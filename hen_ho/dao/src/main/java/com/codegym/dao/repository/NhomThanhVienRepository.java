package com.codegym.dao.repository;

import com.codegym.dao.entity.HoiNhom;
import com.codegym.dao.entity.NhomThanhVien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NhomThanhVienRepository extends JpaRepository<NhomThanhVien,Long> {
    List<NhomThanhVien> findAllByHoiNhom(HoiNhom hoiNhom);
}
