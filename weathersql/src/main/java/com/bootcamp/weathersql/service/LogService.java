package com.bootcamp.weathersql.service;

import com.bootcamp.weathersql.repository.LogRepository;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    private final LogRepository logRepository;

    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public void test() {
        System.out.println("test");
    }
}
