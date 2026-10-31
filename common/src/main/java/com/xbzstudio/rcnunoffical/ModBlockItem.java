package com.xbzstudio.rcnunoffical;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class ModBlockItem extends BlockItem {
    private final String blockName; // 注册名（不含命名空间）

    public ModBlockItem(Block block, Properties properties, String blockName) {
        super(block, properties);
        this.blockName = blockName;
    }

    @Override
    public Component getName(ItemStack stack) {
        return Component.translatable("block." + RoadChinaUnoffical.MOD_ID + "." + blockName);
    }
}