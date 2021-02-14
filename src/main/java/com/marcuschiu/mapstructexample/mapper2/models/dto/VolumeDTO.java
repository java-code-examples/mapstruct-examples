package com.marcuschiu.mapstructexample.mapper2.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
public class VolumeDTO {
    public int length;
    public int width;
    public int height;
}