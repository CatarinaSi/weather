package com.bootcamp.weathermongo.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WeatherResponseCurrent {
    @JsonProperty(value = "temp_c")
    private float temperature;
    @JsonProperty(value = "last_updated")
    private String time;
    @JsonProperty(value = "precip_mm")
    private float precipitation;
}
