package com.lothrazar.cobblestoney;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.lothrazar.cobblestoney.registry.BlockRegistry;
import com.lothrazar.cobblestoney.registry.ConfigManager;
import com.lothrazar.cobblestoney.registry.ItemRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CobbleyMod.MODID)
public class CobbleyMod {

  public static final String MODID = "cobblestoney";
  public static final Logger LOGGER = LogManager.getLogger();

  public CobbleyMod() {
    IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    BlockRegistry.BLOCKS.register(eventBus);
    ItemRegistry.ITEMS.register(eventBus);
    ConfigManager.setup();
    FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
  }

  private void setup(final FMLCommonSetupEvent event) {}
}
