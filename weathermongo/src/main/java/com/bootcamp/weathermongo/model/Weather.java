package com.bootcamp.weathermongo.model;

import com.bootcamp.weathermongo.controller.response.WeatherResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Weather {

    @Id
    private String id;
    private float temperature;
    private LocalDateTime time;
    private float precipitation;


    @JsonIgnore
    public WeatherResponse weatherResponse() {
        return new WeatherResponse(
                this.temperature,
                this.time,
                this.precipitation);
    }
}
