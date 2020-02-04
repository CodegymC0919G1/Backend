package com.codegym.service.Impl;

import com.codegym.dao.DTO.DetailHoiNhomDTO;
import com.codegym.dao.entity.HoiNhom;
import com.codegym.dao.entity.NhomThanhVien;
import com.codegym.dao.repository.HoiNhomRepository;
import com.codegym.service.HoiNhomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoiNhomServiceImpl implements HoiNhomService {
    @Autowired
    private HoiNhomRepository hoiNhomRepository;

    @Override
    public List<HoiNhom> findAll() {
        return hoiNhomRepository.findAll();
    }

    @Override
    public HoiNhom findById(Long id) {
        return hoiNhomRepository.findById(id).orElse(null);
    }

    @Override
    public void save(HoiNhom hoiNhom) {
        hoiNhomRepository.save(hoiNhom);
    }

    @Override
    public void remove(Long id) {
        hoiNhomRepository.deleteById(id);
    }

}
