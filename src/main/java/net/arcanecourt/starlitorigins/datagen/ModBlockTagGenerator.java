package net.arcanecourt.starlitorigins.datagen;

import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.arcanecourt.starlitorigins.block.ModBlocks;
import net.arcanecourt.starlitorigins.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {


    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, StarlitOrigins.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(Tags.Blocks.ORES)
                .add(ModBlocks.SUSPICIOUS_DEEPSLATE.get(),
                        ModBlocks.SUSPICIOUS_NETHERRACK.get(),
                        ModBlocks.SILVER_ORE.get());

        this.tag(Tags.Blocks.ORES_IN_GROUND_NETHERRACK)
                .add(ModBlocks.SUSPICIOUS_NETHERRACK.get());

        this.tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
                .add(ModBlocks.SUSPICIOUS_DEEPSLATE.get());

        this.tag(Tags.Blocks.ORES_IN_GROUND_STONE)
                .add(ModBlocks.SILVER_ORE.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SUSPICIOUS_NETHERRACK.get(),
                        ModBlocks.SUSPICIOUS_DEEPSLATE.get(),
                        ModBlocks.SILVER_ORE.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SUSPICIOUS_DEEPSLATE.get(),
                        ModBlocks.SUSPICIOUS_NETHERRACK.get(),
                        ModBlocks.SILVER_ORE.get());

        this.tag(ModTags.Blocks.NEEDS_SILVER_TOOL);
    }

}
