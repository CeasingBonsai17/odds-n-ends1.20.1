package net.bon.oddsnends.mixin;

import net.bon.oddsnends.block.OddBlocks;
import net.bon.oddsnends.block.custom.RageFireBlock;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(AbstractFireBlock.class)
public abstract class AbstractFireBlockMixin {

    @Inject(
            method = "getState",
            at = @At(value = "HEAD"),
            cancellable = true
    )
    private static void oddsnends$getState(BlockView world, BlockPos pos, CallbackInfoReturnable<BlockState> cir) {
        if (RageFireBlock.isRageBase(world.getBlockState(pos.down()))) {
            cir.setReturnValue(OddBlocks.RAGE_FIRE.getDefaultState());
        }
    }
}