package com.codegym.web_service.controller;

import com.codegym.dao.entity.BaiDang;
import com.codegym.dao.repository.BaiDangRepository;
import com.codegym.service.BaiDangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
public class BaiDangController {
    @Autowired
    BaiDangService baiDangService;

    @GetMapping("/baidang")
    public ResponseEntity<List<BaiDang>> danhsachbaidang(){
        List<BaiDang> priceTickets = baiDangService.findAll();
        return ResponseEntity.ok(priceTickets);
    }

    @GetMapping("/baidang/{idBaiDang}")
    public ResponseEntity<BaiDang> getbaidang(@PathVariable("idBaiDang") Integer id) {
        BaiDang baiDang = baiDangService.findByIdBaiDang(id);
        return ResponseEntity.ok(baiDang);
    }

    @PostMapping("/updateBaiDang")
    public ResponseEntity<BaiDang> updateBaiDang(@RequestBody BaiDang baiDang){
        baiDangService.save(baiDang);
        return ResponseEntity.ok(baiDang);
    }
}

