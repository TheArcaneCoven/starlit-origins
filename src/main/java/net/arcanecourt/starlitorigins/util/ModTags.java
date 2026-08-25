package net.arcanecourt.starlitorigins.util;

import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_SILVER_TOOL = tag("needs_silver_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(StarlitOrigins.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> IS_SILVER = tag("is_silver");
        public static final TagKey<Item> IS_SCULK_FOOD = tag("is_sculk_food");
        public static final TagKey<Item> IS_MINERAL_FOOD = tag("is_mineral_food");
        public static final TagKey<Item> POWDERED_ORES = tag("powdered_ores");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(StarlitOrigins.MOD_ID, name));
        }
    }
}
