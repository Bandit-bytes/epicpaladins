package net.veroxuniverse.epicpaladins;

import com.mojang.logging.LogUtils;
import net.veroxuniverse.epicpaladins.common.registries.BlocksRegistry;
import net.veroxuniverse.epicpaladins.common.registries.ItemsRegistry;
import net.veroxuniverse.epicpaladins.common.registries.TabRegistry;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.veroxuniverse.epicpaladins.common.registries.items.ArmorMaterialsRegistry;
import org.slf4j.Logger;

@Mod(EpicPaladinsMod.MOD_ID)
public class EpicPaladinsMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "epicpaladins";
    private static final Logger LOGGER = LogUtils.getLogger();

    public EpicPaladinsMod(IEventBus modEventBus, ModContainer modContainer) {

        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
        TabRegistry.register(modEventBus);
        ItemsRegistry.register(modEventBus);
        BlocksRegistry.register(modEventBus);
        ArmorMaterialsRegistry.register(modEventBus);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
