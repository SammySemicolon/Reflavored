package com.sammy.reflavored.registry;

import com.sammy.reflavored.ReflavoredHelper;
import com.sammy.reflavored.ReflavoredMod;
import net.minecraft.block.WoodType;
import net.minecraft.client.renderer.model.RenderMaterial;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.ArrayList;

import static net.minecraft.client.renderer.Atlases.SIGN_ATLAS;
import static net.minecraft.client.renderer.Atlases.SIGN_MATERIALS;

@Mod.EventBusSubscriber(modid= ReflavoredMod.MODID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class ReflavoredWoodTypes
{
    public static ArrayList<WoodType> WOOD_TYPES = new ArrayList<>();
    public static final WoodType BAOBAB = new ReflavoredWoodType("baobab");
    public static final WoodType FIR = new ReflavoredWoodType("fir");
    public static final WoodType PINE = new ReflavoredWoodType("pine");
    public static final WoodType REDWOOD = new ReflavoredWoodType("redwood");
    public static final WoodType SAKURA = new ReflavoredWoodType("sakura");
    public static final WoodType WILLOW = new ReflavoredWoodType("willow");
    public static final WoodType PALM = new ReflavoredWoodType("palm");
    public static final WoodType MANGROVE = new ReflavoredWoodType("mangrove");

    @SubscribeEvent
    public static void addWoodTypes(FMLClientSetupEvent event)
    {
        event.enqueueWork(() -> {
            for (WoodType type : WOOD_TYPES)
            {
                addWoodType(type);
            }
        });
    }

    public static void addWoodType(WoodType woodType) {
        SIGN_MATERIALS.put(woodType, new RenderMaterial(SIGN_ATLAS, ReflavoredHelper.prefix("entity/signs/" + woodType.getName())));
    }
    static class ReflavoredWoodType extends WoodType
    {
        public ReflavoredWoodType(String nameIn)
        {
            super(nameIn);
            WOOD_TYPES.add(this);
        }
    }
}
