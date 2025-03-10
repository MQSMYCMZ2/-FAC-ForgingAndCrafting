package net.mqsmycmz.forgingandcrafting.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mqsmycmz.forgingandcrafting.ForgingAndCrafting;
import net.mqsmycmz.forgingandcrafting.item.*;

public class ForgingAndCraftingItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ForgingAndCrafting.MODID);
    public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
    public static final RegistryObject<Item> COPPER_SWORD = REGISTRY.register("copper_sword", () -> new CopperSwordItem());
    public static final RegistryObject<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
    public static final RegistryObject<Item> COPPER_STAR = REGISTRY.register("copper_star", () -> new CopperStarItem());
    public static final RegistryObject<Item> COPPER_PARTICLES = REGISTRY.register("copper_particles", () -> new CopperParticlesItem());
    public static final RegistryObject<Item> COPPER_HOE = REGISTRY.register("copper_hoe", () -> new CopperHoeItem());
    public static final RegistryObject<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
    public static final RegistryObject<Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet",  ()->new CopperArmorItem.Helmet());
    public static final RegistryObject<Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate",  ()->new CopperArmorItem.Chestplate());
    public static final RegistryObject<Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings",  ()->new CopperArmorItem.Leggings());
    public static final RegistryObject<Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots",  ()->new CopperArmorItem.Boots());
    public static final RegistryObject<Item> DIAMOND_STAR = REGISTRY.register("diamond_star",  ()->new DiamondStarItem());
    public static final RegistryObject<Item> DIAMOND_STAR_UPGRADE_AXE = REGISTRY.register("diamond_star_upgrade_axe",  ()->new DiamondStarUpgradeAxeItem());
    public static final RegistryObject<Item> DIAMOND_STAR_UPGRADE_HOE = REGISTRY.register("diamond_star_upgrade_hoe",  ()->new DiamondStarUpgradeHoeItem());
    public static final RegistryObject<Item> DIAMOND_UPGRADE = REGISTRY.register("diamond_upgrade",  ()->new DiamondUpgradeItem());
    public static final RegistryObject<Item> DIAMOND_STAR_UPGRADE_SHOVEL = REGISTRY.register("diamond_star_upgrade_shovel",  ()->new DiamondStarUpgradeShovelItem());
    public static final RegistryObject<Item> DIAMOND_STAR_UPGRADE_PICKAXE = REGISTRY.register("diamond_star_upgrade_pickaxe",  ()->new DiamondStarUpgradePickaxeItem());
    public static final RegistryObject<Item> DIAMOND_STAR_UPGRADE_SWORD = REGISTRY.register("diamond_star_upgrade_sword",  ()->new DiamondStarUpgradeSwordItem());

}
