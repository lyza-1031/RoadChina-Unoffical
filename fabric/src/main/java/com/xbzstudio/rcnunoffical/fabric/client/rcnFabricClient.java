package com.xbzstudio.rcnunoffical.fabric.client;


import net.fabricmc.api.ClientModInitializer;

import net.minecraft.client.KeyMapping;

public final class rcnFabricClient implements ClientModInitializer {

    private static KeyMapping killItemsKey;

    @Override
    public void onInitializeClient() {
        System.setProperty("fabric.texture.size.limit", "4096");
    }
}