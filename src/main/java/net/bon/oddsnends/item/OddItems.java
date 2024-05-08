package net.bon.oddsnends.item;

import net.bon.oddsnends.OddsNEnds;
import net.bon.oddsnends.block.OddBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class OddItems {
    public static final Item APPLE_BLOSSOM = registerItem("apple_blossom", new Item(new FabricItemSettings()));
    public static final Item FLORAL_BAKED_APPLE = registerItem("floral_baked_apple", new Item(new FabricItemSettings().food(OddFoodComponents.FLORAL_BAKED_APPLE)));
    public static final Item BAKED_APPLE = registerItem("baked_apple", new Item(new FabricItemSettings().food(OddFoodComponents.BAKED_APPLE)));
    public static final Item MANDRAKE_ROOT = registerItem("mandrake_root", new Item(new FabricItemSettings().food(OddFoodComponents.MANDRAKE_ROOT)));
    public static final Item PEELED_MANDRAKE_ROOT = registerItem("peeled_mandrake_root", new Item(new FabricItemSettings().food(OddFoodComponents.PEELED_MANDRAKE_ROOT)));
    public static final Item WILD_MANDRAKE_ROOT = registerItem("wild_mandrake_root", new Item(new FabricItemSettings().food(OddFoodComponents.WILD_MANDRAKE_ROOT)));
    public static final Item WILD_CARROT = registerItem("wild_carrot", new Item(new FabricItemSettings().food(OddFoodComponents.WILD_CARROT)));
    public static final Item BURIAL_SCONCE = Items.register(new VerticallyAttachableBlockItem(OddBlocks.BURIAL_SCONCE, OddBlocks.WALL_BURIAL_SCONCE, new Item.Settings(), Direction.DOWN));
    public static final Item DUNGEON_STEEL = registerItem("dungeon_steel", new Item(new FabricItemSettings()));
    public static final Item GIANT_PADMA_PETAL = registerItem("giant_padma_petal", new Item(new FabricItemSettings()));
    public static final Item ALGAE = registerItem("algae", new AliasedBlockItem(OddBlocks.ALGAE, new Item.Settings().food(OddFoodComponents.ALGAE)));
    public static final Item ANTHESI_PIT = registerItem("anthesi_pit", new Item(new FabricItemSettings()));






    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
    entries.add(APPLE_BLOSSOM);
}

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OddsNEnds.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OddsNEnds.LOGGER.info("Registering Mod Items for " + OddsNEnds.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(OddItems::addItemsToIngredientsItemGroup);
    }
}