package com.marcuschiu.mapstructexample.mapper2.models.internal;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Quality {
    private final String report;
}
