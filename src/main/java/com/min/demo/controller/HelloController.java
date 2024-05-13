package com.min.demo.controller;

import com.min.demo.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    HelloService helloService = new HelloService();
    
    @GetMapping("/hello")
    public String hello() {
        return helloService.printHello();
    }
}
