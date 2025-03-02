package net.mqsmycmz.forgingandcrafting.item;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraftforge.items.ItemHandlerHelper;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingItems;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingTabs;

public class CopperSwordItem extends SwordItem {
    public CopperSwordItem() {
        super(new Tier() {
            @Override
            public int getUses() {
                return 100;
            }

            @Override
            public float getSpeed() {
                return 4f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 2f;
            }

            @Override
            public int getLevel() {
                return 1;
            }

            @Override
            public int getEnchantmentValue() {
                return 5;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.COPPER_INGOT));
            }
        }, 3, 2f, new Item.Properties().tab(ForgingAndCraftingTabs.TAB_FORGING_AND_CRAFTING));
    }

    @Override
    public void inventoryTick(ItemStack itemStack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemStack, world, entity, slot, selected);
        if (selected && entity instanceof Player player) {
            if (player.getInventory().contains(new
                    ItemStack(ForgingAndCraftingItems.COPPER_SWORD.get())) &&
                    player.isShiftKeyDown()) {
                ItemStack copperParticles = new
                        ItemStack(ForgingAndCraftingItems.COPPER_PARTICLES.get());
                copperParticles.setCount(1);
                ItemHandlerHelper.giveItemToPlayer(player, copperParticles);
            }
        }
    }
}