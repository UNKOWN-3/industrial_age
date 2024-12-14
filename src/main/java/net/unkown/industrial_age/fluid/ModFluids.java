package net.unkown.industrial_age.fluid;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.unkown.industrial_age.Industrial_Age;
import net.unkown.industrial_age.block.ModBlocks;
import net.unkown.industrial_age.item.ModItems;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Industrial_Age.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TIN = FLUIDS.register("molten_tin_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_TIN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TIN = FLUIDS.register("flowing_molten_tin",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_TIN_FLUID_PROPERTIES));





    public static final ForgeFlowingFluid.Properties MOLTEN_TIN_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_TIN_FLUID_TYPE, SOURCE_MOLTEN_TIN, FLOWING_MOLTEN_TIN)
            .slopeFindDistance(1).levelDecreasePerBlock(4).block(ModBlocks.MOLTEN_TIN_BLOCK)
            .bucket(ModItems.MOLTEN_TIN_BUCKET);




    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
