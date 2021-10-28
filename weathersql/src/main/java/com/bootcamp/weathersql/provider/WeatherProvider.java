package com.bootcamp.weathersql.provider;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherProvider {
    private final RestTemplate restTemplate;
    private final String url;

    public WeatherProvider(RestTemplate restTemplate, String url) {
        this.restTemplate = restTemplate;
        this.url = url;
    }

/*    public String getFact() {
        final var response = restTemplate.getForEntity(url, String.class);
        return response.getBody().toString();
        return response.getBody().getFact();
    }*/
}