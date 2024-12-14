package net.unkown.industrial_age.datagen;

import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.unkown.industrial_age.Industrial_Age;
import net.unkown.industrial_age.block.ModBlocks;
import net.unkown.industrial_age.block.custom.CanolaCropBlock;
import net.unkown.industrial_age.block.entity.ModBlockEntities;

import java.util.function.Function;

import static net.minecraft.world.level.block.ChestBlock.FACING;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Industrial_Age.MOD_ID, exFileHelper);

    }


    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ZINC_ORE);
        blockWithItem(ModBlocks.TIN_ORE);
        blockWithItem(ModBlocks.TITANOMAGNETITE_ORE);
        blockWithItem(ModBlocks.RUTILE_ORE);
        blockWithItem(ModBlocks.LEAD_ORE);
        blockWithItem(ModBlocks.DOLOMITE_ORE);
        blockWithItem(ModBlocks.MAGNETITE_ORE);
        blockWithItem(ModBlocks.BAUXITE);
        blockWithItem(ModBlocks.WOLFRAMITE_ORE);

        blockWithItem(ModBlocks.ZINC_BLOCK);
        blockWithItem(ModBlocks.TIN_BLOCK);
        blockWithItem(ModBlocks.TITANIUM_BLOCK);
        blockWithItem(ModBlocks.LEAD_BLOCK);
        blockWithItem(ModBlocks.MAGNESIUM_BLOCK);
        blockWithItem(ModBlocks.ALUMINUM_BLOCK);
        blockWithItem(ModBlocks.WOLFRAM_BLOCK);

        blockWithItem(ModBlocks.BRASS_BLOCK);
        blockWithItem(ModBlocks.BRONZE_BLOCK);
        blockWithItem(ModBlocks.DURALUMIN_BLOCK);
        blockWithItem(ModBlocks.SILUMIN_BLOCK);
        blockWithItem(ModBlocks.TITANOSTEEL_BLOCK);
        blockWithItem(ModBlocks.CAST_IRON_BLOCK);
        blockWithItem(ModBlocks.STAINLESS_STEEL_BLOCK);
        blockWithItem(ModBlocks.TZ_BLOCK);

        makeCanolaCrop((CropBlock) ModBlocks.CANOLA_CROP.get(), "canola_stage", "canola_stage");

        simpleBlock(ModBlocks.BASIC_FOUNDRY_FURNACE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/basic_foundry_furnace")));
        simpleBlockWithItem(ModBlocks.BASIC_JAW_CRUSHER.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/basic_jaw_crusher")));

    }

    public void makeCanolaCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> canolaStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] canolaStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((CanolaCropBlock) block).getAgeProperty()),
            new ResourceLocation(Industrial_Age.MOD_ID, "block/" + textureName + state.getValue(((CanolaCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }




    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }




}
