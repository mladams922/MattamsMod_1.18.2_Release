package com.mattams.mattamsmod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class MattamsPlacedFeatures {
    public static final Holder<PlacedFeature> BRASS_ORE_PLACED = PlacementUtils.register("brass_ore_placed",
            MattamsConfiguredFeatures.BRASS_ORE, MattamsOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(250))));

    public static final Holder<PlacedFeature> TITANIUM_ORE_PLACED = PlacementUtils.register("titanium_ore_placed",
            MattamsConfiguredFeatures.TITANIUM_ORE, MattamsOrePlacement.commonOrePlacement(5,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(250))));

    public static final Holder<PlacedFeature> CITRINE_ORE_PLACED = PlacementUtils.register("citrine_ore_placed",
            MattamsConfiguredFeatures.CITRINE_ORE, MattamsOrePlacement.commonOrePlacement(8,
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(50))));

    public static final Holder<PlacedFeature> NETHER_CITRINE_ORE_PLACED = PlacementUtils.register("nether_citrine_ore_placed",
            MattamsConfiguredFeatures.NETHER_CITRINE_ORE, MattamsOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(20))));

    public static final Holder<PlacedFeature> END_CITRINE_ORE_PLACED = PlacementUtils.register("end_citrine_ore_placed",
            MattamsConfiguredFeatures.END_CITRINE_ORE, MattamsOrePlacement.commonOrePlacement(9,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(130))));

    public static final Holder<PlacedFeature> REDWOOD_PLACED = PlacementUtils.register("redwood_placed",
            MattamsConfiguredFeatures.REDWOOD_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(6, 0.5f, 4)
            ));

    public static final Holder<PlacedFeature> EBONY_PLACED = PlacementUtils.register("ebony_placed",
            MattamsConfiguredFeatures.EBONY_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(6, 0.5f, 4)
            ));

    /*public static final Holder<PlacedFeature> EBONY_PLACED = PlacementUtils.register("ebony_placed",
            MattamsConfiguredFeatures.EBONY_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(6, 0.5f, 4)
            ));*/
}
