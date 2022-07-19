package com.mattams.mattamsmod.brass;

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

public class BrassBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MattamsMod.MOD_ID);

    public static final RegistryObject<Block> BRASS_BLOCK = registerBlock("brass_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(8f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> BRASS_ORE = registerBlock("brass_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> DEEPSLATE_BRASS_ORE = registerBlock("deepslate_brass_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> BRASS_STAIRS = registerBlock("brass_stairs",
            () -> new StairBlock(() -> BrassBlocks.BRASS_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.METAL).strength(8f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> BRASS_SLAB = registerBlock("brass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).strength(8f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> BRASS_FENCE = registerBlock("brass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> BRASS_FENCE_GATE = registerBlock("brass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> BRASS_WALL = registerBlock("brass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL).strength(8f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> BRASS_BUTTON = registerBlock("brass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(8f).requiresCorrectToolForDrops().noCollission()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> BRASS_PRESSURE_PLATE = registerBlock("brass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> BRASS_DOOR = registerBlock("brass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(8f).requiresCorrectToolForDrops().noCollission()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> BRASS_TRAPDOOR = registerBlock("brass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(8f).requiresCorrectToolForDrops().noCollission()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return BrassItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
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
