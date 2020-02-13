package com.codegym.service.Impl;

import com.codegym.dao.entity.ThongBao;
import com.codegym.dao.repository.ThongBaoRepository;
import com.codegym.service.ThongBaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThongBaoServiceImpl implements ThongBaoService {
    @Autowired
    ThongBaoRepository thongBaoRepository;

    @Override
    public List<ThongBao> getThongBao() {
        return thongBaoRepository.findAll();
    }

    @Override
    public ThongBao saveThongBao(ThongBao thongBao) {
        return thongBaoRepository.save(thongBao);
    }

    @Override
    public ThongBao getThongBaoById(long id) {
        return thongBaoRepository.findById(id).orElse(null);
    }
}
