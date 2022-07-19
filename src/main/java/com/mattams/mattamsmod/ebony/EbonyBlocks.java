package com.mattams.mattamsmod.ebony;

import com.mattams.mattamsmod.MattamsMod;
import com.mattams.mattamsmod.materials.MattamsFlammableRotatedPillarBlock;
import com.mattams.mattamsmod.mod.MattamsCreativeModeTab;
import com.mattams.mattamsmod.world.feature.tree.EbonyTreeGrower;
import com.mattams.mattamsmod.world.feature.tree.RedwoodTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class EbonyBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MattamsMod.MOD_ID);

    public static final RegistryObject<Block> EBONY_SAPLING = registerBlock("ebony_sapling",
            () -> new SaplingBlock(new EbonyTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> EBONY_LOG = registerBlock("ebony_log",
            () -> new MattamsFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> EBONY_WOOD = registerBlock("ebony_wood",
            () -> new MattamsFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> STRIPPED_EBONY_LOG = registerBlock("stripped_ebony_log",
            () -> new MattamsFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> STRIPPED_EBONY_WOOD = registerBlock("stripped_ebony_wood",
            () -> new MattamsFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> EBONY_LEAVES = registerBlock("ebony_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).sound(SoundType.GLASS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 1;
                }
            },
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> EBONY_PLANKS = registerBlock("ebony_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 1;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 1;
                }
            }, MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> EBONY_SLAB = registerBlock("ebony_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)) , MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> EBONY_STAIRS = registerBlock("ebony_stairs",
            () -> new StairBlock(() -> EbonyBlocks.EBONY_LOG.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)) , MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> EBONY_FENCE = registerBlock("ebony_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)) , MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> EBONY_FENCE_GATE = registerBlock("ebony_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)) , MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> EBONY_BUTTON = registerBlock("ebony_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> EBONY_PRESSURE_PLATE = registerBlock("ebony_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> EBONY_DOOR = registerBlock("ebony_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    public static final RegistryObject<Block> EBONY_TRAPDOOR = registerBlock("ebony_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)),
            MattamsCreativeModeTab.MATTAMS_TAB);

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return EbonyItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
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
