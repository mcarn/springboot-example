package com.example.springbootexample.scheduled;

import com.example.springbootexample.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class Scheduler {
    private static final Logger logger = LoggerFactory.getLogger(Scheduler.class);
    private final Service service;

    public Scheduler(Service service) {
        this.service = service;
    }


    @Scheduled(fixedRate = 60, timeUnit = TimeUnit.SECONDS)
    public void doCheckA() {
        logger.info("Scheduler A");
        service.doA("Scheduler");
    }

    @Scheduled(fixedRate = 60, timeUnit = TimeUnit.SECONDS)
    public void doCheckB() {
        logger.info("Scheduler B");
        service.doB("Scheduler");
    }
}
