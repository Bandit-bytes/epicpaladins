package net.bandit.epicpaladins.registry;

import net.bandit.epicpaladins.EpicPaladinsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TabRegistry { public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EpicPaladinsMod.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EP_TAB_ITEMS = CREATIVE_MODE_TABS.register("ep_tab_items", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.items." + EpicPaladinsMod.MOD_ID))
            .icon(() -> ItemRegistry.ANGEL_HELMET.get().getDefaultInstance())
            .displayItems((parameters, output) -> {

                ItemRegistry.ITEMS.getEntries().forEach(item -> {
                    output.accept(item.get());

                });
            }).build());

    public static void register(net.neoforged.bus.api.IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
