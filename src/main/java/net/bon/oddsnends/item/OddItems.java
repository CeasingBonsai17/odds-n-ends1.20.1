package net.bon.oddsnends.item;

import net.bon.oddsnends.OddsNEnds;
import net.bon.oddsnends.block.OddBlocks;
import net.bon.oddsnends.item.custom.BlossomStaffItem;
import net.bon.oddsnends.item.custom.ContentBookItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class OddItems {
    public static final Item MANDRAKE_ROOT = registerItem("mandrake_root", new Item(new FabricItemSettings().food(OddFoodComponents.MANDRAKE_ROOT)));
    public static final Item PEELED_MANDRAKE_ROOT = registerItem("peeled_mandrake_root", new Item(new FabricItemSettings().food(OddFoodComponents.PEELED_MANDRAKE_ROOT)));
    public static final Item WILD_MANDRAKE_ROOT = registerItem("wild_mandrake_root", new Item(new FabricItemSettings().food(OddFoodComponents.WILD_MANDRAKE_ROOT)));
    public static final Item WILD_CARROT = registerItem("wild_carrot", new Item(new FabricItemSettings().food(OddFoodComponents.WILD_CARROT)));
    public static final Item BURIAL_SCONCE = Items.register(new VerticallyAttachableBlockItem(OddBlocks.BURIAL_SCONCE, OddBlocks.WALL_BURIAL_SCONCE, new Item.Settings(), Direction.DOWN));
    public static final Item DUNGEON_STEEL = registerItem("dungeon_steel", new Item(new FabricItemSettings()));
    public static final Item GIANT_PADMA_PETAL = registerItem("giant_padma_petal", new Item(new FabricItemSettings()));
    public static final Item ALGAE = registerItem("algae", new AliasedBlockItem(OddBlocks.ALGAE, new FabricItemSettings().food(OddFoodComponents.ALGAE)));
    public static final Item ANTHESI_PIT = registerItem("anthesi_pit", new Item(new FabricItemSettings()));

    public static final Item CHERRY_BLOSSOMS= registerItem("cherry_blossoms", new Item(new FabricItemSettings()));
    public static final Item AZALEA_BLOSSOMS = registerItem("azalea_blossoms", new Item(new FabricItemSettings()));

    public static final Item CHERRY_BLOSSOM_STAFF = registerItem("cherry_blossom_staff", new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new Item.Settings()));
    public static final Item AZALEA_BLOSSOM_STAFF = registerItem("azalea_blossom_staff", new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new Item.Settings()));

    public static final Item FLAX_SEEDS = registerItem("flax_seeds", new AliasedBlockItem(OddBlocks.FLAX_CROP, new FabricItemSettings()));
    public static final Item FLAX_FIBERS = registerItem("flax_fibers", new Item(new FabricItemSettings()));
    public static final Item LINEN_PATCH = registerItem("linen_patch", new Item(new FabricItemSettings()));


    public static final Item BOOK_OF_CONTENT = registerItem("book_of_content", new ContentBookItem(new FabricItemSettings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OddsNEnds.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OddsNEnds.LOGGER.info("Registering Items for " + OddsNEnds.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.addAfter(Items.BEETROOT_SEEDS, FLAX_SEEDS);
        });
    }
}