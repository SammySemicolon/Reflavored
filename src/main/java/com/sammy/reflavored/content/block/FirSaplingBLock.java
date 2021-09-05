package com.sammy.reflavored.content.block;

import com.sammy.reflavored.registry.ReflavoredWorldgen;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class FirSaplingBLock extends SaplingBlock
{
    public FirSaplingBLock(Properties p_i48337_2_)
    {
        super(null, p_i48337_2_);
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
            if (rand.nextFloat() < 0.1f)
            {
                ReflavoredWorldgen.GIANT_FIR_TREE.generate(world, world.getChunkProvider().generator, rand, pos, null);
                return;
            }
            ReflavoredWorldgen.FIR_TREE.generate(world, world.getChunkProvider().generator, rand, pos, null);
        }
    }
}
