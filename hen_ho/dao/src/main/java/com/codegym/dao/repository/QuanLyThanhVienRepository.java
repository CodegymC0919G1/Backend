package com.codegym.dao.repository;


import com.codegym.dao.entity.ThanhVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface QuanLyThanhVienRepository extends JpaRepository<ThanhVien, Long> {
    List<ThanhVien> findAllByVip(boolean vip);

    Page<ThanhVien> findAllByHoTenContaining(Pageable pageable, String search);

    Page<ThanhVien> findAllByVipAndHoTenContaining(Pageable pageable, boolean vip, String search);

    Page<ThanhVien> findAllByVip(Pageable pageable, boolean vip);
}
