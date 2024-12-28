package net.veroxuniverse.epicpaladins.common.items.armorItems;

import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.veroxuniverse.epicpaladins.client.items.armors.arclight.ArclightArmorModel;
import net.veroxuniverse.epicpaladins.client.items.armors.arclight.ArclightArmorRenderer;
import net.veroxuniverse.epicpaladins.common.items.armorItems.geckolib.PaladinArmorItem;
import net.veroxuniverse.epicpaladins.common.registries.items.ArmorMaterialsRegistry;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ArclightArmorItem extends PaladinArmorItem {
    public ArclightArmorItem(Holder<ArmorMaterial> material, ArmorItem.Type slot, Item.Properties properties) {
        super(material, slot, properties);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new ArclightArmorRenderer(new ArclightArmorModel());
    }
}