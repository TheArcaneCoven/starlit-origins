package net.arcanecourt.starlitorigins.item;

import net.arcanecourt.starlitorigins.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

import static vectorwing.farmersdelight.common.FoodValues.nourishment;

public class ModFoods {
    // Sculky foods!
    public static final FoodProperties SCULKED_BREAD = new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build();
    public static final FoodProperties SCULKED_MEAT = new FoodProperties.Builder().nutrition(6).saturationMod(0.6f).build();
    public static final FoodProperties ELDRITCH_STEW = (new FoodProperties.Builder()).nutrition(8).saturationMod(1.2f)
            .effect(() -> nourishment(2400), 1.0f).effect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 2,false,false,true), 1.0f)
            .build();

    // Mineral foods!
    public static final FoodProperties CINDER_INFUSED_COAL = new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties AMETHYST_ON_A_STICK = new FoodProperties.Builder().nutrition(6).saturationMod(0.8f).build();
    public static final FoodProperties AMETHYST_TEA = new FoodProperties.Builder().nutrition(6).saturationMod(0.1f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 0, false,false,true), 1.0f)
            .build();
    public static final FoodProperties CITRINE_TEA = new FoodProperties.Builder().nutrition(6).saturationMod(0.1f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 1, false,false,true), 1.0f)
            .build();
    public static final FoodProperties RAW_EMERALD_GINGERBREAD = new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build();
    public static final FoodProperties BAKED_EMERALD_GINGERBREAD = new FoodProperties.Builder().nutrition(7).saturationMod(0.7f)
            .effect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 120, 0, false,false,true), 0.1f)
            .build();
    public static final FoodProperties RAW_CORDON_BLEU = new FoodProperties.Builder().nutrition(3).saturationMod(0.3f).build();
    public static final FoodProperties COOKED_CORDON_BLEU = new FoodProperties.Builder().nutrition(10).saturationMod(0.8f).build();
    public static final FoodProperties MINER_STEW = new FoodProperties.Builder().nutrition(6).saturationMod(0.6f)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 600, 1, false, false,true), 1.0f)
            .build();
    public static final FoodProperties BOILED_GOLD_COATED_CALCITE_EGG = new FoodProperties.Builder().nutrition(6).saturationMod(0.6f).build();
    public static final FoodProperties LITHOSPHERIAN_SALAD = new FoodProperties.Builder().nutrition(14).saturationMod(0.75f)
            .effect(() -> nourishment(6000), 1.0f)
            .build();
    public static final FoodProperties BLESSED_MIXTURE =  new FoodProperties.Builder().nutrition(10).saturationMod(0.6f)
            .effect(() -> nourishment(1200), 1.0f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 0, false,false,true), 1.0f)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 200, 1,false,false,true), 1.0f)
            .build();
    public static final FoodProperties ARCANE_MIXTURE = new FoodProperties.Builder().nutrition(10).saturationMod(0.6f)
            .effect(() -> nourishment(1200), 1.0f)
            .effect(new MobEffectInstance(ModEffects.MAGIC_IMBUEMENT.get(), 600, 0,false, false,true), 1.0f)
            .build();
}
