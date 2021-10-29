package com.bootcamp.weathersql.controller;

import com.bootcamp.weathersql.controller.response.WeatherResponse;
import com.bootcamp.weathersql.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public WeatherResponse getCityWeather(@RequestParam String city) {
        return weatherService.getWeather(city).weatherResponse();

    }
}