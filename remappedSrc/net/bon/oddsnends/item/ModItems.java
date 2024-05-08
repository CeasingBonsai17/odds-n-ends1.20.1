package net.bon.oddsnends.item;

import net.bon.oddsnends.OddsNEnds;
import net.bon.oddsnends.block.OddsNEndsBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.VerticallyAttachableBlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModItems {
    public static final Item APPLE_BLOSSOM = registerItem("apple_blossom", new Item(new FabricItemSettings()));
    public static final Item BAKED_APPLE = registerItem("baked_apple", new Item(new FabricItemSettings().food(ModFoodComponents.BAKED_APPLE)));
    public static final Item MANDRAKE_ROOT = registerItem("mandrake_root", new Item(new FabricItemSettings().food(ModFoodComponents.MANDRAKE_ROOT)));
    public static final Item PEELED_MANDRAKE_ROOT = registerItem("peeled_mandrake_root", new Item(new FabricItemSettings().food(ModFoodComponents.PEELED_MANDRAKE_ROOT)));
    public static final Item WILD_MANDRAKE_ROOT = registerItem("wild_mandrake_root", new Item(new FabricItemSettings().food(ModFoodComponents.WILD_MANDRAKE_ROOT)));
    public static final Item WILD_CARROT = registerItem("wild_carrot", new Item(new FabricItemSettings().food(ModFoodComponents.WILD_CARROT)));
    public static final Item BURIAL_SCONCE = Items.register(new VerticallyAttachableBlockItem(OddsNEndsBlocks.BURIAL_SCONCE, OddsNEndsBlocks.WALL_BURIAL_SCONCE, new Item.Settings(), Direction.DOWN));
    public static final Item DUNGEON_STEEL = registerItem("dungeon_steel", new Item(new FabricItemSettings()));
    public static final Item GIANT_PADMA_PETAL = registerItem("giant_padma_petal", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
    entries.add(APPLE_BLOSSOM);
}

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OddsNEnds.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OddsNEnds.LOGGER.info("Registering Mod Items for " + OddsNEnds.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
    }
}