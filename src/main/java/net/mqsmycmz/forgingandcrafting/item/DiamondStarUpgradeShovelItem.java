package net.mqsmycmz.forgingandcrafting.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingItems;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingTabs;

public class DiamondStarUpgradeShovelItem extends HoeItem {
    public DiamondStarUpgradeShovelItem() {
        super(new Tier() {
            @Override
            public int getUses() {
                return 6800;
            }

            @Override
            public float getSpeed() {
                return 30f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 18f;
            }

            @Override
            public int getLevel() {
                return 8;
            }

            @Override
            public int getEnchantmentValue() {
                return 30;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(ForgingAndCraftingItems.DIAMOND_STAR.get()));
            }
        },0, 4f, new Item.Properties().tab(ForgingAndCraftingTabs.TAB_FORGING_AND_CRAFTING));
    }

    @Override
    public void inventoryTick(ItemStack itemStack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemStack, world, entity, slot, selected);
        if (selected) {
            if (entity instanceof LivingEntity _livEnt && !_livEnt.level.isClientSide()) {
                ItemStack mainHandItem = _livEnt.getMainHandItem();
                if (mainHandItem.getItem() == ForgingAndCraftingItems.DIAMOND_STAR_UPGRADE_SHOVEL.get()) {
                    _livEnt.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 1));
                }
            }
        }
    }
}
