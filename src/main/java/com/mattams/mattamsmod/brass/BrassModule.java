package com.mattams.mattamsmod.brass;

import net.minecraftforge.eventbus.api.IEventBus;

public class BrassModule {
    public static void register(IEventBus eventBus){
        BrassItems.register(eventBus);
        BrassBlocks.register(eventBus);
    }
}
