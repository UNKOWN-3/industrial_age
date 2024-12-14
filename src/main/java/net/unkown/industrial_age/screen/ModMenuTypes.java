package net.unkown.industrial_age.screen;

import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.unkown.industrial_age.Industrial_Age;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, Industrial_Age.MOD_ID);

    public static final RegistryObject<MenuType<BasicFoundryFurnaceMenu>> BASIC_FOUNDRY_FURNACE_MENU =
            registerMenuTypes("basic_foundry_furnace_menu", BasicFoundryFurnaceMenu::new);
    public static final RegistryObject<MenuType<BasicJawCrusherMenu>> BASIC_JAW_CRUSHER_MENU =
            registerMenuTypes("basic_jaw_crusher_menu", BasicJawCrusherMenu::new);


    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuTypes(String name, IContainerFactory<T> factory){
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus){
        MENUS.register(eventBus);
    }
}
