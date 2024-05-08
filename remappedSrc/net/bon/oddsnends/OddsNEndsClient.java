package net.bon.oddsnends;

import net.bon.oddsnends.block.OddsNEndsBlocks;
import net.bon.oddsnends.particle.ONEParticles;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.render.RenderLayer;

public class OddsNEndsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(OddsNEndsBlocks.AKANE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OddsNEndsBlocks.AKANE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OddsNEndsBlocks.GIANT_PADMA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OddsNEndsBlocks.ALGAE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OddsNEndsBlocks.CAVE_BRANCHES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OddsNEndsBlocks.WALL_BURIAL_SCONCE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OddsNEndsBlocks.BURIAL_SCONCE, RenderLayer.getCutout());
        ParticleFactoryRegistry.getInstance().register(ONEParticles.RAGEFLAME, FlameParticle.Factory::new);
    }
}