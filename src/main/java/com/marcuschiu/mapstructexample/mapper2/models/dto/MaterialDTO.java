package com.marcuschiu.mapstructexample.mapper2.models.dto;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class MaterialDTO {
    private final String materialType;
}
