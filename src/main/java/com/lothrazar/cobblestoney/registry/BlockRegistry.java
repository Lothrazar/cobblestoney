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
  public static final DeferredBlock<Block> DRIPSTONE_COBBLED = BLOCKS.register("dripstone_cobbled", () -> new BlockFlib(Block.Properties.of().sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops().strength(1.5F, 1.0F)));
  public static final DeferredBlock<Block> CALCITE_COBBLED = BLOCKS.register("calcite_cobbled", () -> new BlockFlib(Block.Properties.of().sound(SoundType.CALCITE).requiresCorrectToolForDrops().strength(0.75F)));
  public static final DeferredBlock<Block> TUFF_COBBLED = BLOCKS.register("tuff_cobbled", () -> new BlockFlib(Block.Properties.of().sound(SoundType.TUFF).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> DIORITE_COBBLED = BLOCKS.register("diorite_cobbled", () -> new BlockFlib(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> ANDESITE_COBBLED = BLOCKS.register("andesite_cobbled", () -> new BlockFlib(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> GRANITE_COBBLED = BLOCKS.register("granite_cobbled", () -> new BlockFlib(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> GRANITE_JADE = BLOCKS.register("granite_jade", () -> new BlockFlib(Block.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> GRANITE_SOLADITE = BLOCKS.register("granite_soladite", () -> new BlockFlib(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> GRANITE_CECILIA = BLOCKS.register("granite_cecilia", () -> new BlockFlib(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> GRANITE_RED = BLOCKS.register("granite_red", () -> new BlockFlib(Block.Properties.of().mapColor(DyeColor.RED).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> GRANITE_PINK = BLOCKS.register("granite_pink", () -> new BlockFlib(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> GRANITE_PURPLE = BLOCKS.register("granite_purple", () -> new BlockFlib(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final DeferredBlock<Block> STONE_SILT = BLOCKS.register("stone_silt", () -> new BlockFlib(Block.Properties.of().sound(SoundType.BASALT).requiresCorrectToolForDrops().strength(1.2F, 4.0F)));
  public static final DeferredBlock<Block> STONE_MUD = BLOCKS.register("stone_mud", () -> new BlockFlib(Block.Properties.of().sound(SoundType.NETHERRACK).requiresCorrectToolForDrops().strength(1.9F, 4.0F)));
  public static final DeferredBlock<Block> DIRT_SAND = BLOCKS.register("dirt_sand", () -> new BlockFlib(Block.Properties.of().mapColor(MapColor.SAND).requiresCorrectToolForDrops().strength(0.5F).sound(SoundType.SOUL_SAND)));
  public static final DeferredBlock<Block> DIRT_CLAY = BLOCKS.register("dirt_clay", () -> new BlockFlib(Block.Properties.of().mapColor(MapColor.SAND).requiresCorrectToolForDrops().strength(0.7F).sound(SoundType.GRAVEL)));
  public static final DeferredBlock<Block> CLAY_SAND = BLOCKS.register("clay_sand", () -> new BlockFlib(Block.Properties.of().mapColor(MapColor.SAND).requiresCorrectToolForDrops().strength(0.6F).sound(SoundType.GRAVEL)));
  public static final DeferredBlock<Block> CLAY_SILT = BLOCKS.register("clay_silt", () -> new BlockFlib(Block.Properties.of().mapColor(MapColor.CLAY).requiresCorrectToolForDrops().strength(0.9F).sound(SoundType.SAND)));
}
