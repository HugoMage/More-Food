package com.example.hugosdelight.registry;

import com.example.hugosdelight.HugosDelight;
import com.example.hugosdelight.WildCropBlock;
import com.example.hugosdelight.blocks.plants.JackFruitBlock;
import com.example.hugosdelight.blocks.plants.PricklyPearCactus;
import com.example.hugosdelight.items.JackFruitItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.*;
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

    //wild plant
    public static final RegistryObject<PricklyPearCactus> PRICKLY_PEAR_CACTUS = BLOCKS.register("prickly_pear_cactus_seeds",() -> new PricklyPearCactus(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS).sound(SoundType.SWEET_BERRY_BUSH).noCollission().instabreak()));
    public static final RegistryObject<Item> PRICKLY_PEAR_CACTUS_ITEM = ITEMS.register("prickly_pear_cactus_seeds", () -> new BlockItem(PRICKLY_PEAR_CACTUS.get(), new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Block> WILD_GARLICS = BLOCKS.register("wild_garlics", () -> new WildCropBlock(MobEffects.JUMP, 6, Block.Properties.copy(Blocks.TALL_GRASS), false));
    public static final RegistryObject<Item> WILD_GARLICS_ITEM = ITEMS.register("wild_garlics", () -> new BlockItem(WILD_GARLICS.get(), new Item.Properties()));
    public static final RegistryObject<Block> JACK_FRUIT_BLOCK = BLOCKS.register("jack_fruit_seeds",() -> new JackFruitBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS).sound(SoundType.SWEET_BERRY_BUSH).noCollission().instabreak()));
    public static final RegistryObject<Item> JACK_FRUIT_ITEM = ITEMS.register("jack_fruit_seeds", () -> new BlockItem(JACK_FRUIT_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Block> WILD_SESAMES = BLOCKS.register("wild_sesames", () -> new WildCropBlock(MobEffects.DIG_SPEED, 6, Block.Properties.copy(Blocks.TALL_GRASS), false));
    public static final RegistryObject<Item> WILD_SESAMES_ITEM = ITEMS.register("wild_sesames", () -> new BlockItem(WILD_SESAMES.get(), new Item.Properties()));

    //Crop
    public static final RegistryObject<Block> GARLIC_CROP = BLOCKS.register("garlics", () -> new CropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP)));
    public static final RegistryObject<Block> SALSIFY_CROP = BLOCKS.register("salsifys", () -> new CropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP)));
    public static final RegistryObject<Block> SESAME_CROP = BLOCKS.register("sesames", () -> new CropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP)));

    //plants item
    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic",() -> new ItemNameBlockItem(HDRegistry.GARLIC_CROP.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_FOOD).food(HDRegistry.GARLIC_FOOD)));
    public static final RegistryObject<Item> SESAME_SEEDS = ITEMS.register("sesame_seeds",() -> new ItemNameBlockItem(HDRegistry.SESAME_CROP.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_FOOD).food(HDRegistry.GARLIC_FOOD)));
    public static final RegistryObject<Item> SALSIFY = ITEMS.register("salsify",() -> new ItemNameBlockItem(HDRegistry.SALSIFY_CROP.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_FOOD).food(HDRegistry.SALSIFY_FOOD)));
    public static final RegistryObject<Item> PRICKLY_PEAR = ITEMS.register("prickly_pear", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.8F).effect(new MobEffectInstance(MobEffects.HARM, 1, 0), 1.0F).build())));
    public static final RegistryObject<Item> JACK_FRUIT = ITEMS.register("jack_fruit", () -> new JackFruitItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.8F).build())));
    public static final RegistryObject<Item> JACK_FRUIT_HALF = ITEMS.register("half_jack_fruit", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.9F).build())));
    public static final RegistryObject<Item> DANDELION_GREENS = ITEMS.register("dandelion_greens", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3F).build())));
    public static final RegistryObject<Item> GRAPES = ITEMS.register("grapes",() -> new ItemNameBlockItem(HDRegistry.GARLIC_CROP.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_FOOD).food(HDRegistry.GRAPES_FOOD)));

    //saplings

    //for roots and plant items with no seeds
    public static final FoodProperties GARLIC_FOOD = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.6F).build();
    public static final FoodProperties GRAPES_FOOD = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.6F).build();
    public static final FoodProperties SESAME_SEED_FOOD = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.3F).build();
    public static final FoodProperties SALSIFY_FOOD = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.5F).build();
}
