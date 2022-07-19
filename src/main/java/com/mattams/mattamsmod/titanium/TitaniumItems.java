package com.mattams.mattamsmod.titanium;

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

public class TitaniumItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MattamsMod.MOD_ID);

    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            () -> new SwordItem(MattamsTiers.TITANIUM, 5, 2f,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(MattamsTiers.TITANIUM, 2, 1f,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe",
            () -> new AxeItem(MattamsTiers.TITANIUM, 5, 2f,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            () -> new ShovelItem(MattamsTiers.TITANIUM, 1, 3f,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe",
            () -> new HoeItem(MattamsTiers.TITANIUM, 1, 2f,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet",
            () -> new ArmorItem(MattamsArmorMaterials.TITANIUM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate",
            () -> new ArmorItem(MattamsArmorMaterials.TITANIUM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings",
            () -> new ArmorItem(MattamsArmorMaterials.TITANIUM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots",
            () -> new ArmorItem(MattamsArmorMaterials.TITANIUM, EquipmentSlot.FEET,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
