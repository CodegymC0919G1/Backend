package com.codegym.dao.repository;

import com.codegym.dao.entity.BaoCao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface BaoCaoRepository extends JpaRepository<BaoCao, Long> {

    Page<BaoCao> findAllByXuLyAndThoiGianBaoCaoBetween(Pageable pageable, boolean xuly, Date start, Date end);

    Page<BaoCao> findAllByXuLy(Pageable pageable, boolean xuly);

    Page<BaoCao> findAllByThoiGianBaoCaoBetween(Pageable pageable, Date start, Date end);
}
