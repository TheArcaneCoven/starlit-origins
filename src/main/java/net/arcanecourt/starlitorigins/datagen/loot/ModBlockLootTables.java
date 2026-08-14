package net.arcanecourt.starlitorigins.datagen.loot;

import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.arcanecourt.starlitorigins.block.ModBlocks;
import net.arcanecourt.starlitorigins.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.add(ModBlocks.SUSPICIOUS_DEEPSLATE.get(),
                block -> createOreDrop(ModBlocks.SUSPICIOUS_DEEPSLATE.get(), ModItems.SMALL_GEODE.get()));

        this.add(ModBlocks.SUSPICIOUS_NETHERRACK.get(),
                block -> createOreDrop(ModBlocks.SUSPICIOUS_NETHERRACK.get(),  ModItems.SMALL_GEODE_NETHERRACK.get()));

        this.add(ModBlocks.SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.SILVER_ORE.get(),  ModItems.RAW_SILVER.get()));
    }



    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
