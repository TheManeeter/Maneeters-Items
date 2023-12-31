package net.maneeter.maneetersitems;

import net.fabricmc.api.ModInitializer;

import net.maneeter.maneetersitems.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ManeetersItems implements ModInitializer {
	public static final String MOD_ID = "maneetersitems";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		LOGGER.info("Hello Fabric world!");
	}
}