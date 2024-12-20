package net.bandit.epicpaladins.client.weapons.arclight;

import mod.azure.azurelib.common.api.client.model.GeoModel;
import mod.azure.azurelib.core.animatable.GeoAnimatable;
import net.bandit.epicpaladins.EpicPaladinsMod;
import net.minecraft.resources.ResourceLocation;

public class ArclightItemModel extends GeoModel {
    @Override
    public ResourceLocation getModelResource(GeoAnimatable animatable) {
        return ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "geo/angel_sword.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GeoAnimatable animatable) {
        return ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "textures/item/angel_sword.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GeoAnimatable animatable) {
        return null;
    }
}
