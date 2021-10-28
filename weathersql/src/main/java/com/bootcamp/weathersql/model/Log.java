package com.bootcamp.weathersql.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalTime timeStamp;
    private String request;
    private String response;
}
