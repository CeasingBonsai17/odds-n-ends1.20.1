package net.bon.oddsnends.datagen;

import net.bon.oddsnends.block.OddsNEndsBlocks;
import net.bon.oddsnends.item.ModItems;
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
        BlockStateModelGenerator.BlockTexturePool akanePool = blockStateModelGenerator.registerCubeAllModelTexturePool(OddsNEndsBlocks.AKANE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool manastonebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(OddsNEndsBlocks.MANASTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smoothmanastonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(OddsNEndsBlocks.SMOOTH_MANASTONE);
        BlockStateModelGenerator.BlockTexturePool smallmanastonebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(OddsNEndsBlocks.SMALL_MANASTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(OddsNEndsBlocks.FRUITING_AKANE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(OddsNEndsBlocks.FLOWERING_AKANE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(OddsNEndsBlocks.AKANE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(OddsNEndsBlocks.MANASTONE);
        blockStateModelGenerator.registerSimpleCubeAll(OddsNEndsBlocks.SHATTERSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(OddsNEndsBlocks.DUNGEON_STEEL_ORE);

        blockStateModelGenerator.registerDoor(OddsNEndsBlocks.AKANE_DOOR);
        blockStateModelGenerator.registerTrapdoor(OddsNEndsBlocks.AKANE_TRAPDOOR);

        smoothmanastonePool.slab(OddsNEndsBlocks.SMOOTH_MANASTONE_SLAB);
        manastonebrickPool.stairs(OddsNEndsBlocks.MANASTONE_BRICK_STAIRS);
        manastonebrickPool.slab(OddsNEndsBlocks.MANASTONE_BRICK_SLAB);
        manastonebrickPool.wall(OddsNEndsBlocks.MANASTONE_BRICK_WALL);
        smallmanastonebrickPool.stairs(OddsNEndsBlocks.SMALL_MANASTONE_BRICK_STAIRS);
        smallmanastonebrickPool.slab(OddsNEndsBlocks.SMALL_MANASTONE_BRICK_SLAB);
        smallmanastonebrickPool.wall(OddsNEndsBlocks.SMALL_MANASTONE_BRICK_WALL);
        akanePool.stairs(OddsNEndsBlocks.AKANE_STAIRS);
        akanePool.slab(OddsNEndsBlocks.AKANE_SLAB);
        akanePool.button(OddsNEndsBlocks.AKANE_BUTTON);
        akanePool.pressurePlate(OddsNEndsBlocks.AKANE_PRESSURE_PLATE);
        akanePool.fence(OddsNEndsBlocks.AKANE_FENCE);
        akanePool.fenceGate(OddsNEndsBlocks.AKANE_FENCE_GATE);

        blockStateModelGenerator.registerRotatable(OddsNEndsBlocks.STRIPPED_AKANE_WOOD);
        blockStateModelGenerator.registerRotatable(OddsNEndsBlocks.AKANE_WOOD);
        blockStateModelGenerator.registerRotatable(OddsNEndsBlocks.STRIPPED_AKANE_LOG);
        blockStateModelGenerator.registerRotatable(OddsNEndsBlocks.AKANE_LOG);
        blockStateModelGenerator.registerRotatable(OddsNEndsBlocks.MANASTONE_PILLAR);

        blockStateModelGenerator.registerRod(OddsNEndsBlocks.GIANT_PADMA);
        blockStateModelGenerator.registerRod(OddsNEndsBlocks.ALGAE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.APPLE_BLOSSOM, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAKED_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANDRAKE_ROOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEELED_MANDRAKE_ROOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WILD_CARROT, Models.GENERATED);
    }
}