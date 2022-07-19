package com.mattams.mattamsmod.world.feature;

import com.mattams.mattamsmod.brass.BrassBlocks;
import com.mattams.mattamsmod.citrine.CitrineBlocks;
import com.mattams.mattamsmod.ebony.EbonyBlocks;
import com.mattams.mattamsmod.redwood.RedwoodBlocks;
import com.mattams.mattamsmod.titanium.TitaniumBlocks;
import net.minecraft.core.Holder;
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

import java.util.List;

public class MattamsConfiguredFeatures {
    //Ore Generation

    public static final RuleTest END_STONE = new BlockMatchTest(Blocks.END_STONE);

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_BRASS_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BrassBlocks.BRASS_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BrassBlocks.DEEPSLATE_BRASS_ORE.get().defaultBlockState())
    );

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TITANIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, TitaniumBlocks.TITANIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, TitaniumBlocks.DEEPSLATE_TITANIUM_ORE.get().defaultBlockState())
    );

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_CITRINE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, CitrineBlocks.CITRINE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, CitrineBlocks.DEEPSLATE_CITRINE_ORE.get().defaultBlockState())
    );

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BRASS_ORE = FeatureUtils.register("brass_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_BRASS_ORES, 12));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TITANIUM_ORE = FeatureUtils.register("titanium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_TITANIUM_ORES, 5));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CITRINE_ORE = FeatureUtils.register("citrine_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_CITRINE_ORES, 12));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_CITRINE_ORE =
            FeatureUtils.register("nether_citrine_ore", Feature.ORE,
                    new OreConfiguration(OreFeatures.NETHERRACK,
                            CitrineBlocks.NETHERRACK_CITRINE_ORE.get().defaultBlockState(), 9));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> END_CITRINE_ORE =
            FeatureUtils.register("end_citrine_ore", Feature.ORE,
                    new OreConfiguration(END_STONE,
                            CitrineBlocks.ENDSTONE_CITRINE_ORE.get().defaultBlockState(), 9));

    //Tree Generation

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> REDWOOD_TREE =
            FeatureUtils.register("redwood", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(RedwoodBlocks.REDWOOD_LOG.get()),
                    new MegaJungleTrunkPlacer(22, 4, 4),
                    BlockStateProvider.simple(RedwoodBlocks.REDWOOD_LEAVES.get()),
                    new PineFoliagePlacer(ConstantInt.of(5), ConstantInt.of(1), ConstantInt.of(4)),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<PlacedFeature> REDWOOD_CHECKED =
            PlacementUtils.register("redwood_checked", REDWOOD_TREE,
                    PlacementUtils.filteredByBlockSurvival(RedwoodBlocks.REDWOOD_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> REDWOOD_SPAWN =
            FeatureUtils.register("redwood_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(REDWOOD_CHECKED,
                            0.5F)), REDWOOD_CHECKED));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> EBONY_TREE =
            FeatureUtils.register("ebony", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(EbonyBlocks.EBONY_LOG.get()),
                    new MegaJungleTrunkPlacer(22, 4, 4),
                    BlockStateProvider.simple(EbonyBlocks.EBONY_LEAVES.get()),
                    new PineFoliagePlacer(ConstantInt.of(5), ConstantInt.of(1), ConstantInt.of(4)),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<PlacedFeature> EBONY_CHECKED =
            PlacementUtils.register("ebony_checked", EBONY_TREE,
                    PlacementUtils.filteredByBlockSurvival(EbonyBlocks.EBONY_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> EBONY_SPAWN =
            FeatureUtils.register("ebony_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(EBONY_CHECKED,
                            0.5F)), EBONY_CHECKED));

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
