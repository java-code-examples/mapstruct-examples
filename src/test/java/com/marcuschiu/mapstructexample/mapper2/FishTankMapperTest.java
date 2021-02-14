package com.marcuschiu.mapstructexample.mapper2;

import com.marcuschiu.mapstructexample.MapstructExampleApplication;
import com.marcuschiu.mapstructexample.mapper2.models.dto.FishTankWithVolumeDTO;
import com.marcuschiu.mapstructexample.mapper2.models.internal.Fish;
import com.marcuschiu.mapstructexample.mapper2.models.internal.FishTank;
import com.marcuschiu.mapstructexample.mapper2.models.internal.Quality;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = MapstructExampleApplication.class)
public class FishTankMapperTest {

    @Autowired
    FishTankMapper fishTankMapper;

    @Test
    public void test() {
        FishTank ft = new FishTank();
        ft.fish = Fish.builder().type("angel fish").build();
        ft.material = "stone";
        ft.quality = Quality.builder().report("stinky").build();
        ft.length = 1;
        ft.width = 2;
        ft.height = 3;

        FishTankWithVolumeDTO fishTankWithVolumeDTO = fishTankMapper.map(ft);
        FishTank mappedFishTank = fishTankMapper.map(fishTankWithVolumeDTO);

        assertEquals(ft, mappedFishTank);
    }
}
