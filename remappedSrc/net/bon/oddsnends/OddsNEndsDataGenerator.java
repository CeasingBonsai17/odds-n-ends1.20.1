package net.bon.oddsnends;

import net.bon.oddsnends.datagen.ModBlockTagProvider;
import net.bon.oddsnends.datagen.ModItemTagProvider;
import net.bon.oddsnends.datagen.ModLootTableProvider;
import net.bon.oddsnends.datagen.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class OddsNEndsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		fabricDataGenerator.createPack().addProvider(ModModelProvider::new);
		fabricDataGenerator.createPack().addProvider(ModBlockTagProvider::new);
		fabricDataGenerator.createPack().addProvider(ModItemTagProvider::new);
		fabricDataGenerator.createPack().addProvider(ModLootTableProvider::new);
	}
}