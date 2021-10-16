package com.marcuschiu.mapstructexample.mapper4_circular_dependency.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Father {
    private String name;
    private List<Child> children = new ArrayList<>();
}