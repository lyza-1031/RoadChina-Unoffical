package com.xbzstudio.rcnunoffical;

import com.xbzstudio.citymod.BlockDef;
import com.xbzstudio.citymod.block.*;
import com.xbzstudio.citymod.block.genericblocks.GenericSignBlock;
import com.xbzstudio.citymod.block.shapes.BlockShapes;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class RoadChinaUnoffical {

    public static final String MOD_ID = "roadchina";
    public static final List<BlockDef> BLOCKS = new ArrayList<>();
    public static Map<Direction, VoxelShape> createShape(
            VoxelShape south, VoxelShape north, VoxelShape east, VoxelShape west) {
        Map<Direction, VoxelShape> shapes = new EnumMap<>(Direction.class);
        shapes.put(Direction.SOUTH, south);
        shapes.put(Direction.NORTH, north);
        shapes.put(Direction.EAST, east);
        shapes.put(Direction.WEST, west);
        return shapes;
    }

    private static VoxelShape box(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Block.box(x1, y1, z1, x2, y2, z2);
    }
    public static final Map<Direction, VoxelShape> SLAB = createShape(
            box(0, 0, 0, 16, 8, 16),
            box(0, 0, 0, 16, 8, 16),
            box(0, 0, 0, 16, 8, 16),
            box(0, 0, 0, 16, 8, 16)
    );
    static {

        reg("asphalt_road", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_asphalt_road", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("yellow_asphalt_road", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        // ==================== 白线 ====================
        reg("white_line_1", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_2", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_3", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_4", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_5", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_6", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_7", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_8", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_9a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_9b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_10a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_10b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_11a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_11b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_12a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_12b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_13", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_14", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_15", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_16a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_16b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_17a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_17b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_18a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_18b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_19a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_19b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_20a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_20b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_21a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_21b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_22a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_22b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_23a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_23b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_23c", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_24", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_25", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_26a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_26b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_26c", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_27a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_27b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_27c", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_28", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_29a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_29b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_29c", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_30a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_30b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_30c", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_31a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_31b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_31c", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_32", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_33a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_33b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_34", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_35", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_36", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_37a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_37b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_37c", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_37d", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_38a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_38b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_38c", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_38d", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_39a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_39b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_39c", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_39d", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_40a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_40b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_40c", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_40d", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_41a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_41b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_41c", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_41d", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_42a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_42b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_42c", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_42d", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_43a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_43b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_44", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_45", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_46", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_47a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_47b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_48a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_line_48b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        //黄线
        reg("yellow_line_1", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("yellow_line_2", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("yellow_line_3", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("yellow_line_4", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("yellow_line_5", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("yellow_line_6", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("yellow_line_7", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("yellow_line_8", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("yellow_line_9", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("yellow_line_10a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("yellow_line_10b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("yellow_line_11a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("yellow_line_11b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("yellow_line_12a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("yellow_line_12b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        //白黄线
        reg("white_yellow_line_1a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_yellow_line_1b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_yellow_line_2a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_yellow_line_2b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_yellow_line_3a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_yellow_line_3b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_yellow_line_4", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_yellow_line_5a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_yellow_line_5b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_yellow_line_5c", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_yellow_line_6a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_yellow_line_6b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_yellow_line_6c", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_yellow_line_7a", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_yellow_line_7b", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_yellow_line_7c", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("white_yellow_line_8", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        //箭头
        reg("white_arrow_1", (id) -> new GenericSlabBlock(id, BlockShapes.TRAFFICLINE));
        reg("white_arrow_2a", (id) -> new GenericSlabBlock(id, BlockShapes.TRAFFICLINE));
        reg("white_arrow_2b", (id) -> new GenericSlabBlock(id, BlockShapes.TRAFFICLINE));
        reg("white_arrow_3a", (id) -> new GenericSlabBlock(id, BlockShapes.TRAFFICLINE));
        reg("white_arrow_3b", (id) -> new GenericSlabBlock(id, BlockShapes.TRAFFICLINE));
        reg("white_arrow_4", (id) -> new GenericSlabBlock(id, BlockShapes.TRAFFICLINE));
        reg("white_arrow_5a", (id) -> new GenericSlabBlock(id, BlockShapes.TRAFFICLINE));
        reg("white_arrow_5b", (id) -> new GenericSlabBlock(id, BlockShapes.TRAFFICLINE));
        reg("white_arrow_6", (id) -> new GenericSlabBlock(id, BlockShapes.TRAFFICLINE));
        reg("white_arrow_7", (id) -> new GenericSlabBlock(id, BlockShapes.TRAFFICLINE));
        reg("white_arrow_8", (id) -> new GenericSlabBlock(id, BlockShapes.TRAFFICLINE));

        //标线
        reg("white_marking_1", (id) -> new GenericSlabBlock(id, BlockShapes.TRAFFICLINE));
        reg("white_marking_2", (id) -> new GenericSlabBlock(id, BlockShapes.TRAFFICLINE));
        reg("white_marking_3", (id) -> new GenericSlabBlock(id, BlockShapes.TRAFFICLINE));
        reg("white_marking_4", (id) -> new GenericSlabBlock(id, BlockShapes.TRAFFICLINE));
        reg("white_marking_5", (id) -> new GenericSlabBlock(id, BlockShapes.TRAFFICLINE));
        reg("white_marking_6", (id) -> new GenericSlabBlock(id, BlockShapes.TRAFFICLINE));
        reg("white_marking_ting", (id) -> new GenericSlabBlock(id, BlockShapes.TRAFFICLINE));
        //沥青路台阶
        reg("asphalt_road_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_asphalt_road_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("yellow_asphalt_road_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));

        //白线台阶
        reg("white_line_1_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_2_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_3_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_4_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_5_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_6_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_7_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_8_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_9a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_9b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_10a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_10b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_11a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_11b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_12a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_12b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_13_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_14_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_15_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_16a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_16b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_17a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_17b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_18a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_18b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_19a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_19b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_20a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_20b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_21a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_21b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_22a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_22b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_23a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_23b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_23c_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_24_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_25_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_26a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_26b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_26c_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_27a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_27b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_27c_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_28_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_29a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_29b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_29c_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_30a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_30b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_30c_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_31a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_31b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_31c_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_32_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_33a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_33b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_34_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_35_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_36_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_37a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_37b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_37c_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_37d_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_38a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_38b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_38c_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_38d_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_39a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_39b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_39c_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_39d_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_40a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_40b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_40c_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_40d_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_41a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_41b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_41c_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_41d_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_42a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_42b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_42c_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_42d_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_43a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_43b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_44_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_45_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_46_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_47a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_47b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_48a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_line_48b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));

        //黄线台阶
        reg("yellow_line_1_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("yellow_line_2_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("yellow_line_3_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("yellow_line_4_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("yellow_line_5_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("yellow_line_6_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("yellow_line_7_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("yellow_line_8_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("yellow_line_9_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("yellow_line_10a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("yellow_line_10b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("yellow_line_11a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("yellow_line_11b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("yellow_line_12a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("yellow_line_12b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        //白黄线台阶
        reg("white_yellow_line_1a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_yellow_line_1b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_yellow_line_2a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_yellow_line_2b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_yellow_line_3a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_yellow_line_3b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_yellow_line_4_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_yellow_line_5a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_yellow_line_5b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_yellow_line_5c_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_yellow_line_6a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_yellow_line_6b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_yellow_line_6c_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_yellow_line_7a_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_yellow_line_7b_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_yellow_line_7c_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        reg("white_yellow_line_8_slab", (id) -> new GenericSignBlock(id, RoadChinaUnoffical.SLAB));
        //柱子
        reg("post_black", (id) -> new GenericPostBlock(id));
        reg("post_gray", (id) -> new GenericPostBlock(id));
        reg("post_silver", (id) -> new GenericPostBlock(id));
        reg("post_blue", (id) -> new GenericPostBlock(id));
        reg("post_white", (id) -> new GenericPostBlock(id));
        reg("thin_post_gray", (id) -> new GenericPostBlock(id));
        reg("thin_post_silver", (id) -> new GenericPostBlock(id));
        reg("thin_post_gray_nc1", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("thin_post_silver_nc1", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("thin_post_gray_base", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("thin_post_silver_base", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("post_gray_base", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("post_silver_base", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("post_black_nc1", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("post_blue_nc1", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("post_gray_nc1", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("post_white_nc1", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
        reg("post_silver_nc1", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
    }

    public static void init() {
        for (var def : RoadChinaUnoffical.BLOCKS) {
            Identifier id = Identifier.fromNamespaceAndPath(MOD_ID, def.id());
            Registry.register(BuiltInRegistries.BLOCK, id, def.factory().apply(id));
        }
        for (var def : RoadChinaUnoffical.BLOCKS) {
            Identifier id = Identifier.fromNamespaceAndPath(MOD_ID, def.id());
            Block block = BuiltInRegistries.BLOCK.get(id)
                    .map(Holder.Reference::value)
                    .orElseThrow(() -> new IllegalStateException("Block not found: " + id));

            Item.Properties props = new Item.Properties();
            props.setId(ResourceKey.create(Registries.ITEM, id));
            Registry.register(BuiltInRegistries.ITEM, id, new ModBlockItem(block, props, def.id()));
        }
        ModCreativeTab.TABS_REGISTER.register();
        ModCreativeTab.appendItems();
    }

    private static void reg(String id, Function<Identifier, ? extends Block> factory) {
        BLOCKS.add(new BlockDef(id, factory));
    }
}