package com.mattams.mattamsmod.titanium;

import com.mattams.mattamsmod.MattamsMod;
import com.mattams.mattamsmod.mod.MattamsCreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class TitaniumBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MattamsMod.MOD_ID);

    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(12f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> TITANIUM_STAIRS = registerBlock("titanium_stairs",
            () -> new StairBlock(() -> TitaniumBlocks.TITANIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.METAL).strength(12f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> TITANIUM_SLAB = registerBlock("titanium_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).strength(12f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> TITANIUM_FENCE = registerBlock("titanium_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(10f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> TITANIUM_FENCE_GATE = registerBlock("titanium_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL).strength(10f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> TITANIUM_WALL = registerBlock("titanium_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL).strength(12f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> TITANIUM_BUTTON = registerBlock("titanium_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(10f).requiresCorrectToolForDrops().noCollission()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> TITANIUM_PRESSURE_PLATE = registerBlock("titanium_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL).strength(10f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> TITANIUM_DOOR = registerBlock("titanium_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(10f).requiresCorrectToolForDrops().noCollission()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> TITANIUM_TRAPDOOR = registerBlock("titanium_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(10f).requiresCorrectToolForDrops().noCollission()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return TitaniumItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
