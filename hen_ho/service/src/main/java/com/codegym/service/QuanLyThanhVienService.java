package com.codegym.service;

import com.codegym.dao.DTO.QuanLyThanhVienDTO;
import com.codegym.dao.entity.ThanhVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuanLyThanhVienService {
    List<QuanLyThanhVienDTO> findAll();

    Page<QuanLyThanhVienDTO> pageFindAll(Pageable pageable);

    List<QuanLyThanhVienDTO> findAllByVip(boolean vip);

    Page<QuanLyThanhVienDTO> getThanhVienByTen(Pageable pageable, String search);

    ThanhVien getThanhVien(long id);

    Page<QuanLyThanhVienDTO> pageFindAllByVip(Pageable pageable, boolean vip);

    Page<QuanLyThanhVienDTO> pageFindALLByVipAndSearchHoTen(Pageable pageable, boolean vip, String search);

    void saveThanhVie(ThanhVien thanhVien);
}
