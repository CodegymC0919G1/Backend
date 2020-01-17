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
	public void deleteThu(int idThu) {

	}

	@Override
	public void getThu(int idThu) {

	}
}
