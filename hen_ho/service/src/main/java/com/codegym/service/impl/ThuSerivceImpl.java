package com.codegym.service.impl;

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
	public Void save(Thu thu) {
		thuRepository.save(thu);
		return null;
	}
}
