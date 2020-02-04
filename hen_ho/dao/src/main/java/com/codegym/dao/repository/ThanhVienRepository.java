package com.codegym.dao.repository;

import com.codegym.dao.entity.ThanhVien;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ThanhVienRepository extends JpaRepository<ThanhVien,Long> {

}
