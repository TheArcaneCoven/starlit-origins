package net.arcanecourt.starlitorigins.datagen;

import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.arcanecourt.starlitorigins.item.ModItems;
import net.arcanecourt.starlitorigins.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.tag.CommonTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, StarlitOrigins.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Items.IS_SCULK_FOOD)
                .add(ModItems.FUNGAL_BROCHETTE.get(),
                        ModItems.RAW_SENSOR_TENDRIL.get(),
                        ModItems.ELDRITCH_STEW.get(),
                        ModItems.COOKED_SENSOR_TENDRIL.get(),
                        ModItems.OVERTAKEN_BERRY_MIX.get(),
                        ModItems.TIMELESS_ALE.get(),
                        ModItems.DARK_TEA.get());

        this.tag(ModTags.Items.POWDERED_ORES)
                .add(ModItems.POWDERED_DIAMOND.get(),
                        ModItems.POWDERED_LAPIS.get(),
                        ModItems.POWDERED_GOLD.get(),
                        ModItems.POWDERED_EMERALD.get());

        this.tag(ModTags.Items.IS_MINERAL_FOOD)
                .add(ModItems.AMETHYST_ON_A_STICK.get(),
                        ModItems.ARCANE_MIXTURE.get(),
                        ModItems.BAKED_EMERALD_GINGERBREAD.get(),
                        ModItems.BLESSED_MIXTURE.get(),
                        ModItems.CINDER_INFUSED_COAL.get(),
                        ModItems.BOILED_GOLD_COATED_CALCITE_EGG.get(),
                        ModItems.COOKED_CORDON_BLEU.get(),
                        ModItems.LITHOSPHERIAN_SALAD.get(),
                        ModItems.MINER_STEW.get(),
                        ModItems.RAW_CORDON_BLEU.get(),
                        ModItems.RAW_EMERALD_GINGERBREAD.get()
                );

        this.tag(ModTags.Items.CHARREABLE_VEGETABLES)
                .add(Items.CARROT,
                        Items.BAKED_POTATO,
                        Items.BEETROOT,
                        Items.DRIED_KELP,
                        Items.CRIMSON_FUNGUS,
                        Items.WARPED_FUNGUS,
                        vectorwing.farmersdelight.common.registry.ModItems.CABBAGE.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.TOMATO.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.ONION.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.PUMPKIN_SLICE.get()
                        );

        this.tag(ModTags.Items.CHARREABLE_MEATS)
                .add(
                        Items.COOKED_BEEF,
                        Items.COOKED_CHICKEN,
                        Items.COOKED_MUTTON,
                        Items.COOKED_PORKCHOP,
                        Items.COOKED_RABBIT,
                        vectorwing.farmersdelight.common.registry.ModItems.SMOKED_HAM.get()
                );

        this.tag(ModTags.Items.CHARREABLE_FISH)
                .add(
                        Items.COOKED_COD,
                        Items.COOKED_SALMON
                );

        this.tag(ModTags.Items.CHARRED_FOOD)
                .add(
                        ModItems.CHARRED_FISH.get(),
                        ModItems.CHARRED_MEAT.get(),
                        ModItems.CHARRED_VEGETABLE.get()

                );

        this.tag(ModTags.Items.IS_SILVER)
                .add(
                        ModItems.SILVER_AXE.get(),
                        ModItems.SILVER_PICKAXE.get(),
                        ModItems.SILVER_SHOVEL.get(),
                        ModItems.SILVER_HOE.get(),
                        ModItems.SILVER_SWORD.get(),
                        ModItems.SILVER_INGOT.get(),
                        ModItems.RAW_SILVER.get()
                );

        this.tag(ModTags.Items.IS_FLEXITARIAN_FOOD)
                .add(
                        Items.APPLE,
                        Items.GOLDEN_APPLE,
                        Items.ENCHANTED_GOLDEN_APPLE,
                        Items.MELON_SLICE,
                        Items.GLOW_BERRIES,
                        Items.CHORUS_FRUIT,
                        Items.CARROT,
                        Items.GOLDEN_CARROT,
                        Items.POTATO,
                        Items.BAKED_POTATO,
                        Items.POISONOUS_POTATO,
                        Items.BEETROOT,
                        Items.DRIED_KELP,
                        Items.BREAD,
                        Items.COOKIE,
                        Items.MUSHROOM_STEW,
                        Items.BEETROOT_SOUP,
                        Items.SUSPICIOUS_STEW,
                        vectorwing.farmersdelight.common.registry.ModItems.CABBAGE.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.TOMATO.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.ONION.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.TOMATO_SAUCE.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.WHEAT_DOUGH.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.RAW_PASTA.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.PUMPKIN_SLICE.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.CABBAGE_LEAF.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.CAKE_SLICE.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.APPLE_PIE_SLICE.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.SWEET_BERRY_CHEESECAKE_SLICE.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.CHOCOLATE_PIE_SLICE.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.PUMPKIN_PIE_SLICE.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.SWEET_BERRY_COOKIE.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.HONEY_COOKIE.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.MELON_POPSICLE.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.MELON_JUICE.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.GLOW_BERRY_CUSTARD.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.FRUIT_SALAD.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.MIXED_SALAD.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.NETHER_SALAD.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.HOT_COCOA.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.APPLE_CIDER.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.CABBAGE_ROLLS.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.KELP_ROLL.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.KELP_ROLL_SLICE.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.COOKED_RICE.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.VEGETABLE_SOUP.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.FRIED_RICE.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.PUMPKIN_SOUP.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.BAKED_COD_STEW.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.NOODLE_SOUP.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.ONION_SOUP.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.MUSHROOM_RICE.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.VEGETABLE_NOODLES.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.RATATOUILLE.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.SQUID_INK_PASTA.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.STUFFED_PUMPKIN.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.GLEAMING_SALAD.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.FRIED_EGG.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.EGG_SANDWICH.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.STUFFED_POTATO.get()
                );

                this.tag(ModTags.Items.MAGE_ARMORS)
                        .add(
                                Items.CHAINMAIL_HELMET,
                                Items.CHAINMAIL_CHESTPLATE,
                                Items.CHAINMAIL_LEGGINGS,
                                Items.CHAINMAIL_BOOTS,

                                Items.IRON_HELMET,
                                Items.IRON_CHESTPLATE,
                                Items.IRON_BOOTS,
                                Items.IRON_LEGGINGS,

                                Items.LEATHER_HELMET,
                                Items.LEATHER_CHESTPLATE,
                                Items.LEATHER_BOOTS,
                                Items.LEATHER_LEGGINGS,

                                Items.GOLDEN_HELMET,
                                Items.GOLDEN_CHESTPLATE,
                                Items.GOLDEN_LEGGINGS,
                                Items.GOLDEN_BOOTS,

                                ItemRegistry.ARCHEVOKER_HELMET.get(),
                                ItemRegistry.ARCHEVOKER_CHESTPLATE.get(),
                                ItemRegistry.ARCHEVOKER_LEGGINGS.get(),
                                ItemRegistry.ARCHEVOKER_BOOTS.get(),

                                ItemRegistry.CULTIST_HELMET.get(),
                                ItemRegistry.CULTIST_CHESTPLATE.get(),
                                ItemRegistry.CULTIST_LEGGINGS.get(),
                                ItemRegistry.CULTIST_BOOTS.get(),

                                ItemRegistry.PRIEST_HELMET.get(),
                                ItemRegistry.PRIEST_CHESTPLATE.get(),
                                ItemRegistry.PRIEST_LEGGINGS.get(),
                                ItemRegistry.PRIEST_BOOTS.get(),
                                ItemRegistry.PALADIN_CHESTPLATE.get(),

                                ItemRegistry.ELECTROMANCER_HELMET.get(),
                                ItemRegistry.ELECTROMANCER_CHESTPLATE.get(),
                                ItemRegistry.ELECTROMANCER_LEGGINGS.get(),
                                ItemRegistry.ELECTROMANCER_BOOTS.get(),
                                ItemRegistry.BOOTS_OF_SPEED.get(),

                                ItemRegistry.PYROMANCER_HELMET.get(),
                                ItemRegistry.PYROMANCER_CHESTPLATE.get(),
                                ItemRegistry.PYROMANCER_LEGGINGS.get(),
                                ItemRegistry.PYROMANCER_BOOTS.get(),
                                ItemRegistry.INFERNAL_SORCERER_CHESTPLATE.get(),

                                ItemRegistry.PLAGUED_HELMET.get(),
                                ItemRegistry.PLAGUED_CHESTPLATE.get(),
                                ItemRegistry.PLAGUED_LEGGINGS.get(),
                                ItemRegistry.PLAGUED_BOOTS.get(),

                                ItemRegistry.CRYOMANCER_HELMET.get(),
                                ItemRegistry.CRYOMANCER_CHESTPLATE.get(),
                                ItemRegistry.CRYOMANCER_LEGGINGS.get(),
                                ItemRegistry.CRYOMANCER_BOOTS.get(),

                                ItemRegistry.SHADOWWALKER_HELMET.get(),
                                ItemRegistry.SHADOWWALKER_CHESTPLATE.get(),
                                ItemRegistry.SHADOWWALKER_LEGGINGS.get(),
                                ItemRegistry.SHADOWWALKER_BOOTS.get()
                        );
    }

}
