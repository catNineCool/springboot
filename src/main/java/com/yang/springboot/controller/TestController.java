package com.yang.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request , HttpServletResponse response){
        return "hello  yc";
    }
}
