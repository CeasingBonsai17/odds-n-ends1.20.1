package net.bon.oddsnends.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.bon.oddsnends.OddsNEnds;
import net.bon.oddsnends.block.OddBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class OddBlockEntities {
    public static final BlockEntityType<HangingSpawnerBlockEntity> HANGING_SPAWNER_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(OddsNEnds.MOD_ID, "hanging_spawner_be"),
                    FabricBlockEntityTypeBuilder.create(HangingSpawnerBlockEntity::new,
                            OddBlocks.HANGING_SPAWNER).build());

    public static void registerBlockEntities() {
        OddsNEnds.LOGGER.info("Registering Block Entities for " + OddsNEnds.MOD_ID);
    }
}