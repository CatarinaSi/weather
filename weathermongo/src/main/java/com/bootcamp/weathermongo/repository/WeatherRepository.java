package com.bootcamp.weathermongo.repository;

import com.bootcamp.weathermongo.model.Weather;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface WeatherRepository extends MongoRepository<Weather, String> {
    Optional<Weather> findByCity(String city);
}
