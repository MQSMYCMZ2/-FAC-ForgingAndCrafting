package net.mqsmycmz.forgingandcrafting.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingItems;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingTabs;

public class GoldStarUpgradeHoeItem extends HoeItem {
    public GoldStarUpgradeHoeItem() {
        super(new Tier() {
            @Override
            public int getUses() {
                return 4090;
            }

            @Override
            public float getSpeed() {
                return 28f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 13f;
            }

            @Override
            public int getLevel() {
                return 6;
            }

            @Override
            public int getEnchantmentValue() {
                return 28;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(ForgingAndCraftingItems.GOLD_STAR.get()));
            }
        }, 1, 3f, new Item.Properties().tab(ForgingAndCraftingTabs.TAB_FORGING_AND_CRAFTING));
    }

    @Override
    public void inventoryTick(ItemStack itemStack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemStack, world, entity, slot, selected);
        if (selected) {
            if (entity instanceof LivingEntity livingEntity && !livingEntity.level.isClientSide()) {
                ItemStack mainHandItem = livingEntity.getMainHandItem();
                if (mainHandItem.getItem() == ForgingAndCraftingItems.GOLD_STAR_UPGRADE_HOE.get()) {
                    livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 3));
                }
            }
        }
    }
}
