package net.arcanecourt.starlitorigins.item;
import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.arcanecourt.starlitorigins.item.advanced.SmallGeodeItem;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StarlitOrigins.MOD_ID);

    // Food components
    public static final RegistryObject<Item> SCULK_PASTE = ITEMS.register("sculk_paste",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_DIAMOND = ITEMS.register("powdered_diamond",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_EMERALD = ITEMS.register("powdered_emerald",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_GOLD = ITEMS.register("powdered_gold",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_LAPIS = ITEMS.register("powdered_lapis",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_GEODE = ITEMS.register("small_geode", ()  -> new SmallGeodeItem(new Item.Properties()));

    //Food items
    public static final RegistryObject<Item> SCULKED_BREAD = ITEMS.register("sculked_bread",() -> new Item(new Item.Properties().food(ModFoods.SCULKED_BREAD)));
    public static final RegistryObject<Item> SCULKED_MEAT = ITEMS.register("sculked_meat",() -> new Item(new Item.Properties().food(ModFoods.SCULKED_MEAT)));
    public static final RegistryObject<Item> ELDRITCH_STEW = ITEMS.register("eldritch_stew",() -> new Item(new Item.Properties().food(ModFoods.ELDRITCH_STEW)));
    public static final RegistryObject<Item> CINDER_INFUSED_COAL = ITEMS.register("cinder_infused_coal", ()  -> new Item(new Item.Properties().food(ModFoods.CINDER_INFUSED_COAL)));
    public static final RegistryObject<Item> AMETHYST_ON_A_STICK = ITEMS.register("amethyst_on_a_stick", ()  -> new Item(new Item.Properties().food(ModFoods.AMETHYST_ON_A_STICK)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
