package com.mattams.mattamsmod.world.feature;

import com.mattams.mattamsmod.MattamsMod;
import com.mattams.mattamsmod.ebony.EbonyBlocks;
import com.mattams.mattamsmod.redwood.RedwoodBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class MattamsPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, MattamsMod.MOD_ID);

    public static void register(IEventBus eventBus){
        PLACED_FEATURES.register(eventBus);
    }

    public static final RegistryObject<PlacedFeature> BRASS_ORE_PLACED = PLACED_FEATURES.register("brass_ore_placed",
            () -> new PlacedFeature(MattamsConfiguredFeatures.BRASS_ORE.getHolder().get(),
                    MattamsOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(250)))));

    public static final RegistryObject<PlacedFeature> TITANIUM_ORE_PLACED = PLACED_FEATURES.register("titanium_ore_placed",
            () -> new PlacedFeature(MattamsConfiguredFeatures.TITANIUM_ORE.getHolder().get(),
                    MattamsOrePlacement.commonOrePlacement(5,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(250)))));

    public static final RegistryObject<PlacedFeature> CITRINE_ORE_PLACED = PLACED_FEATURES.register("citrine_ore_placed",
            () -> new PlacedFeature(MattamsConfiguredFeatures.CITRINE_ORE.getHolder().get(), MattamsOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-100), VerticalAnchor.aboveBottom(100)))));

    public static final RegistryObject<PlacedFeature> NETHER_CITRINE_ORE_PLACED = PLACED_FEATURES.register("nether_citrine_ore_placed",
            () -> new PlacedFeature(MattamsConfiguredFeatures.NETHER_CITRINE_ORE.getHolder().get(), MattamsOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(20)))));

    public static final RegistryObject<PlacedFeature> END_CITRINE_ORE_PLACED = PLACED_FEATURES.register("end_citrine_ore_placed",
            () -> new PlacedFeature(MattamsConfiguredFeatures.END_CITRINE_ORE.getHolder().get(), MattamsOrePlacement.commonOrePlacement(9,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(130)))));

    public static final RegistryObject<PlacedFeature> REDWOOD_CHECKED =
            PLACED_FEATURES.register("redwood_checked", () ->
                    new PlacedFeature(MattamsConfiguredFeatures.REDWOOD_TREE.getHolder().get(),
                    List.of(PlacementUtils.filteredByBlockSurvival(RedwoodBlocks.REDWOOD_SAPLING.get()))));

    public static final RegistryObject<PlacedFeature> REDWOOD_PLACED = PLACED_FEATURES.register("redwood_placed",
            () -> new PlacedFeature(MattamsConfiguredFeatures.REDWOOD_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(6, 0.5f, 4)
            )));

    public static final RegistryObject<PlacedFeature> EBONY_CHECKED =
            PLACED_FEATURES.register("ebony_checked", () ->
                    new PlacedFeature(MattamsConfiguredFeatures.EBONY_TREE.getHolder().get(),
                    List.of(PlacementUtils.filteredByBlockSurvival(EbonyBlocks.EBONY_SAPLING.get()))));

    public static final RegistryObject<PlacedFeature> EBONY_PLACED = PLACED_FEATURES.register("ebony_placed",
            () -> new PlacedFeature(MattamsConfiguredFeatures.EBONY_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(6, 0.5f, 4)
            )));

    /*public static final Holder<PlacedFeature> EBONY_PLACED = PlacementUtils.register("ebony_placed",
            MattamsConfiguredFeatures.EBONY_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(6, 0.5f, 4)
            ));*/
}
