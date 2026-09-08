package com.xbzstudio.rcnunoffical.neoforge;

import com.xbzstudio.rcnunoffical.ModBlockItem;
import com.xbzstudio.rcnunoffical.ModCreativeTab;
import com.xbzstudio.rcnunoffical.RoadChinaUnoffical;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.*;

public class ModRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(RoadChinaUnoffical.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RoadChinaUnoffical.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RoadChinaUnoffical.MOD_ID);

    public static final Map<String, DeferredHolder<Block, Block>> BLOCK_MAP = new LinkedHashMap<>();

    public static void register(IEventBus bus) {
        for (var def : com.xbzstudio.rcnunoffical.RoadChinaUnoffical.BLOCKS) {
            Identifier id = Identifier.fromNamespaceAndPath(RoadChinaUnoffical.MOD_ID, def.id());
            DeferredHolder<Block, Block> blockHolder = BLOCKS.register(def.id(), () -> def.factory().apply(id));
            BLOCK_MAP.put(def.id(), blockHolder);
        }

        for (var entry : BLOCK_MAP.entrySet()) {
            String id = entry.getKey();
            Identifier location = Identifier.fromNamespaceAndPath(RoadChinaUnoffical.MOD_ID, id);
            ITEMS.register(id, () -> {
                Item.Properties props = new Item.Properties();
                props.setId(ResourceKey.create(Registries.ITEM, location));
                return new ModBlockItem(entry.getValue().get(), props, id);
            });
        }

        BLOCKS.register(bus);
        ITEMS.register(bus);

        for (var tab : ModCreativeTab.TABS) {
            TABS.register(tab.id(),
                    () -> CreativeModeTab.builder(
                                    CreativeModeTab.Row.TOP,
                                    ModCreativeTab.TABS.indexOf(tab)
                            )
                            .title(tab.title())
                            .icon(() -> {
                                var blockHolder = BLOCK_MAP.get(tab.iconId());
                                return new ItemStack(blockHolder != null ? blockHolder.get().asItem() : Items.STONE);
                            })
                            .displayItems((params, output) -> {
                                for (String blockId : tab.blockIds()) {
                                    var blockHolder = BLOCK_MAP.get(blockId);
                                    if (blockHolder != null) {
                                        output.accept(blockHolder.get().asItem());
                                    }
                                }
                            })
                            .build()
            );
        }
        TABS.register(bus);
    }
}