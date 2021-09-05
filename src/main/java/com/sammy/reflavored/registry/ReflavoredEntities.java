package com.sammy.reflavored.registry;

import com.sammy.reflavored.ReflavoredHelper;
import com.sammy.reflavored.ReflavoredMod;
import com.sammy.reflavored.content.entity.ReflavoredBoatEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.BoatEntity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ReflavoredEntities
{
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, ReflavoredMod.MODID);

    public static final RegistryObject<EntityType<ReflavoredBoatEntity>> BAOBAB_BOAT = ENTITY_TYPES.register("baobab_boat",
            () -> EntityType.Builder.<ReflavoredBoatEntity>create((t, w)->new ReflavoredBoatEntity(t, w, ReflavoredItems.BAOBAB_BOAT, ReflavoredItems.BAOBAB_PLANKS), EntityClassification.MISC).size(1.375F, 0.5625F).trackingRange(10)
                    .build(ReflavoredHelper.prefix("baobab_boat").toString()));

    public static final RegistryObject<EntityType<ReflavoredBoatEntity>> FIR_BOAT = ENTITY_TYPES.register("fir_boat",
            () -> EntityType.Builder.<ReflavoredBoatEntity>create((t, w)->new ReflavoredBoatEntity(t, w, ReflavoredItems.FIR_BOAT, ReflavoredItems.FIR_PLANKS), EntityClassification.MISC).size(1.375F, 0.5625F).trackingRange(10)
                    .build(ReflavoredHelper.prefix("fir_boat").toString()));

    public static final RegistryObject<EntityType<ReflavoredBoatEntity>> PINE_BOAT = ENTITY_TYPES.register("pine_boat",
            () -> EntityType.Builder.<ReflavoredBoatEntity>create((t, w)->new ReflavoredBoatEntity(t, w, ReflavoredItems.PINE_BOAT, ReflavoredItems.PINE_PLANKS), EntityClassification.MISC).size(1.375F, 0.5625F).trackingRange(10)
                    .build(ReflavoredHelper.prefix("pine_boat").toString()));

    public static final RegistryObject<EntityType<ReflavoredBoatEntity>> REDWOOD_BOAT = ENTITY_TYPES.register("redwood_boat",
            () -> EntityType.Builder.<ReflavoredBoatEntity>create((t, w)->new ReflavoredBoatEntity(t, w, ReflavoredItems.REDWOOD_BOAT, ReflavoredItems.REDWOOD_PLANKS), EntityClassification.MISC).size(1.375F, 0.5625F).trackingRange(10)
                    .build(ReflavoredHelper.prefix("redwood_boat").toString()));

    public static final RegistryObject<EntityType<ReflavoredBoatEntity>> SAKURA_BOAT = ENTITY_TYPES.register("sakura_boat",
            () -> EntityType.Builder.<ReflavoredBoatEntity>create((t, w)->new ReflavoredBoatEntity(t, w, ReflavoredItems.SAKURA_BOAT, ReflavoredItems.SAKURA_PLANKS), EntityClassification.MISC).size(1.375F, 0.5625F).trackingRange(10)
                    .build(ReflavoredHelper.prefix("sakura_boat").toString()));

    public static final RegistryObject<EntityType<ReflavoredBoatEntity>> WILLOW_BOAT = ENTITY_TYPES.register("willow_boat",
            () -> EntityType.Builder.<ReflavoredBoatEntity>create((t, w)->new ReflavoredBoatEntity(t, w, ReflavoredItems.WILLOW_BOAT, ReflavoredItems.BAOBAB_PLANKS), EntityClassification.MISC).size(1.375F, 0.5625F).trackingRange(10)
                    .build(ReflavoredHelper.prefix("willow_boat").toString()));

    public static final RegistryObject<EntityType<ReflavoredBoatEntity>> PALM_BOAT = ENTITY_TYPES.register("palm_boat",
            () -> EntityType.Builder.<ReflavoredBoatEntity>create((t, w)->new ReflavoredBoatEntity(t, w, ReflavoredItems.PALM_BOAT, ReflavoredItems.PALM_PLANKS), EntityClassification.MISC).size(1.375F, 0.5625F).trackingRange(10)
                    .build(ReflavoredHelper.prefix("palm_boat").toString()));

    public static final RegistryObject<EntityType<ReflavoredBoatEntity>> MANGROVE_BOAT = ENTITY_TYPES.register("mangrove_boat",
            () -> EntityType.Builder.<ReflavoredBoatEntity>create((t, w)->new ReflavoredBoatEntity(t, w, ReflavoredItems.MANGROVE_BOAT, ReflavoredItems.MANGROVE_PLANKS), EntityClassification.MISC).size(1.375F, 0.5625F).trackingRange(10)
                    .build(ReflavoredHelper.prefix("mangrove_boat").toString()));

}
