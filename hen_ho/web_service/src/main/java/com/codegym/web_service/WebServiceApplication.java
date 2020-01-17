package com.codegym.web_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

<<<<<<< HEAD
@EnableJpaRepositories(basePackages= "com.codegym.dao.repository")
@EnableJpaAuditing()
@ComponentScan("com.codegym")
@SpringBootApplication
=======
@EnableJpaRepositories(basePackages = "com.codegym.dao.repository")
@EnableJpaAuditing()
@SpringBootApplication
@ComponentScan("com.codegym")
>>>>>>> beb4c331472de639e88a3d3b3b93400c42f81b2c
@EntityScan("com.codegym.dao.entity")
public class WebServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebServiceApplication.class, args);
    }

}
