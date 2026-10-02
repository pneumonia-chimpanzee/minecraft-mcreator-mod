/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newmapmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.newmapmod.NewMapModMod;

public class NewMapModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NewMapModMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MODDED_TAB = REGISTRY.register("modded_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.new_map_mod.modded_tab")).icon(() -> new ItemStack(Blocks.DEEPSLATE_BRICKS)).displayItems((parameters, tabData) -> {
				tabData.accept(NewMapModModBlocks.SPIDER_EGG_DECO_1.get().asItem());
			}).withSearchBar().build());
}