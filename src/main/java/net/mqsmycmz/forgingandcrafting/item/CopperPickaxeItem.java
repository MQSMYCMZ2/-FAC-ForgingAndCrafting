package net.mqsmycmz.forgingandcrafting.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingTabs;

public class CopperPickaxeItem extends PickaxeItem {
    public CopperPickaxeItem() {
        super(new Tier() {
            @Override
            public int getUses() {
                return 80;
            }

            @Override
            public float getSpeed() {
                return 4f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 1.8f;
            }

            @Override
            public int getLevel() {
                return 1;
            }

            @Override
            public int getEnchantmentValue() {
                return 10;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.COPPER_INGOT));
            }
        }, 1, -3f, new Item.Properties().tab(ForgingAndCraftingTabs.TAB_FORGING_AND_CRAFTING));
    }
}
