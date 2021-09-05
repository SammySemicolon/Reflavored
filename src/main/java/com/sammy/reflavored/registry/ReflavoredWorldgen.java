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

public class ReflavoredWorldgen
{
    public static final Feature<NoFeatureConfig> PINE_TREE = new PineTreeFeature();
    public static final Feature<NoFeatureConfig> FIR_TREE = new FirTreeFeature();
    public static final Feature<NoFeatureConfig> GIANT_FIR_TREE = new GiantFirTreeFeature();
    public static final Feature<NoFeatureConfig> PALM_TREE = new PalmTreeFeature();

}