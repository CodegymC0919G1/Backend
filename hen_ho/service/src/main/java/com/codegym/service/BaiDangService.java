package com.codegym.service;

import com.codegym.dao.entity.BaiDang;

import com.codegym.dao.entity.ThanhVien;

import java.util.List;

public interface BaiDangService {
    List<BaiDang> findAll();

    List<BaiDang> findByThanhVienDang(ThanhVien thanhVienDang);

    BaiDang findByIdBaiDang(Integer idBaiDang);

    void save(BaiDang baiDang);

    List<BaiDang> findAllByIdHoiNhom(long id);

    void deleteBaiDang(BaiDang baiDang);
}

