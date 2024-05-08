package net.bon.oddsnends;

import net.bon.oddsnends.block.OddBlocks;
import net.bon.oddsnends.block.entity.OddBlockEntities;
import net.bon.oddsnends.item.OddItemGroups;
import net.bon.oddsnends.item.OddItems;
import net.bon.oddsnends.particle.OddParticles;
import net.bon.oddsnends.sound.OddSounds;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OddsNEnds implements ModInitializer {
	public static final String MOD_ID = "oddsnends";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		OddItemGroups.registerItemGroups();
		OddItems.registerModItems();
		OddBlocks.registerModBlocks();
		OddParticles.registerParticles();
		OddSounds.registerSounds();
		OddBlockEntities.registerBlockEntities();

		StrippableBlockRegistry.register(OddBlocks.AKANE_LOG, OddBlocks.STRIPPED_AKANE_LOG);
		StrippableBlockRegistry.register(OddBlocks.AKANE_WOOD, OddBlocks.STRIPPED_AKANE_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(OddBlocks.AKANE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(OddBlocks.STRIPPED_AKANE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(OddBlocks.AKANE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(OddBlocks.STRIPPED_AKANE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(OddBlocks.AKANE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(OddBlocks.AKANE_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(OddBlocks.FLOWERING_AKANE_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(OddBlocks.FRUITING_AKANE_LEAVES, 30, 60);
	}
}