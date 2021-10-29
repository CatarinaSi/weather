package com.bootcamp.weathermongo.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WeatherResponseApi {
    @JsonProperty(value = "current")
    private WeatherResponseCurrent weatherResponseCurrent;
}
