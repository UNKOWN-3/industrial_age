package net.unkown.industrial_age.datagen.loot;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BucketPickup;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.fluids.IFluidBlock;
import net.minecraftforge.fml.common.Mod;
import net.unkown.industrial_age.block.ModBlocks;
import net.minecraftforge.registries.RegistryObject;
import net.unkown.industrial_age.block.custom.CanolaCropBlock;
import net.unkown.industrial_age.fluid.ModFluids;
import net.unkown.industrial_age.item.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }



    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ZINC_BLOCK.get());
        this.dropSelf(ModBlocks.TIN_BLOCK.get());
        this.dropSelf(ModBlocks.TITANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.LEAD_BLOCK.get());
        this.dropSelf(ModBlocks.MAGNESIUM_BLOCK.get());
        this.dropSelf(ModBlocks.ALUMINUM_BLOCK.get());
        this.dropSelf(ModBlocks.BAUXITE.get());
        this.dropSelf(ModBlocks.WOLFRAM_BLOCK.get());

        this.dropSelf(ModBlocks.BRASS_BLOCK.get());
        this.dropSelf(ModBlocks.BRONZE_BLOCK.get());
        this.dropSelf(ModBlocks.DURALUMIN_BLOCK.get());
        this.dropSelf(ModBlocks.SILUMIN_BLOCK.get());
        this.dropSelf(ModBlocks.TITANOSTEEL_BLOCK.get());
        this.dropSelf(ModBlocks.CAST_IRON_BLOCK.get());
        this.dropSelf(ModBlocks.STAINLESS_STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.TZ_BLOCK.get());

        this.add(ModBlocks.ZINC_ORE.get(),
                block -> createZincLikeOreDrops(ModBlocks.ZINC_ORE.get(), ModItems.RAW_ZINC.get()));
        this.add(ModBlocks.TIN_ORE.get(),
                block -> createTinLikeOreDrops(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.TITANOMAGNETITE_ORE.get(),
                block -> createTitanomagnetiteLikeOreDrops(ModBlocks.TITANOMAGNETITE_ORE.get(), ModItems.RAW_TITANOMAGNETITE.get()));
        this.add(ModBlocks.RUTILE_ORE.get(),
                block -> createTitanomagnetiteLikeOreDrops(ModBlocks.RUTILE_ORE.get(), ModItems.RAW_RUTILE.get()));
        this.add(ModBlocks.LEAD_ORE.get(),
                block -> createZincLikeOreDrops(ModBlocks.LEAD_ORE.get(), ModItems.RAW_LEAD.get()));
        this.add(ModBlocks.DOLOMITE_ORE.get(),
                block -> createZincLikeOreDrops(ModBlocks.DOLOMITE_ORE.get(), ModItems.RAW_DOLOMITE.get()));
        this.add(ModBlocks.MAGNETITE_ORE.get(),
                block -> createZincLikeOreDrops(ModBlocks.MAGNETITE_ORE.get(), ModItems.RAW_MAGNETITE.get()));
        this.add(ModBlocks.WOLFRAMITE_ORE.get(),
                block -> createTitanomagnetiteLikeOreDrops(ModBlocks.WOLFRAMITE_ORE.get(), ModItems.RAW_WOLFRAMITE.get()));


        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.CANOLA_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CanolaCropBlock.AGE, 5));

        this.add(ModBlocks.CANOLA_CROP.get(), createCropDrops(ModBlocks.CANOLA_CROP.get(), ModItems.RAW_CANOLA.get(),
                ModItems.CANOLA_SEEDS.get(), lootitemcondition$builder));

        this.dropSelf(ModBlocks.BASIC_FOUNDRY_FURNACE.get());
        this.dropSelf(ModBlocks.BASIC_JAW_CRUSHER.get());



    }

    protected LootTable.Builder createTinLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
    protected LootTable.Builder createZincLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createTitanomagnetiteLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        List<Block> blocks = ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
        blocks.removeAll(NOT_USABLE);
        return blocks;
    }

    private static final List<Block> NOT_USABLE = List.of(ModBlocks.MOLTEN_TIN_BLOCK.get());



}
