package com.lothrazar.cobblestoney;

import com.lothrazar.cobblestoney.registry.ConfigManager;
import com.lothrazar.cobblestoney.registry.FeatureRegistry;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class GraniteWorldgenEvents {

  @SubscribeEvent(priority = EventPriority.HIGH)
  public void biomeLoadingEvent(BiomeLoadingEvent event) {
    ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
    if (BiomeDictionary.hasType(key, BiomeDictionary.Type.OVERWORLD)) {
      BiomeGenerationSettingsBuilder builder = event.getGeneration();
      if (ConfigManager.WORLDGEN_COBBLED.get()) {
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_ANDESITE_LOWER);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_ANDESITE_UPPER);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_DIORITE_LOWER);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_DIORITE_UPPER);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_GRANITE_LOWER);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_GRANITE_UPPER);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_TUFF);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_DRIPSTONE);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_CALCITE);
      }
      //Granite Types
      if (ConfigManager.WORLDGEN_GRANITE.get()) {
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_CECILIA_LOWER); // yellow
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_CECILIA_UPPER);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_JADE_LOWER); // green
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_JADE_UPPER);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_RED_LOWER);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_RED_UPPER);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_FROZEN_LOWER); // blue
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_FROZEN_UPPER);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_PINK_LOWER);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_PINK_UPPER);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_PURPLE_LOWER);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_PURPLE_UPPER);
      }
      //Soil Types
      if (ConfigManager.WORLDGEN_SOIL.get()) {
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_STONE_MUD);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_STONESILT);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_DIRTSAND);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_DIRTCLAY);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_CLAYSAND);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, FeatureRegistry.ORE_CLAYSILT);
      }
    }
  }
}
