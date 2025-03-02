package net.mqsmycmz.forgingandcrafting.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingTabs;

import javax.swing.text.html.parser.Entity;
import java.util.logging.Level;

public class CopperAxeItem extends AxeItem {
    public CopperAxeItem() {
        super(new Tier() {
            public int getUses() {
                return 120;
            }

            public float getSpeed() {
                return 4f;
            }

            public float getAttackDamageBonus() {
                return 4f;
            }

            public int getLevel() {
                return 3;
            }

            public int getEnchantmentValue() {
                return 2;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.COPPER_INGOT));
            }
        }, 1, -2.5f, new Item.Properties().tab(ForgingAndCraftingTabs.TAB_FORGING_AND_CRAFTING));
    }
}
