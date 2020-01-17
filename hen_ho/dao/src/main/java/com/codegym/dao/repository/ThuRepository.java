package com.codegym.dao.repository;

import com.codegym.dao.entity.Thu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThuRepository extends JpaRepository<Thu,Long> {
}
