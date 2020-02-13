package com.codegym.service.Impl;

import com.codegym.dao.entity.BaoCao;
import com.codegym.dao.repository.BaoCaoRepository;
import com.codegym.service.BaoCaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class BaoCaoIml implements BaoCaoService {

    @Autowired
    BaoCaoRepository baoCaoRepository;

    @Override
    public List<BaoCao> findAll() {
        return baoCaoRepository.findAll();
    }

    @Override
    public Page<BaoCao> pageFindAll(Pageable pageable) {
        return baoCaoRepository.findAll(pageable);
    }

    @Override
    public BaoCao getBaoCao(long id) {
        return baoCaoRepository.findById(id).orElse(null);
    }

    @Override
    public Page<BaoCao> pageFindAllXuLy(Pageable pageable, boolean xuLy) {
        return baoCaoRepository.findAllByXuLy(pageable, xuLy);
    }

    @Override
    public Page<BaoCao> pageFindAllXuLyAndThoiGianBaoCao(Pageable pageable, boolean xuLy, Date start, Date end) {
        return baoCaoRepository.findAllByXuLyAndThoiGianBaoCaoBetween(pageable, xuLy, start, end);
    }

    @Override
    public Page<BaoCao> pageFindThoiGianBaoCao(Pageable pageable, Date start, Date end) {
        return baoCaoRepository.findAllByThoiGianBaoCaoBetween(pageable, start, end);
    }
}
