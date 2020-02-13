package com.codegym.service.impl;

import com.codegym.dao.entity.BaiDang;
import com.codegym.dao.entity.HoiNhom;
import com.codegym.dao.entity.NhomThanhVien;
import com.codegym.dao.repository.HoiNhomRepository;
import com.codegym.service.BaiDangService;
import com.codegym.service.HoiNhomService;
import com.codegym.service.NhomThanhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoiNhomServiceImpl implements HoiNhomService {
    @Autowired
    private HoiNhomRepository hoiNhomRepository;

    @Autowired
    private BaiDangService baiDangService;


    @Autowired
    private NhomThanhVienService nhomThanhVienService;
    @Override
    public List<HoiNhom> findAll() {

        List<HoiNhom> hoiNhoms= hoiNhomRepository.findAll();
        for (HoiNhom hoinhom: hoiNhoms) {
            hoinhom.setSoThanhVien((int) nhomThanhVienService.countNhomThanhVienByHoiNhom(hoinhom.getIdHoiNhom()));
            hoiNhomRepository.save(hoinhom);
        }
        return hoiNhoms;
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

//    @Override
//    public void countSoLuongThanhVien(long id) {
//
//        List<NhomThanhVien> nhomThanhViens =nhomThanhVienService.findAllByIdHoiNhom(id);
//
//
//    }

    @Override
    public void deleteHoiNhom(long id) {
        List<NhomThanhVien> nhomThanhViens=  nhomThanhVienService.findAllByIdHoiNhom(id);
        for(NhomThanhVien nhomThanhVien:nhomThanhViens) {
            nhomThanhVienService.remove(nhomThanhVien.getId());
        }
        List<BaiDang> baiDangs= baiDangService.findAllByIdHoiNhom(id);
        for(BaiDang baiDang:baiDangs) {
            baiDangService.deleteBaiDang(baiDang);
        }
        hoiNhomRepository.delete(hoiNhomRepository.findById(id).orElse(null));
    }

}
