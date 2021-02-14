package com.marcuschiu.mapstructexample.mapper2;

import com.marcuschiu.mapstructexample.mapper2.models.dto.FishTankWithVolumeDTO;
import com.marcuschiu.mapstructexample.mapper2.models.dto.VolumeDTO;
import com.marcuschiu.mapstructexample.mapper2.models.internal.FishTank;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FishTankMapper {

    @Mapping(target = "fish.kind", source = "fish.type")
    @Mapping(target = "material.materialType", source = "material")
    @Mapping(target = "quality.document", source = "quality.report")
    @Mapping(target = "volume.length", source = "length")
    @Mapping(target = "volume.width", source = "width")
    @Mapping(target = "volume.height", source = "height")
    FishTankWithVolumeDTO map(FishTank source);

//    @Mapping(target = "fish.type", source = "fish.kind")
//    @Mapping(target = "material", source = "material.materialType")
//    @Mapping(target = "quality.report", source = "quality.document")
//    @Mapping(target = ".", source = "volume")
    @InheritInverseConfiguration
    FishTank map(FishTankWithVolumeDTO source);
}
