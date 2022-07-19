package com.mattams.mattamsmod.citrine;

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

public class CitrineItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MattamsMod.MOD_ID);

    public static final RegistryObject<Item> RAW_CITRINE = ITEMS.register("raw_citrine",
            () -> new Item(new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> CITRINE_SWORD = ITEMS.register("citrine_sword",
            () -> new SwordItem(MattamsTiers.CITRINE, 3, 2f,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> CITRINE_PICKAXE = ITEMS.register("citrine_pickaxe",
            () -> new PickaxeItem(MattamsTiers.CITRINE, 2, 1f,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> CITRINE_AXE = ITEMS.register("citrine_axe",
            () -> new AxeItem(MattamsTiers.CITRINE, 3, 2f,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> CITRINE_SHOVEL = ITEMS.register("citrine_shovel",
            () -> new ShovelItem(MattamsTiers.CITRINE, 1, 3f,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> CITRINE_HOE = ITEMS.register("citrine_hoe",
            () -> new HoeItem(MattamsTiers.CITRINE, 1, 2f,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> CITRINE_HELMET = ITEMS.register("citrine_helmet",
            () -> new ArmorItem(MattamsArmorMaterials.CITRINE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> CITRINE_CHESTPLATE = ITEMS.register("citrine_chestplate",
            () -> new ArmorItem(MattamsArmorMaterials.CITRINE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> CITRINE_LEGGINGS = ITEMS.register("citrine_leggings",
            () -> new ArmorItem(MattamsArmorMaterials.CITRINE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> CITRINE_BOOTS = ITEMS.register("citrine_boots",
            () -> new ArmorItem(MattamsArmorMaterials.CITRINE, EquipmentSlot.FEET,
                    new Item.Properties().tab(MattamsCreativeModeTab.MATTAMS_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
