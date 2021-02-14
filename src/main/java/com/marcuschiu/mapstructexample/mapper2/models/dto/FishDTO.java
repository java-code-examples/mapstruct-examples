package com.marcuschiu.mapstructexample.mapper2.models.dto;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class FishDTO {
    private final String kind;
    private final String fish;
}
