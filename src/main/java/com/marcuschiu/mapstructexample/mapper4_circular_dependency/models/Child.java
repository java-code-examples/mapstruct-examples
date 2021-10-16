package com.marcuschiu.mapstructexample.mapper4_circular_dependency.models;

import lombok.Data;

@Data
public class Child {
    private String name;
    private Father father;
}
