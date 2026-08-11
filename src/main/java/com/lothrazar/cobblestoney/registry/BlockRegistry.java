package com.lothrazar.cobblestoney.registry;

import com.lothrazar.cobblestoney.ModCobbley;
import com.lothrazar.library.block.BlockFlib;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {

  public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ModCobbley.MODID);
  public static final DeferredBlock<Block> DRIPSTONE_COBBLED = BLOCKS.registerBlock("dripstone_cobbled", props -> new BlockFlib(props.sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
  public static final DeferredBlock<Block> CALCITE_COBBLED = BLOCKS.registerBlock("calcite_cobbled", props -> new BlockFlib(props.sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
  public static final DeferredBlock<Block> TUFF_COBBLED = BLOCKS.registerBlock("tuff_cobbled", props -> new BlockFlib(props.sound(SoundType.TUFF).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> DIORITE_COBBLED = BLOCKS.registerBlock("diorite_cobbled", props -> new BlockFlib(props.requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> ANDESITE_COBBLED = BLOCKS.registerBlock("andesite_cobbled", props -> new BlockFlib(props.requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> GRANITE_COBBLED = BLOCKS.registerBlock("granite_cobbled", props -> new BlockFlib(props.requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> GRANITE_JADE = BLOCKS.registerBlock("granite_jade", props -> new BlockFlib(props.mapColor(MapColor.TERRACOTTA_GREEN).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> GRANITE_SOLADITE = BLOCKS.registerBlock("granite_soladite", props -> new BlockFlib(props.requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> GRANITE_CECILIA = BLOCKS.registerBlock("granite_cecilia", props -> new BlockFlib(props.requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> GRANITE_RED = BLOCKS.registerBlock("granite_red", props -> new BlockFlib(props.mapColor(DyeColor.RED).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> GRANITE_PINK = BLOCKS.registerBlock("granite_pink", props -> new BlockFlib(props.requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> GRANITE_PURPLE = BLOCKS.registerBlock("granite_purple", props -> new BlockFlib(props.requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> STONE_SILT = BLOCKS.registerBlock("stone_silt", props -> new BlockFlib(props.sound(SoundType.BASALT).requiresCorrectToolForDrops().strength(1.2F, 4.0F)));
  public static final DeferredBlock<Block> STONE_MUD = BLOCKS.registerBlock("stone_mud", props -> new BlockFlib(props.sound(SoundType.NETHERRACK).requiresCorrectToolForDrops().strength(1.9F, 4.0F)));
  public static final DeferredBlock<Block> DIRT_SAND = BLOCKS.registerBlock("dirt_sand", props -> new BlockFlib(props.mapColor(MapColor.SAND).requiresCorrectToolForDrops().strength(0.5F).sound(SoundType.SOUL_SAND)));
  public static final DeferredBlock<Block> DIRT_CLAY = BLOCKS.registerBlock("dirt_clay", props -> new BlockFlib(props.mapColor(MapColor.SAND).requiresCorrectToolForDrops().strength(0.7F).sound(SoundType.GRAVEL)));
  public static final DeferredBlock<Block> CLAY_SAND = BLOCKS.registerBlock("clay_sand", props -> new BlockFlib(props.mapColor(MapColor.SAND).requiresCorrectToolForDrops().strength(0.6F).sound(SoundType.GRAVEL)));
  public static final DeferredBlock<Block> CLAY_SILT = BLOCKS.registerBlock("clay_silt", props -> new BlockFlib(props.mapColor(MapColor.CLAY).requiresCorrectToolForDrops().strength(0.9F).sound(SoundType.SAND)));
}
