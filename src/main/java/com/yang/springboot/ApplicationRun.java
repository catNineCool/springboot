package com.yang.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication
public class ApplicationRun {
    /**
     * 程序启动器
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun.class,args);
    }
}
