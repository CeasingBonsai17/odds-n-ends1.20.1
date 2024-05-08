package net.bon.oddsnends.block;

import net.bon.oddsnends.OddsNEnds;
import net.bon.oddsnends.block.sapling.AkaneSaplingGenerator;
import net.bon.oddsnends.sound.OddSounds;
import net.bon.oddsnends.block.custom.*;
import net.bon.oddsnends.particle.OddParticles;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.block.sapling.OakSaplingGenerator;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class OddBlocks {

    public static final Block ANTHESI_CROP = registerBlock("anthesi_crop",
            new CropBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));


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
            new RageFireBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIME).replaceable().noCollision().breakInstantly().luminance(state -> 7).sounds(BlockSoundGroup.WOOL).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SPARKING_FIRE = registerBlockWithoutItem("sparking_fire",
            new SparkingFireBlock(AbstractBlock.Settings.create().mapColor(MapColor.BRIGHT_RED).replaceable().noCollision().breakInstantly().luminance(state -> 15).sounds(BlockSoundGroup.WOOL).pistonBehavior(PistonBehavior.DESTROY)));


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


    public static final Block AKANE_PLANKS = registerBlock("akane_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));
    public static final Block AKANE_LOG = registerBlock("akane_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block AKANE_WOOD = registerBlock("akane_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_AKANE_LOG = registerBlock("stripped_akane_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_AKANE_WOOD = registerBlock("stripped_akane_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)));
    public static final Block AKANE_STAIRS = registerBlock("akane_stairs",
            new OddStairsBlock(OddBlocks.AKANE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block AKANE_SLAB = registerBlock("akane_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block AKANE_BUTTON = registerBlock("akane_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON),BlockSetType.OAK,25,true));
    public static final Block AKANE_PRESSURE_PLATE = registerBlock("akane_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE),BlockSetType.OAK));
    public static final Block AKANE_FENCE = registerBlock("akane_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block AKANE_FENCE_GATE = registerBlock("akane_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE),WoodType.OAK));
    public static final Block AKANE_DOOR = registerBlock("akane_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).nonOpaque(),BlockSetType.OAK));
    public static final Block AKANE_TRAPDOOR = registerBlock("akane_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).nonOpaque(),BlockSetType.OAK));
    public static final Block FRUITING_AKANE_LEAVES = registerBlock("fruiting_akane_leaves",
            new FruitingAkaneLeavesBlock(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES).nonOpaque()));
    public static final Block FLOWERING_AKANE_LEAVES = registerBlock("flowering_akane_leaves",
            new GrowableLeavesBlock(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES).nonOpaque().ticksRandomly(), OddBlocks.FRUITING_AKANE_LEAVES));
    public static final Block AKANE_LEAVES = registerBlock("akane_leaves",
            new GrowableLeavesBlock(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES).nonOpaque().ticksRandomly(), OddBlocks.FLOWERING_AKANE_LEAVES));
    public static final Block AKANE_SAPLING = registerBlock("akane_sapling",
            new SaplingBlock(new AkaneSaplingGenerator(), AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));



    public static final Block GIANT_PADMA = registerBlock("giant_padma",
            new GiantPadmaBlock(8,1, FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM_BLOCK).nonOpaque()));
    public static final Block ALGAE = registerBlockWithoutItem("algae",
            new AmethystClusterBlock(5,2,FabricBlockSettings.copyOf(Blocks.LILY_PAD).nonOpaque().noCollision().breakInstantly().replaceable()));
    public static final Block CAVE_BRANCHES = registerBlock("cave_branches",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE).nonOpaque()));
    public static final Block BURIAL_SCONCE = registerBlockWithoutItem("burial_sconce",
            new TorchBlock(AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> -16).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY), OddParticles.RAGEFLAME));
    public static final Block WALL_BURIAL_SCONCE = registerBlockWithoutItem("wall_burial_sconce",
            new WallTorchBlock(AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> -16).sounds(BlockSoundGroup.WOOD).dropsLike(OddBlocks.BURIAL_SCONCE).pistonBehavior(PistonBehavior.DESTROY), OddParticles.RAGEFLAME));
    public static final Block HANGING_SPAWNER = registerBlockWithoutItem("hanging_spawner",
            new HangingSpawnerBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM).requiresTool().strength(5.0f).sounds(BlockSoundGroup.METAL).nonOpaque().dropsLike(Blocks.SPAWNER)));
    public static final Block RAGEFLAME_REDSTONE_TORCH = registerBlockWithoutItem("rageflame_redstone_torch",
            new RedstoneTorchBlock(AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(Blocks.createLightLevelFromLitBlockState(9)).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).dropsLike(Blocks.REDSTONE_TORCH)));
    public static final Block WALL_RAGEFLAME_REDSTONE_TORCH = registerBlockWithoutItem("wall_rageflame_redstone_torch",
            new WallRedstoneTorchBlock(AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(Blocks.createLightLevelFromLitBlockState(9)).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).dropsLike(Blocks.REDSTONE_TORCH)));
    public static final Block QUARTZ_SAND = registerBlock("quartz_sand",
            new SandBlock(14010806, AbstractBlock.Settings.create().mapColor(MapColor.WHITE).instrument(Instrument.SNARE).strength(0.5f).sounds(OddSounds.QUARTZ_SAND)));
    public static final Block QUARTZ_GLASS = registerBlock("quartz_glass",
            new GlassBlock(AbstractBlock.Settings.create().instrument(Instrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block QUARTZ_GLASS_PANE = registerBlock("quartz_glass_pane",
            new PaneBlock(AbstractBlock.Settings.create().instrument(Instrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque()));



    public static final Block LINEN_BLOCK = registerBlock("linen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).strength(4f)));
    public static final Block RED_LINEN_BLOCK = registerBlock("red_linen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_WOOL).strength(4f)));
    public static final Block ORANGE_LINEN_BLOCK = registerBlock("orange_linen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_WOOL).strength(4f)));
    public static final Block YELLOW_LINEN_BLOCK = registerBlock("yellow_linen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_WOOL).strength(4f)));
    public static final Block LIME_LINEN_BLOCK = registerBlock("lime_linen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LIME_WOOL).strength(4f)));
    public static final Block GREEN_LINEN_BLOCK = registerBlock("green_linen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GREEN_WOOL).strength(4f)));
    public static final Block CYAN_LINEN_BLOCK = registerBlock("cyan_linen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_WOOL).strength(4f)));
    public static final Block LIGHT_BLUE_LINEN_BLOCK = registerBlock("light_blue_linen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_WOOL).strength(4f)));
    public static final Block BLUE_LINEN_BLOCK = registerBlock("blue_linen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).strength(4f)));
    public static final Block PURPLE_LINEN_BLOCK = registerBlock("purple_linen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_WOOL).strength(4f)));
    public static final Block MAGENTA_LINEN_BLOCK = registerBlock("magenta_linen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_WOOL).strength(4f)));
    public static final Block PINK_LINEN_BLOCK = registerBlock("pink_linen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_WOOL).strength(4f)));
    public static final Block BROWN_LINEN_BLOCK = registerBlock("brown_blue_linen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_WOOL).strength(4f)));
    public static final Block WHITE_LINEN_BLOCK = registerBlock("white_linen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).strength(4f)));
    public static final Block LIGHT_GRAY_LINEN_BLOCK = registerBlock("light_gray_linen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_WOOL).strength(4f)));
    public static final Block GRAY_LINEN_BLOCK = registerBlock("gray_linen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GRAY_WOOL).strength(4f)));
    public static final Block BLACK_LINEN_BLOCK = registerBlock("black_linen_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL).strength(4f)));


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
        net.bon.oddsnends.OddsNEnds.LOGGER.info("Registering ModBlocks for " + net.bon.oddsnends.OddsNEnds.MOD_ID);
    }
}