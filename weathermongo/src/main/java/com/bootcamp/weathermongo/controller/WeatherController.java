package com.bootcamp.weathermongo.controller;

import com.bootcamp.weathermongo.service.WeatherService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
}
