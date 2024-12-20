package net.bandit.epicpaladins.item.armor;

import net.bandit.epicpaladins.EpicPaladinsMod;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;

public class EPArmorMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS =
            DeferredRegister.create(Registries.ARMOR_MATERIAL, EpicPaladinsMod.MOD_ID);

    public static final Holder<ArmorMaterial> ANGEL =
            ARMOR_MATERIALS.register("angel", () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 6);
                        map.put(ArmorItem.Type.LEGGINGS, 9);
                        map.put(ArmorItem.Type.CHESTPLATE, 14);
                        map.put(ArmorItem.Type.HELMET, 5);
                    }), 25, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> Ingredient.of(Items.DIAMOND),
                    List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "angel"))),
                    4, 0.3F));


    public static void register(IEventBus eventBus) {
        ARMOR_MATERIALS.register(eventBus);
    }
}
