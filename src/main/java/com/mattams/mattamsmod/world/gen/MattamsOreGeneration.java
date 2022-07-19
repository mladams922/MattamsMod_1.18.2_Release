package com.mattams.mattamsmod.world.gen;

import com.mattams.mattamsmod.world.feature.MattamsPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class MattamsOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event){
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(MattamsPlacedFeatures.BRASS_ORE_PLACED);
        base.add(MattamsPlacedFeatures.TITANIUM_ORE_PLACED);
        base.add(MattamsPlacedFeatures.CITRINE_ORE_PLACED);
        base.add(MattamsPlacedFeatures.NETHER_CITRINE_ORE_PLACED);
        base.add(MattamsPlacedFeatures.END_CITRINE_ORE_PLACED);
    }
}
