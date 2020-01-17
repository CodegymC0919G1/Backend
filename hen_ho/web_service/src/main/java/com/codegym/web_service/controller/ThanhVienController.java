package com.codegym.web_service.controller;

import com.codegym.dao.entity.ThanhVien;
import com.codegym.service.ThanhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ThanhVienController {
    @Autowired
    private ThanhVienService thanhVienService;

    @GetMapping(value = {"/thanhvien"})
    public ResponseEntity<List<ThanhVien>> thanhviens(){
        List<ThanhVien> thanhViens =thanhVienService.getThanhVien();
        return ResponseEntity.ok(thanhViens);
    }
    @PostMapping("/createthanhvien")
    public ResponseEntity<ThanhVien> createThanhvien( @RequestBody ThanhVien thanhVien) {
        thanhVienService.saveThanhVien(thanhVien);
        return ResponseEntity.ok(thanhVien);
    }
    @GetMapping(value = {"/getthanhvien/{id}"})
    public ResponseEntity<ThanhVien> getThanhVienById(@PathVariable int id) {
        ThanhVien thanhVien = thanhVienService.getThanhVienById(id);
        return new ResponseEntity<>(thanhVien, HttpStatus.OK);
    }
}
