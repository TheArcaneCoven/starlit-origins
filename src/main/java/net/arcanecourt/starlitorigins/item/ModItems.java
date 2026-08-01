package net.arcanecourt.starlitorigins.item;
import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.arcanecourt.starlitorigins.item.advanced.SmallGeodeItem;
import net.arcanecourt.starlitorigins.item.advanced.TeaItem;
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
    public static final RegistryObject<Item> SMALL_GEODE_NETHERRACK = ITEMS.register("small_geode_netherrack", ()  -> new SmallGeodeItem(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_GEODE_CRACKED = ITEMS.register("small_geode_cracked", ()  -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_GEODE_CRACKED_NETHERRACK = ITEMS.register("small_geode_cracked_netherrack", ()  -> new Item(new Item.Properties()));

    //Food items
    public static final RegistryObject<Item> SCULKED_BREAD = ITEMS.register("sculked_bread",() -> new Item(new Item.Properties().food(ModFoods.SCULKED_BREAD)));
    public static final RegistryObject<Item> SCULKED_MEAT = ITEMS.register("sculked_meat",() -> new Item(new Item.Properties().food(ModFoods.SCULKED_MEAT)));
    public static final RegistryObject<Item> ELDRITCH_STEW = ITEMS.register("eldritch_stew",() -> new Item(new Item.Properties().food(ModFoods.ELDRITCH_STEW)));
    public static final RegistryObject<Item> CINDER_INFUSED_COAL = ITEMS.register("cinder_infused_coal", ()  -> new Item(new Item.Properties().food(ModFoods.CINDER_INFUSED_COAL)));
    public static final RegistryObject<Item> AMETHYST_ON_A_STICK = ITEMS.register("amethyst_on_a_stick", ()  -> new Item(new Item.Properties().food(ModFoods.AMETHYST_ON_A_STICK)));
    public static final RegistryObject<Item> AMETHYST_TEA = ITEMS.register("amethyst_tea", ()  -> new TeaItem(new Item.Properties().food(ModFoods.AMETHYST_TEA)));
    public static final RegistryObject<Item> CITRINE_TEA = ITEMS.register("citrine_tea", ()  -> new TeaItem(new Item.Properties().food(ModFoods.CITRINE_TEA)));
    public static final RegistryObject<Item> RAW_EMERALD_GINGERBREAD = ITEMS.register("raw_emerald_gingerbread", () -> new Item(new Item.Properties().food(ModFoods.RAW_EMERALD_GINGERBREAD)));
    public static final RegistryObject<Item> BAKED_EMERALD_GINGERBREAD = ITEMS.register("baked_emerald_gingerbread", () -> new Item(new Item.Properties().food(ModFoods.BAKED_EMERALD_GINGERBREAD)));
    public static final RegistryObject<Item> LITHOSPHERIAN_SALAD = ITEMS.register("lithospherian_salad", () -> new Item(new Item.Properties().food(ModFoods.LITHOSPHERIAN_SALAD)));
    public static final RegistryObject<Item> BLESSED_MIXTURE = ITEMS.register("blessed_mixture", () -> new Item(new Item.Properties().food(ModFoods.BLESSED_MIXTURE)));
    public static final RegistryObject<Item> ARCANE_MIXTURE = ITEMS.register("arcane_mixture", () -> new Item(new Item.Properties().food(ModFoods.ARCANE_MIXTURE)));

    //Origin icons
    public static final RegistryObject<Item> FIRE_DRAGONBORN_ICON = ITEMS.register("fire_dragonborn_icon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICE_DRAGONBORN_ICON = ITEMS.register("ice_dragonborn_icon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHTNING_DRAGONBORN_ICON = ITEMS.register("lightning_dragonborn_icon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOREST_DRAGONBORN_ICON = ITEMS.register("forest_dragonborn_icon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WATER_DRAGONBORN_ICON = ITEMS.register("water_dragonborn_icon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WEREWOLF_ICON = ITEMS.register("werewolf_icon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NECRODARIAN_ICON = ITEMS.register("necrodarian_icon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IGNITED_ICON = ITEMS.register("ignited_icon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VAMPIRE_ICON = ITEMS.register("vampire_icon", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
