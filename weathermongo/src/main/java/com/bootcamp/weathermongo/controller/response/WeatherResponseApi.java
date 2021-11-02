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
public class WeatherResponseApi { //TODO: this should be in the provider package, we should keep our responses separated from the responses from the API
    @JsonProperty(value = "current")
    private WeatherResponseCurrent weatherResponseCurrent;
}
