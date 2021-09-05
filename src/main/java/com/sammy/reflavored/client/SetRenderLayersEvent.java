package com.sammy.reflavored.client;

import com.sammy.reflavored.ReflavoredHelper;
import com.sammy.reflavored.ReflavoredMod;
import net.minecraft.block.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.HashSet;
import java.util.Set;

import static com.sammy.reflavored.registry.ReflavoredBlocks.BLOCKS;


@Mod.EventBusSubscriber(modid= ReflavoredMod.MODID, value= Dist.CLIENT, bus= Mod.EventBusSubscriber.Bus.MOD)
public class SetRenderLayersEvent
{
    @SubscribeEvent
    public static void setRenderLayers(FMLClientSetupEvent event)
    {
        Set<RegistryObject<Block>> blocks = new HashSet<>(BLOCKS.getEntries());
        ReflavoredHelper.takeAll(blocks, b -> b.get() instanceof TorchBlock).forEach(SetRenderLayersEvent::setCutout);
        ReflavoredHelper.takeAll(blocks, b -> b.get() instanceof TrapDoorBlock).forEach(SetRenderLayersEvent::setCutout);
        ReflavoredHelper.takeAll(blocks, b -> b.get() instanceof DoorBlock).forEach(SetRenderLayersEvent::setCutout);
        ReflavoredHelper.takeAll(blocks, b -> b.get() instanceof SaplingBlock).forEach(SetRenderLayersEvent::setCutout);
        ReflavoredHelper.takeAll(blocks, b -> b.get() instanceof LeavesBlock).forEach(SetRenderLayersEvent::setCutout);
        ReflavoredHelper.takeAll(blocks, b -> b.get() instanceof BushBlock).forEach(SetRenderLayersEvent::setCutout);
        ReflavoredHelper.takeAll(blocks, b -> b.get() instanceof LanternBlock).forEach(SetRenderLayersEvent::setCutout);
    }
    
    public static void setCutout(RegistryObject<Block> b)
    {
        RenderTypeLookup.setRenderLayer(b.get(), RenderType.getCutout());
    }
}