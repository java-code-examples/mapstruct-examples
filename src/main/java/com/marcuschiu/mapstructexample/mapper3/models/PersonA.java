package com.marcuschiu.mapstructexample.mapper3.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
public class PersonA {
    private final String name;
    private final Integer age;
    private final String a;
}
