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
    ThanhVienRepository repository;
    @Override
    public List<ThanhVien> findAll() {
        return repository.findAll();
    }

    @Override
    public ThanhVien findById(long id) {
        return repository.findById(id).orElse(null);
    }


    @Override
    public void save(ThanhVien thanhvien) {
        repository.save(thanhvien);

    }

    @Override
    public ThanhVien findByEmailIs(String email) {
        return repository.findByEmailIs(email);
    }
}
