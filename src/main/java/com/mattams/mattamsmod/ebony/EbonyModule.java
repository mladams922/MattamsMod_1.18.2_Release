package com.mattams.mattamsmod.ebony;

import com.mattams.mattamsmod.redwood.RedwoodBlocks;
import com.mattams.mattamsmod.redwood.RedwoodItems;
import net.minecraftforge.eventbus.api.IEventBus;

public class EbonyModule {
    public static void register(IEventBus eventBus){
        EbonyItems.register(eventBus);
        EbonyBlocks.register(eventBus);
    }
}
