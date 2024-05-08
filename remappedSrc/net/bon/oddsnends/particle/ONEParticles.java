package net.bon.oddsnends.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.bon.oddsnends.OddsNEnds;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ONEParticles {
    public static final SimpleParticleType RAGEFLAME = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(OddsNEnds.MOD_ID, "rageflame"),
                RAGEFLAME);
    }
}