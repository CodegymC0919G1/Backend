package com.codegym.service;

import com.codegym.dao.entity.BaoCao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public interface BaoCaoService {

    List<BaoCao> findAll();

    Page<BaoCao> pageFindAll(Pageable pageable);

    BaoCao getBaoCao(long id);

    Page<BaoCao> pageFindAllXuLy(Pageable pageable, boolean xuLy);

    Page<BaoCao> pageFindAllXuLyAndThoiGianBaoCao(Pageable pageable, boolean xuLy, Date start, Date end);

    Page<BaoCao> pageFindThoiGianBaoCao(Pageable pageable, Date start, Date end);
}
