package com.helping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories
public class FastestFinger {

    public static void main(String[] args) {
        System.out.println("Fastest Finger has been initiated");
        SpringApplication.run(FastestFinger.class, args);
    }

}
