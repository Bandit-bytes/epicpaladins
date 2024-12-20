package net.bandit.epicpaladins.client.armors.angel;

import mod.azure.azurelib.common.api.client.model.GeoModel;
import net.bandit.epicpaladins.EpicPaladinsMod;
import net.bandit.epicpaladins.item.armor.angel.AngelArmor;
import net.minecraft.resources.ResourceLocation;

public class AngelArmorModel extends GeoModel<AngelArmor> {
    @Override
    public ResourceLocation getModelResource(AngelArmor angelArmor) {
        return ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "geo/angel_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AngelArmor angelArmor) {
        return ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "textures/armor/angel_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AngelArmor angelArmor) {
        return null;
    }
}
