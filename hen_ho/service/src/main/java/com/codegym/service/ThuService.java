package com.codegym.service;

import com.codegym.dao.entity.Thu;

import java.util.List;

public interface ThuService {
	List<Thu> getAllThu();
	void deleteThu(int idThu);
	void getThu(int idThu);
}
