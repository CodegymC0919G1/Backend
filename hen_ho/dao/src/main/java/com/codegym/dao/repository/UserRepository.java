package com.codegym.dao.repository;

import com.codegym.dao.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
