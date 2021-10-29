package com.bootcamp.weathermongo.controller;

import com.bootcamp.weathermongo.controller.response.WeatherResponse;
import com.bootcamp.weathermongo.model.Weather;
import com.bootcamp.weathermongo.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public Weather getCityWeather(@RequestParam String city) {
        return weatherService.getWeather(city);

    }
}
