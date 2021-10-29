package com.bootcamp.weathermongo.provider;

import com.bootcamp.weathermongo.controller.response.WeatherResponseApi;
import com.bootcamp.weathermongo.model.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class WeatherProvider {
    private final RestTemplate restTemplate;
    private final String apiUrl;
    private final String apiKey;

    public WeatherProvider(RestTemplate restTemplate, @Value("${weather.api.url}") String apiUrl, @Value("${weather.api.key}") String apiKey) {
        this.restTemplate = restTemplate;
        this.apiUrl = apiUrl;
        this.apiKey = apiKey;
    }

    public Weather getCityWeather(String city) {
        String url = apiUrl + "?key=" + apiKey + "&q=" + city + "&aqi=no";
        final ResponseEntity<WeatherResponseApi> response = restTemplate.getForEntity(url, WeatherResponseApi.class);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return Weather
                .builder()
                .temperature(response.getBody().getWeatherResponseCurrent().getTemperature())
                .time(LocalDateTime.parse(response.getBody().getWeatherResponseCurrent().getTime(), formatter))
                .precipitation(response.getBody().getWeatherResponseCurrent().getPrecipitation())
                .city(city)
                .build();
    }


}
