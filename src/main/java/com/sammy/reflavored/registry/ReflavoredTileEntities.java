package com.sammy.reflavored.registry;

import com.sammy.reflavored.ReflavoredHelper;
import com.sammy.reflavored.content.block.ReflavoredStandingSignBlock;
import com.sammy.reflavored.content.block.ReflavoredWallSignBlock;
import com.sammy.reflavored.content.tile.ReflavoredSignTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.sammy.reflavored.ReflavoredMod.MODID;

public class ReflavoredTileEntities
{
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, MODID);

    public static final RegistryObject<TileEntityType<ReflavoredSignTileEntity>> SIGN_TILE_ENTITY = TILE_ENTITIES.register("sign_tile_entity", () -> TileEntityType.Builder.create(ReflavoredSignTileEntity::new, ReflavoredHelper.getModBlocks(ReflavoredWallSignBlock.class, ReflavoredStandingSignBlock.class)).build(null));

}
