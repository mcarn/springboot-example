package com.example.springbootexample.controller;

import com.example.springbootexample.scheduled.Scheduler;
import com.example.springbootexample.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/a")
    public String a() {
        logger.info("Controller A");
        service.doA("Controller");
        return "A";
    }

    @GetMapping("/b")
    public String b() {
        logger.info("Controller B");
        service.doB("Controller");
        return "B";
    }
}
