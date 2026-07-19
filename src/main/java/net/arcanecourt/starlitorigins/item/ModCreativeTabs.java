package net.arcanecourt.starlitorigins.item;

import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.arcanecourt.starlitorigins.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StarlitOrigins.MOD_ID);

    public static final RegistryObject<CreativeModeTab> STARLIT_ORIGINS_ITEMS = CREATIVE_MODE_TABS.register("starlit_origins_items", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.AMETHYST_ON_A_STICK.get()))
            .title(Component.translatable("creativetab.starlit_origins_items"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.ELDRITCH_STEW.get());
                output.accept(ModItems.SCULKED_BREAD.get());
                output.accept(ModItems.SCULKED_MEAT.get());
                output.accept(ModItems.SCULK_PASTE.get());

                output.accept(ModItems.POWDERED_DIAMOND.get());
                output.accept(ModItems.POWDERED_EMERALD.get());
                output.accept(ModItems.POWDERED_GOLD.get());
                output.accept(ModItems.POWDERED_LAPIS.get());
                output.accept(ModItems.SMALL_GEODE.get());
                output.accept(ModItems.AMETHYST_ON_A_STICK.get());

                output.accept(ModItems.CINDER_INFUSED_COAL.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
