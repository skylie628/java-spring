package com.example.demoapispringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignInController {
    @RequestMapping("/signin")
    public String ShowHelloWorld(){
        return "Hello World";
    }
}
