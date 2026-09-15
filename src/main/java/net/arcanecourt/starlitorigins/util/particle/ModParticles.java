package net.arcanecourt.starlitorigins.util.particle;

import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

public class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(Registries.PARTICLE_TYPE, StarlitOrigins.MOD_ID);
    public static void register(IEventBus eventBus) {
        PARTICLES.register(eventBus);
    }


}
