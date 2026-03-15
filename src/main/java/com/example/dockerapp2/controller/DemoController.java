package com.example.dockerapp2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/health")
public class DemoController {
    @GetMapping
    public String greet() {
        log.info("greet() executed!");
        return "Hello";
    }
}
