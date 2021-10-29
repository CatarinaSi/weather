package com.bootcamp.weathersql.controller.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WeatherResponse {
    private float temperature;
    private LocalDateTime time;
    private float precipitation;
    private String city;
}
