package com.codegym.service;

import com.codegym.dao.DTO.DetailNhomThanhVienDTO;
import com.codegym.dao.entity.HoiNhom;
import com.codegym.dao.entity.NhomThanhVien;
import java.util.List;
public interface NhomThanhVienService {
    List<NhomThanhVien> findAll();
    List<NhomThanhVien> findAllByIdHoiNhom(Long id);
    DetailNhomThanhVienDTO findAllByHoiNhom(HoiNhom hoiNhom);
    void remove(Long id);
    long countNhomThanhVienByHoiNhom(Long id);
//    DetailNhomThanhVienDTO findById(Long id);
}
