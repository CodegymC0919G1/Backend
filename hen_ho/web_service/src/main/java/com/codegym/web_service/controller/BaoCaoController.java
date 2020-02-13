package com.codegym.web_service.controller;

import com.codegym.dao.entity.BaoCao;
import com.codegym.service.BaoCaoService;
import com.codegym.service.impl.BaoCaoIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping("baocao")
@CrossOrigin(origins = {"*"}, allowedHeaders = {"*"})
public class BaoCaoController {

    @Autowired
    BaoCaoService baoCaoService = new BaoCaoIml();

    @GetMapping(value = "/search", params = {"page", "size", "xuly", "start", "end"})
    public ResponseEntity<Page<BaoCao>> findAll(
            @RequestParam("page") int page,
            @RequestParam("size") int size,
            @RequestParam("xuly") String xuly,
            @RequestParam("start") Date start,
            @RequestParam("end") Date end) {
        List<BaoCao> baoCaoList = baoCaoService.findAll();
        if (baoCaoList == null) {
            return new ResponseEntity<Page<BaoCao>>(HttpStatus.NO_CONTENT);
        } else {
            Page<BaoCao> baoCaoPage = null;
            if (xuly.equals("dont")) {
                if (start != null && end != null) {
                    baoCaoPage = baoCaoService.pageFindAllXuLyAndThoiGianBaoCao(PageRequest.of(page, size), false, start, end);
                } else if (start != null) {
                    java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
                    baoCaoPage = baoCaoService.pageFindAllXuLyAndThoiGianBaoCao(PageRequest.of(page, size), false, start, date);
                } else if (start == null && end == null) {
                    baoCaoPage = baoCaoService.pageFindAllXuLy(PageRequest.of(page, size), false);
                }
            }
            if (xuly.equals("done")) {
                if (start != null && end != null) {
                    baoCaoPage = baoCaoService.pageFindAllXuLyAndThoiGianBaoCao(PageRequest.of(page, size), true, start, end);
                } else if (start != null) {
                    java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
                    baoCaoPage = baoCaoService.pageFindAllXuLyAndThoiGianBaoCao(PageRequest.of(page, size), true, start, date);
                } else if (start == null && end == null) {
                    baoCaoPage = baoCaoService.pageFindAllXuLy(PageRequest.of(page, size), true);
                }
            }
            if (xuly.equals("all")) {
                if (start != null && end != null) {
                    baoCaoPage = baoCaoService.pageFindThoiGianBaoCao(PageRequest.of(page, size), start, end);
                } else if (start != null) {
                    java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
                    baoCaoPage = baoCaoService.pageFindThoiGianBaoCao(PageRequest.of(page, size), start, date);
                } else if (start == null && end == null) {
                    baoCaoPage = baoCaoService.pageFindAll(PageRequest.of(page, size));
                }
            }
            return new ResponseEntity<Page<BaoCao>>(baoCaoPage, HttpStatus.OK);
        }
    }

    @GetMapping(value = "", params = {"page", "size", "xuly"})
    public ResponseEntity<Page<BaoCao>> findAll(
            @RequestParam("page") int page,
            @RequestParam("size") int size,
            @RequestParam("xuly") String xuly) {
        List<BaoCao> baoCaoList = baoCaoService.findAll();
        if (baoCaoList == null) {
            return new ResponseEntity<Page<BaoCao>>(HttpStatus.NO_CONTENT);
        } else {
            Page<BaoCao> baoCaoPage = null;
            if (xuly.equals("dont")) {
                baoCaoPage = baoCaoService.pageFindAllXuLy(PageRequest.of(page, size), false);
            }
            if (xuly.equals("done")) {
                baoCaoPage = baoCaoService.pageFindAllXuLy(PageRequest.of(page, size), true);
            }
            if (xuly.equals("all")) {
                baoCaoPage = baoCaoService.pageFindAll(PageRequest.of(page, size));
            }
            return new ResponseEntity<Page<BaoCao>>(baoCaoPage, HttpStatus.OK);
        }
    }
}

