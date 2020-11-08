package com.github.floushee.sbelk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SbElkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbElkApplication.class, args);
    }
}
