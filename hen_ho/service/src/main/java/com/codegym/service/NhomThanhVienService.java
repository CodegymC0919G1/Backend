package com.codegym.service;

import com.codegym.dao.DTO.DetailNhomThanhVienDTO;
import com.codegym.dao.entity.HoiNhom;
import com.codegym.dao.entity.NhomThanhVien;

import java.util.List;

public interface NhomThanhVienService {
    List<NhomThanhVien> findAll();
    List<DetailNhomThanhVienDTO> findAllByHoiNhom(HoiNhom hoiNhom);
    DetailNhomThanhVienDTO findById(Long id);
}
