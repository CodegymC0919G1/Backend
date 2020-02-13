package com.codegym.dao.repository;

import com.codegym.dao.entity.BaiDang;
import com.codegym.dao.entity.HoiNhom;
import com.codegym.dao.entity.ThanhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BaiDangRepository extends JpaRepository<BaiDang,Integer> {
    List<BaiDang> findByThanhVienDang(ThanhVien thanhVienDang);
    BaiDang findByIdBaiDang(Integer idBaiDang);
    List<BaiDang> findAllByIdHoiNhomIs(HoiNhom hoiNhom);
}
