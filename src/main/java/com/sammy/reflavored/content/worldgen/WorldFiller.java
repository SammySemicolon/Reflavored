package com.sammy.reflavored.content.worldgen;

import com.sammy.reflavored.ReflavoredHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.World;

import java.util.ArrayList;

public class WorldFiller
{
    public ArrayList<BlockStateEntry> entries = new ArrayList<>();

    public WorldFiller()
    {

    }

    public void fill(ISeedReader reader, boolean safetyCheck)
    {
        for (BlockStateEntry entry : entries)
        {
            if (safetyCheck && !entry.canPlace(reader))
            {
                continue;
            }
            reader.setBlockState(entry.pos, entry.state, 3);
            entry.additionalPlacement(reader);
            if (reader instanceof World)
            {
                ReflavoredHelper.updateState((World) reader, entry.pos);
            }
        }
    }
    public void replaceAt(int index, BlockStateEntry entry)
    {
        entries.set(index, entry);
    }

    public static class BlockStateEntry
    {
        public final BlockState state;
        public final BlockPos pos;

        public BlockStateEntry(BlockState state, BlockPos pos)
        {
            this.state = state;
            this.pos = pos;
        }

        public boolean canPlace(ISeedReader reader)
        {
            return canPlace(reader, pos);
        }

        public boolean canPlace(ISeedReader reader, BlockPos pos)
        {
            if (World.isOutsideBuildHeight(pos))
            {
                return false;
            }
            BlockState state = reader.getBlockState(pos);
            return reader.isAirBlock(pos) || state.getMaterial().isReplaceable();
        }

        public boolean canPlace(ISeedReader reader, BlockPos pos, Block block)
        {
            if (World.isOutsideBuildHeight(pos))
            {
                return false;
            }
            BlockState state = reader.getBlockState(pos);
            return state.getBlock().equals(block) || reader.isAirBlock(pos) || state.getMaterial().isReplaceable();
        }

        public void additionalPlacement(ISeedReader reader)
        {

        }
    }
}