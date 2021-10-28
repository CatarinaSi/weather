package com.bootcamp.weathermongo.service;

import com.bootcamp.weathermongo.model.Weather;
import com.bootcamp.weathermongo.provider.WeatherProvider;
import com.bootcamp.weathermongo.repository.WeatherRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class WeatherService {

    private final WeatherRepository weatherRepository;
    private final WeatherProvider weatherProvider;

    public WeatherService(WeatherRepository weatherRepository, WeatherProvider weatherProvider) {
        this.weatherRepository = weatherRepository;
        this.weatherProvider = weatherProvider;
    }

    public Weather getWeather(String city) {
        Optional<Weather> weatherOptional = weatherRepository.findByCity(city);
        if (weatherOptional.isPresent()) {
            Weather weather = weatherOptional.get();
            LocalDateTime timThreshold = weather.getTime().minusHours(1);
            if (weather.getTime().isAfter(timThreshold)) {
                return weather;
            }
        }
        Weather newWeather = weatherProvider.getCityWeather(city);
        weatherRepository.save(newWeather);
        return newWeather;
    }
}
