package com.sammy.reflavored.registry;

import com.sammy.reflavored.ReflavoredMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class ReflavoredCreativeTab extends ItemGroup
{
    public static final ReflavoredCreativeTab INSTANCE = new ReflavoredCreativeTab();

    public ReflavoredCreativeTab() {
        super(ReflavoredMod.MODID);
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ReflavoredItems.BAOBAB_SAPLING.get());
    }
}
