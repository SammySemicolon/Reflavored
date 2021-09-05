package com.sammy.reflavored.client;

import com.sammy.reflavored.ReflavoredMod;
import com.sammy.reflavored.client.renderer.ReflavoredBoatRenderer;
import com.sammy.reflavored.registry.ReflavoredEntities;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid= ReflavoredMod.MODID, value= Dist.CLIENT, bus= Mod.EventBusSubscriber.Bus.MOD)
public class BindRenderersEvent
{
    @SubscribeEvent
    public static void bindEntityRenderers(FMLClientSetupEvent event)
    {
        RenderingRegistry.registerEntityRenderingHandler(ReflavoredEntities.BAOBAB_BOAT.get(), (manager) -> new ReflavoredBoatRenderer(manager, "baobab"));
        RenderingRegistry.registerEntityRenderingHandler(ReflavoredEntities.FIR_BOAT.get(), (manager) -> new ReflavoredBoatRenderer(manager, "fir"));
        RenderingRegistry.registerEntityRenderingHandler(ReflavoredEntities.PINE_BOAT.get(), (manager) -> new ReflavoredBoatRenderer(manager, "pine"));
        RenderingRegistry.registerEntityRenderingHandler(ReflavoredEntities.REDWOOD_BOAT.get(), (manager) -> new ReflavoredBoatRenderer(manager, "redwood"));
        RenderingRegistry.registerEntityRenderingHandler(ReflavoredEntities.SAKURA_BOAT.get(), (manager) -> new ReflavoredBoatRenderer(manager, "sakura"));
        RenderingRegistry.registerEntityRenderingHandler(ReflavoredEntities.WILLOW_BOAT.get(), (manager) -> new ReflavoredBoatRenderer(manager, "willow"));
        RenderingRegistry.registerEntityRenderingHandler(ReflavoredEntities.PALM_BOAT.get(), (manager) -> new ReflavoredBoatRenderer(manager, "palm"));
        RenderingRegistry.registerEntityRenderingHandler(ReflavoredEntities.MANGROVE_BOAT.get(), (manager) -> new ReflavoredBoatRenderer(manager, "mangrove"));
    }
}
