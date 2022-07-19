package com.mattams.mattamsmod.world.feature;

import com.mattams.mattamsmod.MattamsMod;
import com.mattams.mattamsmod.world.gen.MattamsOreGeneration;
import com.mattams.mattamsmod.world.gen.MattamsTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MattamsMod.MOD_ID)
public class MattamsWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event){
        MattamsTreeGeneration.generateTrees(event);
        MattamsOreGeneration.generateOres(event);
    }
}
