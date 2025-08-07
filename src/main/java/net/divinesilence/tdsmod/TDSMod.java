package net.divinesilence.tdsmod;

import net.divinesilence.tdsmod.Item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TDSMod implements ModInitializer {
	public static final String MOD_ID = "tdsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}