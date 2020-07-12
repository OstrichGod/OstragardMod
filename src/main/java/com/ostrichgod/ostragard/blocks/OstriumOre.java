package com.ostrichgod.ostragard.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OstriumOre extends Block {

    public OstriumOre() {
        super(Block.Properties.create(Material.IRON)
            .hardnessAndResistance(5.0f,6.0f)
            .sound(SoundType.STONE)
            .harvestLevel(1)
            .harvestTool(ToolType.PICKAXE));
    }
}
