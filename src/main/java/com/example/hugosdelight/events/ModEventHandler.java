package com.example.hugosdelight.events;

import com.example.hugosdelight.HugosDelight;
import com.example.hugosdelight.registry.HDConfiguredFeature;
import com.example.hugosdelight.registry.HDPlacedFeatures;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = HugosDelight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventHandler {
    @SubscribeEvent
    public static void init(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            HDConfiguredFeature.register();
            HDPlacedFeatures.register();
        });
    }
}
