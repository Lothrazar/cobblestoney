package com.lothrazar.cobblestoney.registry;

import com.lothrazar.cobblestoney.CobbleyMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockRegistry {

  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CobbleyMod.MODID);

  public static final RegistryObject<Block> DIORITE_COBBLED = BLOCKS.register("diorite_cobbled", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final RegistryObject<Block> ANDESITE_COBBLED = BLOCKS.register("andesite_cobbled", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final RegistryObject<Block> GRANITE_COBBLED = BLOCKS.register("granite_cobbled", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final RegistryObject<Block> GRANITE_JADE = BLOCKS.register("granite_jade", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final RegistryObject<Block> GRANITE_SOLADITE = BLOCKS.register("granite_soladite", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final RegistryObject<Block> GRANITE_CECILIA = BLOCKS.register("granite_cecilia", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BROWN).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
  public static final RegistryObject<Block> GRANITE_RED = BLOCKS.register("granite_red", () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

}
