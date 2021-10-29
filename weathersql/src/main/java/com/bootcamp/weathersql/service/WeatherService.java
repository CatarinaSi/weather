package com.bootcamp.weathersql.service;

import com.bootcamp.weathersql.model.Weather;
import com.bootcamp.weathersql.provider.WeatherProvider;
import com.bootcamp.weathersql.repository.LogRepository;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    private final WeatherProvider weatherProvider;
    private final LogRepository logRepository;

    public WeatherService(WeatherProvider weatherProvider, LogRepository logRepository) {
        this.weatherProvider = weatherProvider;
        this.logRepository = logRepository;
    }

    public Weather getWeather(String city) {
        return weatherProvider.getWeather(city);
    }
}
