package net.arcanecourt.starlitorigins.datagen;

import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.arcanecourt.starlitorigins.item.ModItems;
import net.arcanecourt.starlitorigins.util.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;
import vectorwing.farmersdelight.data.recipe.CuttingRecipes;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        //Crafting :3
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.GOLD_COATED_CALCITE_EGG.get())
                .pattern("ABA")
                .pattern("BCB")
                .pattern("ABA")
                .define('A', Items.GOLD_INGOT)
                .define('B', Items.CALCITE)
                .define('C', Items.EGG)
                .unlockedBy(getHasName(Items.CALCITE), has(Items.CALCITE))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.FUNGAL_BROCHETTE.get(), 1)
                .requires(Items.STICK)
                .requires(Items.BROWN_MUSHROOM)
                .requires(Items.RED_MUSHROOM)
                .requires(ModItems.COOKED_SENSOR_TENDRIL.get(), 2)
                .unlockedBy(getHasName(ModItems.RAW_SENSOR_TENDRIL.get()), has(ModItems.RAW_SENSOR_TENDRIL.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.AMETHYST_ON_A_STICK.get(), 1)
                .requires(Items.STICK)
                .requires(Items.AMETHYST_SHARD)
                .requires(Items.SUGAR, 2)
                .requires(ItemRegistry.ARCANE_ESSENCE.get(), 2)
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.LITHOSPHERIAN_SALAD.get(), 1)
                .requires(Items.BOWL)
                .requires(Items.AMETHYST_CLUSTER)
                .requires(Items.LAPIS_LAZULI)
                .requires(Items.RAW_GOLD)
                .requires(Items.DIAMOND)
                .requires(Items.EMERALD)
                .requires(ItemRegistry.ARCANE_ESSENCE.get(), 2)
                .unlockedBy(getHasName(Items.BOWL), has(Items.BOWL))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.OVERTAKEN_BERRY_MIX.get(), 1)
                .requires(Items.BOWL)
                .requires(Items.SWEET_BERRIES, 2)
                .requires(Items.GLOW_BERRIES, 2)
                .requires(ModItems.SCULK_PASTE.get())
                .requires(ModItems.RAW_SENSOR_TENDRIL.get())
                .unlockedBy(getHasName(Items.BOWL), has(Items.BOWL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.RAW_EMERALD_GINGERBREAD.get())
                .pattern("DAD")
                .pattern("ABA")
                .pattern("DCD")
                .define('A', ModItems.POWDERED_EMERALD.get())
                .define('B', vectorwing.farmersdelight.common.registry.ModItems.WHEAT_DOUGH.get())
                .define('C', Items.EMERALD)
                .define('D', Items.SUGAR)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.RAW_CORDON_BLEU.get())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("ABA")
                .define('A', ModItems.POWDERED_LAPIS.get())
                .define('B', vectorwing.farmersdelight.common.registry.ModItems.WHEAT_DOUGH.get())
                .define('C', vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .define('D', vectorwing.farmersdelight.common.registry.ModItems.MILK_BOTTLE.get())
                .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Items.LAPIS_LAZULI))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.CINDER_INFUSED_COAL.get())
                .pattern("ABA")
                .pattern("BCB")
                .pattern("ABA")
                .define('A', ItemRegistry.CINDER_ESSENCE.get())
                .define('B', Items.BLAZE_POWDER)
                .define('C', Items.COAL)
                .unlockedBy(getHasName(Items.BLAZE_POWDER), has(Items.BLAZE_POWDER))
                .save(pWriter);

                // Cooking :3
        SimpleCookingRecipeBuilder.generic(Ingredient.of((ItemLike) ModItems.GOLD_COATED_CALCITE_EGG.get()),
                RecipeCategory.FOOD,
                ModItems.BOILED_GOLD_COATED_CALCITE_EGG.get(),
                0.25f,
                200,
                RecipeSerializer.SMELTING_RECIPE)
                .unlockedBy(getHasName(ModItems.GOLD_COATED_CALCITE_EGG.get()), has(ModItems.GOLD_COATED_CALCITE_EGG.get()))
                .save(pWriter);

        foodCookingByTag(ModTags.Items.CHARREABLE_VEGETABLES, ModItems.CHARRED_VEGETABLE.get(), 0.25f, pWriter);
        foodCookingByTag(ModTags.Items.CHARREABLE_MEATS, ModItems.CHARRED_MEAT.get(), 0.25f, pWriter);
        foodCookingByTag(ModTags.Items.CHARREABLE_FISH, ModItems.CHARRED_FISH.get(), 0.25f, pWriter);

        foodCookingByIngredient(ModItems.RAW_SENSOR_TENDRIL.get(), ModItems.COOKED_SENSOR_TENDRIL.get(), 0.25f, pWriter);
        foodCookingByIngredient(ModItems.RAW_CORDON_BLEU.get(), ModItems.COOKED_CORDON_BLEU.get(), 0.25f, pWriter);
        foodCookingByIngredient(ModItems.RAW_EMERALD_GINGERBREAD.get(), ModItems.BAKED_EMERALD_GINGERBREAD.get(), 0.25f, pWriter);


                // Cutting board :3
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(Items.SCULK_SENSOR), CuttingRecipes.KNIVES, ModItems.RAW_SENSOR_TENDRIL.get(), 2, 1.0f).setNamespace(StarlitOrigins.MOD_ID).save(pWriter);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(Items.DIAMOND), CuttingRecipes.PICKAXES, ModItems.POWDERED_DIAMOND.get(), 2, 1.0f).setNamespace(StarlitOrigins.MOD_ID).save(pWriter);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(Items.EMERALD), CuttingRecipes.PICKAXES, ModItems.POWDERED_EMERALD.get(), 2, 1.0f).setNamespace(StarlitOrigins.MOD_ID).save(pWriter);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(Items.RAW_GOLD), CuttingRecipes.PICKAXES, ModItems.POWDERED_GOLD.get(), 2, 1.0f).setNamespace(StarlitOrigins.MOD_ID).save(pWriter);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(Items.LAPIS_LAZULI), CuttingRecipes.PICKAXES, ModItems.POWDERED_LAPIS.get(), 2, 1.0f).setNamespace(StarlitOrigins.MOD_ID).save(pWriter);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(Items.SCULK), CuttingRecipes.SHOVELS, ModItems.SCULK_PASTE.get(), 1, 0.5f).setNamespace(StarlitOrigins.MOD_ID).save(pWriter);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.SMALL_GEODE.get()), CuttingRecipes.PICKAXES, ModItems.SMALL_GEODE_CRACKED.get(), 1, 1.0f).setNamespace(StarlitOrigins.MOD_ID).save(pWriter);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.SMALL_GEODE_NETHERRACK.get()), CuttingRecipes.PICKAXES, ModItems.SMALL_GEODE_CRACKED_NETHERRACK.get(), 1, 1.0f).setNamespace(StarlitOrigins.MOD_ID).save(pWriter);

                // Cooking Pot :3
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.AMETHYST_TEA.get(), 1, 100, 0.25f, ModItems.SMALL_GEODE_CRACKED.get()).addIngredient(Items.WATER_BUCKET).addIngredient(Items.GLOW_BERRIES, 2).addIngredient(ItemRegistry.ARCANE_ESSENCE.get()).addIngredient(Items.SUGAR).setNamespace(StarlitOrigins.MOD_ID).save(pWriter);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.CITRINE_TEA.get(), 1, 100, 0.25f, ModItems.SMALL_GEODE_CRACKED_NETHERRACK.get()).addIngredient(Items.WATER_BUCKET).addIngredient(Items.GLOW_BERRIES, 2).addIngredient(ItemRegistry.CINDER_ESSENCE.get()).addIngredient(Items.SUGAR).setNamespace(StarlitOrigins.MOD_ID).save(pWriter);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.DARK_TEA.get(), 1, 100, 0.25f, Items.GLASS_BOTTLE).addIngredient(Items.WATER_BUCKET).addIngredient(ModItems.SCULK_PASTE.get()).addIngredient(ItemRegistry.TIMELESS_SLURRY.get()).addIngredient(Items.SUGAR).addIngredient(vectorwing.farmersdelight.common.registry.ModItems.MILK_BOTTLE.get()).setNamespace(StarlitOrigins.MOD_ID).save(pWriter);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.ELDRITCH_STEW.get(), 1, 200, 0.35f, Items.BOWL).addIngredient(ModItems.SCULK_PASTE.get()).addIngredient(ModItems.RAW_SENSOR_TENDRIL.get()).addIngredient(CommonTags.Items.VEGETABLES).setNamespace(StarlitOrigins.MOD_ID).save(pWriter);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.MINER_STEW.get(), 1, 200, 0.35f, Items.BOWL).addIngredient(ModTags.Items.POWDERED_ORES).addIngredient(Items.DIAMOND).addIngredient(CommonTags.Items.VEGETABLES).addIngredient(CommonTags.Items.RAW_MEAT).setNamespace(StarlitOrigins.MOD_ID).save(pWriter);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.TIMELESS_ALE.get(), 1, 300, 0.35f, Items.GLASS_BOTTLE).addIngredient(ItemRegistry.TIMELESS_SLURRY.get()).addIngredient(ModItems.SCULK_PASTE.get(), 2).addIngredient(Items.FERMENTED_SPIDER_EYE).addIngredient(Items.HONEY_BOTTLE).setNamespace(StarlitOrigins.MOD_ID).save(pWriter);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.BLESSED_MIXTURE.get(), 1, 200, 0.35f, Items.BOWL).addIngredient(vectorwing.farmersdelight.common.registry.ModItems.MILK_BOTTLE.get()).addIngredient(ModItems.POWDERED_GOLD.get(), 2).addIngredient(ItemRegistry.ARCANE_ESSENCE.get(), 2).setNamespace(StarlitOrigins.MOD_ID).save(pWriter);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.ARCANE_MIXTURE.get(), 1, 200, 0.35f, Items.BOWL).addIngredient(vectorwing.farmersdelight.common.registry.ModItems.MILK_BOTTLE.get()).addIngredient(ModItems.POWDERED_LAPIS.get()).addIngredient(ModItems.POWDERED_DIAMOND.get()).addIngredient(ItemRegistry.ARCANE_ESSENCE.get(), 2).setNamespace(StarlitOrigins.MOD_ID).save(pWriter);


    }

    protected static void simpleCookingRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, String pCookingMethod, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, int pCookingTime, ItemLike pIngredient, ItemLike pResult, float pExperience) {
        SimpleCookingRecipeBuilder
                .generic(Ingredient.of(pIngredient), RecipeCategory.FOOD, pResult, pExperience, pCookingTime, pCookingSerializer)
                .unlockedBy(getHasName(pIngredient), has(pIngredient))
                .save(pFinishedRecipeConsumer, StarlitOrigins.MOD_ID + ":" + getItemName(pResult) + "_from_" + pCookingMethod);
    }

    private static void foodCookingByTag(TagKey<Item> pIngredient, ItemLike pResult, float experience, Consumer<FinishedRecipe> consumer) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(pIngredient), RecipeCategory.FOOD, pResult, experience, 200).unlockedBy(getHasName(Items.FURNACE), has(pIngredient)).save(consumer, StarlitOrigins.MOD_ID + ":" + getItemName(pResult) + "_from_smelting");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(pIngredient), RecipeCategory.FOOD, pResult, experience, 600).unlockedBy(getHasName(Items.CAMPFIRE), has(pIngredient)).save(consumer, StarlitOrigins.MOD_ID + ":" + getItemName(pResult) + "_from_campfire_cooking");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(pIngredient), RecipeCategory.FOOD, pResult, experience, 100).unlockedBy(getHasName(Items.SMOKER), has(pIngredient)).save(consumer, StarlitOrigins.MOD_ID + ":" + getItemName(pResult) + "_from_smoking");
    }

    private static void foodCookingByIngredient(ItemLike pIngredient, ItemLike pResult, float experience, Consumer<FinishedRecipe> consumer) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(pIngredient), RecipeCategory.FOOD, pResult, experience, 200).unlockedBy(getHasName(Items.FURNACE), has(pIngredient)).save(consumer, StarlitOrigins.MOD_ID + ":" + getItemName(pResult) + "_from_smelting");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(pIngredient), RecipeCategory.FOOD, pResult, experience, 600).unlockedBy(getHasName(Items.CAMPFIRE), has(pIngredient)).save(consumer, StarlitOrigins.MOD_ID + ":" + getItemName(pResult) + "_from_campfire_cooking");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(pIngredient), RecipeCategory.FOOD, pResult, experience, 100).unlockedBy(getHasName(Items.SMOKER), has(pIngredient)).save(consumer, StarlitOrigins.MOD_ID + ":" + getItemName(pResult) + "_from_smoking");
    }

}
