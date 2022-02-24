package com.lothrazar.cobblestoney.registry;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import com.lothrazar.cobblestoney.CobbleyMod;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.loading.FMLPaths;

public class ConfigManager {

  private static final ForgeConfigSpec.Builder CFG = new ForgeConfigSpec.Builder();
  private static ForgeConfigSpec COMMON_CONFIG;
  public static ForgeConfigSpec.BooleanValue WORLDGEN_EVENTS;

  static {
    initConfig();
  }

  private static void initConfig() {
    CFG.comment("[" + CobbleyMod.MODID + "] Worldgen settings").push(CobbleyMod.MODID);
    WORLDGEN_EVENTS = CFG.comment("True to enable all worldgen. False means placement features are still registered but not run on any biomes/dimensions by the mod").define("cobblestoney.worldgen", true);
    CFG.pop(); // one pop for every push
    COMMON_CONFIG = CFG.build();
  }

  public static void setup() {
    final CommentedFileConfig configData = CommentedFileConfig.builder(FMLPaths.CONFIGDIR.get().resolve(CobbleyMod.MODID + ".toml"))
        .sync()
        .autosave()
        .writingMode(WritingMode.REPLACE)
        .build();
    configData.load();
    COMMON_CONFIG.setConfig(configData);
  }
}
