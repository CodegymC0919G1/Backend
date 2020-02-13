package com.codegym.dao.repository;

import com.codegym.dao.entity.ThongBao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThongBaoRepository extends JpaRepository<ThongBao,Long> {
}
