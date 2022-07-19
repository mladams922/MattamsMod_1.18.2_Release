package com.mattams.mattamsmod.redwood;

import com.mattams.mattamsmod.brass.BrassBlocks;
import com.mattams.mattamsmod.brass.BrassItems;
import net.minecraftforge.eventbus.api.IEventBus;

public class RedwoodModule {
    public static void register(IEventBus eventBus){
        RedwoodItems.register(eventBus);
        RedwoodBlocks.register(eventBus);
    }
}
