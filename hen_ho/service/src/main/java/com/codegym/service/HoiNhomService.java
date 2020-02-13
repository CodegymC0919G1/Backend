package com.codegym.service;

import com.codegym.dao.DTO.DetailHoiNhomDTO;
import com.codegym.dao.entity.HoiNhom;
import com.codegym.dao.entity.NhomThanhVien;

import java.util.List;

public interface HoiNhomService {
    List<HoiNhom> findAll();

    HoiNhom findById(Long id);

    void save(HoiNhom hoiNhom);

    void remove(Long id);
//    DetailHoiNhomDTO findById(Long id);

}
