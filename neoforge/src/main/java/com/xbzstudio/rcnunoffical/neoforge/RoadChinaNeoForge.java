package com.xbzstudio.rcnunoffical.neoforge;

import com.xbzstudio.rcnunoffical.RoadChinaUnoffical;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;

@Mod(RoadChinaUnoffical.MOD_ID)
public class RoadChinaNeoForge {
    public RoadChinaNeoForge(IEventBus modEventBus, ModContainer container) {
        ModRegistry.register(modEventBus);
    }
}