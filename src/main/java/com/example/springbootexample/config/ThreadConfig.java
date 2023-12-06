package com.example.springbootexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
public class ThreadConfig {

    @Bean
    public Executor other() {
        final var executor = new ThreadPoolTaskExecutor();

        return executor;
    }
}
