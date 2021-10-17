package com.marcuschiu.mapstructexample.mapper4_circular_dependency.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Child {
    private String name;
    private Father father;
}
