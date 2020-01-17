package com.codegym.web_service.controller;

import com.codegym.dao.entity.Thu;
import com.codegym.service.ThuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ThuController {

	@Autowired
	private ThuService thuService;

	@GetMapping("/allthu")
	public ResponseEntity<List<Thu>> getAllThu() {
		List<Thu> allthu = thuService.getAllThu();
		if (allthu.isEmpty()) {
			return new ResponseEntity<List<Thu>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Thu>>(allthu, HttpStatus.OK);
	}
}
