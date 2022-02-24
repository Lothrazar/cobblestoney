package com.lothrazar.cobblestoney.registry;

import com.lothrazar.cobblestoney.CobbleyMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemRegistry {
  public static final CreativeModeTab TAB = new CreativeModeTab(CobbleyMod.MODID) {
    public ItemStack makeIcon() {
      return new ItemStack(ItemRegistry.GRANITE_JADE.get());
    }
  };
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CobbleyMod.MODID);

  public static final RegistryObject<Item> DIORITE_COBBLED = ITEMS.register("diorite_cobbled", () -> new BlockItem(BlockRegistry.DIORITE_COBBLED.get(), new Item.Properties().tab(TAB)));
  public static final RegistryObject<Item> ANDESITE_COBBLED = ITEMS.register("andesite_cobbled", () -> new BlockItem(BlockRegistry.ANDESITE_COBBLED.get(), new Item.Properties().tab(TAB)));
  public static final RegistryObject<Item> GRANITE_COBBLED = ITEMS.register("granite_cobbled", () -> new BlockItem(BlockRegistry.GRANITE_COBBLED.get(), new Item.Properties().tab(TAB)));
  public static final RegistryObject<Item> GRANITE_SOLADITE = ITEMS.register("granite_soladite", () -> new BlockItem(BlockRegistry.GRANITE_SOLADITE.get(), new Item.Properties().tab(TAB)));
  public static final RegistryObject<Item> GRANITE_JADE = ITEMS.register("granite_jade", () -> new BlockItem(BlockRegistry.GRANITE_JADE.get(), new Item.Properties().tab(TAB)));
  public static final RegistryObject<Item> GRANITE_CECILIA = ITEMS.register("granite_cecilia", () -> new BlockItem(BlockRegistry.GRANITE_CECILIA.get(), new Item.Properties().tab(TAB)));
  public static final RegistryObject<Item> GRANITE_RED = ITEMS.register("granite_red", () -> new BlockItem(BlockRegistry.GRANITE_RED.get(), new Item.Properties().tab(TAB)));
  public static final RegistryObject<Item> GRANITE_PINK = ITEMS.register("granite_pink", () -> new BlockItem(BlockRegistry.GRANITE_PINK.get(), new Item.Properties().tab(TAB)));
  public static final RegistryObject<Item> GRANITE_PURPLE = ITEMS.register("granite_purple", () -> new BlockItem(BlockRegistry.GRANITE_PURPLE.get(), new Item.Properties().tab(TAB)));
  public static final RegistryObject<Item> STONE_MUD = ITEMS.register("stone_mud", () -> new BlockItem(BlockRegistry.STONE_MUD.get(), new Item.Properties().tab(TAB)));
  public static final RegistryObject<Item> STONE_SILT = ITEMS.register("stone_silt", () -> new BlockItem(BlockRegistry.STONE_SILT.get(), new Item.Properties().tab(TAB)));
  public static final RegistryObject<Item> DIRT_SAND = ITEMS.register("dirt_sand", () -> new BlockItem(BlockRegistry.DIRT_SAND.get(), new Item.Properties().tab(TAB)));
  public static final RegistryObject<Item> DIRT_CLAY = ITEMS.register("dirt_clay", () -> new BlockItem(BlockRegistry.DIRT_CLAY.get(), new Item.Properties().tab(TAB)));

}
