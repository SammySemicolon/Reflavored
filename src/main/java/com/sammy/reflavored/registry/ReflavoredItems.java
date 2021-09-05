package com.sammy.reflavored.registry;

import com.sammy.reflavored.ReflavoredMod;
import com.sammy.reflavored.content.entity.ReflavoredBoatEntity;
import com.sammy.reflavored.content.item.ReflavoredBoatItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ReflavoredItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ReflavoredMod.MODID);

    public static Item.Properties DEFAULT_PROPERTIES()
    {
        return new Item.Properties().group(ReflavoredCreativeTab.INSTANCE);
    }
    public static final RegistryObject<Item> BAOBAB_SAPLING = ITEMS.register("baobab_sapling", () -> new BlockItem(ReflavoredBlocks.BAOBAB_SAPLING.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> BAOBAB_LEAVES = ITEMS.register("baobab_leaves", () -> new BlockItem(ReflavoredBlocks.BAOBAB_LEAVES.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> BAOBAB_LOG = ITEMS.register("baobab_log", () -> new BlockItem(ReflavoredBlocks.BAOBAB_LOG.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> STRIPPED_BAOBAB_LOG = ITEMS.register("stripped_baobab_log", () -> new BlockItem(ReflavoredBlocks.STRIPPED_BAOBAB_LOG.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> BAOBAB_WOOD = ITEMS.register("baobab_wood", () -> new BlockItem(ReflavoredBlocks.BAOBAB_WOOD.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> STRIPPED_BAOBAB_WOOD = ITEMS.register("stripped_baobab_wood", () -> new BlockItem(ReflavoredBlocks.STRIPPED_BAOBAB_WOOD.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> BAOBAB_PLANKS = ITEMS.register("baobab_planks", () -> new BlockItem(ReflavoredBlocks.BAOBAB_PLANKS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> BAOBAB_PLANKS_SLAB = ITEMS.register("baobab_planks_slab", () -> new BlockItem(ReflavoredBlocks.BAOBAB_PLANKS_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> BAOBAB_PLANKS_STAIRS = ITEMS.register("baobab_planks_stairs", () -> new BlockItem(ReflavoredBlocks.BAOBAB_PLANKS_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> BAOBAB_DOOR = ITEMS.register("baobab_door", () -> new BlockItem(ReflavoredBlocks.BAOBAB_DOOR.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> BAOBAB_TRAPDOOR = ITEMS.register("baobab_trapdoor", () -> new BlockItem(ReflavoredBlocks.BAOBAB_TRAPDOOR.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> BAOBAB_PLANKS_BUTTON = ITEMS.register("baobab_planks_button", () -> new BlockItem(ReflavoredBlocks.BAOBAB_PLANKS_BUTTON.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> BAOBAB_PLANKS_PRESSURE_PLATE = ITEMS.register("baobab_planks_pressure_plate", () -> new BlockItem(ReflavoredBlocks.BAOBAB_PLANKS_PRESSURE_PLATE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> BAOBAB_PLANKS_FENCE = ITEMS.register("baobab_planks_fence", () -> new BlockItem(ReflavoredBlocks.BAOBAB_PLANKS_FENCE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> BAOBAB_PLANKS_FENCE_GATE = ITEMS.register("baobab_planks_fence_gate", () -> new BlockItem(ReflavoredBlocks.BAOBAB_PLANKS_FENCE_GATE.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> BAOBAB_SIGN = ITEMS.register("baobab_sign", () -> new SignItem(DEFAULT_PROPERTIES().maxStackSize(16), ReflavoredBlocks.BAOBAB_SIGN.get(), ReflavoredBlocks.BAOBAB_WALL_SIGN.get()));
    public static final RegistryObject<Item> BAOBAB_BOAT = ITEMS.register("baobab_boat", () -> new ReflavoredBoatItem(DEFAULT_PROPERTIES().maxStackSize(1), ReflavoredEntities.BAOBAB_BOAT));

    public static final RegistryObject<Item> FIR_SAPLING = ITEMS.register("fir_sapling", () -> new BlockItem(ReflavoredBlocks.FIR_SAPLING.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> FIR_LEAVES = ITEMS.register("fir_leaves", () -> new BlockItem(ReflavoredBlocks.FIR_LEAVES.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> FIR_LOG = ITEMS.register("fir_log", () -> new BlockItem(ReflavoredBlocks.FIR_LOG.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> STRIPPED_FIR_LOG = ITEMS.register("stripped_fir_log", () -> new BlockItem(ReflavoredBlocks.STRIPPED_FIR_LOG.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> FIR_WOOD = ITEMS.register("fir_wood", () -> new BlockItem(ReflavoredBlocks.FIR_WOOD.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> STRIPPED_FIR_WOOD = ITEMS.register("stripped_fir_wood", () -> new BlockItem(ReflavoredBlocks.STRIPPED_FIR_WOOD.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> FIR_PLANKS = ITEMS.register("fir_planks", () -> new BlockItem(ReflavoredBlocks.FIR_PLANKS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> FIR_PLANKS_SLAB = ITEMS.register("fir_planks_slab", () -> new BlockItem(ReflavoredBlocks.FIR_PLANKS_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> FIR_PLANKS_STAIRS = ITEMS.register("fir_planks_stairs", () -> new BlockItem(ReflavoredBlocks.FIR_PLANKS_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> FIR_DOOR = ITEMS.register("fir_door", () -> new BlockItem(ReflavoredBlocks.FIR_DOOR.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> FIR_TRAPDOOR = ITEMS.register("fir_trapdoor", () -> new BlockItem(ReflavoredBlocks.FIR_TRAPDOOR.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> FIR_PLANKS_BUTTON = ITEMS.register("fir_planks_button", () -> new BlockItem(ReflavoredBlocks.FIR_PLANKS_BUTTON.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> FIR_PLANKS_PRESSURE_PLATE = ITEMS.register("fir_planks_pressure_plate", () -> new BlockItem(ReflavoredBlocks.FIR_PLANKS_PRESSURE_PLATE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> FIR_PLANKS_FENCE = ITEMS.register("fir_planks_fence", () -> new BlockItem(ReflavoredBlocks.FIR_PLANKS_FENCE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> FIR_PLANKS_FENCE_GATE = ITEMS.register("fir_planks_fence_gate", () -> new BlockItem(ReflavoredBlocks.FIR_PLANKS_FENCE_GATE.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> FIR_SIGN = ITEMS.register("fir_sign", () -> new SignItem(DEFAULT_PROPERTIES().maxStackSize(16), ReflavoredBlocks.FIR_SIGN.get(), ReflavoredBlocks.FIR_WALL_SIGN.get()));
    public static final RegistryObject<Item> FIR_BOAT = ITEMS.register("fir_boat", () -> new ReflavoredBoatItem(DEFAULT_PROPERTIES().maxStackSize(1), ReflavoredEntities.FIR_BOAT));

    public static final RegistryObject<Item> PINE_SAPLING = ITEMS.register("pine_sapling", () -> new BlockItem(ReflavoredBlocks.PINE_SAPLING.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PINE_LEAVES = ITEMS.register("pine_leaves", () -> new BlockItem(ReflavoredBlocks.PINE_LEAVES.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PINE_LOG = ITEMS.register("pine_log", () -> new BlockItem(ReflavoredBlocks.PINE_LOG.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> STRIPPED_PINE_LOG = ITEMS.register("stripped_pine_log", () -> new BlockItem(ReflavoredBlocks.STRIPPED_PINE_LOG.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PINE_WOOD = ITEMS.register("pine_wood", () -> new BlockItem(ReflavoredBlocks.PINE_WOOD.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> STRIPPED_PINE_WOOD = ITEMS.register("stripped_pine_wood", () -> new BlockItem(ReflavoredBlocks.STRIPPED_PINE_WOOD.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PINE_PLANKS = ITEMS.register("pine_planks", () -> new BlockItem(ReflavoredBlocks.PINE_PLANKS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PINE_PLANKS_SLAB = ITEMS.register("pine_planks_slab", () -> new BlockItem(ReflavoredBlocks.PINE_PLANKS_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PINE_PLANKS_STAIRS = ITEMS.register("pine_planks_stairs", () -> new BlockItem(ReflavoredBlocks.PINE_PLANKS_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PINE_DOOR = ITEMS.register("pine_door", () -> new BlockItem(ReflavoredBlocks.PINE_DOOR.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PINE_TRAPDOOR = ITEMS.register("pine_trapdoor", () -> new BlockItem(ReflavoredBlocks.PINE_TRAPDOOR.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PINE_PLANKS_BUTTON = ITEMS.register("pine_planks_button", () -> new BlockItem(ReflavoredBlocks.PINE_PLANKS_BUTTON.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PINE_PLANKS_PRESSURE_PLATE = ITEMS.register("pine_planks_pressure_plate", () -> new BlockItem(ReflavoredBlocks.PINE_PLANKS_PRESSURE_PLATE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PINE_PLANKS_FENCE = ITEMS.register("pine_planks_fence", () -> new BlockItem(ReflavoredBlocks.PINE_PLANKS_FENCE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PINE_PLANKS_FENCE_GATE = ITEMS.register("pine_planks_fence_gate", () -> new BlockItem(ReflavoredBlocks.PINE_PLANKS_FENCE_GATE.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> PINE_SIGN = ITEMS.register("pine_sign", () -> new SignItem(DEFAULT_PROPERTIES().maxStackSize(16), ReflavoredBlocks.PINE_SIGN.get(), ReflavoredBlocks.PINE_WALL_SIGN.get()));
    public static final RegistryObject<Item> PINE_BOAT = ITEMS.register("pine_boat", () -> new ReflavoredBoatItem(DEFAULT_PROPERTIES().maxStackSize(1), ReflavoredEntities.PINE_BOAT));

    public static final RegistryObject<Item> REDWOOD_SAPLING = ITEMS.register("redwood_sapling", () -> new BlockItem(ReflavoredBlocks.REDWOOD_SAPLING.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> REDWOOD_LEAVES = ITEMS.register("redwood_leaves", () -> new BlockItem(ReflavoredBlocks.REDWOOD_LEAVES.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> REDWOOD_LOG = ITEMS.register("redwood_log", () -> new BlockItem(ReflavoredBlocks.REDWOOD_LOG.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> STRIPPED_REDWOOD_LOG = ITEMS.register("stripped_redwood_log", () -> new BlockItem(ReflavoredBlocks.STRIPPED_REDWOOD_LOG.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> REDWOOD_WOOD = ITEMS.register("redwood_wood", () -> new BlockItem(ReflavoredBlocks.REDWOOD_WOOD.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> STRIPPED_REDWOOD_WOOD = ITEMS.register("stripped_redwood_wood", () -> new BlockItem(ReflavoredBlocks.STRIPPED_REDWOOD_WOOD.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> REDWOOD_PLANKS = ITEMS.register("redwood_planks", () -> new BlockItem(ReflavoredBlocks.REDWOOD_PLANKS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> REDWOOD_PLANKS_SLAB = ITEMS.register("redwood_planks_slab", () -> new BlockItem(ReflavoredBlocks.REDWOOD_PLANKS_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> REDWOOD_PLANKS_STAIRS = ITEMS.register("redwood_planks_stairs", () -> new BlockItem(ReflavoredBlocks.REDWOOD_PLANKS_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> REDWOOD_DOOR = ITEMS.register("redwood_door", () -> new BlockItem(ReflavoredBlocks.REDWOOD_DOOR.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> REDWOOD_TRAPDOOR = ITEMS.register("redwood_trapdoor", () -> new BlockItem(ReflavoredBlocks.REDWOOD_TRAPDOOR.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> REDWOOD_PLANKS_BUTTON = ITEMS.register("redwood_planks_button", () -> new BlockItem(ReflavoredBlocks.REDWOOD_PLANKS_BUTTON.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> REDWOOD_PLANKS_PRESSURE_PLATE = ITEMS.register("redwood_planks_pressure_plate", () -> new BlockItem(ReflavoredBlocks.REDWOOD_PLANKS_PRESSURE_PLATE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> REDWOOD_PLANKS_FENCE = ITEMS.register("redwood_planks_fence", () -> new BlockItem(ReflavoredBlocks.REDWOOD_PLANKS_FENCE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> REDWOOD_PLANKS_FENCE_GATE = ITEMS.register("redwood_planks_fence_gate", () -> new BlockItem(ReflavoredBlocks.REDWOOD_PLANKS_FENCE_GATE.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> REDWOOD_SIGN = ITEMS.register("redwood_sign", () -> new SignItem(DEFAULT_PROPERTIES().maxStackSize(16), ReflavoredBlocks.REDWOOD_SIGN.get(), ReflavoredBlocks.REDWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> REDWOOD_BOAT = ITEMS.register("redwood_boat", () -> new ReflavoredBoatItem(DEFAULT_PROPERTIES().maxStackSize(1), ReflavoredEntities.REDWOOD_BOAT));

    public static final RegistryObject<Item> SAKURA_SAPLING = ITEMS.register("sakura_sapling", () -> new BlockItem(ReflavoredBlocks.SAKURA_SAPLING.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> SAKURA_LEAVES = ITEMS.register("sakura_leaves", () -> new BlockItem(ReflavoredBlocks.SAKURA_LEAVES.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> SAKURA_LOG = ITEMS.register("sakura_log", () -> new BlockItem(ReflavoredBlocks.SAKURA_LOG.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> STRIPPED_SAKURA_LOG = ITEMS.register("stripped_sakura_log", () -> new BlockItem(ReflavoredBlocks.STRIPPED_SAKURA_LOG.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> SAKURA_WOOD = ITEMS.register("sakura_wood", () -> new BlockItem(ReflavoredBlocks.SAKURA_WOOD.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> STRIPPED_SAKURA_WOOD = ITEMS.register("stripped_sakura_wood", () -> new BlockItem(ReflavoredBlocks.STRIPPED_SAKURA_WOOD.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> SAKURA_PLANKS = ITEMS.register("sakura_planks", () -> new BlockItem(ReflavoredBlocks.SAKURA_PLANKS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> SAKURA_PLANKS_SLAB = ITEMS.register("sakura_planks_slab", () -> new BlockItem(ReflavoredBlocks.SAKURA_PLANKS_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> SAKURA_PLANKS_STAIRS = ITEMS.register("sakura_planks_stairs", () -> new BlockItem(ReflavoredBlocks.SAKURA_PLANKS_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> SAKURA_DOOR = ITEMS.register("sakura_door", () -> new BlockItem(ReflavoredBlocks.SAKURA_DOOR.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> SAKURA_TRAPDOOR = ITEMS.register("sakura_trapdoor", () -> new BlockItem(ReflavoredBlocks.SAKURA_TRAPDOOR.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> SAKURA_PLANKS_BUTTON = ITEMS.register("sakura_planks_button", () -> new BlockItem(ReflavoredBlocks.SAKURA_PLANKS_BUTTON.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> SAKURA_PLANKS_PRESSURE_PLATE = ITEMS.register("sakura_planks_pressure_plate", () -> new BlockItem(ReflavoredBlocks.SAKURA_PLANKS_PRESSURE_PLATE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> SAKURA_PLANKS_FENCE = ITEMS.register("sakura_planks_fence", () -> new BlockItem(ReflavoredBlocks.SAKURA_PLANKS_FENCE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> SAKURA_PLANKS_FENCE_GATE = ITEMS.register("sakura_planks_fence_gate", () -> new BlockItem(ReflavoredBlocks.SAKURA_PLANKS_FENCE_GATE.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> SAKURA_SIGN = ITEMS.register("sakura_sign", () -> new SignItem(DEFAULT_PROPERTIES().maxStackSize(16), ReflavoredBlocks.SAKURA_SIGN.get(), ReflavoredBlocks.SAKURA_WALL_SIGN.get()));
    public static final RegistryObject<Item> SAKURA_BOAT = ITEMS.register("sakura_boat", () -> new ReflavoredBoatItem(DEFAULT_PROPERTIES().maxStackSize(1), ReflavoredEntities.SAKURA_BOAT));

    public static final RegistryObject<Item> WILLOW_SAPLING = ITEMS.register("willow_sapling", () -> new BlockItem(ReflavoredBlocks.WILLOW_SAPLING.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> WILLOW_LEAVES = ITEMS.register("willow_leaves", () -> new BlockItem(ReflavoredBlocks.WILLOW_LEAVES.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> WILLOW_LOG = ITEMS.register("willow_log", () -> new BlockItem(ReflavoredBlocks.WILLOW_LOG.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_LOG = ITEMS.register("stripped_willow_log", () -> new BlockItem(ReflavoredBlocks.STRIPPED_WILLOW_LOG.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> WILLOW_WOOD = ITEMS.register("willow_wood", () -> new BlockItem(ReflavoredBlocks.WILLOW_WOOD.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_WOOD = ITEMS.register("stripped_willow_wood", () -> new BlockItem(ReflavoredBlocks.STRIPPED_WILLOW_WOOD.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> WILLOW_PLANKS = ITEMS.register("willow_planks", () -> new BlockItem(ReflavoredBlocks.WILLOW_PLANKS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> WILLOW_PLANKS_SLAB = ITEMS.register("willow_planks_slab", () -> new BlockItem(ReflavoredBlocks.WILLOW_PLANKS_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> WILLOW_PLANKS_STAIRS = ITEMS.register("willow_planks_stairs", () -> new BlockItem(ReflavoredBlocks.WILLOW_PLANKS_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> WILLOW_DOOR = ITEMS.register("willow_door", () -> new BlockItem(ReflavoredBlocks.WILLOW_DOOR.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> WILLOW_TRAPDOOR = ITEMS.register("willow_trapdoor", () -> new BlockItem(ReflavoredBlocks.WILLOW_TRAPDOOR.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> WILLOW_PLANKS_BUTTON = ITEMS.register("willow_planks_button", () -> new BlockItem(ReflavoredBlocks.WILLOW_PLANKS_BUTTON.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> WILLOW_PLANKS_PRESSURE_PLATE = ITEMS.register("willow_planks_pressure_plate", () -> new BlockItem(ReflavoredBlocks.WILLOW_PLANKS_PRESSURE_PLATE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> WILLOW_PLANKS_FENCE = ITEMS.register("willow_planks_fence", () -> new BlockItem(ReflavoredBlocks.WILLOW_PLANKS_FENCE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> WILLOW_PLANKS_FENCE_GATE = ITEMS.register("willow_planks_fence_gate", () -> new BlockItem(ReflavoredBlocks.WILLOW_PLANKS_FENCE_GATE.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> WILLOW_SIGN = ITEMS.register("willow_sign", () -> new SignItem(DEFAULT_PROPERTIES().maxStackSize(16), ReflavoredBlocks.WILLOW_SIGN.get(), ReflavoredBlocks.WILLOW_WALL_SIGN.get()));
    public static final RegistryObject<Item> WILLOW_BOAT = ITEMS.register("willow_boat", () -> new ReflavoredBoatItem(DEFAULT_PROPERTIES().maxStackSize(1), ReflavoredEntities.WILLOW_BOAT));

    public static final RegistryObject<Item> PALM_SAPLING = ITEMS.register("palm_sapling", () -> new BlockItem(ReflavoredBlocks.PALM_SAPLING.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PALM_LEAVES = ITEMS.register("palm_leaves", () -> new BlockItem(ReflavoredBlocks.PALM_LEAVES.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PALM_LOG = ITEMS.register("palm_log", () -> new BlockItem(ReflavoredBlocks.PALM_LOG.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> STRIPPED_PALM_LOG = ITEMS.register("stripped_palm_log", () -> new BlockItem(ReflavoredBlocks.STRIPPED_PALM_LOG.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PALM_WOOD = ITEMS.register("palm_wood", () -> new BlockItem(ReflavoredBlocks.PALM_WOOD.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> STRIPPED_PALM_WOOD = ITEMS.register("stripped_palm_wood", () -> new BlockItem(ReflavoredBlocks.STRIPPED_PALM_WOOD.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PALM_PLANKS = ITEMS.register("palm_planks", () -> new BlockItem(ReflavoredBlocks.PALM_PLANKS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PALM_PLANKS_SLAB = ITEMS.register("palm_planks_slab", () -> new BlockItem(ReflavoredBlocks.PALM_PLANKS_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PALM_PLANKS_STAIRS = ITEMS.register("palm_planks_stairs", () -> new BlockItem(ReflavoredBlocks.PALM_PLANKS_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PALM_DOOR = ITEMS.register("palm_door", () -> new BlockItem(ReflavoredBlocks.PALM_DOOR.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PALM_TRAPDOOR = ITEMS.register("palm_trapdoor", () -> new BlockItem(ReflavoredBlocks.PALM_TRAPDOOR.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PALM_PLANKS_BUTTON = ITEMS.register("palm_planks_button", () -> new BlockItem(ReflavoredBlocks.PALM_PLANKS_BUTTON.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PALM_PLANKS_PRESSURE_PLATE = ITEMS.register("palm_planks_pressure_plate", () -> new BlockItem(ReflavoredBlocks.PALM_PLANKS_PRESSURE_PLATE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PALM_PLANKS_FENCE = ITEMS.register("palm_planks_fence", () -> new BlockItem(ReflavoredBlocks.PALM_PLANKS_FENCE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> PALM_PLANKS_FENCE_GATE = ITEMS.register("palm_planks_fence_gate", () -> new BlockItem(ReflavoredBlocks.PALM_PLANKS_FENCE_GATE.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> PALM_SIGN = ITEMS.register("palm_sign", () -> new SignItem(DEFAULT_PROPERTIES().maxStackSize(16), ReflavoredBlocks.PALM_SIGN.get(), ReflavoredBlocks.PALM_WALL_SIGN.get()));
    public static final RegistryObject<Item> PALM_BOAT = ITEMS.register("palm_boat", () -> new ReflavoredBoatItem(DEFAULT_PROPERTIES().maxStackSize(1), ReflavoredEntities.PALM_BOAT));

    public static final RegistryObject<Item> MANGROVE_SAPLING = ITEMS.register("mangrove_sapling", () -> new BlockItem(ReflavoredBlocks.MANGROVE_SAPLING.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> MANGROVE_LEAVES = ITEMS.register("mangrove_leaves", () -> new BlockItem(ReflavoredBlocks.MANGROVE_LEAVES.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> MANGROVE_LOG = ITEMS.register("mangrove_log", () -> new BlockItem(ReflavoredBlocks.MANGROVE_LOG.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_LOG = ITEMS.register("stripped_mangrove_log", () -> new BlockItem(ReflavoredBlocks.STRIPPED_MANGROVE_LOG.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> MANGROVE_WOOD = ITEMS.register("mangrove_wood", () -> new BlockItem(ReflavoredBlocks.MANGROVE_WOOD.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_WOOD = ITEMS.register("stripped_mangrove_wood", () -> new BlockItem(ReflavoredBlocks.STRIPPED_MANGROVE_WOOD.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> MANGROVE_PLANKS = ITEMS.register("mangrove_planks", () -> new BlockItem(ReflavoredBlocks.MANGROVE_PLANKS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> MANGROVE_PLANKS_SLAB = ITEMS.register("mangrove_planks_slab", () -> new BlockItem(ReflavoredBlocks.MANGROVE_PLANKS_SLAB.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> MANGROVE_PLANKS_STAIRS = ITEMS.register("mangrove_planks_stairs", () -> new BlockItem(ReflavoredBlocks.MANGROVE_PLANKS_STAIRS.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> MANGROVE_DOOR = ITEMS.register("mangrove_door", () -> new BlockItem(ReflavoredBlocks.MANGROVE_DOOR.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> MANGROVE_TRAPDOOR = ITEMS.register("mangrove_trapdoor", () -> new BlockItem(ReflavoredBlocks.MANGROVE_TRAPDOOR.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> MANGROVE_PLANKS_BUTTON = ITEMS.register("mangrove_planks_button", () -> new BlockItem(ReflavoredBlocks.MANGROVE_PLANKS_BUTTON.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> MANGROVE_PLANKS_PRESSURE_PLATE = ITEMS.register("mangrove_planks_pressure_plate", () -> new BlockItem(ReflavoredBlocks.MANGROVE_PLANKS_PRESSURE_PLATE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> MANGROVE_PLANKS_FENCE = ITEMS.register("mangrove_planks_fence", () -> new BlockItem(ReflavoredBlocks.MANGROVE_PLANKS_FENCE.get(), DEFAULT_PROPERTIES()));
    public static final RegistryObject<Item> MANGROVE_PLANKS_FENCE_GATE = ITEMS.register("mangrove_planks_fence_gate", () -> new BlockItem(ReflavoredBlocks.MANGROVE_PLANKS_FENCE_GATE.get(), DEFAULT_PROPERTIES()));

    public static final RegistryObject<Item> MANGROVE_SIGN = ITEMS.register("mangrove_sign", () -> new SignItem(DEFAULT_PROPERTIES().maxStackSize(16), ReflavoredBlocks.MANGROVE_SIGN.get(), ReflavoredBlocks.MANGROVE_WALL_SIGN.get()));
    public static final RegistryObject<Item> MANGROVE_BOAT = ITEMS.register("mangrove_boat", () -> new ReflavoredBoatItem(DEFAULT_PROPERTIES().maxStackSize(1), ReflavoredEntities.MANGROVE_BOAT));

}