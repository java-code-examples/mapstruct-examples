package com.marcuschiu.mapstructexample.mapper1.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@EqualsAndHashCode
public class PersonB {
    private final String name;
    private final Integer age;
    private final String b;
}
