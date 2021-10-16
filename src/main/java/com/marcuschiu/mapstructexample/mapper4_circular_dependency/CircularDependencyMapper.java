package com.marcuschiu.mapstructexample.mapper4_circular_dependency;

import com.marcuschiu.mapstructexample.mapper4_circular_dependency.models.Child;
import com.marcuschiu.mapstructexample.mapper4_circular_dependency.models.ChildDto;
import com.marcuschiu.mapstructexample.mapper4_circular_dependency.models.Father;
import com.marcuschiu.mapstructexample.mapper4_circular_dependency.models.FatherDto;
import org.mapstruct.Context;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CircularDependencyMapper {

    FatherDto toDto(Father father, @Context CycleAvoidingMappingContext context);

    ChildDto toDto(Child child, @Context CycleAvoidingMappingContext context);
}
