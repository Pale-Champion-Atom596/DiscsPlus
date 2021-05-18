package com.atom596.discsplus.modThings;

import com.atom596.discsplus.DiscsPlus;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SoundPlus {
    public static final SoundEvent MUSIC_DISC_ANTI = register("anti");
    public static final SoundEvent MUSIC_DISC_CHOP = register("chop");
    public static final SoundEvent MUSIC_DISC_RANGE = register("range");
    public static final SoundEvent MUSIC_DISC_PILLAGED = register("pillaged");
    public static final SoundEvent MUSIC_DISC_TALL = register("tall");

    private static SoundEvent register(String name) {
        Identifier id = new Identifier(DiscsPlus.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
