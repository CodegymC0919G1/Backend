package com.codegym.web_service.controller;

import com.codegym.dao.entity.ThanhVien;
import com.codegym.dao.entity.Thu;
import com.codegym.service.ThanhVienService;
import com.codegym.service.ThuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/thu")
@RestController
@CrossOrigin(origins = ("*"))
public class ThuController {

	@Autowired
	private ThuService thuService;
	@Autowired
	private ThanhVienService thanhVienService;

	//List Thu
	@GetMapping("/allthu")
	public ResponseEntity<List<Thu>> getAllThu() {
		List<Thu> allthu = thuService.getAllThu();
		return new ResponseEntity<List<Thu>>(allthu, HttpStatus.OK);
	}

	//xem thu
	@GetMapping("/thu/{id}")
	public Thu getThu(@PathVariable("id") int id) {
		return thuService.findById(id);
	}
	//Taomoithu
	@PostMapping("/taomoithu")
	public void createThu(@RequestBody Thu thu) {
		thuService.save(thu);
	}
	// Xóa thư
	@DeleteMapping("/delete/{id}")
	public  void  deleteThu(@PathVariable("id") int id){
		thuService.delete(id);
	}

	@GetMapping("/nguoinhan/{id}")
	public ResponseEntity<List<Thu>> getNguoiNhan(@PathVariable("id") int id){
		List<Thu> allnguoiNhan = thuService.findThanhVienNhan(thanhVienService.getThanhVienById(id));
		return new ResponseEntity<>(allnguoiNhan, HttpStatus.OK);
	}
	@GetMapping("/nguoigui/{id}")
	public ResponseEntity<List<Thu>> getNguoiGui(@PathVariable("id") int id){
		List<Thu> allnguoiGui = thuService.findThanhVienGui(thanhVienService.getThanhVienById(id));
		return new ResponseEntity<>(allnguoiGui, HttpStatus.OK);
	}
}
