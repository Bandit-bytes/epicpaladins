package net.bandit.epicpaladins.client.armors.angel;


import mod.azure.azurelib.common.api.client.renderer.GeoArmorRenderer;
import net.bandit.epicpaladins.item.armor.angel.AngelArmor;


public class AngelArmorRenderer extends GeoArmorRenderer<AngelArmor> {
    public AngelArmorRenderer() {
        super(new AngelArmorModel());

    }
}
