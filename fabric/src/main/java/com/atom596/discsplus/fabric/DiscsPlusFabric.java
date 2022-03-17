package com.atom596.discsplus.fabric;

import com.atom596.discsplus.DiscsPlus;
import net.fabricmc.api.ModInitializer;

public class DiscsPlusFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        DiscsPlus.init();
    }
}
