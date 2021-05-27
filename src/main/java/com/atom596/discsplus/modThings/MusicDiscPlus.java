package com.atom596.discsplus.modThings;

import com.atom596.discsplus.DiscsPlus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class MusicDiscPlus extends MusicDiscItem {

    public static Item MUSIC_DISC_ANTI;
    public static Item MUSIC_DISC_CHOP;
    public static Item MUSIC_DISC_RANGE;
    public static Item MUSIC_DISC_PILLAGED;
    public static Item MUSIC_DISC_TALL;
    public static Item MUSIC_DISC_BROKEN_SKY;
    public static Item MUSIC_DISC_SHULK;
    public static Item MUSIC_DISC_SHOCK;
    public static Item MUSIC_DISC_FREE_THE_END;

    private static final Item.Settings SETTINGS = new Item.Settings().maxCount(1).group(ItemGroup.MISC)
            .rarity(Rarity.RARE);

    protected MusicDiscPlus(SoundEvent sound, Settings settings) {
        super(14, sound, settings);
    }

    public static void initDiscs() {
        MUSIC_DISC_ANTI = register("music_disc_anti", new MusicDiscPlus(SoundPlus.MUSIC_DISC_ANTI, SETTINGS));
        MUSIC_DISC_CHOP = register("music_disc_chop", new MusicDiscPlus(SoundPlus.MUSIC_DISC_CHOP, SETTINGS));
        MUSIC_DISC_RANGE = register("music_disc_range", new MusicDiscPlus(SoundPlus.MUSIC_DISC_RANGE, SETTINGS));
        MUSIC_DISC_PILLAGED = register("music_disc_pillaged", new MusicDiscPlus(SoundPlus.MUSIC_DISC_PILLAGED, SETTINGS));
        MUSIC_DISC_TALL = register("music_disc_tall", new MusicDiscPlus(SoundPlus.MUSIC_DISC_TALL, SETTINGS));
        MUSIC_DISC_BROKEN_SKY = register("music_disc_broken_sky", new MusicDiscPlus(SoundPlus.MUSIC_DISC_BROKEN_SKY, SETTINGS));
        MUSIC_DISC_SHULK = register("music_disc_shulk", new MusicDiscPlus(SoundPlus.MUSIC_DISC_SHULK, SETTINGS));
        MUSIC_DISC_SHOCK = register("music_disc_shock", new MusicDiscPlus(SoundPlus.MUSIC_DISC_SHOCK, SETTINGS));
        MUSIC_DISC_FREE_THE_END = register("music_disc_free_the_end", new MusicDiscPlus(SoundPlus.MUSIC_DISC_FREE_THE_END, SETTINGS));

    }

    private static Item register(String name, Item item) {
        Identifier id = new Identifier(DiscsPlus.MOD_ID, name);
        Registry.register(Registry.ITEM, id, item);

        return item;
    }
}
