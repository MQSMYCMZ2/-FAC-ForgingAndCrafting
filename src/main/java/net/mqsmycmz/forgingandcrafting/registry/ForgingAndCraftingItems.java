package net.mqsmycmz.forgingandcrafting.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mqsmycmz.forgingandcrafting.ForgingAndCrafting;

public class ForgingAndCraftingItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ForgingAndCrafting.MODID);

    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_PARTICLES = ITEMS.register("copper_particles",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_STAR = ITEMS.register("copper_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new Item(new Item.Properties()));
}
