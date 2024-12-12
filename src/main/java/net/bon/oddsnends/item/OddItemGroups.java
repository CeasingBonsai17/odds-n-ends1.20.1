package net.bon.oddsnends.item;

import net.bon.oddsnends.OddsNEnds;
import net.bon.oddsnends.block.OddBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class OddItemGroups {
    public static final ItemGroup ODDSNENDS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OddsNEnds.MOD_ID, "oddsnends"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.oddsnends"))
                    .icon(() -> new ItemStack(OddItems.LINEN_PATCH)).entries((displayContext, entries) -> {
                        entries.add(OddItems.CHERRY_BLOSSOMS);
                        entries.add(OddItems.CHERRY_BLOSSOM_STAFF);
                        entries.add(OddItems.AZALEA_BLOSSOMS);
                        entries.add(OddItems.AZALEA_BLOSSOM_STAFF);
                        entries.add(OddItems.MANDRAKE_ROOT);
                        entries.add(OddItems.PEELED_MANDRAKE_ROOT);
                        entries.add(OddItems.WILD_CARROT);
                        entries.add(OddItems.WILD_MANDRAKE_ROOT);
                        entries.add(OddBlocks.FLAX_FLOWERS);
                        entries.add(OddBlocks.DRIED_FLAX_FLOWERS);
                        entries.add(OddItems.FLAX_SEEDS);
                        entries.add(OddItems.FLAX_FIBERS);
                        entries.add(OddItems.LINEN_PATCH);
                        entries.add(OddBlocks.LINEN_BLOCK);
                        entries.add(OddBlocks.LINEN_CARPET);
                        entries.add(OddBlocks.ALGAE);
                        entries.add(OddBlocks.GIANT_PADMA);
                        entries.add(OddBlocks.SHALE);
                        entries.add(OddBlocks.SHALE_BRICKS);
                        entries.add(OddBlocks.SHALE_BRICK_STAIRS);
                        entries.add(OddBlocks.SHALE_BRICK_SLAB);
                        entries.add(OddBlocks.CHISELED_SHALE_PILLAR);
                        entries.add(OddBlocks.SHALE_PILLAR);
                        entries.add(OddBlocks.POLISHED_SHALE);
                        entries.add(OddBlocks.MANASTONE);
                        entries.add(OddBlocks.MANASTONE_STAIRS);
                        entries.add(OddBlocks.MANASTONE_SLAB);
                        entries.add(OddBlocks.MANASTONE_WALL);
                        entries.add(OddBlocks.MANASTONE_BRICKS);
                        entries.add(OddBlocks.MANASTONE_BRICK_STAIRS);
                        entries.add(OddBlocks.MANASTONE_BRICK_SLAB);
                        entries.add(OddBlocks.MANASTONE_BRICK_WALL);
                        entries.add(OddBlocks.MANASTONE_PILLAR);
                        entries.add(OddBlocks.SMOOTH_MANASTONE);
                        entries.add(OddBlocks.SMOOTH_MANASTONE_SLAB);
                        entries.add(OddBlocks.DUNGEON_STEEL_ORE);
                        entries.add(OddItems.DUNGEON_STEEL);
                        entries.add(OddBlocks.DUNGEON_STEEL_BLOCK);
                        entries.add(OddBlocks.SMALL_MANASTONE_BRICKS);
                        entries.add(OddBlocks.SMALL_MANASTONE_BRICK_STAIRS);
                        entries.add(OddBlocks.SMALL_MANASTONE_BRICK_SLAB);
                        entries.add(OddBlocks.SMALL_MANASTONE_BRICK_WALL);
                        entries.add(OddBlocks.SHATTERSLATE);
                        entries.add(OddBlocks.SHATTERSLATE_STAIRS);
                        entries.add(OddBlocks.SHATTERSLATE_SLAB);
                        entries.add(OddBlocks.SHATTERSLATE_WALL);
                        entries.add(OddBlocks.CAVE_BRANCHES);
                        entries.add(OddItems.BURIAL_SCONCE);
                        entries.add(OddBlocks.QUARTZ_SAND);
                        entries.add(OddBlocks.ROUGH_QUARTZ);
                        entries.add(OddBlocks.ROUGH_QUARTZ_STAIRS);
                        entries.add(OddBlocks.ROUGH_QUARTZ_SLAB);
                        entries.add(OddBlocks.SUSPICIOUS_QUARTZ_SAND);
                        entries.add(OddBlocks.QUARTZ_GLASS);
                        entries.add(OddBlocks.QUARTZ_GLASS_PANE);
                        entries.add(OddBlocks.SHORESTONE);
                        entries.add(OddBlocks.SHORESTONE_BRICKS);
                        entries.add(OddBlocks.WILD_MELON);
                        entries.add(OddBlocks.WILD_MELON_STAIRS);
                        entries.add(OddBlocks.WILD_MELON_SLAB);
                        entries.add(OddBlocks.MELON_STAIRS);
                        entries.add(OddBlocks.MELON_SLAB);

                    }).build());

    public static void registerItemGroups() {
        net.bon.oddsnends.OddsNEnds.LOGGER.info("Registering Item Groups for " + net.bon.oddsnends.OddsNEnds.MOD_ID);
    }
}