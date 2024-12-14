package net.unkown.industrial_age.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.unkown.industrial_age.Industrial_Age;
import net.unkown.industrial_age.block.ModBlocks;

import javax.swing.*;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Industrial_Age.MOD_ID);

    public static final RegistryObject<CreativeModeTab> INDUSTRIAL_AGE_TAB = CREATIVE_MODE_TABS.register("industrial_age_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_RUTILE.get()))
                    .title(Component.translatable("creativetab.industrial_age_tab"))
                    .displayItems((itemDisplayParameters, pOutput) -> {

                        //raw ores
                        pOutput.accept(ModItems.RAW_ZINC.get());
                        pOutput.accept(ModItems.RAW_TIN.get());
                        pOutput.accept(ModItems.RAW_TITANOMAGNETITE.get());
                        pOutput.accept(ModItems.RAW_RUTILE.get());
                        pOutput.accept(ModItems.RAW_LEAD.get());
                        pOutput.accept(ModItems.RAW_DOLOMITE.get());
                        pOutput.accept(ModItems.RAW_MAGNETITE.get());
                        pOutput.accept(ModItems.RAW_WOLFRAMITE.get());

                        //ores
                        pOutput.accept(ModBlocks.ZINC_ORE.get());
                        pOutput.accept(ModBlocks.TIN_ORE.get());
                        pOutput.accept(ModBlocks.TITANOMAGNETITE_ORE.get());
                        pOutput.accept(ModBlocks.RUTILE_ORE.get());
                        pOutput.accept(ModBlocks.LEAD_ORE.get());
                        pOutput.accept(ModBlocks.DOLOMITE_ORE.get());
                        pOutput.accept(ModBlocks.MAGNETITE_ORE.get());
                        pOutput.accept(ModBlocks.BAUXITE.get());
                        pOutput.accept(ModBlocks.WOLFRAMITE_ORE.get());

                        //metal blocks
                        pOutput.accept(ModBlocks.ZINC_BLOCK.get());
                        pOutput.accept(ModBlocks.TIN_BLOCK.get());
                        pOutput.accept(ModBlocks.TITANIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.LEAD_BLOCK.get());
                        pOutput.accept(ModBlocks.MAGNESIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.ALUMINUM_BLOCK.get());
                        pOutput.accept(ModBlocks.WOLFRAM_BLOCK.get());

                        //alloy blocks
                        pOutput.accept(ModBlocks.BRASS_BLOCK.get());
                        pOutput.accept(ModBlocks.BRONZE_BLOCK.get());
                        pOutput.accept(ModBlocks.DURALUMIN_BLOCK.get());
                        pOutput.accept(ModBlocks.SILUMIN_BLOCK.get());
                        pOutput.accept(ModBlocks.TITANOSTEEL_BLOCK.get());
                        pOutput.accept(ModBlocks.CAST_IRON_BLOCK.get());
                        pOutput.accept(ModBlocks.STAINLESS_STEEL_BLOCK.get());
                        pOutput.accept(ModBlocks.TZ_BLOCK.get());

                        //metal ingots
                        pOutput.accept(ModItems.ZINC_INGOT.get());
                        pOutput.accept(ModItems.TIN_INGOT.get());
                        pOutput.accept(ModItems.TITANIUM_INGOT.get());
                        pOutput.accept(ModItems.LEAD_INGOT.get());
                        pOutput.accept(ModItems.MAGNESIUM_INGOT.get());
                        pOutput.accept(ModItems.ALUMINUM_INGOT.get());
                        pOutput.accept(ModItems.WOLFRAM_INGOT.get());

                        //alloy ingots
                        pOutput.accept(ModItems.BRASS_INGOT.get());
                        pOutput.accept(ModItems.BRONZE_INGOT.get());
                        pOutput.accept(ModItems.DURALUMIN_INGOT.get());
                        pOutput.accept(ModItems.SILUMIN_INGOT.get());
                        pOutput.accept(ModItems.TITANOSTEEL_INGOT.get());
                        pOutput.accept(ModItems.CAST_IRON_INGOT.get());
                        pOutput.accept(ModItems.STAINLESS_STEEL_INGOT.get());
                        pOutput.accept(ModItems.TZ_INGOT.get());

                        //gears
                        pOutput.accept(ModItems.IRON_GEAR.get());
                        pOutput.accept(ModItems.ALUMINUM_INGOT.get());
                        pOutput.accept(ModItems.BRASS_GEAR.get());
                        pOutput.accept(ModItems.BRONZE_GEAR.get());
                        pOutput.accept(ModItems.TITANOSTEEL_GEAR.get());
                        pOutput.accept(ModItems.CAST_IRON_GEAR.get());
                        pOutput.accept(ModItems.TIN_GEAR.get());

                        //rods
                        pOutput.accept(ModItems.ALUMINUM_ROD.get());
                        pOutput.accept(ModItems.IRON_ROD.get());
                        pOutput.accept(ModItems.BRASS_ROD.get());
                        pOutput.accept(ModItems.BRONZE_ROD.get());
                        pOutput.accept(ModItems.COPPER_ROD.get());
                        pOutput.accept(ModItems.CAST_IRON_ROD.get());
                        pOutput.accept(ModItems.STAINLESS_STEEL_ROD.get());
                        pOutput.accept(ModItems.SILUMIN_ROD.get());
                        pOutput.accept(ModItems.TZ_ROD.get());
                        pOutput.accept(ModItems.TITANOSTEEL_ROD.get());

                        //shafts
                        pOutput.accept(ModItems.TITANOSTEEL_SHAFT.get());
                        pOutput.accept(ModItems.IRON_SHAFT.get());
                        pOutput.accept(ModItems.BRASS_SHAFT.get());
                        pOutput.accept(ModItems.BRONZE_SHAFT.get());
                        pOutput.accept(ModItems.CAST_IRON_SHAFT.get());

                        //sheets
                        pOutput.accept(ModItems.ALUMINUM_SHEET.get());
                        pOutput.accept(ModItems.BRASS_SHEET.get());
                        pOutput.accept(ModItems.BRONZE_SHEET.get());
                        pOutput.accept(ModItems.COPPER_SHEET.get());
                        pOutput.accept(ModItems.DURALUMIN_SHEET.get());
                        pOutput.accept(ModItems.IRON_SHEET.get());
                        pOutput.accept(ModItems.SILUMIN_SHEET.get());
                        pOutput.accept(ModItems.STAINLESS_STEEL_SHEET.get());
                        pOutput.accept(ModItems.TITANOSTEEL_SHEET.get());
                        pOutput.accept(ModItems.TZ_SHEET.get());

                        //platings
                        pOutput.accept(ModItems.ALUMINUM_PLATING.get());
                        pOutput.accept(ModItems.BRASS_PLATING.get());
                        pOutput.accept(ModItems.BRONZE_PLATING.get());
                        pOutput.accept(ModItems.DURALUMIN_PLATING.get());
                        pOutput.accept(ModItems.IRON_PLATING.get());
                        pOutput.accept(ModItems.STAINLESS_STEEL_PLATING.get());
                        pOutput.accept(ModItems.TZ_PLATING.get());
                        pOutput.accept(ModItems.SILUMIN_PLATING.get());

                        //crop stuff
                        pOutput.accept(ModItems.CANOLA_SEEDS.get());
                        pOutput.accept(ModItems.RAW_CANOLA.get());

                        //random
                        pOutput.accept(ModItems.SLAG.get());

                        //tools
                        pOutput.accept(ModItems.HAMMER.get());
                        pOutput.accept(ModItems.SAW.get());
                        pOutput.accept(ModItems.WIRECUTTERS.get());
                        pOutput.accept(ModItems.FILE.get());
                        pOutput.accept(ModItems.WRENCH.get());
                        pOutput.accept(ModItems.FOUNDRY_BASIC_FORM_GEAR.get());
                        pOutput.accept(ModItems.FOUNDRY_BASIC_FORM_INGOT.get());
                        pOutput.accept(ModItems.FOUNDRY_BASIC_FORM_PLATE.get());
                        pOutput.accept(ModItems.FOUNDRY_BASIC_FORM_ROD.get());

                        pOutput.accept(ModItems.JAW_CRUSHER_BASIC_BELT.get());


                        //custom machines
                        pOutput.accept(ModBlocks.BASIC_FOUNDRY_FURNACE.get());
                        pOutput.accept(ModBlocks.BASIC_JAW_CRUSHER.get());

                        //fluids
                        pOutput.accept(ModItems.MOLTEN_TIN_BUCKET.get());





                    })
                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
