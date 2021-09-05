package com.sammy.reflavored.content.worldgen.trees;

import com.sammy.reflavored.content.worldgen.WorldFiller;
import com.sammy.reflavored.registry.ReflavoredBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;

import static com.sammy.reflavored.content.worldgen.WorldHelper.makeDiamondLeafSlice;
import static net.minecraft.world.gen.feature.NoFeatureConfig.field_236558_a_;

public class PalmTreeFeature extends Feature<NoFeatureConfig>
{
    public PalmTreeFeature()
    {
        super(field_236558_a_);
    }

    @Override
    public boolean generate(ISeedReader reader, ChunkGenerator generator, Random rand, BlockPos pos, NoFeatureConfig config)
    {
        if (reader.isAirBlock(pos.down()) || !ReflavoredBlocks.PALM_SAPLING.get().getDefaultState().isValidPosition(reader, pos))
        {
            return false;
        }
        int trunkHeight = 9;
        int extraTrunkHeight = 2;
        BlockState logState = ReflavoredBlocks.PALM_LOG.get().getDefaultState();
        WorldFiller treeFiller = new WorldFiller();
        WorldFiller leavesFiller = new WorldFiller();

        Direction[] directions = new Direction[]{Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST};
        Direction offsetDirection = directions[rand.nextInt(directions.length)];
        int extraHeight = rand.nextInt(extraTrunkHeight+1);
        for (int i =0; i < trunkHeight+extraHeight;i++)
        {
            BlockPos trunkPos = pos.up(i);
            if (i > (trunkHeight+extraHeight)/4f)
            {
                trunkPos = trunkPos.offset(offsetDirection);
            }
            treeFiller.entries.add(new WorldFiller.BlockStateEntry(logState, trunkPos));
        }
        makeLeafBlob(leavesFiller, ReflavoredBlocks.PALM_LEAVES.get(), pos.up(7+extraHeight).offset(offsetDirection));
        treeFiller.fill(reader, false);
        leavesFiller.fill(reader, true);
        return true;
    }
    public static void makeLeafBlob(WorldFiller filler, Block block, BlockPos pos)
    {
        makeDiamondLeafSlice(filler, block, pos, 1);
        makePalmLeafSlice(filler, block, pos.up(1), 4);
        makeDiamondLeafSlice(filler, block, pos.up(2), 1);

        filler.entries.add(new WorldFiller.BlockStateEntry(block.getDefaultState(), pos.up(3)));
    }
    public static void makePalmLeafSlice(WorldFiller filler, Block block, BlockPos pos, int leavesSize)
    {
        for (int i = -leavesSize; i <= leavesSize; i++)
        {
            int offset = i > 0 ? 1 : -1;
            BlockPos leavesPos = new BlockPos(pos).add(i, 0, 0);
            filler.entries.add(new WorldFiller.BlockStateEntry(block.getDefaultState().with(LeavesBlock.DISTANCE, 1), leavesPos));
            if (Math.abs(i) == leavesSize)
            {
                filler.entries.add(new WorldFiller.BlockStateEntry(block.getDefaultState().with(LeavesBlock.DISTANCE, 1), leavesPos.down()));
                filler.entries.add(new WorldFiller.BlockStateEntry(block.getDefaultState().with(LeavesBlock.DISTANCE, 1), leavesPos.down().add(offset, 0,0)));
            }
            leavesPos = new BlockPos(pos).add(0, 0, i);
            filler.entries.add(new WorldFiller.BlockStateEntry(block.getDefaultState().with(LeavesBlock.DISTANCE, 1), leavesPos));
            if (Math.abs(i) == leavesSize)
            {
                filler.entries.add(new WorldFiller.BlockStateEntry(block.getDefaultState().with(LeavesBlock.DISTANCE, 1), leavesPos.down()));
                filler.entries.add(new WorldFiller.BlockStateEntry(block.getDefaultState().with(LeavesBlock.DISTANCE, 1), leavesPos.down().add(0,0,offset)));
            }
        }
    }
}