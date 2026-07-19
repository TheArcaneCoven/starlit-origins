package net.arcanecourt.starlitorigins.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.*;

import static vectorwing.farmersdelight.common.FoodValues.nourishment;

public class ModFoods {
    // Sculky foods!
    public static final FoodProperties SCULKED_BREAD = new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build();
    public static final FoodProperties SCULKED_MEAT = new FoodProperties.Builder().nutrition(6).saturationMod(0.6f).build();
    public static final FoodProperties ELDRITCH_STEW = (new FoodProperties.Builder()).nutrition(8).saturationMod(1.2f).effect(() -> nourishment(2400), 1.0f).effect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 2), 1.0f).build();

    // Mineral foods!
    public static final FoodProperties CINDER_INFUSED_COAL = new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build();
    public static final FoodProperties AMETHYST_ON_A_STICK = new FoodProperties.Builder().nutrition(6).saturationMod(0.8f).build();

}
