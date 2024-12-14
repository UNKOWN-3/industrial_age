package net.unkown.industrial_age.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.unkown.industrial_age.Industrial_Age;
import net.unkown.industrial_age.block.ModBlocks;
import net.unkown.industrial_age.item.ModItems;
import net.unkown.industrial_age.item.ModTools;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public static final List<ItemLike> TIN_SMELTABLES = List.of(ModItems.RAW_TIN.get(),
            ModBlocks.TIN_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f, 200,"tin");
        oreSmelting(pWriter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f, 400,"tin");


        //blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZINC_BLOCK.get())
                .pattern("@@@")
                .pattern("@@@")
                .pattern("@@@")
                .define('@', ModItems.ZINC_INGOT.get())
                .unlockedBy(getHasName(ModItems.ZINC_INGOT.get()), has(ModItems.ZINC_INGOT.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZINC_INGOT.get(), 9)
                .requires(ModBlocks.ZINC_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ZINC_BLOCK.get()), has(ModBlocks.ZINC_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TIN_BLOCK.get())
                .pattern("@@@")
                .pattern("@@@")
                .pattern("@@@")
                .define('@', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 9)
                .requires(ModBlocks.TIN_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TIN_BLOCK.get()), has(ModBlocks.TIN_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TITANIUM_BLOCK.get())
                .pattern("@@@")
                .pattern("@@@")
                .pattern("@@@")
                .define('@', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 9)
                .requires(ModBlocks.TITANIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TITANIUM_BLOCK.get()), has(ModBlocks.TITANIUM_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LEAD_BLOCK.get())
                .pattern("@@@")
                .pattern("@@@")
                .pattern("@@@")
                .define('@', ModItems.LEAD_INGOT.get())
                .unlockedBy(getHasName(ModItems.LEAD_INGOT.get()), has(ModItems.LEAD_INGOT.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 9)
                .requires(ModBlocks.LEAD_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.LEAD_BLOCK.get()), has(ModBlocks.LEAD_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALUMINUM_BLOCK.get())
                .pattern("@@@")
                .pattern("@@@")
                .pattern("@@@")
                .define('@', ModItems.ALUMINUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALUMINUM_INGOT.get()), has(ModItems.ALUMINUM_INGOT.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALUMINUM_INGOT.get(), 9)
                .requires(ModBlocks.ALUMINUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ALUMINUM_BLOCK.get()), has(ModBlocks.ALUMINUM_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BRASS_BLOCK.get())
                .pattern("@@@")
                .pattern("@@@")
                .pattern("@@@")
                .define('@', ModItems.BRASS_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRASS_INGOT.get()), has(ModItems.BRASS_INGOT.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRASS_INGOT.get(), 9)
                .requires(ModBlocks.BRASS_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BRASS_BLOCK.get()), has(ModBlocks.BRASS_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BRONZE_BLOCK.get())
                .pattern("@@@")
                .pattern("@@@")
                .pattern("@@@")
                .define('@', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 9)
                .requires(ModBlocks.BRONZE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BRONZE_BLOCK.get()), has(ModBlocks.BRONZE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DURALUMIN_BLOCK.get())
                .pattern("@@@")
                .pattern("@@@")
                .pattern("@@@")
                .define('@', ModItems.DURALUMIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.DURALUMIN_INGOT.get()), has(ModItems.DURALUMIN_INGOT.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DURALUMIN_INGOT.get(), 9)
                .requires(ModBlocks.DURALUMIN_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.DURALUMIN_BLOCK.get()), has(ModBlocks.DURALUMIN_BLOCK.get()))
                .save(pWriter);


        //machines
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BASIC_FOUNDRY_FURNACE.get())
                .pattern("@#@")
                .pattern("@$@")
                .pattern("@#@")
                .define('@', Items.BRICK.asItem())
                .define('#', Blocks.BRICKS.asItem())
                .define('$', Blocks.CAMPFIRE.asItem())
                .unlockedBy(getHasName(Items.BRICK.asItem()), has(Items.BRICK.asItem()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BASIC_JAW_CRUSHER.get())
                .pattern("#$#")
                .pattern("&%&")
                .pattern("&@&")
                .define('@', Blocks.IRON_BLOCK.asItem())
                .define('#', ModItems.TIN_GEAR.get())
                .define('$', ModItems.IRON_SHAFT.get())
                .define('%', Blocks.FURNACE.asItem())
                .define('&', ModItems.IRON_PLATING.get())
                .unlockedBy(getHasName(ModItems.TIN_GEAR.get()), has(ModItems.TIN_GEAR.get()))
                .save(pWriter);

        //gears basic
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_GEAR.get())
                .pattern("#@$")
                .pattern("@ @")
                .pattern(" @ ")
                .define('@', Items.IRON_INGOT.asItem())
                .define('#', ModItems.HAMMER.get())
                .define('$', ModItems.FILE.get())
                .unlockedBy(getHasName(Items.IRON_INGOT.asItem()), has(Items.IRON_INGOT.asItem()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_GEAR.get())
                .pattern("#@$")
                .pattern("@ @")
                .pattern(" @ ")
                .define('@', ModItems.TIN_INGOT.get())
                .define('#', ModItems.HAMMER.get())
                .define('$', ModItems.FILE.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINUM_GEAR.get())
                .pattern("#@$")
                .pattern("@ @")
                .pattern(" @ ")
                .define('@', ModItems.ALUMINUM_INGOT.get())
                .define('#', ModItems.HAMMER.get())
                .define('$', ModItems.FILE.get())
                .unlockedBy(getHasName(ModItems.ALUMINUM_INGOT.get()), has(ModItems.ALUMINUM_INGOT.get()))
                .save(pWriter);

        //rods
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_ROD.get())
                .pattern("# @")
                .pattern(" @ ")
                .pattern("@  ")
                .define('@', Items.IRON_INGOT.asItem())
                .define('#', ModItems.HAMMER.get())
                .unlockedBy(getHasName(Items.IRON_INGOT.asItem()), has(Items.IRON_INGOT.asItem()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINUM_ROD.get())
                .pattern("# @")
                .pattern(" @ ")
                .pattern("@  ")
                .define('@', ModItems.ALUMINUM_ROD.get())
                .define('#', ModItems.HAMMER.get())
                .unlockedBy(getHasName(ModItems.ALUMINUM_INGOT.get()), has(ModItems.ALUMINUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRASS_ROD.get())
                .pattern("# @")
                .pattern(" @ ")
                .pattern("@  ")
                .define('@', ModItems.BRASS_ROD.get())
                .define('#', ModItems.HAMMER.get())
                .unlockedBy(getHasName(ModItems.BRASS_INGOT.get()), has(ModItems.BRASS_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_ROD.get())
                .pattern("# @")
                .pattern(" @ ")
                .pattern("@  ")
                .define('@', ModItems.BRONZE_ROD.get())
                .define('#', ModItems.HAMMER.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_ROD.get())
                .pattern("# @")
                .pattern(" @ ")
                .pattern("@  ")
                .define('@', ModItems.COPPER_ROD.get())
                .define('#', ModItems.HAMMER.get())
                .unlockedBy(getHasName(Items.COPPER_INGOT.asItem()), has(Items.COPPER_INGOT.asItem()))
                .save(pWriter);

        //shafts
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_SHAFT.get())
                .pattern("$% ")
                .pattern("@#@")
                .define('@', ModItems.IRON_ROD.get())
                .define('#', ModItems.IRON_GEAR.get())
                .define('$', ModItems.HAMMER.get())
                .define('%', ModItems.WRENCH.get())
                .unlockedBy(getHasName(ModItems.IRON_ROD.get()), has(ModItems.IRON_ROD.get()))
                .save(pWriter);
        //platings
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_PLATING.get())
                .pattern("$% ")
                .pattern("@#@")
                .define('@', ModItems.IRON_ROD.get())
                .define('#', ModItems.IRON_SHEET.get())
                .define('$', ModItems.HAMMER.get())
                .define('%', ModItems.WRENCH.get())
                .unlockedBy(getHasName(ModItems.IRON_ROD.get()), has(ModItems.IRON_ROD.get()))
                .save(pWriter);

        //sheets
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_SHEET.get())
                .pattern("# ")
                .pattern("@@")
                .define('@', Items.IRON_INGOT.asItem())
                .define('#', ModItems.HAMMER.get())
                .unlockedBy(getHasName(Items.IRON_INGOT.asItem()), has(Items.IRON_INGOT.asItem()))
                .save(pWriter);

        //tools
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HAMMER.get())
                .pattern(" #@")
                .pattern(" $#")
                .pattern("$  ")
                .define('@', Items.STRING.asItem())
                .define('#', Items.IRON_INGOT.asItem())
                .define('$', Items.STICK.asItem())
                .unlockedBy(getHasName(Items.STICK.asItem()), has(Items.STICK.asItem()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FILE.get())
                .pattern("@ #")
                .pattern(" # ")
                .pattern("$  ")
                .define('@', ModItems.HAMMER.get())
                .define('#', Items.IRON_INGOT.asItem())
                .define('$', Items.STICK.asItem())
                .unlockedBy(getHasName(Items.STICK.asItem()), has(Items.STICK.asItem()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WRENCH.get())
                .pattern("@&#")
                .pattern(" % ")
                .pattern("$  ")
                .define('@', ModItems.HAMMER.get())
                .define('#', Items.IRON_INGOT.asItem())
                .define('$', Items.STICK.asItem())
                .define('%', ModItems.IRON_SHEET.get())
                .define('&', ModItems.FILE.get())
                .unlockedBy(getHasName(Items.STICK.asItem()), has(Items.STICK.asItem()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WIRECUTTERS.get())
                .pattern("@ @")
                .pattern("$# ")
                .pattern("# #")
                .define('@', ModItems.IRON_SHEET.get())
                .define('#', Items.STICK.asItem())
                .define('$', ModItems.HAMMER.get())
                .unlockedBy(getHasName(Items.STICK.asItem()), has(Items.STICK.asItem()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAW.get())
                .pattern("$%@")
                .pattern(" @ ")
                .pattern("#  ")
                .define('@', ModItems.IRON_SHEET.get())
                .define('#', Items.STICK.asItem())
                .define('$', ModItems.HAMMER.get())
                .define('%', ModItems.FILE.get())
                .unlockedBy(getHasName(Items.STICK.asItem()), has(Items.STICK.asItem()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.JAW_CRUSHER_BASIC_BELT.get())
                .pattern("#@$")
                .pattern("#@%")
                .define('#', ModItems.IRON_SHEET.get())
                .define('@', Items.IRON_INGOT.asItem())
                .define('$', ModItems.HAMMER.get())
                .define('%', ModItems.FILE.get())
                .unlockedBy(getHasName(Items.IRON_INGOT.asItem()), has(Items.IRON_INGOT.asItem()))
                .save(pWriter);


    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  Industrial_Age.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
