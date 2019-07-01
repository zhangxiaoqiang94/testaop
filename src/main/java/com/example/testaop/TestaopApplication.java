package com.example.testaop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.testaop.mapper")
public class TestaopApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestaopApplication.class, args);
    }

}
