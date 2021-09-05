package com.sammy.reflavored.content.worldgen.trees;

import com.sammy.reflavored.content.worldgen.WorldFiller;
import com.sammy.reflavored.registry.ReflavoredBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RespawnAnchorBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;

import static com.sammy.reflavored.content.worldgen.WorldHelper.makeDiamondLeafSlice;
import static com.sammy.reflavored.content.worldgen.WorldHelper.makeLeafSlice;
import static net.minecraft.world.gen.feature.NoFeatureConfig.field_236558_a_;

public class FirTreeFeature extends Feature<NoFeatureConfig>
{
    public FirTreeFeature()
    {
        super(field_236558_a_);
    }

    @Override
    public boolean generate(ISeedReader reader, ChunkGenerator generator, Random rand, BlockPos pos, NoFeatureConfig config)
    {
        if (reader.isAirBlock(pos.down()) || !ReflavoredBlocks.FIR_SAPLING.get().getDefaultState().isValidPosition(reader, pos))
        {
            return false;
        }
        int trunkHeight = 10;
        int extraTrunkHeight = 3;
        BlockState logState = ReflavoredBlocks.FIR_LOG.get().getDefaultState();
        WorldFiller treeFiller = new WorldFiller();
        WorldFiller leavesFiller = new WorldFiller();


        int extraHeight = rand.nextInt(extraTrunkHeight+1);
        for (int i =0; i < trunkHeight+extraHeight;i++)
        {
            BlockPos trunkPos = pos.up(i);
            treeFiller.entries.add(new WorldFiller.BlockStateEntry(logState, trunkPos));
        }
        makeLeafBlob(leavesFiller, ReflavoredBlocks.FIR_LEAVES.get(), pos.up(5+extraHeight));
        treeFiller.fill(reader, false);
        leavesFiller.fill(reader, true);
        return true;
    }
    public static void makeLeafBlob(WorldFiller filler, Block block, BlockPos pos)
    {
        makeDiamondLeafSlice(filler, block, pos, 1);
        makeDiamondLeafSlice(filler, block, pos.up(1), 2);
        makeDiamondLeafSlice(filler, block, pos.up(2), 1);
        makeDiamondLeafSlice(filler, block, pos.up(3), 2);
        makeDiamondLeafSlice(filler, block, pos.up(4), 1);
        makeDiamondLeafSlice(filler, block, pos.up(5), 2);
        makeDiamondLeafSlice(filler, block, pos.up(6), 1);
        filler.entries.add(new WorldFiller.BlockStateEntry(block.getDefaultState(), pos.up(7)));
    }
}