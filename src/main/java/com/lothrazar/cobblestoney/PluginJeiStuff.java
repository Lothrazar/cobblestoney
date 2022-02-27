package com.lothrazar.cobblestoney;

//import com.lothrazar.cobblestoney.registry.ItemRegistry;
//import mezz.jei.api.JeiPlugin;
//import mezz.jei.api.constants.VanillaTypes;
//import mezz.jei.api.registration.IRecipeRegistration;
//import net.minecraft.network.chat.TranslatableComponent;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemStack;
//@JeiPlugin
//public class PluginJeiStuff implements mezz.jei.api.IModPlugin {
//
//  private static final ResourceLocation ID = new ResourceLocation(CobbleyMod.MODID, "jei");
//
//  @Override public ResourceLocation getPluginUid() {
//    return ID;
//  }
//
//  @Override
//  public void registerRecipes(IRecipeRegistration registry) {
//    add(registry, ItemRegistry.LOAM.get());
//    add(registry, ItemRegistry.MUD.get());
//    add(registry, ItemRegistry.SILT.get());
//  }
//
//  private void add(IRecipeRegistration registry, Item s) {
//    registry.addIngredientInfo(new ItemStack(s), VanillaTypes.ITEM, new TranslatableComponent(s.getDescriptionId() + ".guide"));
//  }
//}
