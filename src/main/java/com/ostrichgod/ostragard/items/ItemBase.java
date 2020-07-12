package com.ostrichgod.ostragard.items;

import com.ostrichgod.ostragard.Ostragard;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(Ostragard.TAB));
    }
}
