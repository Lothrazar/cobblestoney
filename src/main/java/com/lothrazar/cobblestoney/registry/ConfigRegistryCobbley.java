package com.lothrazar.cobblestoney.registry;

import com.lothrazar.cobblestoney.ModCobbley;
import net.neoforged.neoforge.common.ModConfigSpec;

public class ConfigRegistryCobbley {

  public static final ModConfigSpec CONFIG;
  static {
    final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    BUILDER.comment("[" + ModCobbley.MODID + "] Worldgen settings have moved to mojang datapack system").push(ModCobbley.MODID);
    BUILDER.define("_comment", "All worldgen controls have been moved to the mojang datapack system instead of configs.  See built-in json files inside /data/cobblestoney/worldgen/ ");
    BUILDER.pop(); // one pop for every push
    CONFIG = BUILDER.build();
  }

}
