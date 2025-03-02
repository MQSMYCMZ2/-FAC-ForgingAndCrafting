package net.mqsmycmz.forgingandcrafting.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingTabs;

public class CopperHoeItem extends HoeItem {
    public CopperHoeItem() {
        super(new Tier() {
            @Override
            public int getUses() {
                return 90;
            }

            @Override
            public float getSpeed() {
                return 4f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 0f;
            }

            @Override
            public int getLevel() {
                return 2;
            }

            @Override
            public int getEnchantmentValue() {
                return 2;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.COPPER_INGOT));
            }
        }, 0, -3f, new Item.Properties().tab(ForgingAndCraftingTabs.TAB_FORGING_AND_CRAFTING));
    }
}
