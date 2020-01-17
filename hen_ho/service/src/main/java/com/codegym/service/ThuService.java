package com.codegym.service;

import com.codegym.dao.entity.Thu;

import java.util.List;

public interface ThuService {
	List<Thu> getAllThu();

	void delete(int idThu);

	Thu findById(int idThu);

	Void save(Thu thu);
}
