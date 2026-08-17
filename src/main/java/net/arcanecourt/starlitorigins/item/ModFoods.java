package net.arcanecourt.starlitorigins.item;

import io.redspace.ironsspellbooks.registries.MobEffectRegistry;
import net.arcanecourt.starlitorigins.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.*;

public class ModFoods {
    // Sculky foods!
    public static final FoodProperties ELDRITCH_STEW = (new FoodProperties.Builder()).nutrition(6).saturationMod(1.0f)
            .effect(() -> new MobEffectInstance(vectorwing.farmersdelight.common.registry.ModEffects.NOURISHMENT.get(), 1200, 0, false,false,true),1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 100, 2,false,false,true), 1.0f)
            .build();
    public static final FoodProperties TIMELESS_ALE = new FoodProperties.Builder().nutrition(2).saturationMod(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1, false,false,true), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffectRegistry.REND.get(), 200, 3, false,false,true), 1.0f)
            .alwaysEat()
            .build();
    public static final FoodProperties DARK_TEA = new FoodProperties.Builder().nutrition(2).saturationMod(0.1f)
            .effect(() -> new MobEffectInstance(ModEffects.CASTERS_STRENGTH.get(), 600, 0, false,false,true), 1.0f)
            .alwaysEat()
            .build();

    // Mineral foods!
    public static final FoodProperties CINDER_INFUSED_COAL = new FoodProperties.Builder().nutrition(6).saturationMod(1.0f).build();
    public static final FoodProperties AMETHYST_ON_A_STICK = new FoodProperties.Builder().nutrition(6).saturationMod(0.8f).build();
    public static final FoodProperties AMETHYST_TEA = new FoodProperties.Builder().nutrition(6).saturationMod(0.1f)
            .effect(() -> new MobEffectInstance(ModEffects.CASTERS_STRENGTH.get(), 600, 0, false,false,true), 1.0f)
            .build();
    public static final FoodProperties CITRINE_TEA = new FoodProperties.Builder().nutrition(6).saturationMod(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 1, false,false,true), 1.0f)
            .build();
    public static final FoodProperties RAW_EMERALD_GINGERBREAD = new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build();
    public static final FoodProperties BAKED_EMERALD_GINGERBREAD = new FoodProperties.Builder().nutrition(7).saturationMod(0.7f)
            .effect(() -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 1200, 0, false,false,true), 0.15f)
            .build();
    public static final FoodProperties RAW_CORDON_BLEU = new FoodProperties.Builder().nutrition(3).saturationMod(0.3f).build();
    public static final FoodProperties COOKED_CORDON_BLEU = new FoodProperties.Builder().nutrition(10).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(vectorwing.farmersdelight.common.registry.ModEffects.NOURISHMENT.get(), 1200, 0, false,false,true),1.0f)
            .build();
    public static final FoodProperties MINER_STEW = new FoodProperties.Builder().nutrition(6).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 600, 1, false, false,true), 1.0f)
            .effect(() -> new MobEffectInstance(vectorwing.farmersdelight.common.registry.ModEffects.NOURISHMENT.get(), 1200, 0, false,false,true),1.0f)
            .build();
    public static final FoodProperties BOILED_GOLD_COATED_CALCITE_EGG = new FoodProperties.Builder().nutrition(6).saturationMod(0.6f).build();
    public static final FoodProperties LITHOSPHERIAN_SALAD = new FoodProperties.Builder().nutrition(14).saturationMod(0.75f)
            .effect(() -> new MobEffectInstance(vectorwing.farmersdelight.common.registry.ModEffects.NOURISHMENT.get(), 2400, 0, false,false,true),1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0, false,false,true), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300, 1, false,false,true), 1.0f)
            .build();
    public static final FoodProperties BLESSED_MIXTURE =  new FoodProperties.Builder().nutrition(10).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(vectorwing.farmersdelight.common.registry.ModEffects.NOURISHMENT.get(), 1200, 0, false,false,true),1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0, false,false,true), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200, 1,false,false,true), 1.0f)
            .build();
    public static final FoodProperties ARCANE_MIXTURE = new FoodProperties.Builder().nutrition(10).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(vectorwing.farmersdelight.common.registry.ModEffects.NOURISHMENT.get(), 1200, 0, false,false,true),1.0f)
            .effect(() -> new MobEffectInstance(ModEffects.MAGIC_IMBUEMENT.get(), 600, 0,false, false,true), 1.0f)
            .build();
}
