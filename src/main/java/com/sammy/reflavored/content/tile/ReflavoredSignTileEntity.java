package com.sammy.reflavored.content.tile;

import com.sammy.reflavored.registry.ReflavoredTileEntities;
import net.minecraft.tileentity.TileEntityType;

public class ReflavoredSignTileEntity extends net.minecraft.tileentity.SignTileEntity
{
    @Override
    public TileEntityType<?> getType()
    {
        return ReflavoredTileEntities.SIGN_TILE_ENTITY.get();
    }
}
