package com.mattams.mattamsmod.event;

import com.mattams.mattamsmod.MattamsMod;
import com.mattams.mattamsmod.brass.BrassBlocks;
import com.mattams.mattamsmod.ebony.EbonyBlocks;
import com.mattams.mattamsmod.glass.GlassBlocks;
import com.mattams.mattamsmod.redwood.RedwoodBlocks;
import com.mattams.mattamsmod.titanium.TitaniumBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MattamsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event){
        setGlassModuleRenderLayer();

        ItemBlockRenderTypes.setRenderLayer(BrassBlocks.BRASS_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BrassBlocks.BRASS_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(TitaniumBlocks.TITANIUM_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TitaniumBlocks.TITANIUM_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(RedwoodBlocks.REDWOOD_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EbonyBlocks.EBONY_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EbonyBlocks.EBONY_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(EbonyBlocks.EBONY_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EbonyBlocks.EBONY_SAPLING.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(RedwoodBlocks.REDWOOD_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(RedwoodBlocks.REDWOOD_SAPLING.get(), RenderType.cutout());
    }

    private static void setGlassModuleRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.GLASS_STAIRS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.GLASS_BUTTON.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.GLASS_FENCE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.GLASS_FENCE_GATE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.GLASS_PRESSURE_PLATE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.GLASS_WALL.get(), RenderType.translucent());
/*
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.BLACK_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.BLACK_STAINED_GLASS_STAIRS.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.GRAY_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.GRAY_STAINED_GLASS_STAIRS.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.WHITE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.WHITE_STAINED_GLASS_STAIRS.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.BROWN_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.BROWN_STAINED_GLASS_STAIRS.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.RED_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.RED_STAINED_GLASS_STAIRS.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.ORANGE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.ORANGE_STAINED_GLASS_STAIRS.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.YELLOW_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.YELLOW_STAINED_GLASS_STAIRS.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.LIME_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.LIME_STAINED_GLASS_STAIRS.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.GREEN_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.GREEN_STAINED_GLASS_STAIRS.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.CYAN_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.CYAN_STAINED_GLASS_STAIRS.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.BLUE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.BLUE_STAINED_GLASS_STAIRS.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.PINK_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.PINK_STAINED_GLASS_STAIRS.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.PURPLE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.PURPLE_STAINED_GLASS_STAIRS.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.MAGENTA_STAINED_GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.MAGENTA_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
        */

    }
}
