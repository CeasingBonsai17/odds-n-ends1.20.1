package net.bon.oddsnends.datagen;

import net.bon.oddsnends.block.OddsNEndsBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(OddsNEndsBlocks.AKANE_DOOR, doorDrops(OddsNEndsBlocks.AKANE_DOOR));
        addDrop(OddsNEndsBlocks.AKANE_SLAB, slabDrops(OddsNEndsBlocks.AKANE_SLAB));
        addDrop(OddsNEndsBlocks.AKANE_PLANKS);
        addDrop(OddsNEndsBlocks.AKANE_WOOD);
        addDrop(OddsNEndsBlocks.AKANE_LOG);
        addDrop(OddsNEndsBlocks.STRIPPED_AKANE_LOG);
        addDrop(OddsNEndsBlocks.STRIPPED_AKANE_WOOD);
        addDrop(OddsNEndsBlocks.AKANE_STAIRS);
        addDrop(OddsNEndsBlocks.AKANE_TRAPDOOR);
        addDrop(OddsNEndsBlocks.AKANE_FENCE);
        addDrop(OddsNEndsBlocks.AKANE_FENCE_GATE);
        addDrop(OddsNEndsBlocks.AKANE_BUTTON);
        addDrop(OddsNEndsBlocks.AKANE_PRESSURE_PLATE);
    }
}