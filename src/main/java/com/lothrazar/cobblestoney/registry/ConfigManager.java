package com.lothrazar.cobblestoney.registry;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import com.lothrazar.cobblestoney.CobbleyMod;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.loading.FMLPaths;

public class ConfigManager {

  private static final ForgeConfigSpec.Builder CFG = new ForgeConfigSpec.Builder();
  private static ForgeConfigSpec COMMON_CONFIG;

  public static ForgeConfigSpec.BooleanValue WORLDGEN_COBBLED;
  public static ForgeConfigSpec.BooleanValue WORLDGEN_GRANITE;
  public static ForgeConfigSpec.BooleanValue WORLDGEN_SOIL;

  static {
    initConfig();
  }

  private static void initConfig() {
    CFG.comment("[" + CobbleyMod.MODID + "] Worldgen settings.  Control which features / placements run during worldgen if any").push(CobbleyMod.MODID);
    WORLDGEN_SOIL = CFG.comment("True to enable soil worldgen. This affects worldgen for the soil type blocks such as Mudstone")
        .define("cobblestoney.worldgen.soil", true);
    WORLDGEN_GRANITE = CFG.comment("True to enable granite worldgen. This affects worldgen for the special granite variants such as Pink Granite ")
        .define("cobblestoney.worldgen.granite", true);
    WORLDGEN_COBBLED = CFG.comment("True to enable cobbled worldgen. This affects worldgen for cobbled versions of existing blocks such as Cobbled Diorite")
        .define("cobblestoney.worldgen.cobbled", false);
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
