package com.mattams.mattamsmod.glass;

import com.mattams.mattamsmod.MattamsMod;
import com.mattams.mattamsmod.brass.BrassItems;
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

public class GlassBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MattamsMod.MOD_ID);

    public static final RegistryObject<Block> GLASS_STAIRS = registerBlock("glass_stairs",
            () -> new StairBlock(() -> Blocks.GLASS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> GLASS_SLAB = registerBlock("glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> GLASS_FENCE = registerBlock("glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> GLASS_FENCE_GATE = registerBlock("glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> GLASS_WALL = registerBlock("glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> GLASS_BUTTON = registerBlock("glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> GLASS_PRESSURE_PLATE = registerBlock("glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()),
            MattamsCreativeModeTab.MATTAMS_TAB);

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return GlassItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
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
