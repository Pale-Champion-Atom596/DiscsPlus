package com.atom596.discsplus;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DiscsPlus.MOD_ID)
public class DiscsPlusForge {
    public DiscsPlusForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(DiscsPlus.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        DiscsPlus.init();
    }
}
