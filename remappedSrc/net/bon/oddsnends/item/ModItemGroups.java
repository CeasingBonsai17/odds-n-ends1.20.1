package net.bon.oddsnends.item;

import net.bon.oddsnends.block.OddsNEndsBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ODDSNENDS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(net.bon.oddsnends.OddsNEnds.MOD_ID, "oddsnends"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.oddsnends"))
                    .icon(() -> new ItemStack(ModItems.BAKED_APPLE)).entries((displayContext, entries) -> {
                        entries.add(OddsNEndsBlocks.AKANE_LOG);
                        entries.add(OddsNEndsBlocks.AKANE_WOOD);
                        entries.add(OddsNEndsBlocks.STRIPPED_AKANE_LOG);
                        entries.add(OddsNEndsBlocks.STRIPPED_AKANE_WOOD);
                        entries.add(OddsNEndsBlocks.AKANE_PLANKS);
                        entries.add(OddsNEndsBlocks.AKANE_STAIRS);
                        entries.add(OddsNEndsBlocks.AKANE_SLAB);
                        entries.add(OddsNEndsBlocks.AKANE_FENCE);
                        entries.add(OddsNEndsBlocks.AKANE_FENCE_GATE);
                        entries.add(OddsNEndsBlocks.AKANE_DOOR);
                        entries.add(OddsNEndsBlocks.AKANE_TRAPDOOR);
                        entries.add(OddsNEndsBlocks.AKANE_PRESSURE_PLATE);
                        entries.add(OddsNEndsBlocks.AKANE_BUTTON);
                        entries.add(OddsNEndsBlocks.AKANE_LEAVES);
                        entries.add(OddsNEndsBlocks.FLOWERING_AKANE_LEAVES);
                        entries.add(OddsNEndsBlocks.FRUITING_AKANE_LEAVES);
                        entries.add(ModItems.APPLE_BLOSSOM);
                        entries.add(ModItems.BAKED_APPLE);
                        entries.add(OddsNEndsBlocks.ALGAE);
                        entries.add(OddsNEndsBlocks.GIANT_PADMA);
                        entries.add(OddsNEndsBlocks.MANASTONE);
                        entries.add(OddsNEndsBlocks.MANASTONE_BRICKS);
                        entries.add(OddsNEndsBlocks.MANASTONE_BRICK_STAIRS);
                        entries.add(OddsNEndsBlocks.MANASTONE_BRICK_SLAB);
                        entries.add(OddsNEndsBlocks.MANASTONE_BRICK_WALL);
                        entries.add(OddsNEndsBlocks.MANASTONE_PILLAR);
                        entries.add(OddsNEndsBlocks.SMOOTH_MANASTONE);
                        entries.add(OddsNEndsBlocks.SMOOTH_MANASTONE_SLAB);
                        entries.add(OddsNEndsBlocks.DUNGEON_STEEL_ORE);
                        entries.add(ModItems.DUNGEON_STEEL);
                        entries.add(OddsNEndsBlocks.SMALL_MANASTONE_BRICKS);
                        entries.add(OddsNEndsBlocks.SMALL_MANASTONE_BRICK_STAIRS);
                        entries.add(OddsNEndsBlocks.SMALL_MANASTONE_BRICK_SLAB);
                        entries.add(OddsNEndsBlocks.SMALL_MANASTONE_BRICK_WALL);
                        entries.add(OddsNEndsBlocks.SHATTERSLATE);
                        entries.add(OddsNEndsBlocks.CAVE_BRANCHES);
                        entries.add(ModItems.BURIAL_SCONCE);



                    }).build());


    public static void registerItemGroups() {
        net.bon.oddsnends.OddsNEnds.LOGGER.info("Registering Item Groups for " + net.bon.oddsnends.OddsNEnds.MOD_ID);
    }
}
