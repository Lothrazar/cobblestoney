package com.lothrazar.cobblestoney.registry;

import com.lothrazar.cobblestoney.ModCobbley;
import com.lothrazar.library.item.BlockItemFlib;
import com.lothrazar.library.item.ItemFlib;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {

  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModCobbley.MODID);


  public static final DeferredItem<Item> SILT = ITEMS.register("silt", () -> new ItemFlib(new Item.Properties()));
  public static final DeferredItem<Item> LOAM = ITEMS.register("loam", () -> new ItemFlib(new Item.Properties()));
  public static final DeferredItem<Item> MUD = ITEMS.register("mud", () -> new ItemFlib(new Item.Properties()));
  //
  public static final DeferredItem<Item> DRIPSTONE_COBBLED = ITEMS.register("dripstone_cobbled", () -> new BlockItemFlib(BlockRegistry.DRIPSTONE_COBBLED.get(), new Item.Properties()));
  public static final DeferredItem<Item> CALCITE_COBBLED = ITEMS.register("calcite_cobbled", () -> new BlockItemFlib(BlockRegistry.CALCITE_COBBLED.get(), new Item.Properties()));
  public static final DeferredItem<Item> TUFF_COBBLED = ITEMS.register("tuff_cobbled", () -> new BlockItemFlib(BlockRegistry.TUFF_COBBLED.get(), new Item.Properties()));
  public static final DeferredItem<Item> DIORITE_COBBLED = ITEMS.register("diorite_cobbled", () -> new BlockItemFlib(BlockRegistry.DIORITE_COBBLED.get(), new Item.Properties()));
  public static final DeferredItem<Item> ANDESITE_COBBLED = ITEMS.register("andesite_cobbled", () -> new BlockItemFlib(BlockRegistry.ANDESITE_COBBLED.get(), new Item.Properties()));
  public static final DeferredItem<Item> GRANITE_COBBLED = ITEMS.register("granite_cobbled", () -> new BlockItemFlib(BlockRegistry.GRANITE_COBBLED.get(), new Item.Properties()));
  public static final DeferredItem<Item> GRANITE_SOLADITE = ITEMS.register("granite_soladite", () -> new BlockItemFlib(BlockRegistry.GRANITE_SOLADITE.get(), new Item.Properties()));
  public static final DeferredItem<Item> GRANITE_JADE = ITEMS.register("granite_jade", () -> new BlockItemFlib(BlockRegistry.GRANITE_JADE.get(), new Item.Properties()));
  public static final DeferredItem<Item> GRANITE_CECILIA = ITEMS.register("granite_cecilia", () -> new BlockItemFlib(BlockRegistry.GRANITE_CECILIA.get(), new Item.Properties()));
  public static final DeferredItem<Item> GRANITE_RED = ITEMS.register("granite_red", () -> new BlockItemFlib(BlockRegistry.GRANITE_RED.get(), new Item.Properties()));
  public static final DeferredItem<Item> GRANITE_PINK = ITEMS.register("granite_pink", () -> new BlockItemFlib(BlockRegistry.GRANITE_PINK.get(), new Item.Properties()));
  public static final DeferredItem<Item> GRANITE_PURPLE = ITEMS.register("granite_purple", () -> new BlockItemFlib(BlockRegistry.GRANITE_PURPLE.get(), new Item.Properties()));
  public static final DeferredItem<Item> STONE_SILT = ITEMS.register("stone_silt", () -> new BlockItemFlib(BlockRegistry.STONE_SILT.get(), new Item.Properties()));
  public static final DeferredItem<Item> STONE_MUD = ITEMS.register("stone_mud", () -> new BlockItemFlib(BlockRegistry.STONE_MUD.get(), new Item.Properties()));
  public static final DeferredItem<Item> DIRT_SAND = ITEMS.register("dirt_sand", () -> new BlockItemFlib(BlockRegistry.DIRT_SAND.get(), new Item.Properties()));
  public static final DeferredItem<Item> DIRT_CLAY = ITEMS.register("dirt_clay", () -> new BlockItemFlib(BlockRegistry.DIRT_CLAY.get(), new Item.Properties()));
  public static final DeferredItem<Item> CLAY_SAND = ITEMS.register("clay_sand", () -> new BlockItemFlib(BlockRegistry.CLAY_SAND.get(), new Item.Properties()));
  public static final DeferredItem<Item> CLAY_SILT = ITEMS.register("clay_silt", () -> new BlockItemFlib(BlockRegistry.CLAY_SILT.get(), new Item.Properties()));

  public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModCobbley.MODID);

  public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB = CREATIVE_MODE_TABS.register("tab", () ->
      CreativeModeTab.builder()
          .icon(() -> new ItemStack(GRANITE_JADE.get().asItem()))
          .title(Component.translatable("itemGroup." + ModCobbley.MODID))
          .displayItems((enabledFlags, populator) -> {
            for (DeferredHolder<Item, ? extends Item> entry : ITEMS.getEntries()) {
              populator.accept(entry.get());
            }
          }).build());

}
