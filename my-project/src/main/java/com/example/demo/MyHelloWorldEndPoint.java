package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyHelloWorldEndPoint {

    @GetMapping("/")
    public String hello() {
        return "Hello world!";
    }
}
