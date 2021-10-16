package com.marcuschiu.mapstructexample.mapper4_circular_dependency.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FatherDto {
    private String name;
    private List<ChildDto> children = new ArrayList<>();
}
