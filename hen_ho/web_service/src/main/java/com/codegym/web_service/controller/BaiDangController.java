package com.codegym.web_service.controller;

import com.codegym.dao.DTO.BaiDangDTO;
import com.codegym.dao.entity.BaiDang;

import com.codegym.service.BaiDangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class BaiDangController {
    @Autowired
    BaiDangService baiDangService;

    @GetMapping("/listbaidang")
    public ResponseEntity<List<BaiDang>> danhsachbaidang(){
        List<BaiDang> priceTickets = baiDangService.findAll();
        return ResponseEntity.ok(priceTickets);
    }

    @GetMapping("/baidang/{idBaiDang}")
    public ResponseEntity<BaiDang> getbaidang(@PathVariable("idBaiDang") Integer id) {
        BaiDang baiDang = baiDangService.findByIdBaiDang(id);
        return ResponseEntity.ok(baiDang);
    }

    @RequestMapping("/updateBaiDang")
    public ResponseEntity<BaiDang> updateBaiDang(@RequestBody BaiDangDTO baiDangDTO){
        BaiDang baiDang = new BaiDang();
        if (baiDangDTO != null) {
            baiDang.setIdBaiDang(baiDangDTO.getIdBaiDang());
            baiDang.setTieuDe(baiDangDTO.getTieuDe());
            baiDang.setAnh(baiDangDTO.getAnh());
            baiDang.setNoiDung(baiDangDTO.getNoiDung());
            baiDang.setXoa(baiDangDTO.isXoa());
            baiDang.setThoiGianDang(baiDangDTO.getThoiGianDang());
            baiDang.setThanhVienDang(baiDangDTO.getThanhVienDang());
            baiDang.setIdHoiNhom(baiDangDTO.getIdHoiNhom());
        }
        baiDangService.save(baiDang);
        return ResponseEntity.ok(baiDang);
    }
}

