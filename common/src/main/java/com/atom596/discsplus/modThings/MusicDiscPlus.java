package com.atom596.discsplus.modThings;

import com.atom596.discsplus.DiscsPlus;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class MusicDiscPlus extends RecordItem {

    protected MusicDiscPlus(SoundEvent sound) {
        super(14, sound, PROPERTIES);
    }

    public static final DeferredRegister<Item> DISCREGISTER = DeferredRegister.create(DiscsPlus.MOD_ID, Registry.ITEM_REGISTRY);
    private static final Item.Properties PROPERTIES = new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE);

    public static final Item MUSIC_DISC_ANTI = new MusicDiscPlus(SoundPlus.MUSIC_DISC_ANTI);
    public static Item MUSIC_DISC_CHOP = new MusicDiscPlus(SoundPlus.MUSIC_DISC_CHOP);
    public static Item MUSIC_DISC_RANGE = new MusicDiscPlus(SoundPlus.MUSIC_DISC_RANGE);
    public static Item MUSIC_DISC_PILLAGED = new MusicDiscPlus(SoundPlus.MUSIC_DISC_PILLAGED);
    public static Item MUSIC_DISC_TALL = new MusicDiscPlus(SoundPlus.MUSIC_DISC_TALL);
    public static Item MUSIC_DISC_BROKEN_SKY = new MusicDiscPlus(SoundPlus.MUSIC_DISC_BROKEN_SKY);
    public static Item MUSIC_DISC_SHULK = new MusicDiscPlus(SoundPlus.MUSIC_DISC_SHULK);
    public static Item MUSIC_DISC_SHOCK = new MusicDiscPlus(SoundPlus.MUSIC_DISC_SHOCK);
    public static Item MUSIC_DISC_FREE_THE_END = new MusicDiscPlus(SoundPlus.MUSIC_DISC_FREE_THE_END);

    public static void initDiscs() {
        register("music_disc_anti", MUSIC_DISC_ANTI);
        register("music_disc_chop", MUSIC_DISC_CHOP);
        register("music_disc_range", MUSIC_DISC_RANGE);
        register("music_disc_pillaged", MUSIC_DISC_PILLAGED);
        register("music_disc_tall", MUSIC_DISC_TALL);
        register("music_disc_broken_sky", MUSIC_DISC_BROKEN_SKY);
        register("music_disc_shulk", MUSIC_DISC_SHULK);
        register("music_disc_shock", MUSIC_DISC_SHOCK);
        register("music_disc_free_the_end", MUSIC_DISC_FREE_THE_END);
    }

    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new ResourceLocation(DiscsPlus.MOD_ID, name), item);
    }
}
