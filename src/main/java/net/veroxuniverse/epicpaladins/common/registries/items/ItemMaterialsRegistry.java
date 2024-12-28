package net.veroxuniverse.epicpaladins.common.registries.items;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.veroxuniverse.epicpaladins.common.registries.CustomTier;
import net.veroxuniverse.epicpaladins.common.registries.ItemsRegistry;

import java.util.function.Supplier;

public class ItemMaterialsRegistry {

    // Define tool tiers as static final constants
    public static final Tier STEEL = new CustomTier(
            3, // Harvest level
            12.0f, // Mining speed
            0.0f, // Attack damage bonus
            12, // Enchantability
            BlockTags.NEEDS_IRON_TOOL, // Tag for required block
            () -> Ingredient.of(ItemsRegistry.STEEL_INGOT.get()) // Repair ingredient
    );

    public static final Tier JADE = new CustomTier(
            4, // Harvest level
            12.0f, // Mining speed
            0.0f, // Attack damage bonus
            25, // Enchantability
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ItemsRegistry.JADE_GEM.get())
    );

    public static final Tier ARCLIGHT = new CustomTier(
            4, // Harvest level
            12.0f, // Mining speed
            0.0f, // Attack damage bonus
            25, // Enchantability
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ItemsRegistry.ARCLIGHT_GEM.get())
    );

    public static final Tier MOONLIGHT = new CustomTier(
            4, // Harvest level
            12.0f, // Mining speed
            5.0f, // Attack damage bonus
            30, // Enchantability
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.DIAMOND)
    );

    public static final Tier SCULK = new CustomTier(
            4, // Harvest level
            12.0f, // Mining speed
            0.0f, // Attack damage bonus
            25, // Enchantability
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(net.minecraft.world.item.Items.ECHO_SHARD)
    );

    public static final Tier BLOODSTONE = new CustomTier(
            4, // Harvest level
            12.0f, // Mining speed
            0.0f, // Attack damage bonus
            25, // Enchantability
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ItemsRegistry.BLOODSTONE_GEM.get())
    );

    public static final Tier CRYORIUM = new CustomTier(
            4, // Harvest level
            12.0f, // Mining speed
            0.0f, // Attack damage bonus
            25, // Enchantability
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ItemsRegistry.CRYORIUM_GEM.get())
    );
}
