package com.codegym.service.Impl;

import com.codegym.dao.DTO.DetailNhomThanhVienDTO;
import com.codegym.dao.entity.HoiNhom;
import com.codegym.dao.entity.NhomThanhVien;
import com.codegym.dao.repository.HoiNhomRepository;
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
    @Autowired
    HoiNhomRepository hoiNhomRepository;

    @Override
    public List<NhomThanhVien> findAll() {
        return nhomThanhVienRepository.findAll();
    }

    @Override
    public List<NhomThanhVien> findAllByIdHoiNhom(Long id) {
        List<NhomThanhVien> nhomThanhViens=nhomThanhVienRepository.findAllByHoiNhom(hoiNhomRepository.findById(id).orElse(null));
        return nhomThanhViens;
    }
    @Override
    public DetailNhomThanhVienDTO findAllByHoiNhom(HoiNhom hoiNhom) {
        List<NhomThanhVien> nhomThanhVien = nhomThanhVienRepository.findAllByHoiNhom(hoiNhom);
        DetailNhomThanhVienDTO detailNhomThanhVienDTO=new DetailNhomThanhVienDTO();
        if (nhomThanhVien != null) {
            detailNhomThanhVienDTO.setHoTenAdmin(nhomThanhVien.get(0).getThanhVienAdmin().getHoTen());
            detailNhomThanhVienDTO.setId(nhomThanhVien.get(0).getId());
            List<String> list=new ArrayList<>();
            for(NhomThanhVien detailNhomThanhVien:nhomThanhVien) {
                list.add(detailNhomThanhVien.getThanhVienHoiVien().getHoTen());
            }
            detailNhomThanhVienDTO.setHoTenThanhVien(list);
            return detailNhomThanhVienDTO;
        }
        return null;
    }

    @Override
    public void remove(Long id) {
        nhomThanhVienRepository.deleteById(id);
    }

    @Override
    public long countNhomThanhVienByHoiNhom(Long id) {
        return nhomThanhVienRepository.countByHoiNhom(hoiNhomRepository.findById(id).orElse(null));
    }


//    @Override
//    public DetailNhomThanhVienDTO findById(Long id) {
//        NhomThanhVien nhomThanhVien = nhomThanhVienRepository.findById(id).orElse(null);
//        if (nhomThanhVien != null) {
//            DetailNhomThanhVienDTO detailNhomThanhVienDTO = new DetailNhomThanhVienDTO();
//            detailNhomThanhVienDTO.setHoTenAdmin(nhomThanhVien.getThanhVienAdmin().getHoTen());
//            detailNhomThanhVienDTO.setHoTenThanhVien(nhomThanhVien.getThanhVienHoiVien().getHoTen());
//            return detailNhomThanhVienDTO;
//        }
//        return null;
//    }
}
