package net.unkown.industrial_age.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.unkown.industrial_age.Industrial_Age;
import net.unkown.industrial_age.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Industrial_Age.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RAW_ZINC);
        simpleItem(ModItems.RAW_TIN);
        simpleItem(ModItems.RAW_TITANOMAGNETITE);
        simpleItem(ModItems.RAW_RUTILE);
        simpleItem(ModItems.RAW_LEAD);
        simpleItem(ModItems.RAW_DOLOMITE);
        simpleItem(ModItems.RAW_MAGNETITE);
        simpleItem(ModItems.RAW_WOLFRAMITE);

        simpleItem(ModItems.CRUSHED_ZINC);
        simpleItem(ModItems.CRUSHED_TIN);
        simpleItem(ModItems.CRUSHED_TITANOMAGNETITE);
        simpleItem(ModItems.CRUSHED_RUTILE);
        simpleItem(ModItems.CRUSHED_DOLOMITE);
        simpleItem(ModItems.CRUSHED_LEAD);
        simpleItem(ModItems.CRUSHED_MAGNETITE);
        simpleItem(ModItems.CRUSHED_WOLFRAMITE);

        simpleItem(ModItems.ZINC_INGOT);
        simpleItem(ModItems.TIN_INGOT);
        simpleItem(ModItems.TITANIUM_INGOT);
        simpleItem(ModItems.LEAD_INGOT);
        simpleItem(ModItems.MAGNESIUM_INGOT);
        simpleItem(ModItems.ALUMINUM_INGOT);
        simpleItem(ModItems.WOLFRAM_INGOT);

        simpleItem(ModItems.BRASS_INGOT);
        simpleItem(ModItems.BRONZE_INGOT);
        simpleItem(ModItems.DURALUMIN_INGOT);
        simpleItem(ModItems.SILUMIN_INGOT);
        simpleItem(ModItems.TITANOSTEEL_INGOT);
        simpleItem(ModItems.CAST_IRON_INGOT);
        simpleItem(ModItems.STAINLESS_STEEL_INGOT);
        simpleItem(ModItems.TZ_INGOT);

        simpleItem(ModItems.IRON_GEAR);
        simpleItem(ModItems.TIN_GEAR);
        simpleItem(ModItems.TITANOSTEEL_GEAR);
        simpleItem(ModItems.CAST_IRON_GEAR);
        simpleItem(ModItems.BRASS_GEAR);
        simpleItem(ModItems.BRONZE_GEAR);
        simpleItem(ModItems.ALUMINUM_GEAR);

        simpleItem(ModItems.IRON_ROD);
        simpleItem(ModItems.ALUMINUM_ROD);
        simpleItem(ModItems.COPPER_ROD);
        simpleItem(ModItems.BRASS_ROD);
        simpleItem(ModItems.BRONZE_ROD);
        simpleItem(ModItems.CAST_IRON_ROD);
        simpleItem(ModItems.STAINLESS_STEEL_ROD);
        simpleItem(ModItems.TZ_ROD);
        simpleItem(ModItems.TITANOSTEEL_ROD);
        simpleItem(ModItems.SILUMIN_ROD);

        simpleItem(ModItems.IRON_SHAFT);
        simpleItem(ModItems.BRASS_SHAFT);
        simpleItem(ModItems.BRONZE_SHAFT);
        simpleItem(ModItems.CAST_IRON_SHAFT);
        simpleItem(ModItems.TITANOSTEEL_SHAFT);

        simpleItem(ModItems.ALUMINUM_SHEET);
        simpleItem(ModItems.BRASS_SHEET);
        simpleItem(ModItems.BRONZE_SHEET);
        simpleItem(ModItems.COPPER_SHEET);
        simpleItem(ModItems.DURALUMIN_SHEET);
        simpleItem(ModItems.IRON_SHEET);
        simpleItem(ModItems.STAINLESS_STEEL_SHEET);
        simpleItem(ModItems.TITANOSTEEL_SHEET);
        simpleItem(ModItems.TZ_SHEET);
        simpleItem(ModItems.SILUMIN_SHEET);

        simpleItem(ModItems.ALUMINUM_PLATING);
        simpleItem(ModItems.BRASS_PLATING);
        simpleItem(ModItems.BRONZE_PLATING);
        simpleItem(ModItems.DURALUMIN_PLATING);
        simpleItem(ModItems.IRON_PLATING);
        simpleItem(ModItems.TZ_PLATING);
        simpleItem(ModItems.STAINLESS_STEEL_PLATING);
        simpleItem(ModItems.SILUMIN_PLATING);

        simpleItem(ModItems.MOLTEN_TIN_BUCKET);

        simpleItem(ModItems.CANOLA_SEEDS);
        simpleItem(ModItems.RAW_CANOLA);

        simpleItem(ModItems.HAMMER);
        simpleItem(ModItems.SAW);
        simpleItem(ModItems.WIRECUTTERS);
        simpleItem(ModItems.FILE);
        simpleItem(ModItems.WRENCH);
        simpleItem(ModItems.FOUNDRY_BASIC_FORM_GEAR);
        simpleItem(ModItems.FOUNDRY_BASIC_FORM_INGOT);
        simpleItem(ModItems.FOUNDRY_BASIC_FORM_ROD);
        simpleItem(ModItems.FOUNDRY_BASIC_FORM_PLATE);

        simpleItem(ModItems.JAW_CRUSHER_BASIC_BELT);

        simpleItem(ModItems.SLAG);




    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Industrial_Age.MOD_ID, "item/" + item.getId().getPath()));
    }
}
