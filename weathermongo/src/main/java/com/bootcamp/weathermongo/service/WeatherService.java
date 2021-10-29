package com.bootcamp.weathermongo.service;

import com.bootcamp.weathermongo.model.Weather;
import com.bootcamp.weathermongo.provider.WeatherProvider;
import com.bootcamp.weathermongo.repository.WeatherRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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

            LocalDateTime timThreshold = weather.getTime().plusHours(1);
            LocalDateTime date = LocalDateTime.now();

            if (date.isAfter(timThreshold)) {
                return weather;
            }
            else{
                Weather newWeather = weatherProvider.getCityWeather(city);

                weather.setTime(newWeather.getTime());
                weather.setTemperature(newWeather.getTemperature());
                weather.setPrecipitation(newWeather.getPrecipitation());

                weatherRepository.save(newWeather);
                return newWeather;
            }
        }
        Weather newWeather = weatherProvider.getCityWeather(city);
        weatherRepository.save(newWeather);
        return newWeather;
    }
}
