package com.codegym.web_service.controller;

import com.codegym.dao.DTO.DetailNhomThanhVienDTO;
import com.codegym.dao.entity.HoiNhom;

import com.codegym.service.HoiNhomService;

import com.codegym.service.NhomThanhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
public class HoiNhomController {
    @Autowired
    private HoiNhomService hoiNhomService;
    @Autowired
    private NhomThanhVienService nhomThanhVienService;
    @GetMapping("/hoinhom")
    public List<HoiNhom> listAllHoiNhom() {
        return hoiNhomService.findAll();
    }

    @GetMapping("/hoinhom/nhomthanhvien/{id}")
    public List<DetailNhomThanhVienDTO> getNhomThanhVien(@PathVariable("id") long id) {
        HoiNhom hoiNhom=hoiNhomService.findById(id);
        return nhomThanhVienService.findAllByHoiNhom(hoiNhom);
    }
    //-------------------Retrieve Single hoinhom--------------------------------------------------------

    @GetMapping("/hoinhom/{id}")
    public HoiNhom getHoiNhom(@PathVariable("id") long id) {
        return hoiNhomService.findById(id);
    }

    //-------------------Create a hoinhom--------------------------------------------------------

    @PostMapping("/hoinhom")
    public void createHoiNhom(@RequestBody HoiNhom hoiNhom) {
        hoiNhomService.save(hoiNhom);
    }

    //------------------- Update a hoinhom --------------------------------------------------------

    @PatchMapping("/hoinhom/capnhathoinhom/{id}")
    public HoiNhom updateHoiNhom(@PathVariable("id") long id, @RequestBody HoiNhom hoiNhom) {
        HoiNhom currentHoiNhom = hoiNhomService.findById(id);
        currentHoiNhom.setIdHoiNhom(hoiNhom.getIdHoiNhom());
        currentHoiNhom.setTenHoiNhom(hoiNhom.getTenHoiNhom());
        currentHoiNhom.setNgayThanhLap(hoiNhom.getNgayThanhLap());
        currentHoiNhom.setSoLanCanhCao(hoiNhom.getSoLanCanhCao());
        currentHoiNhom.setSoThanhVien(hoiNhom.getSoThanhVien());
        hoiNhomService.save(currentHoiNhom);
        return currentHoiNhom;
    }

    //------------------- Delete a hoinhom --------------------------------------------------------

    @DeleteMapping("/hoinhom/xoahoinhom/{id}")
    public void deletehoinhom(@PathVariable("id") long id) {
        hoiNhomService.remove(id);
    }
    @PatchMapping("/hoinhom/capnhatcanhcao/{id}")
    public HoiNhom updateSoLanCanhCao(@PathVariable("id") long id, @RequestBody HoiNhom hoiNhom) {
        HoiNhom currentHoiNhom = hoiNhomService.findById(id);
        currentHoiNhom.setSoLanCanhCao(hoiNhom.getSoLanCanhCao());
        hoiNhomService.save(currentHoiNhom);
        return currentHoiNhom;
    }
}
