package com.marcuschiu.mapstructexample.mapper4_circular_dependency.models;

import lombok.Data;

@Data
public class ChildDto {
    private String name;
    private FatherDto father;
}
