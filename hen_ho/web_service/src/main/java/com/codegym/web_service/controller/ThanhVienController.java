package com.codegym.web_service.controller;

import com.codegym.dao.entity.ThanhVien;
import com.codegym.dao.repository.ThanhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class ThanhVienController {
    @Autowired
    ThanhVienRepository repository;

    @GetMapping("/thanhviens")
    public ResponseEntity<List<ThanhVien>> getAllThanhviens() {
        List<ThanhVien> thanhviens = new ArrayList<>();
        try {
            repository.findAll().forEach(thanhviens::add);

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
        Optional<ThanhVien> thanhvienData = repository.findById(id);

        if (thanhvienData.isPresent()) {
            return new ResponseEntity<>(thanhvienData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/thanhviens")
    public ResponseEntity<ThanhVien> postThanhvien(@RequestBody ThanhVien thanhvien) {
        try {
            System.out.println(thanhvien);
            ThanhVien _thanhvien = repository.save(thanhvien);
            return new ResponseEntity<>(_thanhvien, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

}
