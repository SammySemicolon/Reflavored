package com.sammy.reflavored.content.block;

import com.sammy.reflavored.registry.ReflavoredWorldgen;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.trees.Tree;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class ReflavoredSaplingBlock extends SaplingBlock
{
    private final Feature<NoFeatureConfig> tree;
    public ReflavoredSaplingBlock(Feature<NoFeatureConfig> tree,  Properties p_i48337_2_)
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
            tree.generate(world, world.getChunkProvider().generator, rand, pos, null);
        }
    }
}
