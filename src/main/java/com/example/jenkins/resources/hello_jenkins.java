package com.example.jenkins.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/jenkins/hello")
public class hello_jenkins {
    @GetMapping
    public String hello(){
        return "This is a jenkins app";
    }
}
