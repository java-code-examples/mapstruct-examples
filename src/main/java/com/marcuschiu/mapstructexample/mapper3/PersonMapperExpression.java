package com.marcuschiu.mapstructexample.mapper3;

import com.marcuschiu.mapstructexample.mapper3.models.PersonA;
import com.marcuschiu.mapstructexample.mapper3.models.PersonB;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

//@MapperConfig(mappingControl = DeepClone.class)
@Mapper(componentModel = "spring", imports = {PersonA.class, PersonB.class}) //Creates a Spring Bean automatically
public interface PersonMapperExpression {

    PersonMapperExpression INSTANCE = Mappers.getMapper( PersonMapperExpression.class );

    @Mapping(target = "name", expression = "java( personA.getName() + \" \" + personA.getA() )")
    @Mapping(target = "b", source = "a")
    PersonB personAToPersonB(PersonA personA);

    @Mapping(target = "name", expression = "java( personB.getName() + \" \" + personB.getB() )")
    @Mapping(target = "a", source = "b")
    PersonA personBToPersonA(PersonB personB);
}
