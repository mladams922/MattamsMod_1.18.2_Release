package com.mattams.mattamsmod.brass;

import com.mattams.mattamsmod.MattamsMod;
import com.mattams.mattamsmod.materials.MattamsArmorMaterials;
import com.mattams.mattamsmod.materials.MattamsTiers;
import com.mattams.mattamsmod.mod.MattamsCreativeModeTab;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BrassItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MattamsMod.MOD_ID);

    public static final RegistryObject<Item> RAW_BRASS = ITEMS.register("raw_brass",
            () -> new Item(new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot",
            () -> new Item(new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> BRASS_NUGGET = ITEMS.register("brass_nugget",
            () -> new Item(new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> BRASS_SWORD = ITEMS.register("brass_sword",
            () -> new SwordItem(MattamsTiers.BRASS, 4, 2f,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> BRASS_PICKAXE = ITEMS.register("brass_pickaxe",
            () -> new PickaxeItem(MattamsTiers.BRASS, 2, 1f,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> BRASS_AXE = ITEMS.register("brass_axe",
            () -> new AxeItem(MattamsTiers.BRASS, 4, 2f,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> BRASS_SHOVEL = ITEMS.register("brass_shovel",
            () -> new ShovelItem(MattamsTiers.BRASS, 1, 3f,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> BRASS_HOE = ITEMS.register("brass_hoe",
            () -> new HoeItem(MattamsTiers.BRASS, 1, 2f,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> BRASS_HELMET = ITEMS.register("brass_helmet",
            () -> new ArmorItem(MattamsArmorMaterials.BRASS, EquipmentSlot.HEAD,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> BRASS_CHESTPLATE = ITEMS.register("brass_chestplate",
            () -> new ArmorItem(MattamsArmorMaterials.BRASS, EquipmentSlot.CHEST,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> BRASS_LEGGINGS = ITEMS.register("brass_leggings",
            () -> new ArmorItem(MattamsArmorMaterials.BRASS, EquipmentSlot.LEGS,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> BRASS_BOOTS = ITEMS.register("brass_boots",
            () -> new ArmorItem(MattamsArmorMaterials.BRASS, EquipmentSlot.FEET,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
