package net.yourname.modname;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModNameMain implements ModInitializer {

	// Variable already ready to use globally your MOD_ID, just change the modid string to the name of your mod id that you put in fabric.mod.json.
	public static final String ID = "modid";
	// This logger is used to write text to the console and the log file.
	public static final Logger MAIN_LOGGER = LoggerFactory.getLogger("main");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		MAIN_LOGGER.info("Hello Fabric world!");
	}
}
