package net.mqsmycmz.forgingandcrafting.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ForgingAndCraftingTabs {
    public static CreativeModeTab TAB_FORGING_AND_CRAFTING;

    public static void load() {
        TAB_FORGING_AND_CRAFTING = new CreativeModeTab("tabforging_and_crafting") {
            @Override
            public @NotNull ItemStack makeIcon() {
                return new ItemStack(ForgingAndCraftingItems.COPPER_STAR.get());
            }

            @Override
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
