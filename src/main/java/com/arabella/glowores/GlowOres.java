package com.arabella.glowores;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlowOres implements ModInitializer {
	public static final String MOD_ID = "glowores";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// The actual light-emission override happens in GlowingOreLightMixin.
		// Nothing to register here yet, but this is where you'd add config
		// loading later if you want per-ore light levels.
		LOGGER.info("Glow Ores initialized - ores in #glowores:glowing_ores will now emit light");
	}
}
