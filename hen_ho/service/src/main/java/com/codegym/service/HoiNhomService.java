package com.codegym.service;

import com.codegym.dao.entity.HoiNhom;

import java.util.List;

public interface HoiNhomService {
    List<HoiNhom>findAll();
    HoiNhom findById(Long id);
    void save(HoiNhom hoiNhom);
    void remove(Long id);
//    void countSoLuongThanhVien(long id);
    void deleteHoiNhom(long id);
}
