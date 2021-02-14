package com.marcuschiu.mapstructexample.mapper2;

import com.marcuschiu.mapstructexample.mapper2.models.dto.*;
import com.marcuschiu.mapstructexample.mapper2.models.internal.Fish;
import com.marcuschiu.mapstructexample.mapper2.models.internal.FishTank;
import com.marcuschiu.mapstructexample.mapper2.models.internal.Quality;

public class FishTankMapperImpl2 {
    public FishTankMapperImpl2() {
    }

    public FishTankWithVolumeDTO map(FishTank source) {
        if (source == null) {
            return null;
        } else {
            FishTankWithVolumeDTO.FishTankWithVolumeDTOBuilder<?, ?> fishTankWithVolumeDTO = FishTankWithVolumeDTO.builder();
            fishTankWithVolumeDTO.fish(this.fishToFishDTO(source.getFish()));
            fishTankWithVolumeDTO.material(this.fishTankToMaterialDTO(source));
            fishTankWithVolumeDTO.quality(this.qualityToQualityDTO(source.getQuality()));
            fishTankWithVolumeDTO.volume(this.fishTankToVolumeDTO(source));
            return fishTankWithVolumeDTO.build();
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

    protected VolumeDTO fishTankToVolumeDTO(FishTank fishTank) {
        if (fishTank == null) {
            return null;
        } else {
            VolumeDTO.VolumeDTOBuilder<?, ?> volumeDTO = VolumeDTO.builder();
            volumeDTO.length(fishTank.getLength());
            volumeDTO.width(fishTank.getWidth());
            volumeDTO.height(fishTank.getHeight());
            return volumeDTO.build();
        }
    }
}

