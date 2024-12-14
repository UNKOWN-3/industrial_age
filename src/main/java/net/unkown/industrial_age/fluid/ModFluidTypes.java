package net.unkown.industrial_age.fluid;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.LavaFluid;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.unkown.industrial_age.Industrial_Age;
import org.joml.Vector3f;

public class ModFluidTypes {

    public static final ResourceLocation LAVA_STILL_RL = new ResourceLocation("block/lava_still");
    public static final ResourceLocation LAVA_FLOWING_RL = new ResourceLocation("block/lava_flow");
    public static final ResourceLocation MOLTEN_TIN_OVERLAY_RL = new ResourceLocation(Industrial_Age.MOD_ID, "misc/in_molten_tin");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Industrial_Age.MOD_ID );

    public static final RegistryObject<FluidType> MOLTEN_TIN_FLUID_TYPE = register("molten-tin_fluid",
            FluidType.Properties.create().viscosity(10).density(20).canSwim(false));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(LAVA_STILL_RL, LAVA_FLOWING_RL, MOLTEN_TIN_OVERLAY_RL,
                0xA1DFB84F, new Vector3f(223f / 255f, 184f / 255f, 78f/ 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }

}
