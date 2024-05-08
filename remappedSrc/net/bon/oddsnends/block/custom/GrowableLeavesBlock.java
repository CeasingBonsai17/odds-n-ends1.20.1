package net.bon.oddsnends.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;


public class GrowableLeavesBlock extends LeavesBlock {

    private final BlockState nextState;

    public GrowableLeavesBlock(Settings settings, Block nextState) {
        super(settings);
        this.nextState = nextState.getDefaultState();
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        int r = random.nextInt(20);
        if (r == 0 && !this.shouldDecay(state)) {
            world.setBlockState(pos, nextState, NOTIFY_LISTENERS);
        }
        else super.randomTick(state, world, pos, random);
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return !state.get(PERSISTENT);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(DISTANCE, PERSISTENT, WATERLOGGED);
    }
}
