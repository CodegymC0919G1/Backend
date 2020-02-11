package com.codegym.service;

import com.codegym.dao.entity.ThanhVien;

import java.util.List;

public interface ThanhVienService {
    List<ThanhVien> findAll();
    ThanhVien findById(long id);
    void save (ThanhVien thanhvien);
    ThanhVien findByEmailIs(String email);
}
