package net.arcanecourt.starlitorigins.util;

import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import javax.swing.text.html.HTML;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_SILVER_TOOL = tag("needs_silver_tool");
        public static final TagKey<Block> WARM_BLOCKS = tag("warm_blocks");
        public static final TagKey<Block> GOLDEN_BLOCKS = tag("golden_blocks");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(StarlitOrigins.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> IS_SILVER = tag("is_silver");

        public static final TagKey<Item> IS_SCULK_FOOD = tag("is_sculk_food");
        public static final TagKey<Item> IS_MINERAL_FOOD = tag("is_mineral_food");
        public static final TagKey<Item> POWDERED_ORES = tag("powdered_ores");

        public static final TagKey<Item> CHARREABLE_VEGETABLES = tag("charreable_vegetables");
        public static final TagKey<Item> CHARREABLE_MEATS = tag("charreable_meats");
        public static final TagKey<Item> CHARREABLE_FISH = tag("charreable_fish");
        public static final TagKey<Item> CHARRED_FOOD = tag("charred_food");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(StarlitOrigins.MOD_ID, name));
        }
    }
}
