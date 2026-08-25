package net.arcanecourt.starlitorigins.item;
import net.arcanecourt.starlitorigins.ModToolTiers;
import net.arcanecourt.starlitorigins.StarlitOrigins;
import net.arcanecourt.starlitorigins.item.advanced.SculkDrinkItem;
import net.arcanecourt.starlitorigins.item.advanced.SmallGeodeItem;
import net.arcanecourt.starlitorigins.item.advanced.TeaItem;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.FoodValues;

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
    public static final RegistryObject<Item> GOLD_COATED_CALCITE_EGG = ITEMS.register("gold_coated_calcite_egg", ()  -> new Item(new Item.Properties()));

    //Food items
    public static final RegistryObject<Item> FUNGAL_BROCHETTE = ITEMS.register("fungal_brochette", ()  -> new Item(new Item.Properties().food(FoodValues.BARBECUE_STICK)));
    public static final RegistryObject<Item> TIMELESS_ALE = ITEMS.register("timeless_ale", () -> new SculkDrinkItem(new Item.Properties().food(ModFoods.TIMELESS_ALE)));
    public static final RegistryObject<Item> DARK_TEA = ITEMS.register("dark_tea", () -> new SculkDrinkItem(new Item.Properties().food(ModFoods.DARK_TEA)));
    public static final RegistryObject<Item> OVERTAKEN_BERRY_MIX = ITEMS.register("overtaken_berry_mix", ()  -> new Item(new Item.Properties().food(FoodValues.FRUIT_SALAD)));
    public static final RegistryObject<Item> RAW_SENSOR_TENDRIL = ITEMS.register("raw_sensor_tendril", ()  -> new Item(new Item.Properties().food(Foods.POTATO)));
    public static final RegistryObject<Item> COOKED_SENSOR_TENDRIL = ITEMS.register("cooked_sensor_tendril", ()  -> new Item(new Item.Properties().food(Foods.BAKED_POTATO)));
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
    public static final RegistryObject<Item> RAW_CORDON_BLEU = ITEMS.register("raw_cordon_bleu", () -> new Item(new Item.Properties().food(ModFoods.RAW_CORDON_BLEU)));
    public static final RegistryObject<Item> COOKED_CORDON_BLEU = ITEMS.register("cooked_cordon_bleu", () -> new Item(new Item.Properties().food(ModFoods.COOKED_CORDON_BLEU)));
    public static final RegistryObject<Item> MINER_STEW = ITEMS.register("miner_stew",  () -> new Item(new Item.Properties().food(ModFoods.MINER_STEW).food(ModFoods.MINER_STEW)));
    public static final RegistryObject<Item> BOILED_GOLD_COATED_CALCITE_EGG = ITEMS.register("boiled_gold_coated_calcite_egg", ()  -> new Item(new Item.Properties().food(ModFoods.BOILED_GOLD_COATED_CALCITE_EGG)));

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
    public static final RegistryObject<Item> VOIDKIN_ICON = ITEMS.register("voidkin_icon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOBLIN_ICON = ITEMS.register("goblin_icon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VOID_ELF_ICON = ITEMS.register("void_elf_icon", () -> new Item(new Item.Properties()));

    // Misc
    public static final RegistryObject<Item> RAW_SILVER =  ITEMS.register("raw_silver", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_INGOT =  ITEMS.register("silver_ingot", () -> new Item(new Item.Properties()));

    // Tools
    public static final RegistryObject<Item> SILVER_SWORD =  ITEMS.register("silver_sword", () -> new SwordItem(ModToolTiers.SILVER, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_PICKAXE =  ITEMS.register("silver_pickaxe", () -> new PickaxeItem(ModToolTiers.SILVER, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_AXE =  ITEMS.register("silver_axe", () -> new AxeItem(ModToolTiers.SILVER, 6, -3.1f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SHOVEL =  ITEMS.register("silver_shovel", () -> new ShovelItem(ModToolTiers.SILVER, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_HOE =  ITEMS.register("silver_hoe", () -> new HoeItem(ModToolTiers.SILVER, -2, -1.0f, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
