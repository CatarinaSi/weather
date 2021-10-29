package com.bootcamp.weathersql.model;

import com.bootcamp.weathersql.controller.response.WeatherResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Weather {

    @Id
    private String id;
    private float temperature;
    private LocalDateTime time;
    private float precipitation;
    private String city;


    @JsonIgnore
    public WeatherResponse weatherResponse() {
        return new WeatherResponse(
                this.temperature,
                this.time,
                this.precipitation,
                this.city);
    }
}
