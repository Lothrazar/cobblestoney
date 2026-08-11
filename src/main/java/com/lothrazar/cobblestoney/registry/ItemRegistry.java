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


  public static final DeferredItem<Item> SILT = ITEMS.registerItem("silt", props -> new ItemFlib(props));
  public static final DeferredItem<Item> LOAM = ITEMS.registerItem("loam", props -> new ItemFlib(props));
  public static final DeferredItem<Item> MUD = ITEMS.registerItem("mud", props -> new ItemFlib(props));
  //
  public static final DeferredItem<Item> DRIPSTONE_COBBLED = ITEMS.registerItem("dripstone_cobbled", props -> new BlockItemFlib(BlockRegistry.DRIPSTONE_COBBLED.get(), props.useBlockDescriptionPrefix()));
  public static final DeferredItem<Item> CALCITE_COBBLED = ITEMS.registerItem("calcite_cobbled", props -> new BlockItemFlib(BlockRegistry.CALCITE_COBBLED.get(), props.useBlockDescriptionPrefix()));
  public static final DeferredItem<Item> TUFF_COBBLED = ITEMS.registerItem("tuff_cobbled", props -> new BlockItemFlib(BlockRegistry.TUFF_COBBLED.get(), props.useBlockDescriptionPrefix()));
  public static final DeferredItem<Item> DIORITE_COBBLED = ITEMS.registerItem("diorite_cobbled", props -> new BlockItemFlib(BlockRegistry.DIORITE_COBBLED.get(), props.useBlockDescriptionPrefix()));
  public static final DeferredItem<Item> ANDESITE_COBBLED = ITEMS.registerItem("andesite_cobbled", props -> new BlockItemFlib(BlockRegistry.ANDESITE_COBBLED.get(), props.useBlockDescriptionPrefix()));
  public static final DeferredItem<Item> GRANITE_COBBLED = ITEMS.registerItem("granite_cobbled", props -> new BlockItemFlib(BlockRegistry.GRANITE_COBBLED.get(), props.useBlockDescriptionPrefix()));
  public static final DeferredItem<Item> GRANITE_SOLADITE = ITEMS.registerItem("granite_soladite", props -> new BlockItemFlib(BlockRegistry.GRANITE_SOLADITE.get(), props.useBlockDescriptionPrefix()));
  public static final DeferredItem<Item> GRANITE_JADE = ITEMS.registerItem("granite_jade", props -> new BlockItemFlib(BlockRegistry.GRANITE_JADE.get(), props.useBlockDescriptionPrefix()));
  public static final DeferredItem<Item> GRANITE_CECILIA = ITEMS.registerItem("granite_cecilia", props -> new BlockItemFlib(BlockRegistry.GRANITE_CECILIA.get(), props.useBlockDescriptionPrefix()));
  public static final DeferredItem<Item> GRANITE_RED = ITEMS.registerItem("granite_red", props -> new BlockItemFlib(BlockRegistry.GRANITE_RED.get(), props.useBlockDescriptionPrefix()));
  public static final DeferredItem<Item> GRANITE_PINK = ITEMS.registerItem("granite_pink", props -> new BlockItemFlib(BlockRegistry.GRANITE_PINK.get(), props.useBlockDescriptionPrefix()));
  public static final DeferredItem<Item> GRANITE_PURPLE = ITEMS.registerItem("granite_purple", props -> new BlockItemFlib(BlockRegistry.GRANITE_PURPLE.get(), props.useBlockDescriptionPrefix()));
  public static final DeferredItem<Item> STONE_SILT = ITEMS.registerItem("stone_silt", props -> new BlockItemFlib(BlockRegistry.STONE_SILT.get(), props.useBlockDescriptionPrefix()));
  public static final DeferredItem<Item> STONE_MUD = ITEMS.registerItem("stone_mud", props -> new BlockItemFlib(BlockRegistry.STONE_MUD.get(), props.useBlockDescriptionPrefix()));
  public static final DeferredItem<Item> DIRT_SAND = ITEMS.registerItem("dirt_sand", props -> new BlockItemFlib(BlockRegistry.DIRT_SAND.get(), props.useBlockDescriptionPrefix()));
  public static final DeferredItem<Item> DIRT_CLAY = ITEMS.registerItem("dirt_clay", props -> new BlockItemFlib(BlockRegistry.DIRT_CLAY.get(), props.useBlockDescriptionPrefix()));
  public static final DeferredItem<Item> CLAY_SAND = ITEMS.registerItem("clay_sand", props -> new BlockItemFlib(BlockRegistry.CLAY_SAND.get(), props.useBlockDescriptionPrefix()));
  public static final DeferredItem<Item> CLAY_SILT = ITEMS.registerItem("clay_silt", props -> new BlockItemFlib(BlockRegistry.CLAY_SILT.get(), props.useBlockDescriptionPrefix()));

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
