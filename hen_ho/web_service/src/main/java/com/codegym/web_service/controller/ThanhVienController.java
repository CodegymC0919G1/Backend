package com.codegym.web_service.controller;


import com.codegym.dao.DTO.JwtRequest;
import com.codegym.dao.entity.ThanhVien;
import com.codegym.dao.repository.UserRepository;
import com.codegym.service.ThanhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class ThanhVienController {

    @Autowired
    ThanhVienService thanhVienService;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/thanhviens")
    public ResponseEntity<List<ThanhVien>> getAllThanhviens() {
        List<ThanhVien> thanhviens = new ArrayList<>();
        try {
            thanhVienService.findAll().forEach(thanhviens::add);

            if (thanhviens.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(thanhviens, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/thanhviens/{id}")
    public ResponseEntity<ThanhVien> getCustomerById(@PathVariable("id") long id) {
        ThanhVien thanhvienData = thanhVienService.findById(id);

        if (thanhvienData!=null) {
            return new ResponseEntity<>(thanhvienData, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/thanhviens")
    public ResponseEntity<ThanhVien> postThanhvien(@RequestBody ThanhVien thanhvien) {
        try {
            userRepository.save(thanhvien.getUser());
            System.out.println(thanhvien);
            thanhVienService.save(thanhvien);
            ThanhVien thanhvien1=thanhVienService.findByEmailIs(thanhvien.getEmail());
            return new ResponseEntity<>(thanhvien1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
    @PutMapping(value = "/thanhviens")
    public ResponseEntity<ThanhVien> putThanhvien(@RequestBody ThanhVien thanhvien) {
        try {
            System.out.println(thanhvien);
            thanhVienService.save(thanhvien);
            ThanhVien thanhvien1=thanhVienService.findByEmailIs(thanhvien.getEmail());
            return new ResponseEntity<>(thanhvien1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
    @PostMapping("/upload/{id}")
    public ThanhVien uploadImage(@PathVariable("id") Long id, @RequestParam("myFile") MultipartFile file) throws IOException {
        ThanhVien thanhvien = thanhVienService.findById(id);
        thanhvien.setAnhDaiDien(file.getBytes());
        thanhVienService.save(thanhvien);
        System.out.println("Image saved");

        return thanhvien;
    }
}
