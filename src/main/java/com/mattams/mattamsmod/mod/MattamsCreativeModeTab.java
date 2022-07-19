package com.mattams.mattamsmod.mod;

import com.mattams.mattamsmod.brass.BrassItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MattamsCreativeModeTab {
    public static final CreativeModeTab MATTAMS_TAB = new CreativeModeTab("mattamstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BrassItems.BRASS_INGOT.get());
        }
    };
}
