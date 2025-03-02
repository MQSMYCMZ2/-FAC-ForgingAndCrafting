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
}
