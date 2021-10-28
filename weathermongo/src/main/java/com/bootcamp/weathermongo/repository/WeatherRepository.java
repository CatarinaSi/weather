package com.bootcamp.weathermongo.repository;

import com.bootcamp.weathermongo.model.Weather;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeatherRepository extends MongoRepository<Weather, String> {
}
