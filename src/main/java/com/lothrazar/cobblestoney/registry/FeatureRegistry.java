package com.lothrazar.cobblestoney.registry;

import java.util.List;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class FeatureRegistry {

  private static List<PlacementModifier> orePlacement(PlacementModifier plac, PlacementModifier mod) {
    return List.of(plac, InSquarePlacement.spread(), mod, BiomeFilter.biome());
  }

  private static List<PlacementModifier> commonOrePlacement(int i, PlacementModifier mod) {
    return orePlacement(CountPlacement.of(i), mod);
  }

  private static List<PlacementModifier> rareOrePlacement(int i, PlacementModifier mod) {
    return orePlacement(RarityFilter.onAverageOnceEvery(i), mod);
  }

  private static final RuleTest NATURAL_STONE = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
  private static final RuleTest DEEP_STONE = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
  //

  //registered features
  public static final ConfiguredFeature<?, ?> ORE_JADE = FeatureUtils.register("ore_granite_jade",
      Feature.ORE.configured(new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.GRANITE_JADE.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.GRANITE_JADE.get().defaultBlockState())), 16)));
  public static final ConfiguredFeature<?, ?> ORE_GRANITE_SOLADITE = FeatureUtils.register("ore_granite_soladite",
      Feature.ORE.configured(new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.GRANITE_SOLADITE.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.GRANITE_SOLADITE.get().defaultBlockState())), 16)));
  public static final ConfiguredFeature<?, ?> ORE_GRANITE_COBBLED = FeatureUtils.register("ore_granite_cobbled",
      Feature.ORE.configured(new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.GRANITE_COBBLED.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.GRANITE_COBBLED.get().defaultBlockState())), 32)));
  public static final ConfiguredFeature<?, ?> ORE_DIORITE_COBBLED = FeatureUtils.register("ore_diorite_cobbled",
      Feature.ORE.configured(new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.DIORITE_COBBLED.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.DIORITE_COBBLED.get().defaultBlockState())), 32)));
  public static final ConfiguredFeature<?, ?> ORE_ANDESITE_COBBLED = FeatureUtils.register("ore_andesite_cobbled",
      Feature.ORE.configured(new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.ANDESITE_COBBLED.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.ANDESITE_COBBLED.get().defaultBlockState())), 32)));
  public static final ConfiguredFeature<?, ?> ORE_RED = FeatureUtils.register("ore_granite_red",
      Feature.ORE.configured(new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.GRANITE_RED.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.GRANITE_RED.get().defaultBlockState())), 16)));
  public static final ConfiguredFeature<?, ?> ORE_CECILIA = FeatureUtils.register("ore_granite_cecilia",
      Feature.ORE.configured(new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.GRANITE_CECILIA.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.GRANITE_CECILIA.get().defaultBlockState())), 64)));
  // placed features
  //
  public static final PlacedFeature ORE_JADE_UPPER = PlacementUtils.register("ore_granite_jade_upper",
      FeatureRegistry.ORE_JADE.placed(rareOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128)))));
  public static final PlacedFeature ORE_JADE_LOWER = PlacementUtils.register("ore_granite_jade_lower",
      FeatureRegistry.ORE_JADE.placed(commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60)))));
  //
  public static final PlacedFeature ORE_FROZEN_UPPER = PlacementUtils.register("ore_granite_soladite_upper",
      FeatureRegistry.ORE_GRANITE_SOLADITE.placed(rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128)))));
  public static final PlacedFeature ORE_FROZEN_LOWER = PlacementUtils.register("ore_granite_soladite_lower",
      FeatureRegistry.ORE_GRANITE_SOLADITE.placed(commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60)))));
  //
  public static final PlacedFeature ORE_DIORITE_UPPER = PlacementUtils.register("ore_diorite_upper",
      FeatureRegistry.ORE_DIORITE_COBBLED.placed(rareOrePlacement(9, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128)))));
  public static final PlacedFeature ORE_DIORITE_LOWER = PlacementUtils.register("ore_diorite_lower",
      FeatureRegistry.ORE_DIORITE_COBBLED.placed(commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60)))));
  //
  public static final PlacedFeature ORE_ANDESITE_UPPER = PlacementUtils.register("ore_andesite_upper",
      FeatureRegistry.ORE_ANDESITE_COBBLED.placed(rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128)))));
  public static final PlacedFeature ORE_ANDESITE_LOWER = PlacementUtils.register("ore_andesite_lower",
      FeatureRegistry.ORE_ANDESITE_COBBLED.placed(commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(60)))));
  //
  public static final PlacedFeature ORE_GRANITE_UPPER = PlacementUtils.register("ore_granite_upper",
      FeatureRegistry.ORE_GRANITE_COBBLED.placed(rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128)))));
  public static final PlacedFeature ORE_GRANITE_LOWER = PlacementUtils.register("ore_granite_lower",
      FeatureRegistry.ORE_GRANITE_COBBLED.placed(commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(60)))));
  //
  public static final PlacedFeature ORE_RED_UPPER = PlacementUtils.register("ore_granite_red_upper",
      FeatureRegistry.ORE_RED.placed(rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(16), VerticalAnchor.absolute(64)))));
  public static final PlacedFeature ORE_RED_LOWER = PlacementUtils.register("ore_granite_red_lower",
      FeatureRegistry.ORE_RED.placed(commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-128), VerticalAnchor.absolute(32)))));
  //
  public static final PlacedFeature ORE_CELICIA_UPPER = PlacementUtils.register("ore_granite_cecilia_upper",
      FeatureRegistry.ORE_CECILIA.placed(rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128)))));
  public static final PlacedFeature ORE_CELICIA_LOWER = PlacementUtils.register("ore_granite_cecilia_lower",
      FeatureRegistry.ORE_CECILIA.placed(commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(60)))));
}
