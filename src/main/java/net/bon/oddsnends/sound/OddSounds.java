package net.bon.oddsnends.sound;


import net.bon.oddsnends.OddsNEnds;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class OddSounds {
    public static final SoundEvent BLOCK_APPLES_PICKED = OddSounds.registerSoundEvent("block.apples_picked");
    public static final SoundEvent BLOCK_QUARTZ_SAND_STEP = OddSounds.registerSoundEvent("block.quartz_sand.step");
    public static final SoundEvent BLOCK_QUARTZ_SAND_BREAK = OddSounds.registerSoundEvent("block.quartz_sand.break");

    public static final BlockSoundGroup QUARTZ_SAND = new BlockSoundGroup(1f, 1f,
            OddSounds.BLOCK_QUARTZ_SAND_BREAK, OddSounds.BLOCK_QUARTZ_SAND_STEP, SoundEvents.BLOCK_SUSPICIOUS_SAND_PLACE,
            SoundEvents.BLOCK_SAND_HIT, SoundEvents.BLOCK_SAND_FALL);

    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(OddsNEnds.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        OddsNEnds.LOGGER.info("Registering Sounds for " + OddsNEnds.MOD_ID);
    }
}