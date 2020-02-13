package com.codegym.web_service.controller;

import com.codegym.dao.DTO.QuanLyThanhVienDTO;
import com.codegym.dao.entity.ThanhVien;
import com.codegym.service.impl.QuanLyThahVienServiceIml;
import com.codegym.service.QuanLyThanhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("qlthanhvien")
@CrossOrigin(origins = {"*"}, allowedHeaders = {"*"})
public class QuanLyThanhVienController {
    @Autowired
    QuanLyThanhVienService quanLyThanhVienService = new QuanLyThahVienServiceIml();

    @GetMapping(value = "/get/{isVip}", params = {"page", "size", "search"})
    public ResponseEntity<Page<QuanLyThanhVienDTO>> getAllThanhVienDTO(@PathVariable String isVip,
                                                                       @RequestParam("page") int page,
                                                                       @RequestParam("size") int size,
                                                                       @RequestParam("search") String search) {
        List<QuanLyThanhVienDTO> quanLyThanhVienDTOList = quanLyThanhVienService.findAll();
        Page<QuanLyThanhVienDTO> quanLyThanhVienDTOPage;
        if (quanLyThanhVienDTOList.isEmpty()) {
            return new ResponseEntity<Page<QuanLyThanhVienDTO>>(HttpStatus.NO_CONTENT);
        } else {
            if (isVip.equals("vip") && search == null) {
                quanLyThanhVienDTOPage = quanLyThanhVienService.pageFindAllByVip(PageRequest.of(page, size), true);
            } else if (isVip.equals("vip") && search != null) {
                quanLyThanhVienDTOPage = quanLyThanhVienService.pageFindALLByVipAndSearchHoTen(PageRequest.of(page, size), true, search);
            } else if (isVip.equals("normal") && search == null) {
                quanLyThanhVienDTOPage = quanLyThanhVienService.pageFindAllByVip(PageRequest.of(page, size), false);
            } else if (isVip.equals("normal") && search != null) {
                quanLyThanhVienDTOPage = quanLyThanhVienService.pageFindALLByVipAndSearchHoTen(PageRequest.of(page, size), false, search);
            } else if (isVip.equals("all") && search != null) {
                quanLyThanhVienDTOPage = quanLyThanhVienService.getThanhVienByTen(PageRequest.of(page, size), search);
            } else {
                quanLyThanhVienDTOPage = quanLyThanhVienService.pageFindAll(PageRequest.of(page, size));
            }
            return new ResponseEntity<Page<QuanLyThanhVienDTO>>(quanLyThanhVienDTOPage, HttpStatus.OK);
        }
    }

    @GetMapping()
    public ResponseEntity<Page<QuanLyThanhVienDTO>> getPagingAll(Pageable pageable) {
        Page<QuanLyThanhVienDTO> quanLyThanhVienDTOPage = quanLyThanhVienService.pageFindAll(pageable);
        return new ResponseEntity<Page<QuanLyThanhVienDTO>>(quanLyThanhVienDTOPage, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ThanhVien> getThanhVien(@PathVariable("id") long id) {
        ThanhVien thanhVien = quanLyThanhVienService.getThanhVien(id);
        if (thanhVien == null) {
            return new ResponseEntity<ThanhVien>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<ThanhVien>(thanhVien, HttpStatus.OK);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ThanhVien> updateThanhVien(@PathVariable("id") long id, @RequestBody ThanhVien thanhVien) {
        System.out.println(thanhVien.isVip());
        ThanhVien currentThanhVien = quanLyThanhVienService.getThanhVien(id);
        if (currentThanhVien == null) {
            return new ResponseEntity<ThanhVien>(HttpStatus.NOT_FOUND);
        } else {
            currentThanhVien.setIdThanhVien(thanhVien.getIdThanhVien());
            currentThanhVien.setAnhDaiDien(thanhVien.getAnhDaiDien());
            currentThanhVien.setDiaChi(thanhVien.getDiaChi());
            currentThanhVien.setEmail(thanhVien.getEmail());
            currentThanhVien.setGioiTinh(thanhVien.getGioiTinh());
            currentThanhVien.setKhoa(thanhVien.isKhoa());
            currentThanhVien.setLuotThich(thanhVien.getLuotThich());
            currentThanhVien.setMucDichThamGia(thanhVien.getMucDichThamGia());
            currentThanhVien.setNgaySinh(thanhVien.getNgaySinh());
            currentThanhVien.setNgayThamGia(thanhVien.getNgayThamGia());
            currentThanhVien.setNgheNghiep(thanhVien.getNgheNghiep());
            currentThanhVien.setSoLanCanhcao(thanhVien.getSoLanCanhcao());
            currentThanhVien.setTinhTrangHonNhan(thanhVien.getTinhTrangHonNhan());
            currentThanhVien.setVip(thanhVien.isVip());
            currentThanhVien.setXu(thanhVien.getXu());
            currentThanhVien.setTrangThaiDangNhap(thanhVien.getTrangThaiDangNhap());
            currentThanhVien.setUser(thanhVien.getUser());
            System.out.println(currentThanhVien.isVip());
            this.quanLyThanhVienService.saveThanhVie(currentThanhVien);
            return new ResponseEntity<ThanhVien>(currentThanhVien, HttpStatus.OK);
        }
    }
}
