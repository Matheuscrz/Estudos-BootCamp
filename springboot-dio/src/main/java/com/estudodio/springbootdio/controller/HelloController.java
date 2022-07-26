package com.estudodio.springbootdio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */
@RestController
public class HelloController {
    
    @GetMapping("/")
    public String helloController(){
        return "Hello, Matheus";
    }
}