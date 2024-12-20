package net.bandit.epicpaladins.item.lib;

import mod.azure.azurelib.common.api.common.animatable.GeoItem;
import mod.azure.azurelib.common.internal.client.RenderProvider;
import mod.azure.azurelib.common.internal.common.util.AzureLibUtil;
import mod.azure.azurelib.core.animatable.instance.AnimatableInstanceCache;
import mod.azure.azurelib.core.animation.AnimatableManager;
import mod.azure.azurelib.core.animation.AnimationState;
import mod.azure.azurelib.core.object.PlayState;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import java.util.function.Consumer;

public class EPWeaponItem extends SwordItem implements GeoItem {

    private final AnimatableInstanceCache cache = AzureLibUtil.createInstanceCache(this);

    public EPWeaponItem(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public void createRenderer(Consumer<RenderProvider> consumer) {

    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {

    }
    private PlayState predicate(AnimationState<EPWeaponItem> animationState) {
        return PlayState.STOP;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
}
