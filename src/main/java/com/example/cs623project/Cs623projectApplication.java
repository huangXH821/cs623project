package com.example.cs623project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.cs623project.mapper")
public class Cs623projectApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cs623projectApplication.class, args);
    }

}
