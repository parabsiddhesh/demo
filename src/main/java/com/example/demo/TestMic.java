package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMic {

    @GetMapping("/hello/new")
    public String getDemo() {
        return "Application is started";
    }

}
