package com.sammy.reflavored;

import com.sammy.reflavored.registry.ReflavoredConfiguredWorldgen;
import com.sammy.reflavored.registry.ReflavoredEntities;
import com.sammy.reflavored.registry.data.*;
import net.minecraft.data.BlockTagsProvider;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.sammy.reflavored.registry.ReflavoredBlocks.BLOCKS;
import static com.sammy.reflavored.registry.ReflavoredEntities.ENTITY_TYPES;
import static com.sammy.reflavored.registry.ReflavoredItems.ITEMS;

@Mod(ReflavoredMod.MODID)
public class ReflavoredMod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "reflavored";
    public ReflavoredMod()
    {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modBus);
        ITEMS.register(modBus);
        ENTITY_TYPES.register(modBus);
        modBus.addListener(this::gatherData);
        modBus.addListener(ReflavoredMod::setup);
    }
    public void gatherData(GatherDataEvent evt)
    {
        BlockTagsProvider provider = new ModBlockTagProvider(evt.getGenerator(), evt.getExistingFileHelper());
        evt.getGenerator().addProvider(provider);
        evt.getGenerator().addProvider(new ModItemTagProvider(evt.getGenerator(),provider, evt.getExistingFileHelper()));
        evt.getGenerator().addProvider(new ModBlockStateProvider(evt.getGenerator(), evt.getExistingFileHelper()));
        evt.getGenerator().addProvider(new ModItemModelProvider(evt.getGenerator(), evt.getExistingFileHelper()));
        evt.getGenerator().addProvider(new ModLangProvider(evt.getGenerator()));
        evt.getGenerator().addProvider(new ModLootTableProvider(evt.getGenerator()));
        evt.getGenerator().addProvider(new ModRecipeProvider(evt.getGenerator()));
    }
    public static void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(ReflavoredConfiguredWorldgen::register);
    }
}
