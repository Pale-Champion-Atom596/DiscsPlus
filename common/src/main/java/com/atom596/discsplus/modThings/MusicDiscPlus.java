package com.atom596.discsplus.modThings;

import com.atom596.discsplus.DiscsPlus;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.Registry;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class MusicDiscPlus extends RecordItem {

    public static Item MUSIC_DISC_ANTI;
    public static Item MUSIC_DISC_CHOP;
    public static Item MUSIC_DISC_RANGE;
    public static Item MUSIC_DISC_PILLAGED;
    public static Item MUSIC_DISC_TALL;
    public static Item MUSIC_DISC_BROKEN_SKY;
    public static Item MUSIC_DISC_SHULK;
    public static Item MUSIC_DISC_SHOCK;
    public static Item MUSIC_DISC_FREE_THE_END;

    public static final DeferredRegister<Item> DISCREGISTER = DeferredRegister.create(DiscsPlus.MOD_ID, Registry.ITEM_REGISTRY);
    private static final Item.Properties PROPERTIES = new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE);

    protected MusicDiscPlus(SoundEvent sound, Item.Properties properties) {
        super(14, sound, properties);
    }

    public static void initDiscs() {
        MUSIC_DISC_ANTI = register("music_disc_anti", new MusicDiscPlus(SoundPlus.MUSIC_DISC_ANTI, PROPERTIES));
        MUSIC_DISC_CHOP = register("music_disc_chop", new MusicDiscPlus(SoundPlus.MUSIC_DISC_CHOP, PROPERTIES));
        MUSIC_DISC_RANGE = register("music_disc_range", new MusicDiscPlus(SoundPlus.MUSIC_DISC_RANGE, PROPERTIES));
        MUSIC_DISC_PILLAGED = register("music_disc_pillaged", new MusicDiscPlus(SoundPlus.MUSIC_DISC_PILLAGED, PROPERTIES));
        MUSIC_DISC_TALL = register("music_disc_tall", new MusicDiscPlus(SoundPlus.MUSIC_DISC_TALL, PROPERTIES));
        MUSIC_DISC_BROKEN_SKY = register("music_disc_broken_sky", new MusicDiscPlus(SoundPlus.MUSIC_DISC_BROKEN_SKY, PROPERTIES));
        MUSIC_DISC_SHULK = register("music_disc_shulk", new MusicDiscPlus(SoundPlus.MUSIC_DISC_SHULK, PROPERTIES));
        MUSIC_DISC_SHOCK = register("music_disc_shock", new MusicDiscPlus(SoundPlus.MUSIC_DISC_SHOCK, PROPERTIES));
        MUSIC_DISC_FREE_THE_END = register("music_disc_free_the_end", new MusicDiscPlus(SoundPlus.MUSIC_DISC_FREE_THE_END, PROPERTIES));

    }

    private static Item register(String name, Item item) {
        DISCREGISTER.register(name, () -> new Item(PROPERTIES));
        return item;
    }
}
