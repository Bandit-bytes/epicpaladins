package net.bandit.epicpaladins.client.weapons.arclight;


import mod.azure.azurelib.common.api.client.renderer.GeoItemRenderer;
import net.bandit.epicpaladins.item.weapon.ArclightSwordItem;

public class ArclightItemRenderer extends GeoItemRenderer<ArclightSwordItem> {
    public ArclightItemRenderer() {
        super(new ArclightItemModel());
    }
}
