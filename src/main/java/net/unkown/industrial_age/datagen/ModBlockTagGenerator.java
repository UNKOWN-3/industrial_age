package net.unkown.industrial_age.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.unkown.industrial_age.Industrial_Age;
import net.unkown.industrial_age.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Industrial_Age.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.TIN_ORE.get(),
                        ModBlocks.TIN_BLOCK.get()

                );

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ZINC_ORE.get(),
                        ModBlocks.LEAD_ORE.get(),
                        ModBlocks.DOLOMITE_ORE.get(),
                        ModBlocks.WOLFRAMITE_ORE.get(),

                        ModBlocks.ZINC_BLOCK.get(),
                        ModBlocks.LEAD_BLOCK.get(),
                        ModBlocks.DOLOMITE_ORE.get()
                );



        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.TITANOMAGNETITE_ORE.get(),
                        ModBlocks.RUTILE_ORE.get(),

                        ModBlocks.TITANIUM_BLOCK.get()
                );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ZINC_ORE.get(),
                        ModBlocks.TIN_ORE.get(),
                        ModBlocks.TITANOMAGNETITE_ORE.get(),
                        ModBlocks.RUTILE_ORE.get(),
                        ModBlocks.LEAD_ORE.get(),
                        ModBlocks.DOLOMITE_ORE.get(),

                        ModBlocks.ZINC_BLOCK.get(),
                        ModBlocks.TIN_BLOCK.get(),
                        ModBlocks.TITANIUM_BLOCK.get(),
                        ModBlocks.LEAD_BLOCK.get(),
                        ModBlocks.MAGNESIUM_BLOCK.get()
                );
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL); //<- delet ; before adding smth
                //.add(ModBlocks.ZINC_ORE.get(),

        this.tag(BlockTags.MINEABLE_WITH_AXE); //<- delet ; before adding smth
                //.add(ModBlocks.SOMETHING.get());

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL); //<- delet ; before adding smth
                //.add(ModBlocks.SOMETHING.get());

        this.tag(BlockTags.MINEABLE_WITH_HOE); //<- delet ; before adding smth
                //.add(ModBlocks.SOMETHING.get());


    }
}
