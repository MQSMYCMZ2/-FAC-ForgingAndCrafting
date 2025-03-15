package net.mqsmycmz.forgingandcrafting.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingTabs;

public class CopperParticlesItem extends Item {
    public CopperParticlesItem() {
        super(new Item.Properties().tab(ForgingAndCraftingTabs.TAB_FORGING_AND_CRAFTING).stacksTo(64).rarity(Rarity.COMMON));
    }
}
