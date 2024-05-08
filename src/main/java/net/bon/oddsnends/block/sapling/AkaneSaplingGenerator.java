package net.bon.oddsnends.block.sapling;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;

public class AkaneSaplingGenerator extends SaplingGenerator {
    public AkaneSaplingGenerator() {
    }

    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        if (random.nextInt(10) == 0) {
            return bees ? TreeConfiguredFeatures.FANCY_OAK_BEES_005 : TreeConfiguredFeatures.FANCY_OAK;
        } else {
            return bees ? TreeConfiguredFeatures.OAK_BEES_005 : TreeConfiguredFeatures.OAK;
        }
    }
}