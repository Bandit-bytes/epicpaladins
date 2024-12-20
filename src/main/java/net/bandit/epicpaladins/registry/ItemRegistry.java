package net.bandit.epicpaladins.registry;

import net.bandit.epicpaladins.EpicPaladinsMod;
import net.bandit.epicpaladins.item.armor.EPArmorMaterials;
import net.bandit.epicpaladins.item.armor.angel.AngelArmor;
import net.bandit.epicpaladins.item.weapon.ArclightSwordItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EpicPaladinsMod.MOD_ID);

    //ARMOR
    public static final DeferredHolder<Item, AngelArmor> ANGEL_HELMET = ITEMS.register(
            "angel_helmet",
            () -> new AngelArmor(EPArmorMaterials.ANGEL, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.EPIC).stacksTo(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(53))));
    public static final DeferredHolder<Item, AngelArmor> ANGEL_CHESTPLATE = ITEMS.register(
            "angel_chestplate",
            () -> new AngelArmor(EPArmorMaterials.ANGEL, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.EPIC).stacksTo(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(53))));
    public static final DeferredHolder<Item, AngelArmor> ANGEL_LEGGINGS = ITEMS.register(
            "angel_leggings",
            () -> new AngelArmor(EPArmorMaterials.ANGEL, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.EPIC).stacksTo(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(53))));
    public static final DeferredHolder<Item, AngelArmor> ANGEL_BOOTS = ITEMS.register(
            "angel_boots",
            () -> new AngelArmor(EPArmorMaterials.ANGEL, ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.EPIC).stacksTo(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(53))));
//WEAPONS
public static final DeferredItem<Item> ANGEL_SWORD = ITEMS.register("angel_sword",
        () -> new ArclightSwordItem(ItemMaterialsRegistry.NETHERITE, new Item.Properties().rarity(Rarity.EPIC)
                .attributes(SwordItem.createAttributes(ItemMaterialsRegistry.NETHERITE,9 , -1.0f)).fireResistant()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
