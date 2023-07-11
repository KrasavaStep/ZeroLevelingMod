package com.example;

import com.example.world.structures.ModStructures;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZeroLevelingMod implements ModInitializer {

	public static final String MOD_ID = "zerolevelingmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("zeroleveling");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Zero Leveling!");

		ModStructures.registerStructureFeatures();
	}
}