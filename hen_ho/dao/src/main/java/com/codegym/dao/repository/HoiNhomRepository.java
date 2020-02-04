package com.codegym.dao.repository;

import com.codegym.dao.entity.HoiNhom;
import com.codegym.dao.entity.NhomThanhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoiNhomRepository extends JpaRepository<HoiNhom,Long> {
}

