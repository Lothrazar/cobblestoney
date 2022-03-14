package com.lothrazar.cobblestoney.registry;

import com.lothrazar.cobblestoney.CobbleyMod;
import java.util.List;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import org.jetbrains.annotations.NotNull;

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
  private static final RuleTest NETHER = new BlockMatchTest(Blocks.NETHERRACK); // OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER;
  private static final RuleTest END = new BlockMatchTest(Blocks.END_STONE);

  public static Holder<ConfiguredFeature<OreConfiguration, ?>> buildOreFeature(String location, RuleTest rule, Block block, int size) {
    return FeatureUtils.register(CobbleyMod.MODID + ":" + location, Feature.ORE, new OreConfiguration(rule, block.defaultBlockState(), size));
  }

  public static Holder<ConfiguredFeature<OreConfiguration, ?>> buildOreFeature(String location, OreConfiguration oc) {
    return FeatureUtils.register(CobbleyMod.MODID + ":" + location, Feature.ORE, oc);
  }
  private static Holder<PlacedFeature> genPlaced(String id, Holder<ConfiguredFeature<OreConfiguration, ?>> ore, List<PlacementModifier> placementModifiers) {
    return PlacementUtils.register(CobbleyMod.MODID + ":" + id, ore, placementModifiers);
  }
  
  public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_CALCITE_COBBLED = buildOreFeature("ore_calcite_cobbled",
      new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.CALCITE_COBBLED.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.CALCITE_COBBLED.get().defaultBlockState())), 16));

  public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_DRIPSTONE_COBBLED = buildOreFeature("ore_dripstone_cobbled",
      new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.DRIPSTONE_COBBLED.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.DRIPSTONE_COBBLED.get().defaultBlockState())), 16));

  public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TUFF_COBBLED = buildOreFeature("ore_tuff_cobbled",
      new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.TUFF_COBBLED.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.TUFF_COBBLED.get().defaultBlockState())), 16));
  //registered features
  public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_JADE = buildOreFeature("ore_granite_jade",
      new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.GRANITE_JADE.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.GRANITE_JADE.get().defaultBlockState())), 16));
  public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_GRANITE_SOLADITE = buildOreFeature("ore_granite_soladite",
      new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.GRANITE_SOLADITE.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.GRANITE_SOLADITE.get().defaultBlockState())), 16));
  public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_GRANITE_COBBLED = buildOreFeature("ore_granite_cobbled",
      new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.GRANITE_COBBLED.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.GRANITE_COBBLED.get().defaultBlockState())), 32));
  public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_DIORITE_COBBLED = buildOreFeature("ore_diorite_cobbled",
      new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.DIORITE_COBBLED.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.DIORITE_COBBLED.get().defaultBlockState())), 32));
  public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_ANDESITE_COBBLED = buildOreFeature("ore_andesite_cobbled",
      new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.ANDESITE_COBBLED.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.ANDESITE_COBBLED.get().defaultBlockState())), 32));
  public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_RED = buildOreFeature("ore_granite_red",
      new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.GRANITE_RED.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.GRANITE_RED.get().defaultBlockState())), 16));
  public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_CECILIA = buildOreFeature("ore_granite_cecilia",
      new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.GRANITE_CECILIA.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.GRANITE_CECILIA.get().defaultBlockState())), 64));
  //granite_pink
  public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_GRANITE_PINK = buildOreFeature("ore_granite_pink",
      new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.GRANITE_PINK.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.GRANITE_PINK.get().defaultBlockState())), 16));
  public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_GRANITE_PURP = buildOreFeature("ore_granite_purple",
      new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.GRANITE_PURPLE.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.GRANITE_PURPLE.get().defaultBlockState())), 16));
  //stone_mud
  public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_MUDSTONE = buildOreFeature("ore_stone_mud",
      new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.STONE_MUD.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.STONE_MUD.get().defaultBlockState())), 16));
  //stone_silt
  public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_STONE_SILT = buildOreFeature("ore_stone_silt",
      new OreConfiguration(
          List.of(OreConfiguration.target(NATURAL_STONE, BlockRegistry.STONE_SILT.get().defaultBlockState())
              , OreConfiguration.target(DEEP_STONE, BlockRegistry.STONE_SILT.get().defaultBlockState())), 16));
  //dirt_sand
  public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_DIRT_SAND = buildOreFeature("ore_dirt_sand",
      new OreConfiguration(NATURAL_STONE, BlockRegistry.DIRT_SAND.get().defaultBlockState(), 16));
  //dirt_clay
  public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_DIRT_CLAY = buildOreFeature("ore_dirt_clay",
      new OreConfiguration(NATURAL_STONE, BlockRegistry.DIRT_CLAY.get().defaultBlockState(), 8));
  public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_CLAY_SAND = buildOreFeature("ore_clay_sand",
      new OreConfiguration(NATURAL_STONE, BlockRegistry.CLAY_SAND.get().defaultBlockState(), 4));
  public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_CLAY_SILT = buildOreFeature("ore_clay_silt",
      new OreConfiguration(NATURAL_STONE, BlockRegistry.CLAY_SILT.get().defaultBlockState(), 4));
  // placed features
  //
  public static final Holder<PlacedFeature> ORE_JADE_UPPER = genPlaced("ore_granite_jade_upper",
      FeatureRegistry.ORE_JADE, rareOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(128))));

  public static final Holder<PlacedFeature> ORE_JADE_LOWER = genPlaced("ore_granite_jade_lower",
      FeatureRegistry.ORE_JADE, commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(60))));
  //
  public static final Holder<PlacedFeature> ORE_FROZEN_UPPER = genPlaced("ore_granite_soladite_upper",
      FeatureRegistry.ORE_GRANITE_SOLADITE, rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(128))));
  public static final Holder<PlacedFeature> ORE_FROZEN_LOWER = genPlaced("ore_granite_soladite_lower",
      FeatureRegistry.ORE_GRANITE_SOLADITE, commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(60))));
  //
  public static final Holder<PlacedFeature> ORE_DIORITE_UPPER = genPlaced("ore_diorite_upper",
      FeatureRegistry.ORE_DIORITE_COBBLED, rareOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(128))));
  public static final Holder<PlacedFeature> ORE_DIORITE_LOWER = genPlaced("ore_diorite_lower",
      FeatureRegistry.ORE_DIORITE_COBBLED, commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(60))));
  //
  public static final Holder<PlacedFeature> ORE_ANDESITE_UPPER = genPlaced("ore_andesite_upper",
      FeatureRegistry.ORE_ANDESITE_COBBLED, rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(128))));
  public static final Holder<PlacedFeature> ORE_ANDESITE_LOWER = genPlaced("ore_andesite_lower",
      FeatureRegistry.ORE_ANDESITE_COBBLED, commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top())));
  //
  public static final Holder<PlacedFeature> ORE_GRANITE_UPPER = genPlaced("ore_granite_upper",
      FeatureRegistry.ORE_GRANITE_COBBLED, rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(128))));
  public static final Holder<PlacedFeature> ORE_GRANITE_LOWER = genPlaced("ore_granite_lower",
      FeatureRegistry.ORE_GRANITE_COBBLED, commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top())));
  //
  public static final Holder<PlacedFeature> ORE_RED_UPPER = genPlaced("ore_granite_red_upper",
      FeatureRegistry.ORE_RED, rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(64))));
  public static final Holder<PlacedFeature> ORE_RED_LOWER = genPlaced("ore_granite_red_lower",
      FeatureRegistry.ORE_RED, commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(32))));
  //
  public static final Holder<PlacedFeature> ORE_CECILIA_UPPER = genPlaced("ore_granite_cecilia_upper",
      FeatureRegistry.ORE_CECILIA, rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(128))));
  public static final Holder<PlacedFeature> ORE_CECILIA_LOWER = genPlaced("ore_granite_cecilia_lower",
      FeatureRegistry.ORE_CECILIA, rareOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(60))));
  //granite_pink
  public static final Holder<PlacedFeature> ORE_PINK_UPPER = genPlaced("ore_granite_pink_upper",
      FeatureRegistry.ORE_GRANITE_PINK, rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(128))));
  public static final Holder<PlacedFeature> ORE_PINK_LOWER = genPlaced("ore_granite_pink_lower",
      FeatureRegistry.ORE_GRANITE_PINK, commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top())));
  public static final Holder<PlacedFeature> ORE_PURPLE_UPPER = genPlaced("ore_granite_purple_upper",
      FeatureRegistry.ORE_GRANITE_PURP, rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(128))));
  public static final Holder<PlacedFeature> ORE_PURPLE_LOWER = genPlaced("ore_granite_purple_lower",
      FeatureRegistry.ORE_GRANITE_PURP, commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top())));
  //  stone_mud
  public static final Holder<PlacedFeature> ORE_STONE_MUD = genPlaced("ore_stone_mud",
      FeatureRegistry.ORE_MUDSTONE, commonOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top())));
  //  stone_silt
  public static final Holder<PlacedFeature> ORE_STONESILT = genPlaced("ore_stone_silt",
      FeatureRegistry.ORE_STONE_SILT, commonOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top())));
  //      dirt types
  public static final Holder<PlacedFeature> ORE_DIRTSAND = genPlaced("ore_dirt_sand",
      FeatureRegistry.ORE_DIRT_SAND, commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top())));
  public static final Holder<PlacedFeature> ORE_DIRTCLAY = genPlaced("ore_dirt_clay",
      FeatureRegistry.ORE_DIRT_CLAY, commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top())));
  public static final Holder<PlacedFeature> ORE_CLAYSAND = genPlaced("ore_clay_sand",
      FeatureRegistry.ORE_CLAY_SAND, commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top())));
  public static final Holder<PlacedFeature> ORE_CLAYSILT = genPlaced("ore_clay_silt",
      FeatureRegistry.ORE_CLAY_SILT, commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top())));
  //
  public static final Holder<PlacedFeature> ORE_CALCITE = genPlaced("ore_calcite_cobbled",
      FeatureRegistry.ORE_CALCITE_COBBLED, commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top())));
  public static final Holder<PlacedFeature> ORE_DRIPSTONE = genPlaced("ore_dripstone_cobbled",
      FeatureRegistry.ORE_DRIPSTONE_COBBLED, commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top())));
  public static final Holder<PlacedFeature> ORE_TUFF = genPlaced("ore_tuff_cobbled",
      FeatureRegistry.ORE_TUFF_COBBLED, commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.top())));
}
