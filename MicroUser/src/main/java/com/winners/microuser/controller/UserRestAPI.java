package com.winners.microuser.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestAPI {
    private String title = "Hello, I'm the user Microservice";

    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println(title);
        return title;
    }
}
