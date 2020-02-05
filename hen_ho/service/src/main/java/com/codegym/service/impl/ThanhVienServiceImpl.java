package com.codegym.service.impl;

import com.codegym.dao.entity.ThanhVien;
import com.codegym.dao.repository.ThanhVienRepository;
import com.codegym.service.ThanhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThanhVienServiceImpl implements ThanhVienService {
    @Autowired
    private ThanhVienRepository thanhVienRepository;

    @Override
    public List<ThanhVien> getThanhVien() {
        return thanhVienRepository.findAll();
    }

    @Override
    public ThanhVien saveThanhVien(ThanhVien thanhVien) {
        return thanhVienRepository.save(thanhVien);
    }

    @Override
    public ThanhVien getThanhVienById(Long id) {
        return thanhVienRepository.findById(id).orElse(null);
    }
}
