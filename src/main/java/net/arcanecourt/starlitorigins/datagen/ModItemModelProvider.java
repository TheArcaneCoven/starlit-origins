package net.arcanecourt.starlitorigins.datagen;

import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.arcanecourt.starlitorigins.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.AMETHYST_ON_A_STICK);
        simpleItem(ModItems.AMETHYST_TEA);
        simpleItem(ModItems.ARCANE_MIXTURE);
        simpleItem(ModItems.BLESSED_MIXTURE);
        simpleItem(ModItems.BAKED_EMERALD_GINGERBREAD);
        simpleItem(ModItems.BOILED_GOLD_COATED_CALCITE_EGG);
        simpleItem(ModItems.CINDER_INFUSED_COAL);
        simpleItem(ModItems.CITRINE_TEA);
        simpleItem(ModItems.COOKED_CORDON_BLEU);
        simpleItem(ModItems.ELDRITCH_STEW);
        simpleItem(ModItems.GOLD_COATED_CALCITE_EGG);
        simpleItem(ModItems.LITHOSPHERIAN_SALAD);
        simpleItem(ModItems.MINER_STEW);
        simpleItem(ModItems.POWDERED_DIAMOND);
        simpleItem(ModItems.POWDERED_EMERALD);
        simpleItem(ModItems.POWDERED_GOLD);
        simpleItem(ModItems.POWDERED_LAPIS);
        simpleItem(ModItems.RAW_CORDON_BLEU);
        simpleItem(ModItems.RAW_EMERALD_GINGERBREAD);
        simpleItem(ModItems.SCULK_PASTE);
        simpleItem(ModItems.SMALL_GEODE);
        simpleItem(ModItems.SMALL_GEODE_CRACKED);
        simpleItem(ModItems.SMALL_GEODE_NETHERRACK);
        simpleItem(ModItems.SMALL_GEODE_CRACKED_NETHERRACK);
        simpleItem(ModItems.SILVER_INGOT);
        simpleItem(ModItems.RAW_SILVER);
        simpleItem(ModItems.RAW_SENSOR_TENDRIL);
        simpleItem(ModItems.COOKED_SENSOR_TENDRIL);

        handheldItem(ModItems.SILVER_SWORD);
        handheldItem(ModItems.SILVER_AXE);
        handheldItem(ModItems.SILVER_HOE);
        handheldItem(ModItems.SILVER_PICKAXE);
        handheldItem(ModItems.SILVER_SHOVEL);
    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(StarlitOrigins.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(StarlitOrigins.MOD_ID,"item/" + item.getId().getPath()));
    }
}
