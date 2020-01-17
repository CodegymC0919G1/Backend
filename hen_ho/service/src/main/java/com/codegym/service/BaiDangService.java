package com.codegym.service;

import com.codegym.dao.entity.BaiDang;

import java.util.Date;
import java.util.List;

public interface BaiDangService {
    List<BaiDang> findAll();
    List<BaiDang> findByUser (int idUser);
}

