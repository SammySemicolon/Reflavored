package com.sammy.reflavored.registry.data;

import com.sammy.reflavored.ReflavoredHelper;
import com.sammy.reflavored.registry.ReflavoredItems;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.sammy.reflavored.ReflavoredMod.MODID;


public class ModItemTagProvider extends ItemTagsProvider
{
    public ModItemTagProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper)
    {
        super(dataGenerator, blockTagProvider, MODID, existingFileHelper);
    }
    
    @Override
    public String getName()
    {
        return "Item Tags";
    }
    
    @Override
    protected void registerTags()
    {
        this.copy(BlockTags.WOOL, ItemTags.WOOL);
        this.copy(BlockTags.PLANKS, ItemTags.PLANKS);
        this.copy(BlockTags.STONE_BRICKS, ItemTags.STONE_BRICKS);
        this.copy(BlockTags.WOODEN_BUTTONS, ItemTags.WOODEN_BUTTONS);
        this.copy(BlockTags.BUTTONS, ItemTags.BUTTONS);
        this.copy(BlockTags.CARPETS, ItemTags.CARPETS);
        this.copy(BlockTags.WOODEN_DOORS, ItemTags.WOODEN_DOORS);
        this.copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        this.copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        this.copy(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);
        this.copy(BlockTags.WOODEN_PRESSURE_PLATES, ItemTags.WOODEN_PRESSURE_PLATES);
        this.copy(BlockTags.DOORS, ItemTags.DOORS);
        this.copy(BlockTags.SAPLINGS, ItemTags.SAPLINGS);
        this.copy(BlockTags.OAK_LOGS, ItemTags.OAK_LOGS);
        this.copy(BlockTags.DARK_OAK_LOGS, ItemTags.DARK_OAK_LOGS);
        this.copy(BlockTags.BIRCH_LOGS, ItemTags.BIRCH_LOGS);
        this.copy(BlockTags.ACACIA_LOGS, ItemTags.ACACIA_LOGS);
        this.copy(BlockTags.SPRUCE_LOGS, ItemTags.SPRUCE_LOGS);
        this.copy(BlockTags.JUNGLE_LOGS, ItemTags.JUNGLE_LOGS);
        this.copy(BlockTags.CRIMSON_STEMS, ItemTags.CRIMSON_STEMS);
        this.copy(BlockTags.WARPED_STEMS, ItemTags.WARPED_STEMS);
        this.copy(BlockTags.LOGS_THAT_BURN, ItemTags.LOGS_THAT_BURN);
        this.copy(BlockTags.LOGS, ItemTags.LOGS);
        this.copy(BlockTags.SAND, ItemTags.SAND);
        this.copy(BlockTags.SLABS, ItemTags.SLABS);
        this.copy(BlockTags.WALLS, ItemTags.WALLS);
        this.copy(BlockTags.STAIRS, ItemTags.STAIRS);
        this.copy(BlockTags.ANVIL, ItemTags.ANVIL);
        this.copy(BlockTags.RAILS, ItemTags.RAILS);
        this.copy(BlockTags.LEAVES, ItemTags.LEAVES);
        this.copy(BlockTags.WOODEN_TRAPDOORS, ItemTags.WOODEN_TRAPDOORS);
        this.copy(BlockTags.TRAPDOORS, ItemTags.TRAPDOORS);
        this.copy(BlockTags.SMALL_FLOWERS, ItemTags.SMALL_FLOWERS);
        this.copy(BlockTags.BEDS, ItemTags.BEDS);
        this.copy(BlockTags.FENCES, ItemTags.FENCES);
        this.copy(BlockTags.TALL_FLOWERS, ItemTags.TALL_FLOWERS);
        this.copy(BlockTags.FLOWERS, ItemTags.FLOWERS);
        this.copy(BlockTags.GOLD_ORES, ItemTags.GOLD_ORES);
        this.copy(BlockTags.SOUL_FIRE_BASE_BLOCKS, ItemTags.SOUL_FIRE_BASE_BLOCKS);

        getOrCreateBuilder(BAOBAB_LOGS).add(ReflavoredItems.BAOBAB_LOG.get(), ReflavoredItems.STRIPPED_BAOBAB_LOG.get(), ReflavoredItems.BAOBAB_WOOD.get(), ReflavoredItems.STRIPPED_BAOBAB_WOOD.get());
        getOrCreateBuilder(FIR_LOGS).add(ReflavoredItems.FIR_LOG.get(), ReflavoredItems.STRIPPED_FIR_LOG.get(), ReflavoredItems.FIR_WOOD.get(), ReflavoredItems.STRIPPED_FIR_WOOD.get());
        getOrCreateBuilder(PINE_LOGS).add(ReflavoredItems.PINE_LOG.get(), ReflavoredItems.STRIPPED_PINE_LOG.get(), ReflavoredItems.PINE_WOOD.get(), ReflavoredItems.STRIPPED_PINE_WOOD.get());
        getOrCreateBuilder(REDWOOD_LOGS).add(ReflavoredItems.REDWOOD_LOG.get(), ReflavoredItems.STRIPPED_REDWOOD_LOG.get(), ReflavoredItems.REDWOOD_WOOD.get(), ReflavoredItems.STRIPPED_REDWOOD_WOOD.get());
        getOrCreateBuilder(SAKURA_LOGS).add(ReflavoredItems.SAKURA_LOG.get(), ReflavoredItems.STRIPPED_SAKURA_LOG.get(), ReflavoredItems.SAKURA_WOOD.get(), ReflavoredItems.STRIPPED_SAKURA_WOOD.get());
        getOrCreateBuilder(WILLOW_LOGS).add(ReflavoredItems.WILLOW_LOG.get(), ReflavoredItems.STRIPPED_WILLOW_LOG.get(), ReflavoredItems.WILLOW_WOOD.get(), ReflavoredItems.STRIPPED_WILLOW_WOOD.get());
        getOrCreateBuilder(PALM_LOGS).add(ReflavoredItems.PALM_LOG.get(), ReflavoredItems.STRIPPED_PALM_LOG.get(), ReflavoredItems.PALM_WOOD.get(), ReflavoredItems.STRIPPED_PALM_WOOD.get());
        getOrCreateBuilder(MANGROVE_LOGS).add(ReflavoredItems.MANGROVE_LOG.get(), ReflavoredItems.STRIPPED_MANGROVE_LOG.get(), ReflavoredItems.MANGROVE_WOOD.get(), ReflavoredItems.STRIPPED_MANGROVE_WOOD.get());
    }
    public static ITag.INamedTag<Item> BAOBAB_LOGS = makeWrapperTag("baobab_logs");
    public static ITag.INamedTag<Item> FIR_LOGS = makeWrapperTag("fir_logs");
    public static ITag.INamedTag<Item> PINE_LOGS = makeWrapperTag("pine_logs");
    public static ITag.INamedTag<Item> REDWOOD_LOGS = makeWrapperTag("redwood_logs");
    public static ITag.INamedTag<Item> SAKURA_LOGS = makeWrapperTag("sakura_logs");
    public static ITag.INamedTag<Item> WILLOW_LOGS = makeWrapperTag("willow_logs");
    public static ITag.INamedTag<Item> PALM_LOGS = makeWrapperTag("palm_logs");
    public static ITag.INamedTag<Item> MANGROVE_LOGS = makeWrapperTag("mangrove_logs");

    public static ITag.INamedTag<Item> makeWrapperTag(String id)
    {
        return ItemTags.createOptional(ReflavoredHelper.prefix(id));
    }
}