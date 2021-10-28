package com.bootcamp.weathermongo.model;

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
    private double temperature;
    private LocalDateTime time;
    private int precipitation;

}
