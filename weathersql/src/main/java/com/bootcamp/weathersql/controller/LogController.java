package com.bootcamp.weathersql.controller;

import com.bootcamp.weathersql.service.LogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private final LogService logService;

    public LogController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("/test")
    public void test() {
        logService.test();
    }
}
