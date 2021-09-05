package com.sammy.reflavored.registry.data;

import com.sammy.reflavored.ReflavoredHelper;
import net.minecraft.block.Block;
import net.minecraft.block.WallSignBlock;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fml.RegistryObject;

import java.util.HashSet;
import java.util.Set;

import static com.sammy.reflavored.ReflavoredMod.MODID;
import static com.sammy.reflavored.ReflavoredHelper.takeAll;
import static com.sammy.reflavored.registry.ReflavoredBlocks.BLOCKS;
import static com.sammy.reflavored.registry.ReflavoredItems.ITEMS;


public class ModLangProvider extends LanguageProvider
{
    public ModLangProvider(DataGenerator gen)
    {
        super(gen, MODID, "en_us");
    }
    
    @Override
    protected void addTranslations()
    {
        Set<RegistryObject<Block>> blocks = new HashSet<>(BLOCKS.getEntries());
        Set<RegistryObject<Item>> items = new HashSet<>(ITEMS.getEntries());
        takeAll(items, i -> i.get() instanceof BlockItem);
        takeAll(blocks, i -> i.get() instanceof WallTorchBlock);
        takeAll(blocks, i -> i.get() instanceof WallSignBlock);

        blocks.forEach(b -> {
            String name = b.get().getTranslationKey().replaceFirst("block." + MODID + ".", "");
            name = ReflavoredHelper.toTitleCase(specialBlockNameChanges(name), "_");
            add(b.get().getTranslationKey(), name);
        });
        
        items.forEach(i -> {
            if (!(i.get() instanceof BlockItem))
            {
                String name = i.get().getTranslationKey().replaceFirst("item." + MODID + ".", "");
                name = ReflavoredHelper.toTitleCase(specialBlockNameChanges(name), "_");
                add(i.get().getTranslationKey(), name);
            }
        });

        add("itemGroup." + MODID, "Reflavored");
    }

    @Override
    public String getName()
    {
        return "Lang Entries";
    }
    
    public String specialBlockNameChanges(String name)
    {
        if ((!name.endsWith("_bricks")))
        {
            if (name.contains("bricks"))
            {
                name = name.replaceFirst("bricks", "brick");
            }
        }
        if (name.contains("_fence") || name.contains("_button") || name.contains("pressure_plate"))
        {
            if (name.contains("planks"))
            {
                name = name.replaceFirst("_planks", "");
            }
        }
        return name;
    }
}