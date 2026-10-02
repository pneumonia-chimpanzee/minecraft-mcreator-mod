/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newmapmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.newmapmod.block.SpiderEggDeco1Block;
import net.mcreator.newmapmod.NewMapModMod;

public class NewMapModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(NewMapModMod.MODID);
	public static final DeferredBlock<Block> SPIDER_EGG_DECO_1;
	static {
		SPIDER_EGG_DECO_1 = REGISTRY.register("spider_egg_deco_1", SpiderEggDeco1Block::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}