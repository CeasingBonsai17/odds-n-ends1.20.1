package net.bon.oddsnends.datagen;



import net.bon.oddsnends.block.OddsNEndsBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(OddsNEndsBlocks.AKANE_PLANKS)
                .add(OddsNEndsBlocks.AKANE_LOG)
                .add(OddsNEndsBlocks.AKANE_WOOD)
                .add(OddsNEndsBlocks.STRIPPED_AKANE_LOG)
                .add(OddsNEndsBlocks.STRIPPED_AKANE_WOOD)
                .add(OddsNEndsBlocks.AKANE_DOOR)
                .add(OddsNEndsBlocks.AKANE_TRAPDOOR)
                .add(OddsNEndsBlocks.AKANE_SLAB)
                .add(OddsNEndsBlocks.AKANE_FENCE)
                .add(OddsNEndsBlocks.AKANE_PRESSURE_PLATE)
                .add(OddsNEndsBlocks.AKANE_STAIRS)
                .add(OddsNEndsBlocks.AKANE_BUTTON);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(OddsNEndsBlocks.AKANE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(OddsNEndsBlocks.AKANE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(OddsNEndsBlocks.AKANE_STAIRS)
                .add(OddsNEndsBlocks.MANASTONE_BRICK_STAIRS)
                .add(OddsNEndsBlocks.SMALL_MANASTONE_BRICK_SLAB);
        getOrCreateTagBuilder(BlockTags.STONE_BRICKS)
                .add(OddsNEndsBlocks.SMALL_MANASTONE_BRICKS)
                .add(OddsNEndsBlocks.MANASTONE_BRICKS);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(OddsNEndsBlocks.AKANE_STAIRS);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(OddsNEndsBlocks.AKANE_LOG)
                .add(OddsNEndsBlocks.AKANE_WOOD)
                .add(OddsNEndsBlocks.STRIPPED_AKANE_LOG)
                .add(OddsNEndsBlocks.STRIPPED_AKANE_WOOD);
        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(OddsNEndsBlocks.AKANE_LOG)
                .add(OddsNEndsBlocks.AKANE_WOOD)
                .add(OddsNEndsBlocks.STRIPPED_AKANE_LOG)
                .add(OddsNEndsBlocks.STRIPPED_AKANE_WOOD);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(OddsNEndsBlocks.AKANE_BUTTON);
        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(OddsNEndsBlocks.AKANE_DOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(OddsNEndsBlocks.AKANE_DOOR);
        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(OddsNEndsBlocks.AKANE_BUTTON);
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(OddsNEndsBlocks.AKANE_FENCE);
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(OddsNEndsBlocks.AKANE_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(OddsNEndsBlocks.AKANE_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(OddsNEndsBlocks.AKANE_SLAB);
        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(OddsNEndsBlocks.AKANE_SLAB)
                .add(OddsNEndsBlocks.SMALL_MANASTONE_BRICK_SLAB)
                .add(OddsNEndsBlocks.MANASTONE_BRICK_SLAB);
        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(OddsNEndsBlocks.AKANE_PLANKS);
        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(OddsNEndsBlocks.AKANE_LEAVES)
                .add(OddsNEndsBlocks.FLOWERING_AKANE_LEAVES)
                .add(OddsNEndsBlocks.FRUITING_AKANE_LEAVES);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(OddsNEndsBlocks.MANASTONE_BRICK_WALL)
                .add(OddsNEndsBlocks.SMALL_MANASTONE_BRICK_WALL);
    }
}