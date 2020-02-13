package com.codegym.service.impl;

import com.codegym.dao.DTO.QuanLyThanhVienDTO;
import com.codegym.dao.entity.ThanhVien;
import com.codegym.dao.repository.QuanLyThanhVienRepository;
import com.codegym.service.QuanLyThanhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@Service
public class QuanLyThahVienServiceIml implements QuanLyThanhVienService {

    @Autowired
    QuanLyThanhVienRepository quanLyThanhVienRepository;

    @Override
    public List<QuanLyThanhVienDTO> findAll() {
        List<ThanhVien> thanhVienList = quanLyThanhVienRepository.findAll();
        List<QuanLyThanhVienDTO> quanLyThanhVienDTOList = new ArrayList<>();
        if (thanhVienList != null) {
            for (ThanhVien thanhVien : thanhVienList) {
                QuanLyThanhVienDTO quanLyThanhVienDTO = new QuanLyThanhVienDTO();
                quanLyThanhVienDTO.setIdThanhVien(thanhVien.getIdThanhVien());
                quanLyThanhVienDTO.setHoTen(thanhVien.getHoTen());
                quanLyThanhVienDTO.setNgayThamGia(thanhVien.getNgayThamGia());
                quanLyThanhVienDTO.setXu(thanhVien.getXu());
                quanLyThanhVienDTO.setVip(thanhVien.isVip());
                quanLyThanhVienDTO.setSoLanCanhCao(thanhVien.getSoLanCanhcao());
                quanLyThanhVienDTOList.add(quanLyThanhVienDTO);
            }
            return quanLyThanhVienDTOList;
        }
        return null;
    }

    @Override
    public Page<QuanLyThanhVienDTO> pageFindAll(Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber(), 5);
        Page<ThanhVien> thanhViens = quanLyThanhVienRepository.findAll(pageable);
        Page<QuanLyThanhVienDTO> thanhVienDTOS = thanhViens.map(new Function<ThanhVien, QuanLyThanhVienDTO>() {
            @Override
            public QuanLyThanhVienDTO apply(ThanhVien thanhVien) {
                QuanLyThanhVienDTO quanLyThanhVienDTO = new QuanLyThanhVienDTO();
                quanLyThanhVienDTO.setIdThanhVien(thanhVien.getIdThanhVien());
                quanLyThanhVienDTO.setHoTen(thanhVien.getHoTen());
                quanLyThanhVienDTO.setNgayThamGia(thanhVien.getNgayThamGia());
                quanLyThanhVienDTO.setXu(thanhVien.getXu());
                quanLyThanhVienDTO.setVip(thanhVien.isVip());
                quanLyThanhVienDTO.setSoLanCanhCao(thanhVien.getSoLanCanhcao());
                return quanLyThanhVienDTO;
            }
        });
        return thanhVienDTOS;
    }

    @Override
    public List<QuanLyThanhVienDTO> findAllByVip(boolean vip) {
        List<ThanhVien> thanhVienList = quanLyThanhVienRepository.findAllByVip(vip);
        List<QuanLyThanhVienDTO> quanLyThanhVienDTOList = new ArrayList<>();
        if (thanhVienList != null) {
            for (ThanhVien thanhVien : thanhVienList) {
                QuanLyThanhVienDTO quanLyThanhVienDTO = new QuanLyThanhVienDTO();
                quanLyThanhVienDTO.setIdThanhVien(thanhVien.getIdThanhVien());
                quanLyThanhVienDTO.setHoTen(thanhVien.getHoTen());
                quanLyThanhVienDTO.setNgayThamGia(thanhVien.getNgayThamGia());
                quanLyThanhVienDTO.setXu(thanhVien.getXu());
                quanLyThanhVienDTO.setVip(thanhVien.isVip());
                quanLyThanhVienDTO.setSoLanCanhCao(thanhVien.getSoLanCanhcao());
                quanLyThanhVienDTOList.add(quanLyThanhVienDTO);
            }
            return quanLyThanhVienDTOList;
        }
        return null;
    }

    @Override
    public Page<QuanLyThanhVienDTO> getThanhVienByTen(Pageable pageable, String search) {
        Page<ThanhVien> thanhViens = quanLyThanhVienRepository.findAllByHoTenContaining(pageable, search);
        Page<QuanLyThanhVienDTO> thanhVienDTOS = thanhViens.map(new Function<ThanhVien, QuanLyThanhVienDTO>() {
            @Override
            public QuanLyThanhVienDTO apply(ThanhVien thanhVien) {
                QuanLyThanhVienDTO quanLyThanhVienDTO = new QuanLyThanhVienDTO();
                quanLyThanhVienDTO.setIdThanhVien(thanhVien.getIdThanhVien());
                quanLyThanhVienDTO.setHoTen(thanhVien.getHoTen());
                quanLyThanhVienDTO.setNgayThamGia(thanhVien.getNgayThamGia());
                quanLyThanhVienDTO.setXu(thanhVien.getXu());
                quanLyThanhVienDTO.setVip(thanhVien.isVip());
                quanLyThanhVienDTO.setSoLanCanhCao(thanhVien.getSoLanCanhcao());
                return quanLyThanhVienDTO;
            }
        });
        return thanhVienDTOS;
    }

    @Override
    public ThanhVien getThanhVien(long id) {
        return quanLyThanhVienRepository.findById(id).orElse(null);
    }

    @Override
    public Page<QuanLyThanhVienDTO> pageFindAllByVip(Pageable pageable, boolean vip) {
        Page<ThanhVien> thanhVienPage = quanLyThanhVienRepository.findAllByVip(pageable, vip);
        Page<QuanLyThanhVienDTO> quanLyThanhVienDTOPage = thanhVienPage.map(new Function<ThanhVien, QuanLyThanhVienDTO>() {
            @Override
            public QuanLyThanhVienDTO apply(ThanhVien thanhVien) {
                QuanLyThanhVienDTO quanLyThanhVienDTO = new QuanLyThanhVienDTO();
                quanLyThanhVienDTO.setIdThanhVien(thanhVien.getIdThanhVien());
                quanLyThanhVienDTO.setHoTen(thanhVien.getHoTen());
                quanLyThanhVienDTO.setNgayThamGia(thanhVien.getNgayThamGia());
                quanLyThanhVienDTO.setXu(thanhVien.getXu());
                quanLyThanhVienDTO.setVip(thanhVien.isVip());
                quanLyThanhVienDTO.setSoLanCanhCao(thanhVien.getSoLanCanhcao());
                return quanLyThanhVienDTO;
            }
        });
        return quanLyThanhVienDTOPage;
    }

    @Override
    public Page<QuanLyThanhVienDTO> pageFindALLByVipAndSearchHoTen(Pageable pageable, boolean vip, String search) {
        Page<ThanhVien> thanhVienPage = quanLyThanhVienRepository.findAllByVipAndHoTenContaining(pageable, vip, search);
        Page<QuanLyThanhVienDTO> quanLyThanhVienDTOPage = thanhVienPage.map(new Function<ThanhVien, QuanLyThanhVienDTO>() {
            @Override
            public QuanLyThanhVienDTO apply(ThanhVien thanhVien) {
                QuanLyThanhVienDTO quanLyThanhVienDTO = new QuanLyThanhVienDTO();
                quanLyThanhVienDTO.setIdThanhVien(thanhVien.getIdThanhVien());
                quanLyThanhVienDTO.setHoTen(thanhVien.getHoTen());
                quanLyThanhVienDTO.setNgayThamGia(thanhVien.getNgayThamGia());
                quanLyThanhVienDTO.setXu(thanhVien.getXu());
                quanLyThanhVienDTO.setVip(thanhVien.isVip());
                quanLyThanhVienDTO.setSoLanCanhCao(thanhVien.getSoLanCanhcao());
                return quanLyThanhVienDTO;
            }
        });
        return quanLyThanhVienDTOPage;
    }

    @Override
    public void saveThanhVie(ThanhVien thanhVien) {
        quanLyThanhVienRepository.save(thanhVien);
    }
}
