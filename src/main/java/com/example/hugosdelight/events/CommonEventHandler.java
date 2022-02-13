package com.example.hugosdelight.events;

import com.example.hugosdelight.HugosDelight;
import com.example.hugosdelight.registry.HDPlacedFeatures;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = HugosDelight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonEventHandler {
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void onBiomeLoad(BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder builder = event.getGeneration();
        String name = event.getName().getPath();

        if (event.getCategory() == Biome.BiomeCategory.DESERT) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(() -> HDPlacedFeatures.PATCH_PRICKLY_PEAR_CACTUS);
        }
    }
}