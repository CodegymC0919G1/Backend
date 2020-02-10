package com.codegym.dao.repository;

import com.codegym.dao.entity.ThanhVien;
import com.codegym.dao.entity.Thu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThuRepository extends JpaRepository<Thu,Integer> {
	List<Thu> findAllByThanhVienGui(ThanhVien thanhVien);

	List<Thu> findAllByThanhVienNhan(ThanhVien thanhVien);
}
