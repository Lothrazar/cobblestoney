package com.lothrazar.cobblestoney.registry;

import com.lothrazar.cobblestoney.ModCobbley;
import com.lothrazar.library.item.BlockItemFlib;
import com.lothrazar.library.item.ItemFlib;
import com.lothrazar.library.registry.RegistryFactory;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemRegistry {

  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModCobbley.MODID);

  @SubscribeEvent
  public static void buildContents(CreativeModeTabEvent.Register event) {
    RegistryFactory.buildTab(event, ModCobbley.MODID, GRANITE_JADE.get().asItem(), ITEMS);
  }

  public static final RegistryObject<Item> SILT = ITEMS.register("silt", () -> new ItemFlib(new Item.Properties()));
  public static final RegistryObject<Item> LOAM = ITEMS.register("loam", () -> new ItemFlib(new Item.Properties()));
  public static final RegistryObject<Item> MUD = ITEMS.register("mud", () -> new ItemFlib(new Item.Properties()));
  //
  public static final RegistryObject<Item> DRIPSTONE_COBBLED = ITEMS.register("dripstone_cobbled", () -> new BlockItemFlib(BlockRegistry.DRIPSTONE_COBBLED.get(), new Item.Properties()));
  public static final RegistryObject<Item> CALCITE_COBBLED = ITEMS.register("calcite_cobbled", () -> new BlockItemFlib(BlockRegistry.CALCITE_COBBLED.get(), new Item.Properties()));
  public static final RegistryObject<Item> TUFF_COBBLED = ITEMS.register("tuff_cobbled", () -> new BlockItemFlib(BlockRegistry.TUFF_COBBLED.get(), new Item.Properties()));
  public static final RegistryObject<Item> DIORITE_COBBLED = ITEMS.register("diorite_cobbled", () -> new BlockItemFlib(BlockRegistry.DIORITE_COBBLED.get(), new Item.Properties()));
  public static final RegistryObject<Item> ANDESITE_COBBLED = ITEMS.register("andesite_cobbled", () -> new BlockItemFlib(BlockRegistry.ANDESITE_COBBLED.get(), new Item.Properties()));
  public static final RegistryObject<Item> GRANITE_COBBLED = ITEMS.register("granite_cobbled", () -> new BlockItemFlib(BlockRegistry.GRANITE_COBBLED.get(), new Item.Properties()));
  public static final RegistryObject<Item> GRANITE_SOLADITE = ITEMS.register("granite_soladite", () -> new BlockItemFlib(BlockRegistry.GRANITE_SOLADITE.get(), new Item.Properties()));
  public static final RegistryObject<Item> GRANITE_JADE = ITEMS.register("granite_jade", () -> new BlockItemFlib(BlockRegistry.GRANITE_JADE.get(), new Item.Properties()));
  public static final RegistryObject<Item> GRANITE_CECILIA = ITEMS.register("granite_cecilia", () -> new BlockItemFlib(BlockRegistry.GRANITE_CECILIA.get(), new Item.Properties()));
  public static final RegistryObject<Item> GRANITE_RED = ITEMS.register("granite_red", () -> new BlockItemFlib(BlockRegistry.GRANITE_RED.get(), new Item.Properties()));
  public static final RegistryObject<Item> GRANITE_PINK = ITEMS.register("granite_pink", () -> new BlockItemFlib(BlockRegistry.GRANITE_PINK.get(), new Item.Properties()));
  public static final RegistryObject<Item> GRANITE_PURPLE = ITEMS.register("granite_purple", () -> new BlockItemFlib(BlockRegistry.GRANITE_PURPLE.get(), new Item.Properties()));
  public static final RegistryObject<Item> STONE_SILT = ITEMS.register("stone_silt", () -> new BlockItemFlib(BlockRegistry.STONE_SILT.get(), new Item.Properties()));
  public static final RegistryObject<Item> STONE_MUD = ITEMS.register("stone_mud", () -> new BlockItemFlib(BlockRegistry.STONE_MUD.get(), new Item.Properties()));
  public static final RegistryObject<Item> DIRT_SAND = ITEMS.register("dirt_sand", () -> new BlockItemFlib(BlockRegistry.DIRT_SAND.get(), new Item.Properties()));
  public static final RegistryObject<Item> DIRT_CLAY = ITEMS.register("dirt_clay", () -> new BlockItemFlib(BlockRegistry.DIRT_CLAY.get(), new Item.Properties()));
  public static final RegistryObject<Item> CLAY_SAND = ITEMS.register("clay_sand", () -> new BlockItemFlib(BlockRegistry.CLAY_SAND.get(), new Item.Properties()));
  public static final RegistryObject<Item> CLAY_SILT = ITEMS.register("clay_silt", () -> new BlockItemFlib(BlockRegistry.CLAY_SILT.get(), new Item.Properties()));
}
