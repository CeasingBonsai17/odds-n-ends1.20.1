package net.bon.oddsnends.block.custom;

import net.bon.oddsnends.util.OddTags;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class RageFireBlock
        extends AbstractFireBlock {
    public RageFireBlock(AbstractBlock.Settings settings) {
        super(settings, 2.0f);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (this.canPlaceAt(state, world, pos)) {
            return this.getDefaultState();
        }
        return Blocks.AIR.getDefaultState();
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return RageFireBlock.isRageBase(world.getBlockState(pos.down()));
    }

    public static boolean isRageBase(BlockState state) {
        return state.isIn(OddTags.Blocks.RAGE_FIRE_BASE_BLOCKS);
    }

    @Override
    protected boolean isFlammable(BlockState state) {
        return true;
    }
}
