package net.bon.oddsnends.block;

import net.bon.oddsnends.OddsNEnds;
import net.bon.oddsnends.sound.OddSounds;
import net.bon.oddsnends.block.custom.*;
import net.bon.oddsnends.particle.OddParticles;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.awt.*;

@SuppressWarnings("unused")

public class OddBlocks {
    public static final Block SHORESTONE = registerBlock("shorestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block SHORESTONE_BRICKS = registerBlock("shorestone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block ROUGH_QUARTZ = registerBlock("rough_quartz",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ROUGH_QUARTZ_STAIRS = registerBlock("rough_quartz_stairs",
            new OddStairsBlock(OddBlocks.ROUGH_QUARTZ.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block ROUGH_QUARTZ_SLAB = registerBlock("rough_quartz_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));

    public static final Block SHALE = registerBlock("shale",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)));
    public static final Block POLISHED_SHALE = registerBlock("polished_shale",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)));
    public static final Block SHALE_BRICKS = registerBlock("shale_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)));
    public static final Block SHALE_BRICK_STAIRS = registerBlock("shale_brick_stairs",
            new OddStairsBlock(OddBlocks.SHALE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DEEPSLATE)));
    public static final Block SHALE_BRICK_SLAB = registerBlock("shale_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)));
    public static final Block SHALE_PILLAR = registerBlock("shale_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)));
    public static final Block CHISELED_SHALE_PILLAR = registerBlock("chiseled_shale_pillar",
            new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)));

    public static final Block MANASTONE = registerBlock("manastone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block MANASTONE_SLAB = registerBlock("manastone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
    public static final Block MANASTONE_STAIRS = registerBlock("manastone_stairs",
            new OddStairsBlock(OddBlocks.MANASTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
    public static final Block MANASTONE_WALL = registerBlock("manastone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
    public static final Block MANASTONE_BRICKS = registerBlock("manastone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block MANASTONE_BRICK_SLAB = registerBlock("manastone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block MANASTONE_BRICK_STAIRS = registerBlock("manastone_brick_stairs",
            new OddStairsBlock(OddBlocks.MANASTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block MANASTONE_BRICK_WALL = registerBlock("manastone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block SMALL_MANASTONE_BRICKS = registerBlock("small_manastone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block SMALL_MANASTONE_BRICK_SLAB = registerBlock("small_manastone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block SMALL_MANASTONE_BRICK_STAIRS = registerBlock("small_manastone_brick_stairs",
            new OddStairsBlock(OddBlocks.SMALL_MANASTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block SMALL_MANASTONE_BRICK_WALL = registerBlock("small_manastone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));
    public static final Block SMOOTH_MANASTONE = registerBlock("smooth_manastone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
    public static final Block SMOOTH_MANASTONE_SLAB = registerBlock("smooth_manastone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
    public static final Block MANASTONE_PILLAR = registerBlock("manastone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block SHATTERSLATE = registerBlock("shatterslate",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block SHATTERSLATE_SLAB = registerBlock("shatterslate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_SLAB)));
    public static final Block SHATTERSLATE_STAIRS = registerBlock("shatterslate_stairs",
            new OddStairsBlock(OddBlocks.SHATTERSLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_STAIRS)));
    public static final Block SHATTERSLATE_WALL = registerBlock("shatterslate_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_WALL)));

    public static final Block DUNGEON_STEEL_ORE = registerBlock("dungeon_steel_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block DUNGEON_STEEL_BLOCK = registerBlock("dungeon_steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));


    public static final Block RAGE_FIRE = registerBlockWithoutItem("rage_fire",
            new RageFireBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIME).replaceable().noCollision().breakInstantly().luminance(state -> 13).sounds(BlockSoundGroup.WOOL).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block WILD_MELON = registerBlock("wild_melon",
            new Block(FabricBlockSettings.copyOf(Blocks.MELON).strength(4f)));
    public static final Block WILD_MELON_SLAB = registerBlock("wild_melon_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MELON).strength(4f)));
    public static final Block WILD_MELON_STAIRS = registerBlock("wild_melon_stairs",
            new StairsBlock(OddBlocks.WILD_MELON.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MELON).strength(4f)));
    public static final Block MELON_SLAB = registerBlock("melon_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MELON).strength(4f)));
    public static final Block MELON_STAIRS = registerBlock("melon_stairs",
            new StairsBlock(Blocks.MELON.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MELON).strength(4f)));


    public static final Block GIANT_PADMA = registerBlock("giant_padma",
            new GiantPadmaBlock(8,1, FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM_BLOCK).nonOpaque()));
    public static final Block ALGAE = registerBlockWithoutItem("algae",
            new AmethystClusterBlock(5,2,FabricBlockSettings.copyOf(Blocks.LILY_PAD).nonOpaque().noCollision().breakInstantly().replaceable()));
    public static final Block CAVE_BRANCHES = registerBlock("cave_branches",
            new CaveBranchBlock(FabricBlockSettings.copyOf(Blocks.VINE).nonOpaque()));
    public static final Block BURIAL_SCONCE = registerBlockWithoutItem("burial_sconce",
            new TorchBlock(AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 12).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY), OddParticles.RAGEFLAME));
    public static final Block WALL_BURIAL_SCONCE = registerBlockWithoutItem("wall_burial_sconce",
            new WallTorchBlock(AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 12).sounds(BlockSoundGroup.WOOD).dropsLike(OddBlocks.BURIAL_SCONCE).pistonBehavior(PistonBehavior.DESTROY), OddParticles.RAGEFLAME));
    public static final Block HANGING_SPAWNER = registerBlockWithoutItem("hanging_spawner",
            new HangingSpawnerBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM).requiresTool().strength(5.0f).sounds(BlockSoundGroup.METAL).nonOpaque().dropsLike(Blocks.SPAWNER)));
    public static final Block QUARTZ_SAND = registerBlock("quartz_sand",
            new SandBlock(14010806, AbstractBlock.Settings.create().mapColor(MapColor.OFF_WHITE).instrument(Instrument.SNARE).strength(0.5f).sounds(OddSounds.QUARTZ_SAND)));
    public static final Block SUSPICIOUS_QUARTZ_SAND = registerBlock("suspicious_quartz_sand",
            new BrushableBlock(OddBlocks.QUARTZ_SAND, FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).instrument(Instrument.SNARE).strength(0.25F).sounds(OddSounds.SUSPICIOUS_QUARTZ_SAND).pistonBehavior(PistonBehavior.DESTROY), SoundEvents.ITEM_BRUSH_BRUSHING_SAND, SoundEvents.ITEM_BRUSH_BRUSHING_SAND_COMPLETE));
    public static final Block QUARTZ_GLASS = registerBlock("quartz_glass",
            new GlassBlock(AbstractBlock.Settings.create().instrument(Instrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block QUARTZ_GLASS_PANE = registerBlock("quartz_glass_pane",
            new PaneBlock(AbstractBlock.Settings.create().instrument(Instrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque()));



    public static final Block FLAX_FLOWERS = registerBlock("flax_flowers",
            new FlaxFlowerBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DRIED_FLAX_FLOWERS = registerBlock("dried_flax_flowers",
            new DriedFlaxFlowerBlock(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block FLAX_CROP = registerBlockWithoutItem("flax_crop",
            new FlaxCropBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LINEN_BLOCK = registerBlock("linen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).mapColor(MapColor.TERRACOTTA_WHITE).strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block LINEN_CARPET = registerBlock("linen_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).mapColor(MapColor.TERRACOTTA_WHITE).strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable()));

    public static final Block POTTED_FLAX = registerBlockWithoutItem("potted_flax",
            new FlowerPotBlock(OddBlocks.FLAX_FLOWERS, FabricBlockSettings.create().breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_DRIED_FLAX = registerBlockWithoutItem("potted_dried_flax",
            new FlowerPotBlock(OddBlocks.DRIED_FLAX_FLOWERS, FabricBlockSettings.create().breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));




    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(OddsNEnds.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(net.bon.oddsnends.OddsNEnds.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(net.bon.oddsnends.OddsNEnds.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        net.bon.oddsnends.OddsNEnds.LOGGER.info("Registering Blocks for " + net.bon.oddsnends.OddsNEnds.MOD_ID);
    }
}