package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication --  invokes the SpringApplication.run method
//                        -- starts the Spring application as a standalone application,
//                        --runs the embedded servers and loads the beans.
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args); //SpringApplication.run() method
        System.out.println("Hello world!");
    }
}