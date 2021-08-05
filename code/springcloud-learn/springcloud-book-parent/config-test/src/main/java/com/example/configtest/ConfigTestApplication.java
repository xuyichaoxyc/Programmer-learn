package com.example.configtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ConfigTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigTestApplication.class, args);
    }

}
