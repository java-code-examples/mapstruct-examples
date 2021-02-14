package com.marcuschiu.mapstructexample.mapper2;

import com.marcuschiu.mapstructexample.mapper2.models.dto.FishDTO;
import com.marcuschiu.mapstructexample.mapper2.models.dto.FishTankWithVolumeDTO;
import com.marcuschiu.mapstructexample.mapper2.models.dto.MaterialDTO;
import com.marcuschiu.mapstructexample.mapper2.models.dto.QualityDTO;
import com.marcuschiu.mapstructexample.mapper2.models.internal.Fish;
import com.marcuschiu.mapstructexample.mapper2.models.internal.FishTank;
import com.marcuschiu.mapstructexample.mapper2.models.internal.Quality;

public class FishTankMapperImpl1 {
    public FishTankMapperImpl1() {
    }

    public FishTankWithVolumeDTO map(FishTank source) {
        if (source == null) {
            return null;
        } else {
            FishTankWithVolumeDTO.FishTankWithVolumeDTOBuilder<?, ?> fishTankWithVolumeDTO = FishTankWithVolumeDTO.builder();
            fishTankWithVolumeDTO.fish(this.fishToFishDTO(source.getFish()));
            fishTankWithVolumeDTO.material(this.fishTankToMaterialDTO(source));
            fishTankWithVolumeDTO.quality(this.qualityToQualityDTO(source.getQuality()));
            return fishTankWithVolumeDTO.build();
        }
    }

    public FishTank map(FishTankWithVolumeDTO source) {
        if (source == null) {
            return null;
        } else {
            FishTank.FishTankBuilder<?, ?> fishTank = FishTank.builder();
            fishTank.fish(this.fishDTOToFish(source.getFish()));
            fishTank.quality(this.qualityDTOToQuality(source.getQuality()));
            fishTank.material(this.sourceMaterialMaterialType(source));
            return fishTank.build();
        }
    }

    protected FishDTO fishToFishDTO(Fish fish) {
        if (fish == null) {
            return null;
        } else {
            FishDTO.FishDTOBuilder<?, ?> fishDTO = FishDTO.builder();
            fishDTO.kind(fish.getType());
            fishDTO.fish(fish.getFish());
            return fishDTO.build();
        }
    }

    protected MaterialDTO fishTankToMaterialDTO(FishTank fishTank) {
        if (fishTank == null) {
            return null;
        } else {
            MaterialDTO.MaterialDTOBuilder<?, ?> materialDTO = MaterialDTO.builder();
            materialDTO.materialType(fishTank.getMaterial());
            return materialDTO.build();
        }
    }

    protected QualityDTO qualityToQualityDTO(Quality quality) {
        if (quality == null) {
            return null;
        } else {
            QualityDTO.QualityDTOBuilder<?, ?> qualityDTO = QualityDTO.builder();
            qualityDTO.document(quality.getReport());
            return qualityDTO.build();
        }
    }

    protected Fish fishDTOToFish(FishDTO fishDTO) {
        if (fishDTO == null) {
            return null;
        } else {
            Fish.FishBuilder<?, ?> fish = Fish.builder();
            fish.type(fishDTO.getKind());
            fish.fish(fishDTO.getFish());
            return fish.build();
        }
    }

    protected Quality qualityDTOToQuality(QualityDTO qualityDTO) {
        if (qualityDTO == null) {
            return null;
        } else {
            Quality.QualityBuilder<?, ?> quality = Quality.builder();
            quality.report(qualityDTO.getDocument());
            return quality.build();
        }
    }

    private String sourceMaterialMaterialType(FishTankWithVolumeDTO fishTankWithVolumeDTO) {
        if (fishTankWithVolumeDTO == null) {
            return null;
        } else {
            MaterialDTO material = fishTankWithVolumeDTO.getMaterial();
            if (material == null) {
                return null;
            } else {
                String materialType = material.getMaterialType();
                return materialType == null ? null : materialType;
            }
        }
    }
}
