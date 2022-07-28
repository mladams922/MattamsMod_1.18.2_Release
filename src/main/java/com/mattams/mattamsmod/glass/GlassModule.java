package com.mattams.mattamsmod.glass;

import net.minecraftforge.eventbus.api.IEventBus;

public class GlassModule {
    public static void register(IEventBus eventBus){
        GlassItems.register(eventBus);
        GlassBlocks.register(eventBus);
    }
}
