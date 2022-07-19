package com.mattams.mattamsmod.titanium;

import com.mattams.mattamsmod.brass.BrassBlocks;
import com.mattams.mattamsmod.brass.BrassItems;
import net.minecraftforge.eventbus.api.IEventBus;

public class TitaniumModule {
    public static void register(IEventBus eventBus){
        TitaniumItems.register(eventBus);
        TitaniumBlocks.register(eventBus);
    }
}
