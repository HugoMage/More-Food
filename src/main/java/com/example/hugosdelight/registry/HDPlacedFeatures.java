package com.example.hugosdelight.registry;


import com.example.hugosdelight.HugosDelight;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.*;



public class HDPlacedFeatures {
    public static final PlacedFeature PATCH_PRICKLY_PEAR_CACTUS = HDConfiguredFeature.PATCH_PRICKLY_PEAR_CACTUS.placed(VegetationPlacements.worldSurfaceSquaredWithCount(4));


    public static PlacedFeature registerPlacedFeature(String pKey, PlacedFeature pPlacedFeature) {
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(HugosDelight.MOD_ID, pKey), pPlacedFeature);
    }
    public static void register() {
        registerPlacedFeature("patch_prickly_pear_cactus", PATCH_PRICKLY_PEAR_CACTUS);
    }
}
