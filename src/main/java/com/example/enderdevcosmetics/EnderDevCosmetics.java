package com.example.enderdevcosmetics;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnderDevCosmetics implements ModInitializer {
    public static final String MOD_ID = "enderdev-cosmetics";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing EnderDev Cosmetics");
    }
}