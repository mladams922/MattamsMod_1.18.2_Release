package com.mattams.mattamsmod.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.mattams.mattamsmod.MattamsMod;
import com.mattams.mattamsmod.brass.BrassBlocks;
import com.mattams.mattamsmod.citrine.CitrineBlocks;
import com.mattams.mattamsmod.ebony.EbonyBlocks;
import com.mattams.mattamsmod.redwood.RedwoodBlocks;
import com.mattams.mattamsmod.titanium.TitaniumBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.PineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.MegaJungleTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class MattamsConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?,?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, MattamsMod.MOD_ID);

    public static void register(IEventBus eventBus){
        CONFIGURED_FEATURES.register(eventBus);
    }

    //Ore Generation

    public static final RuleTest END_STONE = new BlockMatchTest(Blocks.END_STONE);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_BRASS_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BrassBlocks.BRASS_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BrassBlocks.DEEPSLATE_BRASS_ORE.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TITANIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, TitaniumBlocks.TITANIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TitaniumBlocks.DEEPSLATE_TITANIUM_ORE.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CITRINE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, CitrineBlocks.CITRINE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, CitrineBlocks.DEEPSLATE_CITRINE_ORE.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHERRACK_CITRINE_ORE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, CitrineBlocks.NETHERRACK_CITRINE_ORE.get().defaultBlockState())
    ));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> ENDSTONE_CITRINE_ORE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(MattamsConfiguredFeatures.END_STONE, CitrineBlocks.ENDSTONE_CITRINE_ORE.get().defaultBlockState())
    ));

    public static final RegistryObject<ConfiguredFeature<?, ?>> BRASS_ORE = CONFIGURED_FEATURES.register("brass_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_BRASS_ORES.get(), 12)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> TITANIUM_ORE = CONFIGURED_FEATURES.register("titanium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TITANIUM_ORES.get(), 5)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> CITRINE_ORE = CONFIGURED_FEATURES.register("citrine_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_CITRINE_ORES.get(), 10)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_CITRINE_ORE =
            CONFIGURED_FEATURES.register("nether_citrine_ore", () -> new ConfiguredFeature<>(Feature.ORE,
                    new OreConfiguration(NETHERRACK_CITRINE_ORE.get(), 9)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> END_CITRINE_ORE =
            CONFIGURED_FEATURES.register("end_citrine_ore", () -> new ConfiguredFeature<>(Feature.ORE,
                    new OreConfiguration(ENDSTONE_CITRINE_ORE.get(), 9)));

    //Tree Generation

    public static final RegistryObject<ConfiguredFeature<?, ?>> REDWOOD_TREE =
            CONFIGURED_FEATURES.register("redwood", () ->
                    new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(RedwoodBlocks.REDWOOD_LOG.get()),
                        new MegaJungleTrunkPlacer(22, 4, 4),
                        BlockStateProvider.simple(RedwoodBlocks.REDWOOD_LEAVES.get()),
                        new PineFoliagePlacer(ConstantInt.of(5), ConstantInt.of(1), ConstantInt.of(4)),
                        new TwoLayersFeatureSize(1, 0, 2)).build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>> REDWOOD_SPAWN =
            CONFIGURED_FEATURES.register("redwood_spawn", () ->
                new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
                        new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                        MattamsPlacedFeatures.REDWOOD_CHECKED.getHolder().get(),
                        0.5F)), MattamsPlacedFeatures.REDWOOD_CHECKED.getHolder().get())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> EBONY_TREE =
            CONFIGURED_FEATURES.register("ebony", () ->
                new ConfiguredFeature<>(
                    Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(EbonyBlocks.EBONY_LOG.get()),
                    new MegaJungleTrunkPlacer(22, 4, 4),
                    BlockStateProvider.simple(EbonyBlocks.EBONY_LEAVES.get()),
                    new PineFoliagePlacer(ConstantInt.of(5), ConstantInt.of(1), ConstantInt.of(4)),
                    new TwoLayersFeatureSize(1, 0, 2)).build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>> EBONY_SPAWN =
            CONFIGURED_FEATURES.register("ebony_spawn", () ->
                    new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
                            new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                                    MattamsPlacedFeatures.EBONY_CHECKED.getHolder().get(),
                                    0.5F)), MattamsPlacedFeatures.EBONY_CHECKED.getHolder().get())));

    /*public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> EBONY_TREE =
            FeatureUtils.register("ebony", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(EbonyBlocks.EBONY_LOG.get()),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.simple(EbonyBlocks.EBONY_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<PlacedFeature> EBONY_CHECKED =
            PlacementUtils.register("ebony_checked", EBONY_TREE,
                    PlacementUtils.filteredByBlockSurvival(EbonyBlocks.EBONY_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> EBONY_SPAWN =
            FeatureUtils.register("ebony_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(EBONY_CHECKED,
                            0.5F)), EBONY_CHECKED));*/
}
