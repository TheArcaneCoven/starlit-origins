package net.arcanecourt.starlitorigins.datagen;

import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.arcanecourt.starlitorigins.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.common.Mod;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.GOLD_COATED_CALCITE_EGG.get())
                .pattern("ABA")
                .pattern("BCB")
                .pattern("ABA")
                .define('A', Items.GOLD_INGOT)
                .define('B', Items.CALCITE)
                .define('C', Items.EGG)
                .unlockedBy(getHasName(Items.CALCITE), has(Items.CALCITE))
                .save(pWriter);

        SimpleCookingRecipeBuilder.generic(Ingredient.of((ItemLike) ModItems.GOLD_COATED_CALCITE_EGG.get()),
                RecipeCategory.FOOD,
                ModItems.BOILED_GOLD_COATED_CALCITE_EGG.get(),
                0.25f,
                200,
                RecipeSerializer.SMELTING_RECIPE)
                .unlockedBy(getHasName(ModItems.GOLD_COATED_CALCITE_EGG.get()), has(ModItems.GOLD_COATED_CALCITE_EGG.get()))
                .save(pWriter);

                SimpleCookingRecipeBuilder.generic(Ingredient.of((ItemLike) ModItems.RAW_EMERALD_GINGERBREAD.get()),
                RecipeCategory.FOOD,
                ModItems.BAKED_EMERALD_GINGERBREAD.get(),
                0.25f,
                200,
                RecipeSerializer.SMELTING_RECIPE)
                .unlockedBy(getHasName(ModItems.RAW_EMERALD_GINGERBREAD.get()), has(ModItems.RAW_EMERALD_GINGERBREAD.get()))
                .save(pWriter);

                SimpleCookingRecipeBuilder.generic(Ingredient.of((ItemLike) ModItems.RAW_CORDON_BLEU.get()),
                RecipeCategory.FOOD,
                ModItems.COOKED_CORDON_BLEU.get(),
                0.25f,
                200,
                RecipeSerializer.SMELTING_RECIPE)
                .unlockedBy(getHasName(ModItems.RAW_CORDON_BLEU.get()), has(ModItems.RAW_CORDON_BLEU.get()))
                .save(pWriter);


    }

    protected static void simpleCookingRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, String pCookingMethod, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, int pCookingTime, ItemLike pIngredient, ItemLike pResult, float pExperience) {
        SimpleCookingRecipeBuilder
                .generic(Ingredient.of(pIngredient), RecipeCategory.FOOD, pResult, pExperience, pCookingTime, pCookingSerializer)
                .unlockedBy(getHasName(pIngredient), has(pIngredient))
                .save(pFinishedRecipeConsumer, StarlitOrigins.MOD_ID + ":" + getItemName(pResult) + "_from_" + pCookingMethod);
    }
}
