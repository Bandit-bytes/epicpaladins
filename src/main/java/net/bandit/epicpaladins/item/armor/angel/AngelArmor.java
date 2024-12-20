package net.bandit.epicpaladins.item.armor.angel;


import mod.azure.azurelib.common.internal.client.RenderProvider;
import net.bandit.epicpaladins.client.armors.angel.AngelArmorRenderer;
import net.bandit.epicpaladins.item.lib.EPArmorItem;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;


public class AngelArmor extends EPArmorItem {


    public AngelArmor(Holder<ArmorMaterial> holder, Type type, Properties properties) {
        super(holder, type, properties);
    }

    @Override
    public void createRenderer(Consumer<RenderProvider> consumer) {
        consumer.accept(new RenderProvider() {
            private AngelArmorRenderer renderer;

            @Override
            public @NotNull HumanoidModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<LivingEntity> original) {
                if (renderer == null)
                    return new AngelArmorRenderer();
                renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
                return this.renderer;
            }
        });
    }
}
