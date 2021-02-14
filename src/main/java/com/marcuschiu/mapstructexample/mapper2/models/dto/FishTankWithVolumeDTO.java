package com.marcuschiu.mapstructexample.mapper2.models.dto;

import lombok.Data;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class FishTankWithVolumeDTO {
    FishDTO fish;
    MaterialDTO material;
    QualityDTO quality;
    VolumeDTO volume;
}