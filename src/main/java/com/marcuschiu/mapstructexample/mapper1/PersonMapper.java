package com.marcuschiu.mapstructexample.mapper1;

import com.marcuschiu.mapstructexample.mapper1.models.PersonA;
import com.marcuschiu.mapstructexample.mapper1.models.PersonB;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

//@MapperConfig(mappingControl = DeepClone.class)
@Mapper(componentModel = "spring") //Creates a Spring Bean automatically
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper( PersonMapper.class );

    @Mapping(target = "a", source = "b")
    PersonA personBToPersonA(PersonB personB);

    @InheritInverseConfiguration
    PersonB personAToPersonB(PersonA personA);
}
