package com.arabella.glowores;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public final class GloworesTags {
	// Points at data/glowores/tags/block/glowing_ores.json
	public static final TagKey<Block> GLOWING_ORES =
			TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(GlowOres.MOD_ID, "glowing_ores"));
	public static final TagKey<Block> DIAMOND_ORES =
			TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(GlowOres.MOD_ID, "diamond_ores"));

	private GloworesTags() {
	}
}
