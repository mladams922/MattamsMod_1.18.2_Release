package com.mattams.mattamsmod.ebony;

import com.mattams.mattamsmod.MattamsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EbonyItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MattamsMod.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
