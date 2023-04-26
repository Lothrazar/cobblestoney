package com.lothrazar.cobblestoney;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.lothrazar.cobblestoney.registry.BlockRegistry;
import com.lothrazar.cobblestoney.registry.ConfigRegistryCobbley;
import com.lothrazar.cobblestoney.registry.ItemRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModCobbley.MODID)
public class ModCobbley {

  public static final String MODID = "cobblestoney";
  public static final Logger LOGGER = LogManager.getLogger();

  public ModCobbley() {
    new ConfigRegistryCobbley();
    IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    BlockRegistry.BLOCKS.register(bus);
    ItemRegistry.ITEMS.register(bus);
  }
  //worldgen defaults:
  //most are everywhere (zero above_bottom and below_top
  //below zero only: calcite, tuff, dripstone,   with max absolute zero
  //the six SOFT ones have above_bottom > 0 so not all the way down
}
