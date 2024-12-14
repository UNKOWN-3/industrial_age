package net.unkown.industrial_age.recipe;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.unkown.industrial_age.Industrial_Age;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Industrial_Age.MOD_ID);

    public static final RegistryObject<RecipeSerializer<BasicJawCrushingRecipe>> BASIC_JAW_CRUSHING_SERIALIZER =
            SERIALIZERS.register("basic_jaw_crushing", () -> BasicJawCrushingRecipe.Serializer.INSTANCE);


    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
