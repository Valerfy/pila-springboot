package com.matias.pila;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.matias.pila", "com.mat.pila"})
public class PilaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PilaApplication.class, args);
    }

}