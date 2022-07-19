package com.mattams.mattamsmod.world.feature.tree;

import com.mattams.mattamsmod.world.feature.MattamsConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class RedwoodTreeGrower extends AbstractTreeGrower {

    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random pRandom, boolean pLargeHive) {
        return MattamsConfiguredFeatures.REDWOOD_TREE;
    }
}
