package com.codegym.service;

import com.codegym.dao.entity.ThanhVien;

import java.util.List;


public interface ThanhVienService {
    List<ThanhVien> getThanhVien();

    ThanhVien saveThanhVien(ThanhVien thanhVien);

    ThanhVien getThanhVienById(long id);
}
