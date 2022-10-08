package net.yourname.modname;

import net.fabricmc.api.DedicatedServerModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModNameServer implements DedicatedServerModInitializer {

    // This logger is used to write text to the console and the log file.
    public static final Logger SERVER_LOGGER = LoggerFactory.getLogger("server");

    @Override
    public void onInitializeServer() {
        // This code runs only on server side.
        // Proceed with mild caution.
        SERVER_LOGGER.info("Hello Fabric world!");

    }
}
