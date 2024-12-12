package net.bon.oddsnends;

import net.bon.oddsnends.block.OddBlocks;
import net.bon.oddsnends.particle.OddParticles;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.render.RenderLayer;

public class OddsNEndsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        BlockRenderLayerMap.INSTANCE.putBlock(OddBlocks.LINEN_CARPET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OddBlocks.FLAX_FLOWERS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OddBlocks.DRIED_FLAX_FLOWERS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OddBlocks.FLAX_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OddBlocks.GIANT_PADMA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OddBlocks.ALGAE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OddBlocks.CAVE_BRANCHES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OddBlocks.WALL_BURIAL_SCONCE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OddBlocks.BURIAL_SCONCE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OddBlocks.BURIAL_SCONCE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OddBlocks.RAGE_FIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OddBlocks.POTTED_FLAX, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OddBlocks.POTTED_DRIED_FLAX, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(OddBlocks.QUARTZ_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(OddBlocks.QUARTZ_GLASS_PANE, RenderLayer.getTranslucent());

        ParticleFactoryRegistry.getInstance().register(OddParticles.RAGEFLAME, FlameParticle.Factory::new);
    }
}