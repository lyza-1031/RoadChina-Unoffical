package com.xbzstudio.rcnunoffical;

import com.xbzstudio.citymod.CreativeTabData;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.List;

public class ModCreativeTab {
    public static final String MODID = "roadchina";

    public static final DeferredRegister<CreativeModeTab> TABS_REGISTER =
            DeferredRegister.create(MODID, Registries.CREATIVE_MODE_TAB);

    public static final List<CreativeTabData.TabDef> TABS = List.of(
            // 白线标签页
            new CreativeTabData.TabDef(
                    "white_line_group",
                    Component.translatable("itemGroup.white_line_group"),
                    "white_line_1",
                    List.of(
                            "asphalt_road","white_asphalt_road","yellow_asphalt_road","white_line_1", "white_line_2", "white_line_3", "white_line_4", "white_line_5",
                            "white_line_6", "white_line_7", "white_line_8", "white_line_9a", "white_line_9b",
                            "white_line_10a", "white_line_10b", "white_line_11a", "white_line_11b",
                            "white_line_12a", "white_line_12b", "white_line_13", "white_line_14", "white_line_15",
                            "white_line_16a", "white_line_16b", "white_line_17a", "white_line_17b",
                            "white_line_18a", "white_line_18b", "white_line_19a", "white_line_19b",
                            "white_line_20a", "white_line_20b", "white_line_21a", "white_line_21b",
                            "white_line_22a", "white_line_22b",
                            "white_line_23a", "white_line_23b", "white_line_23c",
                            "white_line_24", "white_line_25",
                            "white_line_26a", "white_line_26b", "white_line_26c",
                            "white_line_27a", "white_line_27b", "white_line_27c",
                            "white_line_28",
                            "white_line_29a", "white_line_29b", "white_line_29c",
                            "white_line_30a", "white_line_30b", "white_line_30c",
                            "white_line_31a", "white_line_31b", "white_line_31c",
                            "white_line_32",
                            "white_line_33a", "white_line_33b",
                            "white_line_34", "white_line_35", "white_line_36",
                            "white_line_37a", "white_line_37b", "white_line_37c", "white_line_37d",
                            "white_line_38a", "white_line_38b", "white_line_38c", "white_line_38d",
                            "white_line_39a", "white_line_39b", "white_line_39c", "white_line_39d",
                            "white_line_40a", "white_line_40b", "white_line_40c", "white_line_40d",
                            "white_line_41a", "white_line_41b", "white_line_41c", "white_line_41d",
                            "white_line_42a", "white_line_42b", "white_line_42c", "white_line_42d",
                            "white_line_43a", "white_line_43b",
                            "white_line_44", "white_line_45", "white_line_46",
                            "white_line_47a", "white_line_47b",
                            "white_line_48a", "white_line_48b",
                            "asphalt_road_slab", "white_asphalt_road_slab", "yellow_asphalt_road_slab",
                            "white_line_1_slab", "white_line_2_slab", "white_line_3_slab", "white_line_4_slab",
                            "white_line_5_slab", "white_line_6_slab", "white_line_7_slab", "white_line_8_slab",
                            "white_line_9a_slab", "white_line_9b_slab", "white_line_10a_slab", "white_line_10b_slab",
                            "white_line_11a_slab", "white_line_11b_slab", "white_line_12a_slab", "white_line_12b_slab",
                            "white_line_13_slab", "white_line_14_slab", "white_line_15_slab",
                            "white_line_16a_slab", "white_line_16b_slab", "white_line_17a_slab", "white_line_17b_slab",
                            "white_line_18a_slab", "white_line_18b_slab", "white_line_19a_slab", "white_line_19b_slab",
                            "white_line_20a_slab", "white_line_20b_slab", "white_line_21a_slab", "white_line_21b_slab",
                            "white_line_22a_slab", "white_line_22b_slab",
                            "white_line_23a_slab", "white_line_23b_slab", "white_line_23c_slab",
                            "white_line_24_slab", "white_line_25_slab",
                            "white_line_26a_slab", "white_line_26b_slab", "white_line_26c_slab",
                            "white_line_27a_slab", "white_line_27b_slab", "white_line_27c_slab",
                            "white_line_28_slab",
                            "white_line_29a_slab", "white_line_29b_slab", "white_line_29c_slab",
                            "white_line_30a_slab", "white_line_30b_slab", "white_line_30c_slab",
                            "white_line_31a_slab", "white_line_31b_slab", "white_line_31c_slab",
                            "white_line_32_slab",
                            "white_line_33a_slab", "white_line_33b_slab",
                            "white_line_34_slab", "white_line_35_slab", "white_line_36_slab",
                            "white_line_37a_slab", "white_line_37b_slab", "white_line_37c_slab", "white_line_37d_slab",
                            "white_line_38a_slab", "white_line_38b_slab", "white_line_38c_slab", "white_line_38d_slab",
                            "white_line_39a_slab", "white_line_39b_slab", "white_line_39c_slab", "white_line_39d_slab",
                            "white_line_40a_slab", "white_line_40b_slab", "white_line_40c_slab", "white_line_40d_slab",
                            "white_line_41a_slab", "white_line_41b_slab", "white_line_41c_slab", "white_line_41d_slab",
                            "white_line_42a_slab", "white_line_42b_slab", "white_line_42c_slab", "white_line_42d_slab",
                            "white_line_43a_slab", "white_line_43b_slab",
                            "white_line_44_slab", "white_line_45_slab", "white_line_46_slab",
                            "white_line_47a_slab", "white_line_47b_slab",
                            "white_line_48a_slab", "white_line_48b_slab"
                    )
            ),
            // 黄线标签页
            new CreativeTabData.TabDef(
                    "yellow_line_group",
                    Component.translatable("itemGroup.yellow_line_group"),
                    "yellow_line_1",
                    List.of(
                            "post_black","yellow_line_1", "yellow_line_2", "yellow_line_3", "yellow_line_4", "yellow_line_5",
                            "yellow_line_6", "yellow_line_7", "yellow_line_8", "yellow_line_9",
                            "yellow_line_10a", "yellow_line_10b", "yellow_line_11a", "yellow_line_11b",
                            "yellow_line_12a", "yellow_line_12b",
                            "white_yellow_line_1a", "white_yellow_line_1b",
                            "white_yellow_line_2a", "white_yellow_line_2b",
                            "white_yellow_line_3a", "white_yellow_line_3b",
                            "white_yellow_line_4",
                            "white_yellow_line_5a", "white_yellow_line_5b", "white_yellow_line_5c",
                            "white_yellow_line_6a", "white_yellow_line_6b", "white_yellow_line_6c",
                            "white_yellow_line_7a", "white_yellow_line_7b", "white_yellow_line_7c",
                            "white_yellow_line_8",
                            "yellow_line_1_slab", "yellow_line_2_slab", "yellow_line_3_slab", "yellow_line_4_slab",
                            "yellow_line_5_slab", "yellow_line_6_slab", "yellow_line_7_slab", "yellow_line_8_slab",
                            "yellow_line_9_slab", "yellow_line_10a_slab", "yellow_line_10b_slab",
                            "yellow_line_11a_slab", "yellow_line_11b_slab",
                            "yellow_line_12a_slab", "yellow_line_12b_slab",
                            "white_yellow_line_1a_slab", "white_yellow_line_1b_slab",
                            "white_yellow_line_2a_slab", "white_yellow_line_2b_slab",
                            "white_yellow_line_3a_slab", "white_yellow_line_3b_slab",
                            "white_yellow_line_4_slab",
                            "white_yellow_line_5a_slab", "white_yellow_line_5b_slab", "white_yellow_line_5c_slab",
                            "white_yellow_line_6a_slab", "white_yellow_line_6b_slab", "white_yellow_line_6c_slab",
                            "white_yellow_line_7a_slab", "white_yellow_line_7b_slab", "white_yellow_line_7c_slab",
                            "white_yellow_line_8_slab"
                    )
            ),
            new CreativeTabData.TabDef(
                    "marking_group",
                    Component.translatable("itemGroup.marking_group"),
                    "white_arrow_1",
                    List.of(
                            "white_arrow_1", "white_arrow_2a", "white_arrow_2b",
                            "white_arrow_3a", "white_arrow_3b",
                            "white_arrow_4", "white_arrow_5a", "white_arrow_5b",
                            "white_arrow_6", "white_arrow_7", "white_arrow_8",
                            "white_marking_1", "white_marking_2", "white_marking_3",
                            "white_marking_4", "white_marking_5", "white_marking_6",
                            "white_marking_ting"
                    )
            ),
            new CreativeTabData.TabDef(
                    "post_group",
                    Component.translatable("itemGroup.road_sign_group"),
                    "post_silver_base",
                    List.of(
                    "post_black", "post_gray", "post_silver", "post_blue","post_white","thin_post_gray",
                           "thin_post_silver","post_black_nc1", "post_gray_nc1", "post_silver_nc1", "post_blue_nc1","post_white_nc1","thin_post_gray_nc1","thin_post_silver_nc1",
                            "thin_post_gray_base","thin_post_silver_base","post_gray_base","post_silver_base"
                    )
            )
    );

    static {
        for (var tab : TABS) {
            TABS_REGISTER.register(tab.id(), () -> CreativeTabRegistry.create(
                    tab.title(),
                    () -> {
                        Block b = getBlockFromRoadChina(tab.iconId());
                        return new ItemStack(b != Blocks.AIR ? b.asItem() : Blocks.STONE.asItem());
                    }
            ));
        }
    }

    private static Block getBlockFromRoadChina(String id) {
        return BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath(MODID, id))
                .map(Holder.Reference::value)
                .orElse(Blocks.AIR);
    }

    public static void appendItems() {
        for (var tab : TABS) {
            ResourceKey<CreativeModeTab> tabKey = ResourceKey.create(
                    Registries.CREATIVE_MODE_TAB,
                    Identifier.fromNamespaceAndPath(MODID, tab.id())
            );

            var items = tab.blockIds().stream()
                    .map(ModCreativeTab::getBlockFromRoadChina)
                    .filter(b -> b != Blocks.AIR)
                    .toArray(Block[]::new);

            if (items.length > 0) {
                CreativeTabRegistry.append(tabKey, items);
            }
        }
    }
}