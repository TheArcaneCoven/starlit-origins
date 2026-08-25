package net.arcanecourt.starlitorigins.datagen;

import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.arcanecourt.starlitorigins.item.ModItems;
import net.arcanecourt.starlitorigins.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

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
    }

}
