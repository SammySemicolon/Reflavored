package com.sammy.reflavored.registry.data;

import com.sammy.reflavored.registry.ReflavoredItems;
import net.minecraft.advancements.criterion.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.registry.Registry;

import java.util.function.Consumer;

import static net.minecraft.data.ShapedRecipeBuilder.shapedRecipe;
import static net.minecraft.data.ShapelessRecipeBuilder.shapelessRecipe;

public class ModRecipeProvider extends RecipeProvider
{
    public ModRecipeProvider(DataGenerator generatorIn)
    {
        super(generatorIn);
    }
    
    @Override
    public String getName()
    {
        return "Recipe Provider";
    }
    
    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer)
    {
        shapelessPlanks(consumer, ReflavoredItems.BAOBAB_PLANKS.get(), ModItemTagProvider.BAOBAB_LOGS);
        shapelessWood(consumer, ReflavoredItems.BAOBAB_WOOD.get(), ReflavoredItems.BAOBAB_LOG.get());
        shapelessWood(consumer, ReflavoredItems.STRIPPED_BAOBAB_WOOD.get(), ReflavoredItems.STRIPPED_BAOBAB_LOG.get());
        shapelessButton(consumer, ReflavoredItems.BAOBAB_PLANKS_BUTTON.get(), ReflavoredItems.BAOBAB_PLANKS.get());
        shapedDoor(consumer, ReflavoredItems.BAOBAB_DOOR.get(), ReflavoredItems.BAOBAB_PLANKS.get());
        shapedFence(consumer, ReflavoredItems.BAOBAB_PLANKS_FENCE.get(), ReflavoredItems.BAOBAB_PLANKS.get());
        shapedFenceGate(consumer, ReflavoredItems.BAOBAB_PLANKS_FENCE_GATE.get(), ReflavoredItems.BAOBAB_PLANKS.get());
        shapedPressurePlate(consumer, ReflavoredItems.BAOBAB_PLANKS_PRESSURE_PLATE.get(), ReflavoredItems.BAOBAB_PLANKS.get());
        shapedSlab(consumer, ReflavoredItems.BAOBAB_PLANKS_SLAB.get(), ReflavoredItems.BAOBAB_PLANKS.get());
        shapedStairs(consumer, ReflavoredItems.BAOBAB_PLANKS_STAIRS.get(), ReflavoredItems.BAOBAB_PLANKS.get());
        shapedTrapdoor(consumer, ReflavoredItems.BAOBAB_TRAPDOOR.get(), ReflavoredItems.BAOBAB_PLANKS.get());
        shapedSign(consumer, ReflavoredItems.BAOBAB_SIGN.get(), ReflavoredItems.BAOBAB_PLANKS.get());
        shapedRecipe(ReflavoredItems.BAOBAB_BOAT.get()).key('#', ReflavoredItems.BAOBAB_PLANKS.get()).patternLine("# #").patternLine("###").addCriterion("has_baobab_planks", hasItem(ReflavoredItems.BAOBAB_PLANKS.get())).build(consumer);

        shapelessPlanks(consumer, ReflavoredItems.FIR_PLANKS.get(), ModItemTagProvider.FIR_LOGS);
        shapelessWood(consumer, ReflavoredItems.FIR_WOOD.get(), ReflavoredItems.FIR_LOG.get());
        shapelessWood(consumer, ReflavoredItems.STRIPPED_FIR_WOOD.get(), ReflavoredItems.STRIPPED_FIR_LOG.get());
        shapelessButton(consumer, ReflavoredItems.FIR_PLANKS_BUTTON.get(), ReflavoredItems.FIR_PLANKS.get());
        shapedDoor(consumer, ReflavoredItems.FIR_DOOR.get(), ReflavoredItems.FIR_PLANKS.get());
        shapedFence(consumer, ReflavoredItems.FIR_PLANKS_FENCE.get(), ReflavoredItems.FIR_PLANKS.get());
        shapedFenceGate(consumer, ReflavoredItems.FIR_PLANKS_FENCE_GATE.get(), ReflavoredItems.FIR_PLANKS.get());
        shapedPressurePlate(consumer, ReflavoredItems.FIR_PLANKS_PRESSURE_PLATE.get(), ReflavoredItems.FIR_PLANKS.get());
        shapedSlab(consumer, ReflavoredItems.FIR_PLANKS_SLAB.get(), ReflavoredItems.FIR_PLANKS.get());
        shapedStairs(consumer, ReflavoredItems.FIR_PLANKS_STAIRS.get(), ReflavoredItems.FIR_PLANKS.get());
        shapedTrapdoor(consumer, ReflavoredItems.FIR_TRAPDOOR.get(), ReflavoredItems.FIR_PLANKS.get());
        shapedSign(consumer, ReflavoredItems.FIR_SIGN.get(), ReflavoredItems.FIR_PLANKS.get());
        shapedRecipe(ReflavoredItems.FIR_BOAT.get()).key('#', ReflavoredItems.FIR_PLANKS.get()).patternLine("# #").patternLine("###").addCriterion("has_fir_planks", hasItem(ReflavoredItems.FIR_PLANKS.get())).build(consumer);

        shapelessPlanks(consumer, ReflavoredItems.PINE_PLANKS.get(), ModItemTagProvider.PINE_LOGS);
        shapelessWood(consumer, ReflavoredItems.PINE_WOOD.get(), ReflavoredItems.PINE_LOG.get());
        shapelessWood(consumer, ReflavoredItems.STRIPPED_PINE_WOOD.get(), ReflavoredItems.STRIPPED_PINE_LOG.get());
        shapelessButton(consumer, ReflavoredItems.PINE_PLANKS_BUTTON.get(), ReflavoredItems.PINE_PLANKS.get());
        shapedDoor(consumer, ReflavoredItems.PINE_DOOR.get(), ReflavoredItems.PINE_PLANKS.get());
        shapedFence(consumer, ReflavoredItems.PINE_PLANKS_FENCE.get(), ReflavoredItems.PINE_PLANKS.get());
        shapedFenceGate(consumer, ReflavoredItems.PINE_PLANKS_FENCE_GATE.get(), ReflavoredItems.PINE_PLANKS.get());
        shapedPressurePlate(consumer, ReflavoredItems.PINE_PLANKS_PRESSURE_PLATE.get(), ReflavoredItems.PINE_PLANKS.get());
        shapedSlab(consumer, ReflavoredItems.PINE_PLANKS_SLAB.get(), ReflavoredItems.PINE_PLANKS.get());
        shapedStairs(consumer, ReflavoredItems.PINE_PLANKS_STAIRS.get(), ReflavoredItems.PINE_PLANKS.get());
        shapedTrapdoor(consumer, ReflavoredItems.PINE_TRAPDOOR.get(), ReflavoredItems.PINE_PLANKS.get());
        shapedSign(consumer, ReflavoredItems.PINE_SIGN.get(), ReflavoredItems.PINE_PLANKS.get());
        shapedRecipe(ReflavoredItems.PINE_BOAT.get()).key('#', ReflavoredItems.PINE_PLANKS.get()).patternLine("# #").patternLine("###").addCriterion("has_pine_planks", hasItem(ReflavoredItems.PINE_PLANKS.get())).build(consumer);

        shapelessPlanks(consumer, ReflavoredItems.REDWOOD_PLANKS.get(), ModItemTagProvider.REDWOOD_LOGS);
        shapelessWood(consumer, ReflavoredItems.REDWOOD_WOOD.get(), ReflavoredItems.REDWOOD_LOG.get());
        shapelessWood(consumer, ReflavoredItems.STRIPPED_REDWOOD_WOOD.get(), ReflavoredItems.STRIPPED_REDWOOD_LOG.get());
        shapelessButton(consumer, ReflavoredItems.REDWOOD_PLANKS_BUTTON.get(), ReflavoredItems.REDWOOD_PLANKS.get());
        shapedDoor(consumer, ReflavoredItems.REDWOOD_DOOR.get(), ReflavoredItems.REDWOOD_PLANKS.get());
        shapedFence(consumer, ReflavoredItems.REDWOOD_PLANKS_FENCE.get(), ReflavoredItems.REDWOOD_PLANKS.get());
        shapedFenceGate(consumer, ReflavoredItems.REDWOOD_PLANKS_FENCE_GATE.get(), ReflavoredItems.REDWOOD_PLANKS.get());
        shapedPressurePlate(consumer, ReflavoredItems.REDWOOD_PLANKS_PRESSURE_PLATE.get(), ReflavoredItems.REDWOOD_PLANKS.get());
        shapedSlab(consumer, ReflavoredItems.REDWOOD_PLANKS_SLAB.get(), ReflavoredItems.REDWOOD_PLANKS.get());
        shapedStairs(consumer, ReflavoredItems.REDWOOD_PLANKS_STAIRS.get(), ReflavoredItems.REDWOOD_PLANKS.get());
        shapedTrapdoor(consumer, ReflavoredItems.REDWOOD_TRAPDOOR.get(), ReflavoredItems.REDWOOD_PLANKS.get());
        shapedSign(consumer, ReflavoredItems.REDWOOD_SIGN.get(), ReflavoredItems.REDWOOD_PLANKS.get());
        shapedRecipe(ReflavoredItems.REDWOOD_BOAT.get()).key('#', ReflavoredItems.REDWOOD_PLANKS.get()).patternLine("# #").patternLine("###").addCriterion("has_redwood_planks", hasItem(ReflavoredItems.REDWOOD_PLANKS.get())).build(consumer);

        shapelessPlanks(consumer, ReflavoredItems.SAKURA_PLANKS.get(), ModItemTagProvider.SAKURA_LOGS);
        shapelessWood(consumer, ReflavoredItems.SAKURA_WOOD.get(), ReflavoredItems.SAKURA_LOG.get());
        shapelessWood(consumer, ReflavoredItems.STRIPPED_SAKURA_WOOD.get(), ReflavoredItems.STRIPPED_SAKURA_LOG.get());
        shapelessButton(consumer, ReflavoredItems.SAKURA_PLANKS_BUTTON.get(), ReflavoredItems.SAKURA_PLANKS.get());
        shapedDoor(consumer, ReflavoredItems.SAKURA_DOOR.get(), ReflavoredItems.SAKURA_PLANKS.get());
        shapedFence(consumer, ReflavoredItems.SAKURA_PLANKS_FENCE.get(), ReflavoredItems.SAKURA_PLANKS.get());
        shapedFenceGate(consumer, ReflavoredItems.SAKURA_PLANKS_FENCE_GATE.get(), ReflavoredItems.SAKURA_PLANKS.get());
        shapedPressurePlate(consumer, ReflavoredItems.SAKURA_PLANKS_PRESSURE_PLATE.get(), ReflavoredItems.SAKURA_PLANKS.get());
        shapedSlab(consumer, ReflavoredItems.SAKURA_PLANKS_SLAB.get(), ReflavoredItems.SAKURA_PLANKS.get());
        shapedStairs(consumer, ReflavoredItems.SAKURA_PLANKS_STAIRS.get(), ReflavoredItems.SAKURA_PLANKS.get());
        shapedTrapdoor(consumer, ReflavoredItems.SAKURA_TRAPDOOR.get(), ReflavoredItems.SAKURA_PLANKS.get());
        shapedSign(consumer, ReflavoredItems.SAKURA_SIGN.get(), ReflavoredItems.SAKURA_PLANKS.get());
        shapedRecipe(ReflavoredItems.SAKURA_BOAT.get()).key('#', ReflavoredItems.SAKURA_PLANKS.get()).patternLine("# #").patternLine("###").addCriterion("has_sakura_planks", hasItem(ReflavoredItems.SAKURA_PLANKS.get())).build(consumer);

        shapelessPlanks(consumer, ReflavoredItems.WILLOW_PLANKS.get(), ModItemTagProvider.WILLOW_LOGS);
        shapelessWood(consumer, ReflavoredItems.WILLOW_WOOD.get(), ReflavoredItems.WILLOW_LOG.get());
        shapelessWood(consumer, ReflavoredItems.STRIPPED_WILLOW_WOOD.get(), ReflavoredItems.STRIPPED_WILLOW_LOG.get());
        shapelessButton(consumer, ReflavoredItems.WILLOW_PLANKS_BUTTON.get(), ReflavoredItems.WILLOW_PLANKS.get());
        shapedDoor(consumer, ReflavoredItems.WILLOW_DOOR.get(), ReflavoredItems.WILLOW_PLANKS.get());
        shapedFence(consumer, ReflavoredItems.WILLOW_PLANKS_FENCE.get(), ReflavoredItems.WILLOW_PLANKS.get());
        shapedFenceGate(consumer, ReflavoredItems.WILLOW_PLANKS_FENCE_GATE.get(), ReflavoredItems.WILLOW_PLANKS.get());
        shapedPressurePlate(consumer, ReflavoredItems.WILLOW_PLANKS_PRESSURE_PLATE.get(), ReflavoredItems.WILLOW_PLANKS.get());
        shapedSlab(consumer, ReflavoredItems.WILLOW_PLANKS_SLAB.get(), ReflavoredItems.WILLOW_PLANKS.get());
        shapedStairs(consumer, ReflavoredItems.WILLOW_PLANKS_STAIRS.get(), ReflavoredItems.WILLOW_PLANKS.get());
        shapedTrapdoor(consumer, ReflavoredItems.WILLOW_TRAPDOOR.get(), ReflavoredItems.WILLOW_PLANKS.get());
        shapedSign(consumer, ReflavoredItems.WILLOW_SIGN.get(), ReflavoredItems.WILLOW_PLANKS.get());
        shapedRecipe(ReflavoredItems.WILLOW_BOAT.get()).key('#', ReflavoredItems.WILLOW_PLANKS.get()).patternLine("# #").patternLine("###").addCriterion("has_willow_planks", hasItem(ReflavoredItems.WILLOW_PLANKS.get())).build(consumer);

        shapelessPlanks(consumer, ReflavoredItems.PALM_PLANKS.get(), ModItemTagProvider.PALM_LOGS);
        shapelessWood(consumer, ReflavoredItems.PALM_WOOD.get(), ReflavoredItems.PALM_LOG.get());
        shapelessWood(consumer, ReflavoredItems.STRIPPED_PALM_WOOD.get(), ReflavoredItems.STRIPPED_PALM_LOG.get());
        shapelessButton(consumer, ReflavoredItems.PALM_PLANKS_BUTTON.get(), ReflavoredItems.PALM_PLANKS.get());
        shapedDoor(consumer, ReflavoredItems.PALM_DOOR.get(), ReflavoredItems.PALM_PLANKS.get());
        shapedFence(consumer, ReflavoredItems.PALM_PLANKS_FENCE.get(), ReflavoredItems.PALM_PLANKS.get());
        shapedFenceGate(consumer, ReflavoredItems.PALM_PLANKS_FENCE_GATE.get(), ReflavoredItems.PALM_PLANKS.get());
        shapedPressurePlate(consumer, ReflavoredItems.PALM_PLANKS_PRESSURE_PLATE.get(), ReflavoredItems.PALM_PLANKS.get());
        shapedSlab(consumer, ReflavoredItems.PALM_PLANKS_SLAB.get(), ReflavoredItems.PALM_PLANKS.get());
        shapedStairs(consumer, ReflavoredItems.PALM_PLANKS_STAIRS.get(), ReflavoredItems.PALM_PLANKS.get());
        shapedTrapdoor(consumer, ReflavoredItems.PALM_TRAPDOOR.get(), ReflavoredItems.PALM_PLANKS.get());
        shapedSign(consumer, ReflavoredItems.PALM_SIGN.get(), ReflavoredItems.PALM_PLANKS.get());
        shapedRecipe(ReflavoredItems.PALM_BOAT.get()).key('#', ReflavoredItems.PALM_PLANKS.get()).patternLine("# #").patternLine("###").addCriterion("has_palm_planks", hasItem(ReflavoredItems.PALM_PLANKS.get())).build(consumer);

        shapelessPlanks(consumer, ReflavoredItems.MANGROVE_PLANKS.get(), ModItemTagProvider.MANGROVE_LOGS);
        shapelessWood(consumer, ReflavoredItems.MANGROVE_WOOD.get(), ReflavoredItems.MANGROVE_LOG.get());
        shapelessWood(consumer, ReflavoredItems.STRIPPED_MANGROVE_WOOD.get(), ReflavoredItems.STRIPPED_MANGROVE_LOG.get());
        shapelessButton(consumer, ReflavoredItems.MANGROVE_PLANKS_BUTTON.get(), ReflavoredItems.MANGROVE_PLANKS.get());
        shapedDoor(consumer, ReflavoredItems.MANGROVE_DOOR.get(), ReflavoredItems.MANGROVE_PLANKS.get());
        shapedFence(consumer, ReflavoredItems.MANGROVE_PLANKS_FENCE.get(), ReflavoredItems.MANGROVE_PLANKS.get());
        shapedFenceGate(consumer, ReflavoredItems.MANGROVE_PLANKS_FENCE_GATE.get(), ReflavoredItems.MANGROVE_PLANKS.get());
        shapedPressurePlate(consumer, ReflavoredItems.MANGROVE_PLANKS_PRESSURE_PLATE.get(), ReflavoredItems.MANGROVE_PLANKS.get());
        shapedSlab(consumer, ReflavoredItems.MANGROVE_PLANKS_SLAB.get(), ReflavoredItems.MANGROVE_PLANKS.get());
        shapedStairs(consumer, ReflavoredItems.MANGROVE_PLANKS_STAIRS.get(), ReflavoredItems.MANGROVE_PLANKS.get());
        shapedTrapdoor(consumer, ReflavoredItems.MANGROVE_TRAPDOOR.get(), ReflavoredItems.MANGROVE_PLANKS.get());
        shapedSign(consumer, ReflavoredItems.MANGROVE_SIGN.get(), ReflavoredItems.MANGROVE_PLANKS.get());
        shapedRecipe(ReflavoredItems.MANGROVE_BOAT.get()).key('#', ReflavoredItems.MANGROVE_PLANKS.get()).patternLine("# #").patternLine("###").addCriterion("has_mangrove_planks", hasItem(ReflavoredItems.MANGROVE_PLANKS.get())).build(consumer);
    }

    private static void smithingReinforce(Consumer<IFinishedRecipe> recipeConsumer, Item itemToReinforce, Item output, Item reinforcement)
    {
        SmithingRecipeBuilder.smithingRecipe(Ingredient.fromItems(itemToReinforce), Ingredient.fromItems(reinforcement), output).addCriterion("has_" + Registry.ITEM.getKey(reinforcement).getPath(), hasItem(reinforcement)).build(recipeConsumer, Registry.ITEM.getKey(output).getPath() + "_smithing");
    }
    private static void shapelessPlanks(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider planks, ITag<Item> input)
    {
        shapelessRecipe(planks, 4).addIngredient(input).setGroup("planks").addCriterion("has_logs", hasItem(input)).build(recipeConsumer);
    }
    private static void shapelessWood(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider stripped, IItemProvider input)
    {
        shapedRecipe(stripped, 3).key('#', input).patternLine("##").patternLine("##").setGroup("bark").addCriterion("has_log", hasItem(input)).build(recipeConsumer);
    }
    private static void shapelessButton(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider button, IItemProvider input)
    {
        shapelessRecipe(button).addIngredient(input).addCriterion("has_input", hasItem(input)).build(recipeConsumer);
    }
    private static void shapedDoor(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider door, IItemProvider input)
    {
        shapedRecipe(door, 3).key('#', input).patternLine("##").patternLine("##").patternLine("##").addCriterion("has_input", hasItem(input)).build(recipeConsumer);
    }
    private static void shapedFence(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider fence, IItemProvider input)
    {
        shapedRecipe(fence, 3).key('#', Items.STICK).key('W', input).patternLine("W#W").patternLine("W#W").addCriterion("has_input", hasItem(input)).build(recipeConsumer);
    }
    private static void shapedFenceGate(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider fenceGate, IItemProvider input)
    {
        shapedRecipe(fenceGate).key('#', Items.STICK).key('W', input).patternLine("#W#").patternLine("#W#").addCriterion("has_input", hasItem(input)).build(recipeConsumer);
    }
    private static void shapedPressurePlate(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider pressurePlate, IItemProvider input)
    {
        shapedRecipe(pressurePlate).key('#', input).patternLine("##").addCriterion("has_input", hasItem(input)).build(recipeConsumer);
    }
    private static void shapedSlab(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider slab, IItemProvider input)
    {
        shapedRecipe(slab, 6).key('#', input).patternLine("###").addCriterion("has_input", hasItem(input)).build(recipeConsumer);
    }
    private static void shapedStairs(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider stairs, IItemProvider input)
    {
        shapedRecipe(stairs, 4).key('#', input).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion("has_input", hasItem(input)).build(recipeConsumer);
    }
    private static void shapedTrapdoor(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider trapdoor, IItemProvider input)
    {
        shapedRecipe(trapdoor, 2).key('#', input).patternLine("###").patternLine("###").addCriterion("has_input", hasItem(input)).build(recipeConsumer);
    }
    private static void shapedSign(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider sign, IItemProvider input)
    {
        String s = Registry.ITEM.getKey(input.asItem()).getPath();
        shapedRecipe(sign, 3).setGroup("sign").key('#', input).key('X', Items.STICK).patternLine("###").patternLine("###").patternLine(" X ").addCriterion("has_" + s, hasItem(input)).build(recipeConsumer);
    }
    private static void shapelessColoredWool(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider coloredWool, IItemProvider dye)
    {
        shapelessRecipe(coloredWool).addIngredient(dye).addIngredient(Blocks.WHITE_WOOL).setGroup("wool").addCriterion("has_white_wool", hasItem(Blocks.WHITE_WOOL)).build(recipeConsumer);
    }
    private static void shapedCarpet(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider carpet, IItemProvider input)
    {
        String s = Registry.ITEM.getKey(input.asItem()).getPath();
        shapedRecipe(carpet, 3).key('#', input).patternLine("##").setGroup("carpet").addCriterion("has_" + s, hasItem(input)).build(recipeConsumer);
    }
    private static void shapelessColoredCarpet(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider coloredCarpet, IItemProvider dye)
    {
        String s = Registry.ITEM.getKey(coloredCarpet.asItem()).getPath();
        String s1 = Registry.ITEM.getKey(dye.asItem()).getPath();
        shapedRecipe(coloredCarpet, 8).key('#', Blocks.WHITE_CARPET).key('$', dye).patternLine("###").patternLine("#$#").patternLine("###").setGroup("carpet").addCriterion("has_white_carpet", hasItem(Blocks.WHITE_CARPET)).addCriterion("has_" + s1, hasItem(dye)).build(recipeConsumer, s + "_from_white_carpet");
    }
    private static void shapedBed(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider bed, IItemProvider wool)
    {
        String s = Registry.ITEM.getKey(wool.asItem()).getPath();
        shapedRecipe(bed).key('#', wool).key('X', ItemTags.PLANKS).patternLine("###").patternLine("XXX").setGroup("bed").addCriterion("has_" + s, hasItem(wool)).build(recipeConsumer);
    }
    private static void shapedColoredBed(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider coloredBed, IItemProvider dye)
    {
        String s = Registry.ITEM.getKey(coloredBed.asItem()).getPath();
        shapelessRecipe(coloredBed).addIngredient(Items.WHITE_BED).addIngredient(dye).setGroup("dyed_bed").addCriterion("has_bed", hasItem(Items.WHITE_BED)).build(recipeConsumer, s + "_from_white_bed");
    }
    private static void shapedBanner(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider banner, IItemProvider input)
    {
        String s = Registry.ITEM.getKey(input.asItem()).getPath();
        shapedRecipe(banner).key('#', input).key('|', Items.STICK).patternLine("###").patternLine("###").patternLine(" | ").setGroup("banner").addCriterion("has_" + s, hasItem(input)).build(recipeConsumer);
    }
    private static void shapedColoredGlass(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider coloredGlass, IItemProvider dye)
    {
        shapedRecipe(coloredGlass, 8).key('#', Blocks.GLASS).key('X', dye).patternLine("###").patternLine("#X#").patternLine("###").setGroup("stained_glass").addCriterion("has_glass", hasItem(Blocks.GLASS)).build(recipeConsumer);
    }
    private static void shapedGlassPane(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider pane, IItemProvider glass)
    {
        shapedRecipe(pane, 16).key('#', glass).patternLine("###").patternLine("###").setGroup("stained_glass_pane").addCriterion("has_glass", hasItem(glass)).build(recipeConsumer);
    }
    private static void shapedColoredPane(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider coloredPane, IItemProvider dye)
    {
        String s = Registry.ITEM.getKey(coloredPane.asItem()).getPath();
        String s1 = Registry.ITEM.getKey(dye.asItem()).getPath();
        shapedRecipe(coloredPane, 8).key('#', Blocks.GLASS_PANE).key('$', dye).patternLine("###").patternLine("#$#").patternLine("###").setGroup("stained_glass_pane").addCriterion("has_glass_pane", hasItem(Blocks.GLASS_PANE)).addCriterion("has_" + s1, hasItem(dye)).build(recipeConsumer, s + "_from_glass_pane");
    }
    private static void shapedColoredTerracotta(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider coloredTerracotta, IItemProvider dye)
    {
        shapedRecipe(coloredTerracotta, 8).key('#', Blocks.TERRACOTTA).key('X', dye).patternLine("###").patternLine("#X#").patternLine("###").setGroup("stained_terracotta").addCriterion("has_terracotta", hasItem(Blocks.TERRACOTTA)).build(recipeConsumer);
    }
    private static void shapedColorConcretePowder(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider coloredConcretePowder, IItemProvider dye)
    {
        shapelessRecipe(coloredConcretePowder, 8).addIngredient(dye).addIngredient(Blocks.SAND, 4).addIngredient(Blocks.GRAVEL, 4).setGroup("concrete_powder").addCriterion("has_sand", hasItem(Blocks.SAND)).addCriterion("has_gravel", hasItem(Blocks.GRAVEL)).build(recipeConsumer);
    }
    protected static EnterBlockTrigger.Instance enteredBlock(Block block)
    {
        return new EnterBlockTrigger.Instance(EntityPredicate.AndPredicate.ANY_AND, block, StatePropertiesPredicate.EMPTY);
    }
    protected static InventoryChangeTrigger.Instance hasItem(IItemProvider item)
    {
        return hasItem(ItemPredicate.Builder.create().item(item).build());
    }
    protected static InventoryChangeTrigger.Instance hasItem(ITag<Item> tag)
    {
        return hasItem(ItemPredicate.Builder.create().tag(tag).build());
    }
    protected static InventoryChangeTrigger.Instance hasItem(ItemPredicate... predicate)
    {
        return new InventoryChangeTrigger.Instance(EntityPredicate.AndPredicate.ANY_AND, MinMaxBounds.IntBound.UNBOUNDED, MinMaxBounds.IntBound.UNBOUNDED, MinMaxBounds.IntBound.UNBOUNDED, predicate);
    }
}