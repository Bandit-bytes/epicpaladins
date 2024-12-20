package net.bandit.epicpaladins.world;

import net.bandit.epicpaladins.EpicPaladinsMod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class WorldGen {

    public static final ResourceKey<PlacedFeature> ARCLIGHT_ORE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "arclight_ore_placed"));

    public WorldGen(BootstrapContext<PlacedFeature> context) {
        super();
    }

    public void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ARCLIGHT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ARCLIGHT_KEY),
                this.commonOrePlacement(3, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(13))));
    }



    private List<PlacementModifier> commonOrePlacement(int count, PlacementModifier placementModifier) {
        return this.orePlacement(CountPlacement.of(count), placementModifier);
    }

    private List<PlacementModifier> orePlacement(PlacementModifier countModifier, PlacementModifier placementModifier) {
        return List.of(countModifier, InSquarePlacement.spread(), placementModifier, BiomeFilter.biome());
    }
    private static ResourceKey<PlacedFeature> registerKey(String name) {
            return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, name));
        }

        private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                List<PlacementModifier> modifiers) {
            context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
        }
    }