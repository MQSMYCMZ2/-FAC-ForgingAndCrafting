package net.mqsmycmz.forgingandcrafting.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mqsmycmz.forgingandcrafting.ForgingAndCrafting;
import net.mqsmycmz.forgingandcrafting.item.*;

public class ForgingAndCraftingItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ForgingAndCrafting.MODID);
    public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", CopperAxeItem::new);
    public static final RegistryObject<Item> COPPER_SWORD = REGISTRY.register("copper_sword", CopperSwordItem::new);
    public static final RegistryObject<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", CopperPickaxeItem::new);
    public static final RegistryObject<Item> COPPER_STAR = REGISTRY.register("copper_star", CopperStarItem::new);
    public static final RegistryObject<Item> COPPER_PARTICLES = REGISTRY.register("copper_particles", CopperParticlesItem::new);
    public static final RegistryObject<Item> COPPER_HOE = REGISTRY.register("copper_hoe", CopperHoeItem::new);
    public static final RegistryObject<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", CopperShovelItem::new);
    public static final RegistryObject<Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet", CopperArmorItem.Helmet::new);
    public static final RegistryObject<Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate", CopperArmorItem.Chestplate::new);
    public static final RegistryObject<Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings", CopperArmorItem.Leggings::new);
    public static final RegistryObject<Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots", CopperArmorItem.Boots::new);
    public static final RegistryObject<Item> DIAMOND_STAR = REGISTRY.register("diamond_star", DiamondStarItem::new);
    public static final RegistryObject<Item> DIAMOND_STAR_UPGRADE_AXE = REGISTRY.register("diamond_star_upgrade_axe", DiamondStarUpgradeAxeItem::new);
    public static final RegistryObject<Item> DIAMOND_STAR_UPGRADE_HOE = REGISTRY.register("diamond_star_upgrade_hoe", DiamondStarUpgradeHoeItem::new);
    public static final RegistryObject<Item> DIAMOND_UPGRADE = REGISTRY.register("diamond_upgrade", DiamondUpgradeItem::new);
    public static final RegistryObject<Item> DIAMOND_STAR_UPGRADE_SHOVEL = REGISTRY.register("diamond_star_upgrade_shovel", DiamondStarUpgradeShovelItem::new);
    public static final RegistryObject<Item> DIAMOND_STAR_UPGRADE_PICKAXE = REGISTRY.register("diamond_star_upgrade_pickaxe", DiamondStarUpgradePickaxeItem::new);
    public static final RegistryObject<Item> DIAMOND_STAR_UPGRADE_SWORD = REGISTRY.register("diamond_star_upgrade_sword", DiamondStarUpgradeSwordItem::new);
    public static final RegistryObject<Item> GOLD_STAR = REGISTRY.register("gold_star", GoldStarItem::new);
    public static final RegistryObject<Item> GOLD_UPGRADE = REGISTRY.register("gold_upgrade", GoldUpgradeItem::new);
    public static final RegistryObject<Item> GOLD_STAR_UPGRADE_AXE = REGISTRY.register("gold_star_upgrade_axe", GoldStarUpgradeAxeItem::new);
    public static final RegistryObject<Item> GOLD_STAR_UPGRADE_SHOVEL = REGISTRY.register("gold_star_upgrade_shovel", GoldStarUpgradeShovelItem::new);
    public static final RegistryObject<Item> GOLD_STAR_UPGRADE_PICKAXE = REGISTRY.register("gold_star_upgrade_pickaxe", GoldStarUpgradePickaxeItem::new);
    public static final RegistryObject<Item> GOLD_STAR_UPGRADE_SWORD = REGISTRY.register("gold_star_upgrade_sword", GoldStarUpgradeSwordItem::new);
    public static final RegistryObject<Item> GOLD_STAR_UPGRADE_HOE = REGISTRY.register("gold_star_upgrade_hoe", GoldStarUpgradeHoeItem::new);

}
