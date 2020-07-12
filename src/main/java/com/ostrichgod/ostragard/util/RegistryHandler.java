package com.ostrichgod.ostragard.util;

import com.ostrichgod.ostragard.Ostragard;
import com.ostrichgod.ostragard.blocks.BlockItemBase;
import com.ostrichgod.ostragard.blocks.EggEnergizer;
import com.ostrichgod.ostragard.blocks.OstriumBlock;
import com.ostrichgod.ostragard.blocks.OstriumOre;
import com.ostrichgod.ostragard.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Ostragard.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Ostragard.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
}

    //Items
    public static final RegistryObject<Item> OSTRICH_EGG = ITEMS.register("ostrich_egg", ItemBase::new);
    public static final RegistryObject<Item> OSTRIUM_INGOT = ITEMS.register("ostrium_ingot", ItemBase::new);
    public static final RegistryObject<Item> UNSTABLE_OSTRIUM = ITEMS.register("unstable_ostrium", ItemBase::new);

    //Blocks
    public static final RegistryObject<Block> OSTRIUM_BLOCK = BLOCKS.register("ostrium_block", OstriumBlock::new);
    public static final RegistryObject<Block> EGG_ENERGIZER = BLOCKS.register("egg_energizer", EggEnergizer::new);
    public static final RegistryObject<Block> OSTRIUM_ORE = BLOCKS.register("ostrium_ore", OstriumOre::new);

    //Block Items
    public static final RegistryObject<Item> OSTRIUM_BLOCK_ITEM = ITEMS.register("ostrium_block", () -> new BlockItemBase(OSTRIUM_BLOCK.get()));
    public static final RegistryObject<Item> EGG_ENERGIZER_ITEM = ITEMS.register("egg_energizer", () -> new BlockItemBase(EGG_ENERGIZER.get()));
    public static final RegistryObject<Item> OSTRIUM_ORE_ITEM = ITEMS.register("ostrium_ore", () -> new BlockItemBase(OSTRIUM_ORE.get()));
}
