package com.example.youpangsecurityoauth2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/")
    public String home(){
        return "Hello";
    }

    @GetMapping(value = "/private")
    public String privateArea(){
        return "private";
    }
}
