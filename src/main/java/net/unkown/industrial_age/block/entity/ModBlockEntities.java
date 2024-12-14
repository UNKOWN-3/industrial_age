package net.unkown.industrial_age.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.unkown.industrial_age.Industrial_Age;
import net.unkown.industrial_age.block.ModBlocks;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Industrial_Age.MOD_ID);

    public static final RegistryObject<BlockEntityType<BasicFoundryFurnaceBlockEntity>> BASIC_FOUNDRY_BE =
            BLOCK_ENTITIES.register("basic_foundry_be", () ->
                    BlockEntityType.Builder.of(BasicFoundryFurnaceBlockEntity::new,
                            ModBlocks.BASIC_FOUNDRY_FURNACE.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicJawCrusherBlockEntity>> BASIC_JAW_CRUSHER_BE =
            BLOCK_ENTITIES.register("basic_jaw_crusher_be", () ->
                    BlockEntityType.Builder.of(BasicJawCrusherBlockEntity::new,
                            ModBlocks.BASIC_JAW_CRUSHER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
