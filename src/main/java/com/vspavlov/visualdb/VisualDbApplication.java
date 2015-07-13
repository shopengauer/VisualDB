package com.vspavlov.visualdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.vspavlov.visualdb.*")
@EnableJpaRepositories(basePackages = "com.vspavlov.visualdb.repository")
public class VisualDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(VisualDbApplication.class, args);
    }
}
