package com.mattams.mattamsmod;

import com.mattams.mattamsmod.brass.BrassBlocks;
import com.mattams.mattamsmod.brass.BrassModule;
import com.mattams.mattamsmod.citrine.CitrineModule;
import com.mattams.mattamsmod.ebony.EbonyBlocks;
import com.mattams.mattamsmod.ebony.EbonyModule;
import com.mattams.mattamsmod.glass.GlassBlocks;
import com.mattams.mattamsmod.glass.GlassModule;
import com.mattams.mattamsmod.redwood.RedwoodBlocks;
import com.mattams.mattamsmod.redwood.RedwoodModule;
import com.mattams.mattamsmod.titanium.TitaniumBlocks;
import com.mattams.mattamsmod.titanium.TitaniumModule;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MattamsMod.MOD_ID)
public class MattamsMod
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "mattamsmod";

    public MattamsMod()
    {
        // Register the setup method for modloading
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientSetup);
        // Register the enqueueIMC method for modloading
        modEventBus.addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        modEventBus.addListener(this::processIMC);

        BrassModule.register(modEventBus);
        TitaniumModule.register(modEventBus);
        CitrineModule.register(modEventBus);
        RedwoodModule.register(modEventBus);
        EbonyModule.register(modEventBus);
        GlassModule.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event){
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.GLASS_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.GLASS_STAIRS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.GLASS_BUTTON.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.GLASS_FENCE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.GLASS_FENCE_GATE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.GLASS_PRESSURE_PLATE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(GlassBlocks.GLASS_WALL.get(), RenderType.translucent());

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

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // Some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // Some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.messageSupplier().get()).
                collect(Collectors.toList()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent)
        {
            // Register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
