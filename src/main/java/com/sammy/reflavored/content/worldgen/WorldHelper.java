package com.sammy.reflavored.content.worldgen;

import com.sammy.reflavored.content.block.ReflavoredSaplingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.trees.Tree;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.World;

import java.util.Random;

public class WorldHelper
{
    public static void makeLeafSlice(WorldFiller filler, Block block, BlockPos pos, int leavesSize)
    {
        for (int x = -leavesSize; x <= leavesSize; x++)
        {
            for (int z = -leavesSize; z <= leavesSize; z++)
            {
                if (Math.abs(x) == leavesSize && Math.abs(z) == leavesSize)
                {
                    continue;
                }
                BlockPos leavesPos = new BlockPos(pos).add(x, 0, z);
                filler.entries.add(new WorldFiller.BlockStateEntry(block.getDefaultState().with(LeavesBlock.DISTANCE, 1),leavesPos));
            }
        }
    }

    public static void makeDiamondLeafSlice(WorldFiller filler, Block block, BlockPos pos, int leavesSize)
    {
        if (leavesSize == 1)
        {
            makeLeafSlice(filler, block, pos, leavesSize);
            return;
        }
        for (int x = -leavesSize; x <= leavesSize; x++)
        {
            for (int z = -leavesSize; z <= leavesSize; z++)
            {
                if (Math.abs(x) + Math.abs(z) > leavesSize)
                {
                    continue;
                }
                BlockPos leavesPos = new BlockPos(pos).add(x, 0, z);
                filler.entries.add(new WorldFiller.BlockStateEntry(block.getDefaultState().with(LeavesBlock.DISTANCE, 1),leavesPos));
            }
        }
    }

    public static boolean canPlace(ISeedReader reader, BlockPos pos)
    {
        if (World.isOutsideBuildHeight(pos))
        {
            return false;
        }
        BlockState state = reader.getBlockState(pos);
        return state.getBlock() instanceof ReflavoredSaplingBlock || reader.isAirBlock(pos) || state.getMaterial().isReplaceable();
    }
}
