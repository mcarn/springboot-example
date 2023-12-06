package com.example.springbootexample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;

@org.springframework.stereotype.Service
public class Service {

    private static final Logger logger = LoggerFactory.getLogger(Service.class);

    @Async
    public void doA(String from) {
        logger.info(from + " to  service A");
    }

    @Async(value = "other")
    public void doB(String from) {
        logger.info(from + " to  service B");
    }
}
