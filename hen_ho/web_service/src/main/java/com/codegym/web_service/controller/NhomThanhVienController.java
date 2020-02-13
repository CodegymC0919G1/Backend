package com.codegym.web_service.controller;

import com.codegym.dao.DTO.DetailNhomThanhVienDTO;
import com.codegym.dao.entity.NhomThanhVien;
import com.codegym.service.HoiNhomService;
import com.codegym.service.NhomThanhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
public class NhomThanhVienController {
    @Autowired
    private NhomThanhVienService nhomThanhVienService;
    @Autowired
    private HoiNhomService hoiNhomService;

    @GetMapping("/nhomthanhvien")
    public List<NhomThanhVien> listAllNhomThanhVien() {
        return nhomThanhVienService.findAll();
    }

}
