package net.unkown.industrial_age.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.unkown.industrial_age.Industrial_Age;

import javax.annotation.Nonnull;

public class ModTools extends Item {

    public ModTools(Properties pProperties)
    {
        super(pProperties);
    }


    @Nonnull
    @Override
    public ItemStack getCraftingRemainingItem(@Nonnull ItemStack stack) {
        ItemStack container = stack.copy();
        if (container.hurt(1, Industrial_Age.RANDOM_SOURCE, null))
            return ItemStack.EMPTY;
        else
            return container;
    }
    @Override
    public int getMaxDamage(ItemStack stack) {
        return 128;

    }
    @Override
    public boolean isDamageable(ItemStack itemStack) {
        return true;
    }

    @Override
    public boolean hasCraftingRemainingItem(@Nonnull ItemStack stack)
    {
        return true;
    }





}