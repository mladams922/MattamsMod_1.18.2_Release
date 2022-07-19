package com.mattams.mattamsmod.citrine;

import net.minecraftforge.eventbus.api.IEventBus;

public class CitrineModule {
    public static void register(IEventBus eventBus){
        CitrineItems.register(eventBus);
        CitrineBlocks.register(eventBus);
    }
}
