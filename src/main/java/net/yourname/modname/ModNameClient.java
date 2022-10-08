package net.yourname.modname;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModNameClient implements ClientModInitializer {

    // This logger is used to write text to the console and the log file.
    public static final Logger CLIENT_LOGGER = LoggerFactory.getLogger("client");

    @Override
    public void onInitializeClient() {
        // This code runs only on client side.
        // Proceed with mild caution.
        CLIENT_LOGGER.info("Hello Fabric world!");
    }
}
