package com.lothrazar.cobblestoney;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.lothrazar.cobblestoney.registry.BlockRegistry;
import com.lothrazar.cobblestoney.registry.ConfigRegistryCobbley;
import com.lothrazar.cobblestoney.registry.ItemRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ModCobbley.MODID)
public class ModCobbley {

  public static final String MODID = "cobblestoney";
  public static final Logger LOGGER = LogManager.getLogger();

  public ModCobbley(IEventBus modEventBus) {
    new ConfigRegistryCobbley();
    BlockRegistry.BLOCKS.register(modEventBus);
    ItemRegistry.ITEMS.register(modEventBus);
    ItemRegistry.CREATIVE_MODE_TABS.register(modEventBus);
  }
  //worldgen defaults:
  //most are everywhere (zero above_bottom and below_top
  //below zero only: calcite, tuff, dripstone,   with max absolute zero
  //the six SOFT ones have above_bottom > 0 so not all the way down
}
