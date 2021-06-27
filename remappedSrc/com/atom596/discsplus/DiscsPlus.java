package com.atom596.discsplus;

import com.atom596.discsplus.modThings.MusicDiscPlus;
import net.fabricmc.api.ModInitializer;

public class DiscsPlus implements ModInitializer {

	public static final String MOD_ID = "discsplus";

	@Override
	public void onInitialize() {
		MusicDiscPlus.initDiscs();
	}
}
