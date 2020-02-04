package com.codegym.service.impl;

import com.codegym.dao.entity.BaiDang;
import com.codegym.dao.entity.ThanhVien;
import com.codegym.dao.repository.BaiDangRepository;
import com.codegym.service.BaiDangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BaiDangImpl implements BaiDangService {
    @Autowired
    BaiDangRepository baiDangRepository;
    @Override
    public List<BaiDang> findAll() {
        return baiDangRepository.findAll();
    }

    @Override
    public List<BaiDang> findByThanhVienDang(ThanhVien thanhVienDang) {
        return baiDangRepository.findByThanhVienDang(thanhVienDang);
    }

    @Override
    public BaiDang findByIdBaiDang(Integer idBaiDang) {
        return baiDangRepository.findByIdBaiDang(idBaiDang);
    }

    @Override
    public void save(BaiDang baiDang) {
        baiDangRepository.save(baiDang);
    }
}
