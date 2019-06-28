package com.example.dhiraj.springBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "My first page";
    }
}