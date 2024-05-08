package net.bon.oddsnends;

import net.bon.oddsnends.block.OddsNEndsBlocks;
import net.bon.oddsnends.item.ModItemGroups;
import net.bon.oddsnends.item.ModItems;
import net.bon.oddsnends.particle.ONEParticles;
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
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		OddsNEndsBlocks.registerModBlocks();
		ONEParticles.registerParticles();
		StrippableBlockRegistry.register(OddsNEndsBlocks.AKANE_LOG, OddsNEndsBlocks.STRIPPED_AKANE_LOG);
		StrippableBlockRegistry.register(OddsNEndsBlocks.AKANE_WOOD, OddsNEndsBlocks.STRIPPED_AKANE_WOOD);
		FlammableBlockRegistry.getDefaultInstance().add(OddsNEndsBlocks.AKANE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(OddsNEndsBlocks.STRIPPED_AKANE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(OddsNEndsBlocks.AKANE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(OddsNEndsBlocks.STRIPPED_AKANE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(OddsNEndsBlocks.AKANE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(OddsNEndsBlocks.AKANE_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(OddsNEndsBlocks.FLOWERING_AKANE_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(OddsNEndsBlocks.FRUITING_AKANE_LEAVES, 30, 60);
	}
	
}