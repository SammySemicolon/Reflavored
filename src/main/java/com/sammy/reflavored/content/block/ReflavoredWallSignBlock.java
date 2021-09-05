package com.sammy.reflavored.content.block;

import com.sammy.reflavored.content.tile.ReflavoredSignTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class ReflavoredWallSignBlock extends WallSignBlock
{
    public ReflavoredWallSignBlock(Properties properties, WoodType type)
    {
        super(properties, type);
    }

    @Override
    public boolean hasTileEntity(BlockState state)
    {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world)
    {
        return new ReflavoredSignTileEntity();
    }
}
