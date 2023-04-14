package com.lothrazar.cobblestoney.registry;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import com.lothrazar.cobblestoney.ModCobbley;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.loading.FMLPaths;

public class ConfigRegistryCobbley {

  private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
  private static ForgeConfigSpec CONFIG;
  static {
    initConfig();
  }

  private static void initConfig() {
    BUILDER.comment("[" + ModCobbley.MODID + "] Worldgen settings have moved to mojang datapack system").push(ModCobbley.MODID);
    BUILDER.define("_comment", "All worldgen controls have been moved to the mojang datapack system instead of configs.  See built-in json files inside /data/cobblestoney/worldgen/ ");
    BUILDER.pop(); // one pop for every push
    CONFIG = BUILDER.build();
  }

  public static void setup() {
    final CommentedFileConfig configData = CommentedFileConfig.builder(FMLPaths.CONFIGDIR.get().resolve(ModCobbley.MODID + ".toml"))
        .sync()
        .autosave()
        .writingMode(WritingMode.REPLACE)
        .build();
    configData.load();
    CONFIG.setConfig(configData);
  }
}
