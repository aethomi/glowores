package com.arabella.glowores.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import com.arabella.glowores.GloworesTags;

@Mixin(BlockBehaviour.BlockStateBase.class)
public abstract class GlowingOreLightMixin {

	// 15 is the maximum light level (like glowstone); vanilla torches are 14.
	private static final int ORE_LIGHT_LEVEL = 4;
	private static final int DIAMOND_LIGHT_LEVEL = 6;

	@Inject(method = "getLightEmission()I", at = @At("HEAD"), cancellable = true)
	private void glowores$overrideOreLight(CallbackInfoReturnable<Integer> cir) {
		BlockState self = (BlockState) (Object) this;
		if (self.is(GloworesTags.DIAMOND_ORES)) {
			cir.setReturnValue(DIAMOND_LIGHT_LEVEL);
		} else if (self.is(GloworesTags.GLOWING_ORES)) {
			cir.setReturnValue(ORE_LIGHT_LEVEL);
		}
	}
}
