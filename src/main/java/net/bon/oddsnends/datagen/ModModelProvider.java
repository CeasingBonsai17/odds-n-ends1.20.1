package net.bon.oddsnends.datagen;

import net.bon.oddsnends.block.OddBlocks;
import net.bon.oddsnends.item.OddItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool akanePool = blockStateModelGenerator.registerCubeAllModelTexturePool(OddBlocks.AKANE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool manastonebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(OddBlocks.MANASTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smoothmanastonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(OddBlocks.SMOOTH_MANASTONE);
        BlockStateModelGenerator.BlockTexturePool smallmanastonebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(OddBlocks.SMALL_MANASTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(OddBlocks.FRUITING_AKANE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(OddBlocks.FLOWERING_AKANE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(OddBlocks.AKANE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(OddBlocks.MANASTONE);
        blockStateModelGenerator.registerSimpleCubeAll(OddBlocks.SHATTERSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(OddBlocks.DUNGEON_STEEL_ORE);

        blockStateModelGenerator.registerDoor(OddBlocks.AKANE_DOOR);
        blockStateModelGenerator.registerTrapdoor(OddBlocks.AKANE_TRAPDOOR);

        smoothmanastonePool.slab(OddBlocks.SMOOTH_MANASTONE_SLAB);
        manastonebrickPool.stairs(OddBlocks.MANASTONE_BRICK_STAIRS);
        manastonebrickPool.slab(OddBlocks.MANASTONE_BRICK_SLAB);
        manastonebrickPool.wall(OddBlocks.MANASTONE_BRICK_WALL);
        smallmanastonebrickPool.stairs(OddBlocks.SMALL_MANASTONE_BRICK_STAIRS);
        smallmanastonebrickPool.slab(OddBlocks.SMALL_MANASTONE_BRICK_SLAB);
        smallmanastonebrickPool.wall(OddBlocks.SMALL_MANASTONE_BRICK_WALL);
        akanePool.stairs(OddBlocks.AKANE_STAIRS);
        akanePool.slab(OddBlocks.AKANE_SLAB);
        akanePool.button(OddBlocks.AKANE_BUTTON);
        akanePool.pressurePlate(OddBlocks.AKANE_PRESSURE_PLATE);
        akanePool.fence(OddBlocks.AKANE_FENCE);
        akanePool.fenceGate(OddBlocks.AKANE_FENCE_GATE);

        blockStateModelGenerator.registerRotatable(OddBlocks.STRIPPED_AKANE_WOOD);
        blockStateModelGenerator.registerRotatable(OddBlocks.AKANE_WOOD);
        blockStateModelGenerator.registerRotatable(OddBlocks.STRIPPED_AKANE_LOG);
        blockStateModelGenerator.registerRotatable(OddBlocks.AKANE_LOG);
        blockStateModelGenerator.registerRotatable(OddBlocks.MANASTONE_PILLAR);

        blockStateModelGenerator.registerRod(OddBlocks.GIANT_PADMA);
        blockStateModelGenerator.registerRod(OddBlocks.ALGAE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(OddItems.APPLE_BLOSSOM, Models.GENERATED);
        itemModelGenerator.register(OddItems.BAKED_APPLE, Models.GENERATED);
        itemModelGenerator.register(OddItems.MANDRAKE_ROOT, Models.GENERATED);
        itemModelGenerator.register(OddItems.PEELED_MANDRAKE_ROOT, Models.GENERATED);
        itemModelGenerator.register(OddItems.WILD_CARROT, Models.GENERATED);
    }
}