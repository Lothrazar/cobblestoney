package com.lothrazar.cobblestoney.registry;

import com.lothrazar.cobblestoney.ModCobbley;
import com.lothrazar.library.config.ConfigTemplate;
import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigRegistryCobbley extends ConfigTemplate {

  private static final ForgeConfigSpec CONFIG;
  static {
    final ForgeConfigSpec.Builder BUILDER = builder();
    BUILDER.comment("[" + ModCobbley.MODID + "] Worldgen settings have moved to mojang datapack system").push(ModCobbley.MODID);
    BUILDER.define("_comment", "All worldgen controls have been moved to the mojang datapack system instead of configs.  See built-in json files inside /data/cobblestoney/worldgen/ ");
    BUILDER.pop(); // one pop for every push
    CONFIG = BUILDER.build();
  }

  public ConfigRegistryCobbley() {
    CONFIG.setConfig(setup(ModCobbley.MODID));
  }
}
