package com.codegym.service.Impl;

import com.codegym.dao.entity.ThanhVien;
import com.codegym.dao.entity.Thu;
import com.codegym.service.ThuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codegym.dao.repository.ThuRepository;

import java.util.List;

@Service
public class ThuSerivceImpl implements ThuService {
	@Autowired
	private ThuRepository thuRepository;

	@Override
	public List<Thu> getAllThu() {
		return thuRepository.findAll();
	}

	@Override
	public void delete(int idThu) {
		thuRepository.deleteById(idThu);
	}




	@Override
	public Thu findById(int idThu) {
		return thuRepository.findById(idThu).orElse(null);
	}

	@Override
	public void save(Thu thu) {
		thuRepository.save(thu);
	}

	@Override
	public List<Thu>  findThanhVienGui(ThanhVien thanhVien) {
		return thuRepository.findAllByThanhVienGui(thanhVien);
	}

	@Override
	public List<Thu> findThanhVienNhan(ThanhVien thanhVien) {
		return thuRepository.findAllByThanhVienNhan(thanhVien);
	}

	@Override
	public List<Thu> findThuDaXem(Long id) {
		return thuRepository.findAllByXemIsTrueAndThanhVienNhan(id);
	}

	@Override
	public List<Thu> findThuChuaXem(Long id) {
		return thuRepository.findAllByXemIsFalseAndThanhVienNhan(id);
	}
}
