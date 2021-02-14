package com.marcuschiu.mapstructexample.mapper2.models.dto;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class QualityDTO {
    private final String document;
}
