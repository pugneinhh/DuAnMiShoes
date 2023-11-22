package com.example.duanmishoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DuAnMiShoesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DuAnMiShoesApplication.class, args);
    }

}
