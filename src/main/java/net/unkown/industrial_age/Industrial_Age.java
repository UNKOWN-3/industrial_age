package net.unkown.industrial_age;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.unkown.industrial_age.block.ModBlocks;
import net.unkown.industrial_age.block.entity.BasicJawCrusherBlockEntity;
import net.unkown.industrial_age.block.entity.ModBlockEntities;
import net.unkown.industrial_age.fluid.ModFluidTypes;
import net.unkown.industrial_age.fluid.ModFluids;
import net.unkown.industrial_age.item.ModCreativeModTabs;
import net.unkown.industrial_age.item.ModItems;
import net.unkown.industrial_age.recipe.ModRecipes;
import net.unkown.industrial_age.screen.BasicFoundryFurnaceMenu;
import net.unkown.industrial_age.screen.BasicFoundryFurnaceScreen;
import net.unkown.industrial_age.screen.BasicJawCrusherScreen;
import net.unkown.industrial_age.screen.ModMenuTypes;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Industrial_Age.MOD_ID)
public class Industrial_Age
{
    public static final String MOD_ID = "industrial_age";

    private static final Logger LOGGER = LogUtils.getLogger();

    public static final RandomSource RANDOM_SOURCE = RandomSource.createNewThreadLocalInstance();
    public Industrial_Age(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModFluidTypes.register(modEventBus);
        ModFluids.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        ModRecipes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_MOLTEN_TIN.get(), RenderType.solid());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_MOLTEN_TIN.get(), RenderType.solid());


            MenuScreens.register(ModMenuTypes.BASIC_FOUNDRY_FURNACE_MENU.get(), BasicFoundryFurnaceScreen::new);
            MenuScreens.register(ModMenuTypes.BASIC_JAW_CRUSHER_MENU.get(), BasicJawCrusherScreen::new);

        }
    }
}
