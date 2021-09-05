package com.sammy.reflavored.content.block;

import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraftforge.fml.RegistryObject;

public class ModStairsBlock extends StairsBlock
{
    public ModStairsBlock(RegistryObject<Block> object, Properties properties)
    {
        super(() -> object.get().getDefaultState(), properties);
    }

}
