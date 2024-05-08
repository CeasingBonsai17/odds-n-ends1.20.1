package net.bon.oddsnends.datagen;

import net.bon.oddsnends.block.OddBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(OddBlocks.AKANE_DOOR, doorDrops(OddBlocks.AKANE_DOOR));
        addDrop(OddBlocks.AKANE_SLAB, slabDrops(OddBlocks.AKANE_SLAB));
        addDrop(OddBlocks.AKANE_PLANKS);
        addDrop(OddBlocks.AKANE_WOOD);
        addDrop(OddBlocks.AKANE_LOG);
        addDrop(OddBlocks.STRIPPED_AKANE_LOG);
        addDrop(OddBlocks.STRIPPED_AKANE_WOOD);
        addDrop(OddBlocks.AKANE_STAIRS);
        addDrop(OddBlocks.AKANE_TRAPDOOR);
        addDrop(OddBlocks.AKANE_FENCE);
        addDrop(OddBlocks.AKANE_FENCE_GATE);
        addDrop(OddBlocks.AKANE_BUTTON);
        addDrop(OddBlocks.AKANE_PRESSURE_PLATE);
    }
}