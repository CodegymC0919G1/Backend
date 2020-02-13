package com.codegym.web_service.controller;

import com.codegym.dao.DTO.DetailNhomThanhVienDTO;
import com.codegym.dao.entity.BaiDang;
import com.codegym.dao.entity.HoiNhom;

import com.codegym.service.BaiDangService;
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
    @Autowired
    private BaiDangService baiDangService;
    @GetMapping("/hoinhom")
    public List<HoiNhom> listAllHoiNhom() {
        return hoiNhomService.findAll();
    }
    @GetMapping("/hoinhom/sothanhvien/{id}")
    public long getNhomThanhVienById(@PathVariable(value = "id") long idHoiNhom)
    {
        return nhomThanhVienService.countNhomThanhVienByHoiNhom(idHoiNhom);
    }
    @GetMapping("/hoinhom/nhomthanhvien/{id}")
    public DetailNhomThanhVienDTO getNhomThanhVien(@PathVariable("id") long id) {
        HoiNhom hoiNhom=hoiNhomService.findById(id);
        return nhomThanhVienService.findAllByHoiNhom(hoiNhom);
    }
    @GetMapping("/hoinhom/noidungdangtrongnhom/{id}")
    public List<BaiDang> getNoiDung(@PathVariable("id") long id) {
        return baiDangService.findAllByIdHoiNhom(id);
    }
    @GetMapping("/hoinhom/{id}")
    public HoiNhom getHoiNhom(@PathVariable("id") long id) {
        return hoiNhomService.findById(id);
    }


    @PostMapping("/hoinhom")
    public void createHoiNhom(@RequestBody HoiNhom hoiNhom) {
        hoiNhomService.save(hoiNhom);
    }


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


//    @DeleteMapping("/hoinhom/xoahoinhom/{id}")
//    public void deletehoinhom(@PathVariable("id") long id) {
//        hoiNhomService.remove(id);
//    }
    @DeleteMapping("/hoinhom/xoanhomthanhvien/{id}")
    public void deletenhomthanhvien(@PathVariable("id") long id) {
        hoiNhomService.deleteHoiNhom(id);
    }
    @PatchMapping("/hoinhom/capnhatcanhcao/{id}")
    public HoiNhom updateSoLanCanhCao(@PathVariable("id") long id, @RequestBody HoiNhom hoiNhom) {
        HoiNhom currentHoiNhom = hoiNhomService.findById(id);
        currentHoiNhom.setSoLanCanhCao(hoiNhom.getSoLanCanhCao());
        hoiNhomService.save(currentHoiNhom);
        return currentHoiNhom;
    }
//    @GetMapping("hoinhom/soluongthanhvien/{id}")
//    public int soLuongThanhVien(@PathVariable("id") long id, @RequestBody HoiNhom hoiNhom){
//        HoiNhom soLuongThanhVien=hoiNhomService.findById(id);
//        soLuongThanhVien.countSoLuongThanhVien()
//    }
}
