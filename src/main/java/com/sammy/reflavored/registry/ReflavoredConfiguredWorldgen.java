package com.sammy.reflavored.registry;

import com.sammy.reflavored.ReflavoredMod;
import com.sammy.reflavored.content.worldgen.trees.FirTreeFeature;
import com.sammy.reflavored.content.worldgen.trees.GiantFirTreeFeature;
import com.sammy.reflavored.content.worldgen.trees.PalmTreeFeature;
import com.sammy.reflavored.content.worldgen.trees.PineTreeFeature;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.AcaciaFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.ForkyTrunkPlacer;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ReflavoredConfiguredWorldgen
{
    public static ConfiguredFeature<BaseTreeFeatureConfig, ?> SAKURA_TREE;

    public static void register()
    {
        SAKURA_TREE = Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, ReflavoredMod.MODID + ":sakura_tree_feature",
                Feature.TREE.withConfiguration((
                        new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(ReflavoredBlocks.SAKURA_LOG.get().getDefaultState()),
                                new SimpleBlockStateProvider(ReflavoredBlocks.SAKURA_LEAVES.get().getDefaultState()),
                                new AcaciaFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0)),
                                new ForkyTrunkPlacer(5, 2, 2),
                                new TwoLayerFeature(1, 0, 2))).setIgnoreVines().build()));
    }
}