package com.example.security;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.security.mapper")//mybatis-plus扫描
public class SecurityApp {
    public static void main(String[] args) {
        SpringApplication.run(SecurityApp.class,args);
    }
}
