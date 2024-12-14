package net.unkown.industrial_age.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.unkown.industrial_age.Industrial_Age;
import net.unkown.industrial_age.block.ModBlocks;
import net.unkown.industrial_age.fluid.ModFluids;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Industrial_Age.MOD_ID);

    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TITANOMAGNETITE = ITEMS.register("raw_titanomagnetite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RUTILE = ITEMS.register("raw_rutile",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_DOLOMITE = ITEMS.register("raw_dolomite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MAGNETITE = ITEMS.register("raw_magnetite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_WOLFRAMITE = ITEMS.register("raw_wolframite",
            () -> new Item(new Item.Properties()));

    //crushed ores
    public static final RegistryObject<Item> CRUSHED_ZINC = ITEMS.register("crushed_zinc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_TIN = ITEMS.register("crushed_tin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_TITANOMAGNETITE = ITEMS.register("crushed_titanomagnetite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_RUTILE = ITEMS.register("crushed_rutile",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_LEAD = ITEMS.register("crushed_lead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_DOLOMITE = ITEMS.register("crushed_dolomite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_MAGNETITE = ITEMS.register("crushed_magnetite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_WOLFRAMITE = ITEMS.register("crushed_wolframite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGNESIUM_INGOT = ITEMS.register("magnesium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOLFRAM_INGOT = ITEMS.register("wolfram_ingot",
            () -> new Item(new Item.Properties()));

    //alloys
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DURALUMIN_INGOT = ITEMS.register("duralumin_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILUMIN_INGOT = ITEMS.register("silumin_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANOSTEEL_INGOT = ITEMS.register("titanosteel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAST_IRON_INGOT = ITEMS.register("cast_iron_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STAINLESS_STEEL_INGOT = ITEMS.register("stainless_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TZ_INGOT = ITEMS.register("tz_ingot",
            () -> new Item(new Item.Properties()));

    //gears
    public static final RegistryObject<Item> IRON_GEAR = ITEMS.register("iron_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_GEAR = ITEMS.register("aluminum_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_GEAR = ITEMS.register("brass_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_GEAR = ITEMS.register("bronze_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_GEAR = ITEMS.register("tin_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAST_IRON_GEAR = ITEMS.register("cast_iron_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANOSTEEL_GEAR = ITEMS.register("titanosteel_gear",
            () -> new Item(new Item.Properties()));

    //rods
    public static final RegistryObject<Item> IRON_ROD = ITEMS.register("iron_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_ROD = ITEMS.register("aluminum_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_ROD = ITEMS.register("brass_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_ROD = ITEMS.register("bronze_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ROD = ITEMS.register("copper_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAST_IRON_ROD = ITEMS.register("cast_iron_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILUMIN_ROD = ITEMS.register("silumin_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STAINLESS_STEEL_ROD = ITEMS.register("stainless_steel_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANOSTEEL_ROD = ITEMS.register("titanosteel_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TZ_ROD = ITEMS.register("tz_rod",
            () -> new Item(new Item.Properties()));

    //shaft
    public static final RegistryObject<Item> IRON_SHAFT = ITEMS.register("iron_shaft",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_SHAFT = ITEMS.register("brass_shaft",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SHAFT = ITEMS.register("bronze_shaft",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAST_IRON_SHAFT = ITEMS.register("cast_iron_shaft",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANOSTEEL_SHAFT = ITEMS.register("titanosteel_shaft",
            () -> new Item(new Item.Properties()));

    //sheets
    public static final RegistryObject<Item> ALUMINUM_SHEET = ITEMS.register("aluminum_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_SHEET = ITEMS.register("brass_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SHEET = ITEMS.register("bronze_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHEET = ITEMS.register("copper_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DURALUMIN_SHEET = ITEMS.register("duralumin_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_SHEET = ITEMS.register("iron_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILUMIN_SHEET = ITEMS.register("silumin_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STAINLESS_STEEL_SHEET = ITEMS.register("stainless_steel_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANOSTEEL_SHEET = ITEMS.register("titanosteel_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TZ_SHEET = ITEMS.register("tz_sheet",
            () -> new Item(new Item.Properties()));

    //plating
    public static final RegistryObject<Item> ALUMINUM_PLATING = ITEMS.register("aluminum_plating",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_PLATING = ITEMS.register("brass_plating",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_PLATING = ITEMS.register("bronze_plating",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DURALUMIN_PLATING = ITEMS.register("duralumin_plating",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_PLATING = ITEMS.register("iron_plating",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILUMIN_PLATING = ITEMS.register("silumin_plating",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STAINLESS_STEEL_PLATING = ITEMS.register("stainless_steel_plating",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TZ_PLATING = ITEMS.register("tz_plating",
            () -> new Item(new Item.Properties()));

    //buckets with molten metals
    public static final RegistryObject<Item> MOLTEN_TIN_BUCKET = ITEMS.register("molten_tin_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_TIN, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    //toolz
    public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer",
            () -> new ModTools(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WIRECUTTERS = ITEMS.register("wirecutters",
            () -> new ModTools(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SAW = ITEMS.register("saw",
            () -> new ModTools(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FILE = ITEMS.register("file",
            () -> new ModTools(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WRENCH = ITEMS.register("wrench",
            () -> new ModTools(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FOUNDRY_BASIC_FORM_GEAR = ITEMS.register("foundry_basic_form_gear",
            () -> new ModTools(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FOUNDRY_BASIC_FORM_PLATE = ITEMS.register("foundry_basic_form_plate",
            () -> new ModTools(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FOUNDRY_BASIC_FORM_ROD = ITEMS.register("foundry_basic_form_rod",
            () -> new ModTools(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FOUNDRY_BASIC_FORM_INGOT = ITEMS.register("foundry_basic_form_ingot",
            () -> new ModTools(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> JAW_CRUSHER_BASIC_BELT = ITEMS.register("jaw_crusher_basic_belt",
            () -> new ModTools(new Item.Properties().stacksTo(1)));




    public static final RegistryObject<Item> CANOLA_SEEDS = ITEMS.register("canola_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CANOLA_CROP.get(), new  Item.Properties()));
    public static final RegistryObject<Item> RAW_CANOLA= ITEMS.register("raw_canola",
            () -> new Item(new Item.Properties()));

    //idk random stuff
    public static final RegistryObject<Item> SLAG = ITEMS.register("slag",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
