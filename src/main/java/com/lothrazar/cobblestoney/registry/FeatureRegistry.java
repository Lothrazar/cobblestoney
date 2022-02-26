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

  public static final ConfiguredFeature<?, ?> ORE_CALCITE_COBBLED = FeatureUtils.register("ore_calcite_cobbled",
      Feature.ORE.configured(new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.CALCITE_COBBLED.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.CALCITE_COBBLED.get().defaultBlockState())), 16)));
  public static final ConfiguredFeature<?, ?> ORE_DRIPSTONE_COBBLED = FeatureUtils.register("ore_dripstone_cobbled",
      Feature.ORE.configured(new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.DRIPSTONE_COBBLED.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.DRIPSTONE_COBBLED.get().defaultBlockState())), 16)));
  public static final ConfiguredFeature<?, ?> ORE_TUFF_COBBLED = FeatureUtils.register("ore_tuff_cobbled",
      Feature.ORE.configured(new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.TUFF_COBBLED.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.TUFF_COBBLED.get().defaultBlockState())), 16)));
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
  //granite_pink
  public static final ConfiguredFeature<?, ?> ORE_GRANITE_PINK = FeatureUtils.register("ore_granite_pink",
      Feature.ORE.configured(new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.GRANITE_PINK.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.GRANITE_PINK.get().defaultBlockState())), 16)));
  public static final ConfiguredFeature<?, ?> ORE_GRANITE_PURP = FeatureUtils.register("ore_granite_purple",
      Feature.ORE.configured(new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.GRANITE_PURPLE.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.GRANITE_PURPLE.get().defaultBlockState())), 16)));
  //stone_mud
  public static final ConfiguredFeature<?, ?> ORE_MUDSTONE = FeatureUtils.register("ore_stone_mud",
      Feature.ORE.configured(new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.STONE_MUD.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.STONE_MUD.get().defaultBlockState())), 16)));
  //stone_silt
  public static final ConfiguredFeature<?, ?> ORE_STONE_SILT = FeatureUtils.register("ore_stone_silt",
      Feature.ORE.configured(new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.STONE_SILT.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.STONE_SILT.get().defaultBlockState())), 16)));
  //dirt_sand
  public static final ConfiguredFeature<?, ?> ORE_DIRT_SAND = FeatureUtils.register("ore_dirt_sand",
      Feature.ORE.configured(new OreConfiguration(NATURAL_STONE, BlockRegistry.DIRT_SAND.get().defaultBlockState(), 16)));
  //dirt_clay
  public static final ConfiguredFeature<?, ?> ORE_DIRT_CLAY = FeatureUtils.register("ore_dirt_clay",
      Feature.ORE.configured(new OreConfiguration(NATURAL_STONE, BlockRegistry.DIRT_CLAY.get().defaultBlockState(), 8)));
  public static final ConfiguredFeature<?, ?> ORE_CLAY_SAND = FeatureUtils.register("ore_clay_sand",
      Feature.ORE.configured(new OreConfiguration(NATURAL_STONE, BlockRegistry.CLAY_SAND.get().defaultBlockState(), 4)));
  public static final ConfiguredFeature<?, ?> ORE_CLAY_SILT = FeatureUtils.register("ore_clay_silt",
      Feature.ORE.configured(new OreConfiguration(NATURAL_STONE, BlockRegistry.CLAY_SILT.get().defaultBlockState(), 4)));
  // placed features
  //
  public static final PlacedFeature ORE_JADE_UPPER = PlacementUtils.register("ore_granite_jade_upper",
      FeatureRegistry.ORE_JADE.placed(rareOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(128)))));
  public static final PlacedFeature ORE_JADE_LOWER = PlacementUtils.register("ore_granite_jade_lower",
      FeatureRegistry.ORE_JADE.placed(commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(60)))));
  //
  public static final PlacedFeature ORE_FROZEN_UPPER = PlacementUtils.register("ore_granite_soladite_upper",
      FeatureRegistry.ORE_GRANITE_SOLADITE.placed(rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(128)))));
  public static final PlacedFeature ORE_FROZEN_LOWER = PlacementUtils.register("ore_granite_soladite_lower",
      FeatureRegistry.ORE_GRANITE_SOLADITE.placed(commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(60)))));
  //
  public static final PlacedFeature ORE_DIORITE_UPPER = PlacementUtils.register("ore_diorite_upper",
      FeatureRegistry.ORE_DIORITE_COBBLED.placed(rareOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(128)))));
  public static final PlacedFeature ORE_DIORITE_LOWER = PlacementUtils.register("ore_diorite_lower",
      FeatureRegistry.ORE_DIORITE_COBBLED.placed(commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(60)))));
  //
  public static final PlacedFeature ORE_ANDESITE_UPPER = PlacementUtils.register("ore_andesite_upper",
      FeatureRegistry.ORE_ANDESITE_COBBLED.placed(rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(128)))));
  public static final PlacedFeature ORE_ANDESITE_LOWER = PlacementUtils.register("ore_andesite_lower",
      FeatureRegistry.ORE_ANDESITE_COBBLED.placed(commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()))));
  //
  public static final PlacedFeature ORE_GRANITE_UPPER = PlacementUtils.register("ore_granite_upper",
      FeatureRegistry.ORE_GRANITE_COBBLED.placed(rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(128)))));
  public static final PlacedFeature ORE_GRANITE_LOWER = PlacementUtils.register("ore_granite_lower",
      FeatureRegistry.ORE_GRANITE_COBBLED.placed(commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()))));
  //
  public static final PlacedFeature ORE_RED_UPPER = PlacementUtils.register("ore_granite_red_upper",
      FeatureRegistry.ORE_RED.placed(rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(64)))));
  public static final PlacedFeature ORE_RED_LOWER = PlacementUtils.register("ore_granite_red_lower",
      FeatureRegistry.ORE_RED.placed(commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(32)))));
  //
  public static final PlacedFeature ORE_CECILIA_UPPER = PlacementUtils.register("ore_granite_cecilia_upper",
      FeatureRegistry.ORE_CECILIA.placed(rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(128)))));
  public static final PlacedFeature ORE_CECILIA_LOWER = PlacementUtils.register("ore_granite_cecilia_lower",
      FeatureRegistry.ORE_CECILIA.placed(rareOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(60)))));
  //granite_pink
  public static final PlacedFeature ORE_PINK_UPPER = PlacementUtils.register("ore_granite_pink_upper",
      FeatureRegistry.ORE_GRANITE_PINK.placed(rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(128)))));
  public static final PlacedFeature ORE_PINK_LOWER = PlacementUtils.register("ore_granite_pink_lower",
      FeatureRegistry.ORE_GRANITE_PINK.placed(commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()))));
  public static final PlacedFeature ORE_PURPLE_UPPER = PlacementUtils.register("ore_granite_purple_upper",
      FeatureRegistry.ORE_GRANITE_PURP.placed(rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(128)))));
  public static final PlacedFeature ORE_PURPLE_LOWER = PlacementUtils.register("ore_granite_purple_lower",
      FeatureRegistry.ORE_GRANITE_PURP.placed(commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()))));
  //  stone_mud
  public static final PlacedFeature ORE_STONE_MUD = PlacementUtils.register("ore_stone_mud",
      FeatureRegistry.ORE_MUDSTONE.placed(commonOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()))));
  //  stone_silt
  public static final PlacedFeature ORE_STONESILT = PlacementUtils.register("ore_stone_silt",
      FeatureRegistry.ORE_STONE_SILT.placed(commonOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()))));
  //      dirt types
  public static final PlacedFeature ORE_DIRTSAND = PlacementUtils.register("ore_dirt_sand",
      FeatureRegistry.ORE_DIRT_SAND.placed(commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()))));
  public static final PlacedFeature ORE_DIRTCLAY = PlacementUtils.register("ore_dirt_clay",
      FeatureRegistry.ORE_DIRT_CLAY.placed(commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()))));
  public static final PlacedFeature ORE_CLAYSAND = PlacementUtils.register("ore_clay_sand",
      FeatureRegistry.ORE_CLAY_SAND.placed(commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()))));
  public static final PlacedFeature ORE_CLAYSILT = PlacementUtils.register("ore_clay_silt",
      FeatureRegistry.ORE_CLAY_SILT.placed(commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()))));
  //
  public static final PlacedFeature ORE_CALCITE = PlacementUtils.register("ore_calcite_cobbled",
      FeatureRegistry.ORE_CALCITE_COBBLED.placed(commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()))));
  public static final PlacedFeature ORE_DRIPSTONE = PlacementUtils.register("ore_dripstone_cobbled",
      FeatureRegistry.ORE_DRIPSTONE_COBBLED.placed(commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()))));
  public static final PlacedFeature ORE_TUFF = PlacementUtils.register("ore_tuff_cobbled",
      FeatureRegistry.ORE_TUFF_COBBLED.placed(commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top()))));

}
