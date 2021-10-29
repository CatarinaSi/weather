package com.bootcamp.weathersql.provider;

import com.bootcamp.weathersql.controller.response.WeatherResponse;
import com.bootcamp.weathersql.model.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherProvider {


    private final RestTemplate restTemplate;
    private final String baseurl;

    public WeatherProvider(RestTemplate restTemplate, @Value("${weather.provider.url}") String url) {
        this.restTemplate = restTemplate;
        this.baseurl = url;
    }

    public Weather getWeather(String city) {
        String url = baseurl + "weather&q=" +city;
        final ResponseEntity<Weather> response = restTemplate.getForEntity(url, Weather.class);
        return new Weather(
                response.getBody().getId(),
                response.getBody().getTemperature(),
                response.getBody().getTime(),
                response.getBody().getPrecipitation(),
                response.getBody().getCity());
    }
/*    public String getFact() {
        final var response = restTemplate.getForEntity(url, String.class);
        return response.getBody().toString();
        return response.getBody().getFact();
    }*/
}