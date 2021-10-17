package com.marcuschiu.mapstructexample.mapper4_circular_dependency.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FatherDto {
    private String name;
    private List<ChildDto> children = new ArrayList<>();
}
