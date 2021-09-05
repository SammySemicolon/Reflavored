package com.sammy.reflavored.content.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import java.util.function.Supplier;

public class VanillaCloneSaplingBlock extends SaplingBlock
{
    private final Supplier<ConfiguredFeature<BaseTreeFeatureConfig, ?>> tree;
    public VanillaCloneSaplingBlock(Supplier<ConfiguredFeature<BaseTreeFeatureConfig, ?>> tree, Properties p_i48337_2_)
    {
        super(null, p_i48337_2_);
        this.tree = tree;
    }
    @Override
    public void placeTree(ServerWorld world, BlockPos pos, BlockState state, Random rand)
    {
        if (state.get(STAGE) == 0)
        {
            world.setBlockState(pos, state.func_235896_a_(STAGE), 4);
        }
        else
        {
            if (!net.minecraftforge.event.ForgeEventFactory.saplingGrowTree(world, rand, pos))
            {
                return;
            }
            world.setBlockState(pos, Blocks.AIR.getDefaultState());
            boolean success = tree.get().generate(world, world.getChunkProvider().generator, rand, pos);
            if (!success)
            {
                world.setBlockState(pos, state);
            }
        }
    }
}
