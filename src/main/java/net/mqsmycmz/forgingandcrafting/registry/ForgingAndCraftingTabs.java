package net.mqsmycmz.forgingandcrafting.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ForgingAndCraftingTabs {
    public static CreativeModeTab TAB_FORGING_AND_CRAFTING;

    public static void load() {
        TAB_FORGING_AND_CRAFTING = new CreativeModeTab("tabforging_and_crafting") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ForgingAndCraftingItems.COPPER_STAR.get());
            }

            @Override
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
