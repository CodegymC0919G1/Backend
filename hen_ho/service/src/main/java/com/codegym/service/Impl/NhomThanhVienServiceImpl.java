package com.codegym.service.Impl;

import com.codegym.dao.DTO.DetailNhomThanhVienDTO;
import com.codegym.dao.entity.HoiNhom;
import com.codegym.dao.entity.NhomThanhVien;
import com.codegym.dao.repository.NhomThanhVienRepository;
import com.codegym.service.NhomThanhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NhomThanhVienServiceImpl implements NhomThanhVienService {
    @Autowired
    NhomThanhVienRepository nhomThanhVienRepository;

    @Override
    public List<NhomThanhVien> findAll() {
        return nhomThanhVienRepository.findAll();
    }

    @Override
    public List<DetailNhomThanhVienDTO> findAllByHoiNhom(HoiNhom hoiNhom) {
        List<NhomThanhVien> nhomThanhVien = nhomThanhVienRepository.findAllByHoiNhom(hoiNhom);
        List<DetailNhomThanhVienDTO> listDetailNhomThanhVienDTO=new ArrayList<>();
        if (nhomThanhVien != null) {
            for(NhomThanhVien detailNhomThanhVien:nhomThanhVien) {
                DetailNhomThanhVienDTO detailNhomThanhVienDTO = new DetailNhomThanhVienDTO();
                detailNhomThanhVienDTO.setHoTenAdmin(detailNhomThanhVien.getThanhVienAdmin().getHoTen());
                detailNhomThanhVienDTO.setHoTenThanhVien(detailNhomThanhVien.getThanhVienHoiVien().getHoTen());
                listDetailNhomThanhVienDTO.add(detailNhomThanhVienDTO);
            }
            return listDetailNhomThanhVienDTO;
        }
        return null;
    }

    @Override
    public DetailNhomThanhVienDTO findById(Long id) {
        NhomThanhVien nhomThanhVien = nhomThanhVienRepository.findById(id).orElse(null);
        if (nhomThanhVien != null) {
            DetailNhomThanhVienDTO detailNhomThanhVienDTO = new DetailNhomThanhVienDTO();
            detailNhomThanhVienDTO.setHoTenAdmin(nhomThanhVien.getThanhVienAdmin().getHoTen());
            detailNhomThanhVienDTO.setHoTenThanhVien(nhomThanhVien.getThanhVienHoiVien().getHoTen());
            return detailNhomThanhVienDTO;
        }
        return null;
    }
}
