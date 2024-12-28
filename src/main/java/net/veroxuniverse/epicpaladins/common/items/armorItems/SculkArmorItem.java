package net.veroxuniverse.epicpaladins.common.items.armorItems;

import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.veroxuniverse.epicpaladins.client.items.armors.sculk.SculkArmorModel;
import net.veroxuniverse.epicpaladins.client.items.armors.sculk.SculkArmorRenderer;
import net.veroxuniverse.epicpaladins.common.items.armorItems.geckolib.PaladinArmorItem;

import net.veroxuniverse.epicpaladins.common.registries.items.ArmorMaterialsRegistry;
import software.bernie.geckolib.renderer.GeoArmorRenderer;


public class SculkArmorItem extends PaladinArmorItem {
    public SculkArmorItem(Holder<ArmorMaterial> pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new SculkArmorRenderer(new SculkArmorModel());
    }

//    @Override
//    public void onArmorTick(ItemStack stack, Level level, Player player) {
//        if(!level.isClientSide()) {
//            if(player.getInventory().getArmor(EquipmentSlot.HEAD.getIndex()).is(ItemsRegistry.SCULK_HELMET.get())) {
//                if(player.hasEffect(MobEffects.BLINDNESS)) player.removeEffect(MobEffects.BLINDNESS);
//                if(player.hasEffect(MobEffects.DARKNESS)) player.removeEffect(MobEffects.DARKNESS);
//            }
//
//            if(player.getInventory().getArmor(EquipmentSlot.LEGS.getIndex()).is(ItemsRegistry.SCULK_LEGGINGS.get())) {
//                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 25, 0, true, false, false));
//            }
//        }
//    }
}