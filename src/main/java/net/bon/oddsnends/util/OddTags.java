package net.bon.oddsnends.util;

import net.bon.oddsnends.OddsNEnds;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class OddTags {
    public static class Blocks {
        public static final TagKey<Block> RAGE_FIRE_BASE_BLOCKS =
                createTag("rage_fire_base_blocks");
        public static final TagKey<Block> SPARK_FIRE_BASE_BLOCKS =
                createTag("spark_fire_base_blocks");

        public static final TagKey<Block> DUNGEON_STEEL_ORES =
                createTag("dungeon_steel_ores");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(OddsNEnds.MOD_ID, name));
        }
    }
}
