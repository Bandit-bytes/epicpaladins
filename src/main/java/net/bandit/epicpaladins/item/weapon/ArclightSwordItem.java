package net.bandit.epicpaladins.item.weapon;

import mod.azure.azurelib.common.internal.client.RenderProvider;
import net.bandit.epicpaladins.client.weapons.arclight.ArclightItemRenderer;
import net.bandit.epicpaladins.item.lib.EPWeaponItem;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

import java.util.function.Consumer;

public class ArclightSwordItem extends EPWeaponItem {
    public ArclightSwordItem(Tier tier, Properties properties) {
        super(tier, properties);
    }

    // Creates the render
    @Override
    public void createRenderer(Consumer<RenderProvider> consumer) {
        consumer.accept(new RenderProvider() {
            private ArclightItemRenderer renderer = null;
            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                if (renderer == null)
                    return new ArclightItemRenderer();
                return this.renderer;
            }
        });
    }

}