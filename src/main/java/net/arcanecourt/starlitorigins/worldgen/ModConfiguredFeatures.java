package net.arcanecourt.starlitorigins.worldgen;

import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.arcanecourt.starlitorigins.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> SUSPICIOUS_DEEPSLATE_KEY = registerKey("suspicious_deepslate");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SUSPICIOUS_NETHERRACK_KEY = registerKey("suspicious_netherrack");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_ORE_KEY = registerKey("silver_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest deepslateReplaceables = new BlockMatchTest(Blocks.DEEPSLATE);
        RuleTest stoneReplaceables = new BlockMatchTest(Blocks.STONE);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);

        register(context, SUSPICIOUS_DEEPSLATE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables,
                ModBlocks.SUSPICIOUS_DEEPSLATE.get().defaultBlockState(),
                5));
        register(context, SUSPICIOUS_NETHERRACK_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.SUSPICIOUS_NETHERRACK.get().defaultBlockState(),
                5));
        register(context, SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables,
                ModBlocks.SILVER_ORE.get().defaultBlockState(),
                5));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(StarlitOrigins.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
