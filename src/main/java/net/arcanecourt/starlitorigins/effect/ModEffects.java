package net.arcanecourt.starlitorigins.effect;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import io.redspace.ironsspellbooks.*;
import net.minecraftforge.resource.*;

public class ModEffects {

    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, StarlitOrigins.MOD_ID);


    public static final RegistryObject<MobEffect> FURY = MOB_EFFECTS.register("fury", () -> new ModMobEffects(MobEffectCategory.BENEFICIAL, 10989255)
            .addAttributeModifier(Attributes.ATTACK_DAMAGE, "8fc0dd03-62df-4369-a9f0-378c6f66a5de", 2, AttributeModifier.Operation.ADDITION)
            .addAttributeModifier(Attributes.MOVEMENT_SPEED, "994e24d9-44c7-4f05-9ec6-582f9b7ed075", 0.1, AttributeModifier.Operation.MULTIPLY_BASE));

    public static final RegistryObject<MobEffect> MAGIC_IMBUEMENT = MOB_EFFECTS.register("magic_imbuement", () -> new ModMobEffects(MobEffectCategory.BENEFICIAL, 10052235)
            .addAttributeModifier(AttributeRegistry.MANA_REGEN.get(), "25f1208e-34db-4382-9742-631f7f04177b", 0.2, AttributeModifier.Operation.MULTIPLY_TOTAL));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
