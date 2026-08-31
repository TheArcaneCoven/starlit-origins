package net.arcanecourt.starlitorigins.item;

import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.arcanecourt.starlitorigins.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = StarlitOrigins.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StarlitOrigins.MOD_ID);

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> STARLIT_ORIGINS_ITEMS = CREATIVE_MODE_TABS.register("starlit_origins_items", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.AMETHYST_ON_A_STICK.get()))
            .title(Component.translatable("creativetab.starlit_origins_items"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.ELDRITCH_STEW.get());
                output.accept(ModItems.OVERTAKEN_BERRY_MIX.get());
                output.accept(ModItems.FUNGAL_BROCHETTE.get());
                output.accept(ModItems.RAW_SENSOR_TENDRIL.get());
                output.accept(ModItems.COOKED_SENSOR_TENDRIL.get());
                output.accept(ModItems.SCULK_PASTE.get());
                output.accept(ModItems.TIMELESS_ALE.get());
                output.accept(ModItems.DARK_TEA.get());

                output.accept(ModItems.POWDERED_DIAMOND.get());
                output.accept(ModItems.POWDERED_EMERALD.get());
                output.accept(ModItems.POWDERED_GOLD.get());
                output.accept(ModItems.POWDERED_LAPIS.get());
                output.accept(ModItems.GOLD_COATED_CALCITE_EGG.get());
                output.accept(ModBlocks.SUSPICIOUS_DEEPSLATE.get());
                output.accept(ModBlocks.SUSPICIOUS_NETHERRACK.get());
                output.accept(ModItems.SMALL_GEODE.get());
                output.accept(ModItems.SMALL_GEODE_NETHERRACK.get());
                output.accept(ModItems.SMALL_GEODE_CRACKED.get());
                output.accept(ModItems.SMALL_GEODE_CRACKED_NETHERRACK.get());

                output.accept(ModItems.AMETHYST_TEA.get());
                output.accept(ModItems.CITRINE_TEA.get());
                output.accept(ModItems.AMETHYST_ON_A_STICK.get());
                output.accept(ModItems.RAW_EMERALD_GINGERBREAD.get());
                output.accept(ModItems.BAKED_EMERALD_GINGERBREAD.get());
                output.accept(ModItems.LITHOSPHERIAN_SALAD.get());
                output.accept(ModItems.RAW_CORDON_BLEU.get());
                output.accept(ModItems.COOKED_CORDON_BLEU.get());
                output.accept(ModItems.BOILED_GOLD_COATED_CALCITE_EGG.get());
                output.accept(ModItems.BLESSED_MIXTURE.get());
                output.accept(ModItems.ARCANE_MIXTURE.get());
                output.accept(ModItems.MINER_STEW.get());

                output.accept(ModItems.CINDER_INFUSED_COAL.get());
                output.accept(ModItems.CHARRED_MEAT.get());
                output.accept(ModItems.CHARRED_FISH.get());
                output.accept(ModItems.CHARRED_VEGETABLE.get());

                output.accept(ModBlocks.SILVER_ORE.get());
                output.accept(ModItems.RAW_SILVER.get());
                output.accept(ModItems.SILVER_INGOT.get());
                output.accept(ModItems.SILVER_SWORD.get());
                output.accept(ModItems.SILVER_PICKAXE.get());
                output.accept(ModItems.SILVER_SHOVEL.get());
                output.accept(ModItems.SILVER_HOE.get());
                output.accept(ModItems.SILVER_AXE.get());
            })
            .build());

}
