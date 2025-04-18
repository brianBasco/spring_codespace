package com.appdata.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App {

    @GetMapping("/")
    public String app() {
        return "Hello world";
    }
    
}
