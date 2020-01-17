package com.codegym.web_service.controller;

import com.codegym.dao.entity.HoiNhom;
import com.codegym.service.HoiNhomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
public class HoiNhomController {
    @Autowired
    private HoiNhomService hoiNhomService;

    @GetMapping("/hoinhom")
    public List<HoiNhom> listAllHoiNhom() {
        return hoiNhomService.findAll();
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
//        System.out.println("Updating Customer " + id);
        HoiNhom currentHoiNhom = hoiNhomService.findById(id);
        if (currentHoiNhom == null) {
            System.out.println("hoinhom with id " + id + " not found");
        }

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
//        System.out.println("Fetching & Deleting hoinhom with id " + id);

        HoiNhom hoiNhom = hoiNhomService.findById(id);
        if (hoiNhom == null) {
            System.out.println("Unable to delete. hoi nhom with id " + id + " not found");
        }
        hoiNhomService.remove(id);
    }
}
