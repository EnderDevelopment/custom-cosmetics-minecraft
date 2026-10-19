package com.example.enderdevcosmetics.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class EnderDevCosmeticsClient implements ClientModInitializer {
    public static KeyBinding openCosmeticsMenuKey;

    @Override
    public void onInitializeClient() {
        openCosmeticsMenuKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.enderdev-cosmetics.open_menu",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_C,
                "category.enderdev-cosmetics.cosmetics"
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (openCosmeticsMenuKey.wasPressed()) {
                // Open cosmetics menu
            }
        });
    }
}