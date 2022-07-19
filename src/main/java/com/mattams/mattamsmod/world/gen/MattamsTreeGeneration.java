package com.mattams.mattamsmod.world.gen;

import com.mattams.mattamsmod.world.feature.MattamsPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.Set;

public class MattamsTreeGeneration {
    public static void generateTrees(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

        if(types.contains(BiomeDictionary.Type.PLAINS) ||
                types.contains(BiomeDictionary.Type.MOUNTAIN)){
            base.add(MattamsPlacedFeatures.REDWOOD_PLACED);
        }
        if(types.contains(BiomeDictionary.Type.DEAD) ||
            types.contains(BiomeDictionary.Type.DRY) ||
            types.contains(BiomeDictionary.Type.HOT) ||
            types.contains((BiomeDictionary.Type.SWAMP))) {
            base.add(MattamsPlacedFeatures.EBONY_PLACED);
        }
    }
}
