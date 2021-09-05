package com.sammy.reflavored.registry;

import com.sammy.reflavored.ReflavoredMod;
import com.sammy.reflavored.content.block.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.block.AbstractBlock.Properties;
import static net.minecraft.block.PressurePlateBlock.Sensitivity.EVERYTHING;

public class ReflavoredBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ReflavoredMod.MODID);

    public static Properties WOOD_PROPERTIES()
    {
        return Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).setRequiresTool().hardnessAndResistance(2.0F);
    }

    public static final RegistryObject<Block> BAOBAB_SAPLING = BLOCKS.register("baobab_sapling", () -> new BushBlock(Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> BAOBAB_LEAVES = BLOCKS.register("baobab_leaves", () -> new LeavesBlock(Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> STRIPPED_BAOBAB_LOG = BLOCKS.register("stripped_baobab_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> BAOBAB_LOG = BLOCKS.register("baobab_log", () -> new LogBlock(WOOD_PROPERTIES(), STRIPPED_BAOBAB_LOG));
    public static final RegistryObject<Block> STRIPPED_BAOBAB_WOOD = BLOCKS.register("stripped_baobab_wood", () -> new RotatedPillarBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> BAOBAB_WOOD = BLOCKS.register("baobab_wood", () -> new LogBlock(WOOD_PROPERTIES(), STRIPPED_BAOBAB_WOOD));
    public static final RegistryObject<Block> BAOBAB_PLANKS = BLOCKS.register("baobab_planks", () -> new Block(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> BAOBAB_PLANKS_SLAB = BLOCKS.register("baobab_planks_slab", () -> new SlabBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> BAOBAB_PLANKS_STAIRS = BLOCKS.register("baobab_planks_stairs", () -> new StairsBlock(BAOBAB_PLANKS.get().getDefaultState(), WOOD_PROPERTIES()));
    public static final RegistryObject<Block> BAOBAB_DOOR = BLOCKS.register("baobab_door", () -> new DoorBlock(WOOD_PROPERTIES().notSolid()));
    public static final RegistryObject<Block> BAOBAB_TRAPDOOR = BLOCKS.register("baobab_trapdoor", () -> new TrapDoorBlock(WOOD_PROPERTIES().notSolid()));
    public static final RegistryObject<Block> BAOBAB_PLANKS_BUTTON = BLOCKS.register("baobab_planks_button", () -> new WoodButtonBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> BAOBAB_PLANKS_PRESSURE_PLATE = BLOCKS.register("baobab_planks_pressure_plate", () -> new PressurePlateBlock(EVERYTHING, WOOD_PROPERTIES()));
    public static final RegistryObject<Block> BAOBAB_PLANKS_FENCE = BLOCKS.register("baobab_planks_fence", () -> new FenceBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> BAOBAB_PLANKS_FENCE_GATE = BLOCKS.register("baobab_planks_fence_gate", () -> new FenceGateBlock(WOOD_PROPERTIES()));

    public static final RegistryObject<Block> BAOBAB_SIGN = BLOCKS.register("baobab_sign", () -> new ReflavoredStandingSignBlock(WOOD_PROPERTIES().notSolid().doesNotBlockMovement(), ReflavoredWoodTypes.BAOBAB));
    public static final RegistryObject<Block> BAOBAB_WALL_SIGN = BLOCKS.register("baobab_wall_sign", () -> new ReflavoredWallSignBlock(WOOD_PROPERTIES().notSolid().doesNotBlockMovement(), ReflavoredWoodTypes.BAOBAB));

    public static final RegistryObject<Block> FIR_SAPLING = BLOCKS.register("fir_sapling", () -> new FirSaplingBLock(Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> FIR_LEAVES = BLOCKS.register("fir_leaves", () -> new LeavesBlock(Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> STRIPPED_FIR_LOG = BLOCKS.register("stripped_fir_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> FIR_LOG = BLOCKS.register("fir_log", () -> new LogBlock(WOOD_PROPERTIES(), STRIPPED_FIR_LOG));
    public static final RegistryObject<Block> STRIPPED_FIR_WOOD = BLOCKS.register("stripped_fir_wood", () -> new RotatedPillarBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> FIR_WOOD = BLOCKS.register("fir_wood", () -> new LogBlock(WOOD_PROPERTIES(), STRIPPED_FIR_WOOD));
    public static final RegistryObject<Block> FIR_PLANKS = BLOCKS.register("fir_planks", () -> new Block(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> FIR_PLANKS_SLAB = BLOCKS.register("fir_planks_slab", () -> new SlabBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> FIR_PLANKS_STAIRS = BLOCKS.register("fir_planks_stairs", () -> new StairsBlock(FIR_PLANKS.get().getDefaultState(), WOOD_PROPERTIES()));
    public static final RegistryObject<Block> FIR_DOOR = BLOCKS.register("fir_door", () -> new DoorBlock(WOOD_PROPERTIES().notSolid()));
    public static final RegistryObject<Block> FIR_TRAPDOOR = BLOCKS.register("fir_trapdoor", () -> new TrapDoorBlock(WOOD_PROPERTIES().notSolid()));
    public static final RegistryObject<Block> FIR_PLANKS_BUTTON = BLOCKS.register("fir_planks_button", () -> new WoodButtonBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> FIR_PLANKS_PRESSURE_PLATE = BLOCKS.register("fir_planks_pressure_plate", () -> new PressurePlateBlock(EVERYTHING, WOOD_PROPERTIES()));
    public static final RegistryObject<Block> FIR_PLANKS_FENCE = BLOCKS.register("fir_planks_fence", () -> new FenceBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> FIR_PLANKS_FENCE_GATE = BLOCKS.register("fir_planks_fence_gate", () -> new FenceGateBlock(WOOD_PROPERTIES()));

    public static final RegistryObject<Block> FIR_SIGN = BLOCKS.register("fir_sign", () -> new ReflavoredStandingSignBlock(WOOD_PROPERTIES().notSolid().doesNotBlockMovement(), ReflavoredWoodTypes.FIR));
    public static final RegistryObject<Block> FIR_WALL_SIGN = BLOCKS.register("fir_wall_sign", () -> new ReflavoredWallSignBlock(WOOD_PROPERTIES().notSolid().doesNotBlockMovement(), ReflavoredWoodTypes.FIR));

    public static final RegistryObject<Block> PINE_SAPLING = BLOCKS.register("pine_sapling", () -> new ReflavoredSaplingBlock(ReflavoredWorldgen.PINE_TREE, Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> PINE_LEAVES = BLOCKS.register("pine_leaves", () -> new LeavesBlock(Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> STRIPPED_PINE_LOG = BLOCKS.register("stripped_pine_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> PINE_LOG = BLOCKS.register("pine_log", () -> new LogBlock(WOOD_PROPERTIES(), STRIPPED_PINE_LOG));
    public static final RegistryObject<Block> STRIPPED_PINE_WOOD = BLOCKS.register("stripped_pine_wood", () -> new RotatedPillarBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> PINE_WOOD = BLOCKS.register("pine_wood", () -> new LogBlock(WOOD_PROPERTIES(), STRIPPED_PINE_WOOD));
    public static final RegistryObject<Block> PINE_PLANKS = BLOCKS.register("pine_planks", () -> new Block(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> PINE_PLANKS_SLAB = BLOCKS.register("pine_planks_slab", () -> new SlabBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> PINE_PLANKS_STAIRS = BLOCKS.register("pine_planks_stairs", () -> new StairsBlock(PINE_PLANKS.get().getDefaultState(), WOOD_PROPERTIES()));
    public static final RegistryObject<Block> PINE_DOOR = BLOCKS.register("pine_door", () -> new DoorBlock(WOOD_PROPERTIES().notSolid()));
    public static final RegistryObject<Block> PINE_TRAPDOOR = BLOCKS.register("pine_trapdoor", () -> new TrapDoorBlock(WOOD_PROPERTIES().notSolid()));
    public static final RegistryObject<Block> PINE_PLANKS_BUTTON = BLOCKS.register("pine_planks_button", () -> new WoodButtonBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> PINE_PLANKS_PRESSURE_PLATE = BLOCKS.register("pine_planks_pressure_plate", () -> new PressurePlateBlock(EVERYTHING, WOOD_PROPERTIES()));
    public static final RegistryObject<Block> PINE_PLANKS_FENCE = BLOCKS.register("pine_planks_fence", () -> new FenceBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> PINE_PLANKS_FENCE_GATE = BLOCKS.register("pine_planks_fence_gate", () -> new FenceGateBlock(WOOD_PROPERTIES()));

    public static final RegistryObject<Block> PINE_SIGN = BLOCKS.register("pine_sign", () -> new ReflavoredStandingSignBlock(WOOD_PROPERTIES().notSolid().doesNotBlockMovement(), ReflavoredWoodTypes.PINE));
    public static final RegistryObject<Block> PINE_WALL_SIGN = BLOCKS.register("pine_wall_sign", () -> new ReflavoredWallSignBlock(WOOD_PROPERTIES().notSolid().doesNotBlockMovement(), ReflavoredWoodTypes.PINE));

    public static final RegistryObject<Block> REDWOOD_SAPLING = BLOCKS.register("redwood_sapling", () -> new BushBlock(Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> REDWOOD_LEAVES = BLOCKS.register("redwood_leaves", () -> new LeavesBlock(Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> STRIPPED_REDWOOD_LOG = BLOCKS.register("stripped_redwood_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> REDWOOD_LOG = BLOCKS.register("redwood_log", () -> new LogBlock(WOOD_PROPERTIES(), STRIPPED_REDWOOD_LOG));
    public static final RegistryObject<Block> STRIPPED_REDWOOD_WOOD = BLOCKS.register("stripped_redwood_wood", () -> new RotatedPillarBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> REDWOOD_WOOD = BLOCKS.register("redwood_wood", () -> new LogBlock(WOOD_PROPERTIES(), STRIPPED_REDWOOD_WOOD));
    public static final RegistryObject<Block> REDWOOD_PLANKS = BLOCKS.register("redwood_planks", () -> new Block(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> REDWOOD_PLANKS_SLAB = BLOCKS.register("redwood_planks_slab", () -> new SlabBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> REDWOOD_PLANKS_STAIRS = BLOCKS.register("redwood_planks_stairs", () -> new StairsBlock(REDWOOD_PLANKS.get().getDefaultState(), WOOD_PROPERTIES()));
    public static final RegistryObject<Block> REDWOOD_DOOR = BLOCKS.register("redwood_door", () -> new DoorBlock(WOOD_PROPERTIES().notSolid()));
    public static final RegistryObject<Block> REDWOOD_TRAPDOOR = BLOCKS.register("redwood_trapdoor", () -> new TrapDoorBlock(WOOD_PROPERTIES().notSolid()));
    public static final RegistryObject<Block> REDWOOD_PLANKS_BUTTON = BLOCKS.register("redwood_planks_button", () -> new WoodButtonBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> REDWOOD_PLANKS_PRESSURE_PLATE = BLOCKS.register("redwood_planks_pressure_plate", () -> new PressurePlateBlock(EVERYTHING, WOOD_PROPERTIES()));
    public static final RegistryObject<Block> REDWOOD_PLANKS_FENCE = BLOCKS.register("redwood_planks_fence", () -> new FenceBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> REDWOOD_PLANKS_FENCE_GATE = BLOCKS.register("redwood_planks_fence_gate", () -> new FenceGateBlock(WOOD_PROPERTIES()));

    public static final RegistryObject<Block> REDWOOD_SIGN = BLOCKS.register("redwood_sign", () -> new ReflavoredStandingSignBlock(WOOD_PROPERTIES().notSolid().doesNotBlockMovement(), ReflavoredWoodTypes.REDWOOD));
    public static final RegistryObject<Block> REDWOOD_WALL_SIGN = BLOCKS.register("redwood_wall_sign", () -> new ReflavoredWallSignBlock(WOOD_PROPERTIES().notSolid().doesNotBlockMovement(), ReflavoredWoodTypes.REDWOOD));

    public static final RegistryObject<Block> SAKURA_SAPLING = BLOCKS.register("sakura_sapling", () -> new VanillaCloneSaplingBlock(()->ReflavoredConfiguredWorldgen.SAKURA_TREE, Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> SAKURA_LEAVES = BLOCKS.register("sakura_leaves", () -> new LeavesBlock(Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> STRIPPED_SAKURA_LOG = BLOCKS.register("stripped_sakura_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> SAKURA_LOG = BLOCKS.register("sakura_log", () -> new LogBlock(WOOD_PROPERTIES(), STRIPPED_SAKURA_LOG));
    public static final RegistryObject<Block> STRIPPED_SAKURA_WOOD = BLOCKS.register("stripped_sakura_wood", () -> new RotatedPillarBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> SAKURA_WOOD = BLOCKS.register("sakura_wood", () -> new LogBlock(WOOD_PROPERTIES(), STRIPPED_SAKURA_WOOD));
    public static final RegistryObject<Block> SAKURA_PLANKS = BLOCKS.register("sakura_planks", () -> new Block(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> SAKURA_PLANKS_SLAB = BLOCKS.register("sakura_planks_slab", () -> new SlabBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> SAKURA_PLANKS_STAIRS = BLOCKS.register("sakura_planks_stairs", () -> new StairsBlock(SAKURA_PLANKS.get().getDefaultState(), WOOD_PROPERTIES()));
    public static final RegistryObject<Block> SAKURA_DOOR = BLOCKS.register("sakura_door", () -> new DoorBlock(WOOD_PROPERTIES().notSolid()));
    public static final RegistryObject<Block> SAKURA_TRAPDOOR = BLOCKS.register("sakura_trapdoor", () -> new TrapDoorBlock(WOOD_PROPERTIES().notSolid()));
    public static final RegistryObject<Block> SAKURA_PLANKS_BUTTON = BLOCKS.register("sakura_planks_button", () -> new WoodButtonBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> SAKURA_PLANKS_PRESSURE_PLATE = BLOCKS.register("sakura_planks_pressure_plate", () -> new PressurePlateBlock(EVERYTHING, WOOD_PROPERTIES()));
    public static final RegistryObject<Block> SAKURA_PLANKS_FENCE = BLOCKS.register("sakura_planks_fence", () -> new FenceBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> SAKURA_PLANKS_FENCE_GATE = BLOCKS.register("sakura_planks_fence_gate", () -> new FenceGateBlock(WOOD_PROPERTIES()));

    public static final RegistryObject<Block> SAKURA_SIGN = BLOCKS.register("sakura_sign", () -> new ReflavoredStandingSignBlock(WOOD_PROPERTIES().notSolid().doesNotBlockMovement(), ReflavoredWoodTypes.SAKURA));
    public static final RegistryObject<Block> SAKURA_WALL_SIGN = BLOCKS.register("sakura_wall_sign", () -> new ReflavoredWallSignBlock(WOOD_PROPERTIES().notSolid().doesNotBlockMovement(), ReflavoredWoodTypes.SAKURA));

    public static final RegistryObject<Block> WILLOW_SAPLING = BLOCKS.register("willow_sapling", () -> new BushBlock(Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> WILLOW_LEAVES = BLOCKS.register("willow_leaves", () -> new LeavesBlock(Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> STRIPPED_WILLOW_LOG = BLOCKS.register("stripped_willow_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> WILLOW_LOG = BLOCKS.register("willow_log", () -> new LogBlock(WOOD_PROPERTIES(), STRIPPED_WILLOW_LOG));
    public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD = BLOCKS.register("stripped_willow_wood", () -> new RotatedPillarBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> WILLOW_WOOD = BLOCKS.register("willow_wood", () -> new LogBlock(WOOD_PROPERTIES(), STRIPPED_WILLOW_WOOD));
    public static final RegistryObject<Block> WILLOW_PLANKS = BLOCKS.register("willow_planks", () -> new Block(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> WILLOW_PLANKS_SLAB = BLOCKS.register("willow_planks_slab", () -> new SlabBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> WILLOW_PLANKS_STAIRS = BLOCKS.register("willow_planks_stairs", () -> new StairsBlock(WILLOW_PLANKS.get().getDefaultState(), WOOD_PROPERTIES()));
    public static final RegistryObject<Block> WILLOW_DOOR = BLOCKS.register("willow_door", () -> new DoorBlock(WOOD_PROPERTIES().notSolid()));
    public static final RegistryObject<Block> WILLOW_TRAPDOOR = BLOCKS.register("willow_trapdoor", () -> new TrapDoorBlock(WOOD_PROPERTIES().notSolid()));
    public static final RegistryObject<Block> WILLOW_PLANKS_BUTTON = BLOCKS.register("willow_planks_button", () -> new WoodButtonBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> WILLOW_PLANKS_PRESSURE_PLATE = BLOCKS.register("willow_planks_pressure_plate", () -> new PressurePlateBlock(EVERYTHING, WOOD_PROPERTIES()));
    public static final RegistryObject<Block> WILLOW_PLANKS_FENCE = BLOCKS.register("willow_planks_fence", () -> new FenceBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> WILLOW_PLANKS_FENCE_GATE = BLOCKS.register("willow_planks_fence_gate", () -> new FenceGateBlock(WOOD_PROPERTIES()));

    public static final RegistryObject<Block> WILLOW_SIGN = BLOCKS.register("willow_sign", () -> new ReflavoredStandingSignBlock(WOOD_PROPERTIES().notSolid().doesNotBlockMovement(), ReflavoredWoodTypes.WILLOW));
    public static final RegistryObject<Block> WILLOW_WALL_SIGN = BLOCKS.register("willow_wall_sign", () -> new ReflavoredWallSignBlock(WOOD_PROPERTIES().notSolid().doesNotBlockMovement(), ReflavoredWoodTypes.WILLOW));

    public static final RegistryObject<Block> PALM_SAPLING = BLOCKS.register("palm_sapling", () -> new ReflavoredSaplingBlock(ReflavoredWorldgen.PALM_TREE, Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> PALM_LEAVES = BLOCKS.register("palm_leaves", () -> new LeavesBlock(Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> STRIPPED_PALM_LOG = BLOCKS.register("stripped_palm_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> PALM_LOG = BLOCKS.register("palm_log", () -> new LogBlock(WOOD_PROPERTIES(), STRIPPED_PALM_LOG));
    public static final RegistryObject<Block> STRIPPED_PALM_WOOD = BLOCKS.register("stripped_palm_wood", () -> new RotatedPillarBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> PALM_WOOD = BLOCKS.register("palm_wood", () -> new LogBlock(WOOD_PROPERTIES(), STRIPPED_PALM_WOOD));
    public static final RegistryObject<Block> PALM_PLANKS = BLOCKS.register("palm_planks", () -> new Block(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> PALM_PLANKS_SLAB = BLOCKS.register("palm_planks_slab", () -> new SlabBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> PALM_PLANKS_STAIRS = BLOCKS.register("palm_planks_stairs", () -> new StairsBlock(PALM_PLANKS.get().getDefaultState(), WOOD_PROPERTIES()));
    public static final RegistryObject<Block> PALM_DOOR = BLOCKS.register("palm_door", () -> new DoorBlock(WOOD_PROPERTIES().notSolid()));
    public static final RegistryObject<Block> PALM_TRAPDOOR = BLOCKS.register("palm_trapdoor", () -> new TrapDoorBlock(WOOD_PROPERTIES().notSolid()));
    public static final RegistryObject<Block> PALM_PLANKS_BUTTON = BLOCKS.register("palm_planks_button", () -> new WoodButtonBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> PALM_PLANKS_PRESSURE_PLATE = BLOCKS.register("palm_planks_pressure_plate", () -> new PressurePlateBlock(EVERYTHING, WOOD_PROPERTIES()));
    public static final RegistryObject<Block> PALM_PLANKS_FENCE = BLOCKS.register("palm_planks_fence", () -> new FenceBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> PALM_PLANKS_FENCE_GATE = BLOCKS.register("palm_planks_fence_gate", () -> new FenceGateBlock(WOOD_PROPERTIES()));

    public static final RegistryObject<Block> PALM_SIGN = BLOCKS.register("palm_sign", () -> new ReflavoredStandingSignBlock(WOOD_PROPERTIES().notSolid().doesNotBlockMovement(), ReflavoredWoodTypes.PALM));
    public static final RegistryObject<Block> PALM_WALL_SIGN = BLOCKS.register("palm_wall_sign", () -> new ReflavoredWallSignBlock(WOOD_PROPERTIES().notSolid().doesNotBlockMovement(), ReflavoredWoodTypes.PALM));

    public static final RegistryObject<Block> MANGROVE_SAPLING = BLOCKS.register("mangrove_sapling", () -> new BushBlock(Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> MANGROVE_LEAVES = BLOCKS.register("mangrove_leaves", () -> new LeavesBlock(Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG = BLOCKS.register("stripped_mangrove_log", () -> new RotatedPillarBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> MANGROVE_LOG = BLOCKS.register("mangrove_log", () -> new LogBlock(WOOD_PROPERTIES(), STRIPPED_MANGROVE_LOG));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_WOOD = BLOCKS.register("stripped_mangrove_wood", () -> new RotatedPillarBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> MANGROVE_WOOD = BLOCKS.register("mangrove_wood", () -> new LogBlock(WOOD_PROPERTIES(), STRIPPED_MANGROVE_WOOD));
    public static final RegistryObject<Block> MANGROVE_PLANKS = BLOCKS.register("mangrove_planks", () -> new Block(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> MANGROVE_PLANKS_SLAB = BLOCKS.register("mangrove_planks_slab", () -> new SlabBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> MANGROVE_PLANKS_STAIRS = BLOCKS.register("mangrove_planks_stairs", () -> new StairsBlock(MANGROVE_PLANKS.get().getDefaultState(), WOOD_PROPERTIES()));
    public static final RegistryObject<Block> MANGROVE_DOOR = BLOCKS.register("mangrove_door", () -> new DoorBlock(WOOD_PROPERTIES().notSolid()));
    public static final RegistryObject<Block> MANGROVE_TRAPDOOR = BLOCKS.register("mangrove_trapdoor", () -> new TrapDoorBlock(WOOD_PROPERTIES().notSolid()));
    public static final RegistryObject<Block> MANGROVE_PLANKS_BUTTON = BLOCKS.register("mangrove_planks_button", () -> new WoodButtonBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> MANGROVE_PLANKS_PRESSURE_PLATE = BLOCKS.register("mangrove_planks_pressure_plate", () -> new PressurePlateBlock(EVERYTHING, WOOD_PROPERTIES()));
    public static final RegistryObject<Block> MANGROVE_PLANKS_FENCE = BLOCKS.register("mangrove_planks_fence", () -> new FenceBlock(WOOD_PROPERTIES()));
    public static final RegistryObject<Block> MANGROVE_PLANKS_FENCE_GATE = BLOCKS.register("mangrove_planks_fence_gate", () -> new FenceGateBlock(WOOD_PROPERTIES()));

    public static final RegistryObject<Block> MANGROVE_SIGN = BLOCKS.register("mangrove_sign", () -> new ReflavoredStandingSignBlock(WOOD_PROPERTIES().notSolid().doesNotBlockMovement(), ReflavoredWoodTypes.MANGROVE));
    public static final RegistryObject<Block> MANGROVE_WALL_SIGN = BLOCKS.register("mangrove_wall_sign", () -> new ReflavoredWallSignBlock(WOOD_PROPERTIES().notSolid().doesNotBlockMovement(), ReflavoredWoodTypes.MANGROVE));

}
