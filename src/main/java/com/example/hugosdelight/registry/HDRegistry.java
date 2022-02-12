package com.example.hugosdelight.registry;

import com.example.hugosdelight.HugosDelight;
import com.example.hugosdelight.blocks.plants.JackFruitBlock;
import com.example.hugosdelight.blocks.plants.PricklyPearCactus;
import com.example.hugosdelight.items.JackFruitItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.grower.JungleTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HDRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, HugosDelight.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HugosDelight.MOD_ID);

    //plant
    public static final RegistryObject<PricklyPearCactus> PRICKLY_PEAR_CACTUS = BLOCKS.register("prickly_pear_cactus_seeds",() -> new PricklyPearCactus(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS).sound(SoundType.SWEET_BERRY_BUSH).noCollission().instabreak()));
    public static final RegistryObject<Item> PRICKLY_PEAR_CACTUS_ITEM = ITEMS.register("prickly_pear_cactus_seeds", () -> new BlockItem(PRICKLY_PEAR_CACTUS.get(), new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<JackFruitBlock> JACK_FRUIT_BLOCK = BLOCKS.register("jack_fruit_seeds",() -> new JackFruitBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS).sound(SoundType.SWEET_BERRY_BUSH).noCollission().instabreak()));
    public static final RegistryObject<Item> JACK_FRUIT_ITEM = ITEMS.register("jack_fruit_seeds", () -> new BlockItem(JACK_FRUIT_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    //plants item
    public static final RegistryObject<Item> PRICKLY_PEAR = ITEMS.register("prickly_pear", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.8F).effect(new MobEffectInstance(MobEffects.HARM, 1, 0), 1.0F).build())));
    public static final RegistryObject<Item> JACK_FRUIT = ITEMS.register("jack_fruit", () -> new JackFruitItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.8F).build())));
    public static final RegistryObject<Item> JACK_FRUIT_HALF = ITEMS.register("half_jack_fruit", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.9F).build())));

    //saplings

}
