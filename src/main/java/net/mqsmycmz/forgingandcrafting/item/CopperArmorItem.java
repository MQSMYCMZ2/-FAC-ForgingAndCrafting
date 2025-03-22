package net.mqsmycmz.forgingandcrafting.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingTabs;

public abstract class CopperArmorItem extends ArmorItem {
    private static final Ingredient REPAIR_INGREDIENT = Ingredient.of(new ItemStack(Items.COPPER_INGOT));
    private static final String ARMOR_TEXTURE_PATH =
            "forging_and_crafting:texture/models/armor/copper_layer_%d.png";
    public CopperArmorItem(EquipmentSlot slot, Item.Properties properties) {
        super(new ArmorMaterial() {
            @Override
            public int getDurabilityForSlot(EquipmentSlot slot) {
                return new int[]{13, 15, 16, 11}[slot.getIndex()] * 8;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlot slot) {
                return new int[]{1, 3, 3, 1}[slot.getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 5;
            }

            @Override
            public SoundEvent getEquipSound() {
                return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
            }

            @Override
            public Ingredient getRepairIngredient() {
                return REPAIR_INGREDIENT;
            }

            @Override
            public String getName() {
                return "copper_armor";
            }

            @Override
            public float getToughness() {
                return 0f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0f;
            }
        }, slot, properties);
    }

    public static class Helmet extends CopperArmorItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, new Item.Properties().tab(ForgingAndCraftingTabs.TAB_FORGING_AND_CRAFTING));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "forging_and_crafting:textures/models/armor/copper_layer_1.png";
        }
    }

    public static class Chestplate extends CopperArmorItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Item.Properties().tab(ForgingAndCraftingTabs.TAB_FORGING_AND_CRAFTING));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "forging_and_crafting:textures/models/armor/copper_layer_1.png";
        }
    }
    public static class Leggings extends CopperArmorItem {
        public Leggings() {
            super(EquipmentSlot.LEGS, new Item.Properties().tab(ForgingAndCraftingTabs.TAB_FORGING_AND_CRAFTING));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "forging_and_crafting:textures/models/armor/copper_layer_2.png";
        }
    }
    public static class Boots extends CopperArmorItem {
        public Boots() {
            super(EquipmentSlot.FEET, new Item.Properties().tab(ForgingAndCraftingTabs.TAB_FORGING_AND_CRAFTING));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "forging_and_crafting:textures/models/armor/copper_layer_1.png";
        }
    }
}

