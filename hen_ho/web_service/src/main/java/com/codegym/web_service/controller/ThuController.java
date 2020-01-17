package com.codegym.web_service.controller;

import com.codegym.dao.entity.Thu;
import com.codegym.service.ThuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class ThuController {

	@Autowired
	private ThuService thuService;

	//List Thu
	@GetMapping("/allthu")
	public ResponseEntity<List<Thu>> getAllThu() {
		List<Thu> allthu = thuService.getAllThu();
		return new ResponseEntity<List<Thu>>(allthu, HttpStatus.OK);
	}

	//thêm mới
	@GetMapping("/taomoithu/{id}")
	public Thu creatThu(@PathVariable("id") int id) {
		return thuService.findById(id);
	}

	@PostMapping("/taomoithu/")
	public void createThu(@RequestBody Thu thu) {
		 thuService.save(thu);
	}
}

