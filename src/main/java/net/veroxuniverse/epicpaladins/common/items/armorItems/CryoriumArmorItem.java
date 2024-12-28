package net.veroxuniverse.epicpaladins.common.items.armorItems;

import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.veroxuniverse.epicpaladins.client.items.armors.cryorium.CryoriumArmorModel;
import net.veroxuniverse.epicpaladins.client.items.armors.cryorium.CryoriumArmorRenderer;
import net.veroxuniverse.epicpaladins.common.items.armorItems.geckolib.PaladinArmorItem;
import net.veroxuniverse.epicpaladins.common.registries.items.ArmorMaterialsRegistry;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CryoriumArmorItem extends PaladinArmorItem {
    public CryoriumArmorItem(Holder<ArmorMaterial> pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new CryoriumArmorRenderer(new CryoriumArmorModel());
    }
}