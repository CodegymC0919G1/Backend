package com.codegym.service;

import com.codegym.dao.entity.ThanhVien;
import com.codegym.dao.entity.Thu;

import java.util.List;

public interface ThuService {
	List<Thu> getAllThu();

	void delete(int idThu);

	Thu findById(int idThu);

	void save(Thu thu);

	List<Thu>  findThanhVienGui(ThanhVien thanhVien);

	List<Thu> findThanhVienNhan(ThanhVien thanhVien);
}
