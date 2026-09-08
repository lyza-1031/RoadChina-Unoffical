package com.xbzstudio.rcnunoffical.fabric;

import com.xbzstudio.rcnunoffical.RoadChinaUnoffical;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;

public class rcnFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        RoadChinaUnoffical.init();
    }
}