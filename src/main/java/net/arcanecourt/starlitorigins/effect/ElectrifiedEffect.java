package net.arcanecourt.starlitorigins.effect;

import io.redspace.ironsspellbooks.effect.ISyncedMobEffect;
import io.redspace.ironsspellbooks.registries.SoundRegistry;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class ElectrifiedEffect extends ModMobEffects implements ISyncedMobEffect {

    protected ElectrifiedEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (pLivingEntity.isInWater()) {
            pLivingEntity.level().playSound((Player) null, pLivingEntity.blockPosition(), SoundRegistry.CHAIN_LIGHTNING_CHAIN.get(),  SoundSource.MASTER, 1.0F, 1.0F);
            pLivingEntity.hurt(pLivingEntity.damageSources().magic(), (6 * (pAmplifier + 1)));
            pLivingEntity.removeEffect(this);
        }
    }

    public static void particleGen(ClientLevel level, LivingEntity entity) {
        for (int i = 0; i < 2; i++) {
            level.addParticle(ParticleTypes.ELECTRIC_SPARK, entity.getRandomX(.3f), entity.getRandomY(), entity.getRandomZ(.3f), 0.0, -0.1, 0.0);
        }
    }
    @Override
    public void clientTick(LivingEntity livingEntity, MobEffectInstance instance) {
        if (livingEntity.level() instanceof ClientLevel level) {
            particleGen(level, livingEntity);
        }
    }
}
