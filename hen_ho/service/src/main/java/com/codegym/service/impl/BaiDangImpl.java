package com.codegym.service.Impl;

import com.codegym.dao.entity.BaiDang;
import com.codegym.dao.entity.ThanhVien;
import com.codegym.dao.repository.BaiDangRepository;
import com.codegym.dao.repository.HoiNhomRepository;
import com.codegym.service.BaiDangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BaiDangImpl implements BaiDangService {
    @Autowired
    BaiDangRepository baiDangRepository;
    @Autowired
    HoiNhomRepository hoiNhomRepository;
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

    @Override
    public List<BaiDang> findAllByIdHoiNhom(long id) {
        return baiDangRepository.findAllByIdHoiNhomIs(hoiNhomRepository.findById(id).orElse(null));
    }

    @Override
    public void deleteBaiDang(BaiDang baiDang) {
        baiDangRepository.delete(baiDang);
    }
}
