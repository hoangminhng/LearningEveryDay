package com.hoangminhng.lesson9;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lesson9Application {

    public static void main(String[] args) {
        SpringApplication.run(Lesson9Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
        return runner -> {
            System.out.println("Hello world");
        };
    }
}
