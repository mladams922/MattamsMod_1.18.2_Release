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

    public static final RegistryObject<Block> BLACK_STAINED_GLASS_STAIRS = registerBlock("black_stained_glass_stairs",
            () -> new StairBlock(() -> Blocks.BLACK_STAINED_GLASS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> GRAY_STAINED_GLASS_STAIRS = registerBlock("gray_stained_glass_stairs",
            () -> new StairBlock(() -> Blocks.GRAY_STAINED_GLASS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_STAIRS = registerBlock("light_gray_stained_glass_stairs",
            () -> new StairBlock(() -> Blocks.LIGHT_GRAY_STAINED_GLASS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> WHITE_STAINED_GLASS_STAIRS = registerBlock("white_stained_glass_stairs",
            () -> new StairBlock(() -> Blocks.WHITE_STAINED_GLASS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);
    public static final RegistryObject<Block> BROWN_STAINED_GLASS_STAIRS = registerBlock("brown_stained_glass_stairs",
            () -> new StairBlock(() -> Blocks.BROWN_STAINED_GLASS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> RED_STAINED_GLASS_STAIRS = registerBlock("red_stained_glass_stairs",
            () -> new StairBlock(() -> Blocks.RED_STAINED_GLASS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> ORANGE_STAINED_GLASS_STAIRS = registerBlock("orange_stained_glass_stairs",
            () -> new StairBlock(() -> Blocks.ORANGE_STAINED_GLASS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> YELLOW_STAINED_GLASS_STAIRS = registerBlock("yellow_stained_glass_stairs",
            () -> new StairBlock(() -> Blocks.YELLOW_STAINED_GLASS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> LIME_STAINED_GLASS_STAIRS = registerBlock("lime_stained_glass_stairs",
            () -> new StairBlock(() -> Blocks.LIME_STAINED_GLASS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> GREEN_STAINED_GLASS_STAIRS = registerBlock("green_stained_glass_stairs",
            () -> new StairBlock(() -> Blocks.GREEN_STAINED_GLASS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> CYAN_STAINED_GLASS_STAIRS = registerBlock("cyan_stained_glass_stairs",
            () -> new StairBlock(() -> Blocks.CYAN_STAINED_GLASS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> BLUE_STAINED_GLASS_STAIRS = registerBlock("blue_stained_glass_stairs",
            () -> new StairBlock(() -> Blocks.BLUE_STAINED_GLASS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_STAIRS = registerBlock("light_blue_stained_glass_stairs",
            () -> new StairBlock(() -> Blocks.LIGHT_BLUE_STAINED_GLASS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> PINK_STAINED_GLASS_STAIRS = registerBlock("pink_stained_glass_stairs",
            () -> new StairBlock(() -> Blocks.PINK_STAINED_GLASS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> PURPLE_STAINED_GLASS_STAIRS = registerBlock("purple_stained_glass_stairs",
            () -> new StairBlock(() -> Blocks.PURPLE_STAINED_GLASS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_STAIRS = registerBlock("magenta_stained_glass_stairs",
            () -> new StairBlock(() -> Blocks.MAGENTA_STAINED_GLASS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> GLASS_SLAB = registerBlock("glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> BLACK_STAINED_GLASS_SLAB = registerBlock("black_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> GRAY_STAINED_GLASS_SLAB = registerBlock("gray_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("light_gray_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> WHITE_STAINED_GLASS_SLAB = registerBlock("white_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> BROWN_STAINED_GLASS_SLAB = registerBlock("brown_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> RED_STAINED_GLASS_SLAB = registerBlock("red_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> ORANGE_STAINED_GLASS_SLAB = registerBlock("orange_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> YELLOW_STAINED_GLASS_SLAB = registerBlock("yellow_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> LIME_STAINED_GLASS_SLAB = registerBlock("lime_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> GREEN_STAINED_GLASS_SLAB = registerBlock("green_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> CYAN_STAINED_GLASS_SLAB = registerBlock("cyan_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> BLUE_STAINED_GLASS_SLAB = registerBlock("blue_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("light_blue_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> PINK_STAINED_GLASS_SLAB = registerBlock("pink_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> PURPLE_STAINED_GLASS_SLAB = registerBlock("purple_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_SLAB = registerBlock("magenta_stained_glass_slab",
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
