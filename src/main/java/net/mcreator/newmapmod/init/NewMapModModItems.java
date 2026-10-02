package net.mcreator.newmapmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.newmapmod.NewMapModMod;

public class NewMapModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(NewMapModMod.MODID);
	public static final DeferredItem<Item> SPIDER_EGG_DECO_1;
	static {
		SPIDER_EGG_DECO_1 = block(NewMapModModBlocks.SPIDER_EGG_DECO_1);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}