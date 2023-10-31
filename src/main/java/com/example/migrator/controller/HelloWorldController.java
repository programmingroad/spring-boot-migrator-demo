package com.example.migrator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("")
    private String helloWorld(){
        return "hello world";
    }

}
