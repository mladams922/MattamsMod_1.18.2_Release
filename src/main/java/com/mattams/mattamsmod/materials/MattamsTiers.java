package com.mattams.mattamsmod.materials;

import com.mattams.mattamsmod.brass.BrassItems;
import com.mattams.mattamsmod.citrine.CitrineItems;
import com.mattams.mattamsmod.titanium.TitaniumItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class MattamsTiers {
    public static final ForgeTier BRASS = new ForgeTier(2, 1000, 4.0f, 3.0f,
        25, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(BrassItems.BRASS_INGOT.get()));

    public static final ForgeTier TITANIUM = new ForgeTier(4, 2500, 10.0f, 5f,
            30, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(TitaniumItems.TITANIUM_INGOT.get()));

    public static final ForgeTier CITRINE = new ForgeTier(3, 1200, 7.0f, 10f,
            15, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(CitrineItems.CITRINE.get()));
}
