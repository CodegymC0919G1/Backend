package com.codegym.service;

import com.codegym.dao.entity.ThongBao;

import java.util.List;

public interface ThongBaoService {
    List<ThongBao> getThongBao();
    ThongBao saveThongBao(ThongBao thongBao);
    ThongBao getThongBaoById(int id);
}
