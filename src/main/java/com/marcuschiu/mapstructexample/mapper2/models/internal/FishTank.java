package com.marcuschiu.mapstructexample.mapper2.models.internal;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class FishTank {
    public Fish fish;
    public String material;
    public Quality quality;
    public int length;
    public int width;
    public int height;
}
