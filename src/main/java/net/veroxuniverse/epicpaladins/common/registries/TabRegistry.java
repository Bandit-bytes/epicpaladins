package net.veroxuniverse.epicpaladins.common.registries;

import net.veroxuniverse.epicpaladins.EpicPaladinsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TabRegistry { public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EpicPaladinsMod.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EP_TAB_ITEMS = CREATIVE_MODE_TABS.register("ep_tab_items", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.item." + EpicPaladinsMod.MOD_ID))
            .icon(() -> ItemsRegistry.ANGEL_SWORD.get().getDefaultInstance())
            .displayItems((parameters, output) -> {

                ItemsRegistry.ITEMS.getEntries().forEach(item -> {
                    output.accept(item.get());

                });
            }).build());

    public static void register(net.neoforged.bus.api.IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
