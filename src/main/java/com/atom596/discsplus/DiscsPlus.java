package com.atom596.discsplus;

import com.atom596.discsplus.modThings.MusicDiscPlus;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DiscsPlus implements ModInitializer {

	public static final String MOD_ID = "discsplus";
	public static final Logger LOGGER = LogManager.getLogger("modid");

	@Override
	public void onInitialize() {
		MusicDiscPlus.initDiscs();
	}
}
