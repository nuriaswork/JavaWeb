package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController{
    
    @GetMapping("/error")
    public Greeting error(){
        return new Greeting(-1,"Error");
    }
    
}

