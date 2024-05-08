package net.bon.oddsnends.block.custom;

import net.bon.oddsnends.util.OddTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class SparkingFireBlock
        extends AbstractFireBlock {
    public SparkingFireBlock(AbstractBlock.Settings settings) {
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
        return net.bon.oddsnends.block.custom.SparkingFireBlock.isSparkBase(world.getBlockState(pos.down()));
    }

    public static boolean isSparkBase(BlockState state) {
        return state.isIn(OddTags.Blocks.SPARK_FIRE_BASE_BLOCKS);
    }

    @Override
    protected boolean isFlammable(BlockState state) {
        return true;
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {

            {
                BlockPos blockPos;
                BlockState blockState;
                if (random.nextInt(10) == 0) {
                    world.playSound((double) pos.getX() + 0.5, (double) pos.getY() + 0.5, (double) pos.getZ() + 0.5, SoundEvents.BLOCK_FIRE_AMBIENT, SoundCategory.BLOCKS, 1.0f + random.nextFloat(), random.nextFloat() * 0.7f + 0.3f, false);
                }
                if (!this.isFlammable(blockState = world.getBlockState(blockPos = pos.down())) && !blockState.isSideSolidFullSquare(world, blockPos, Direction.UP));
                for (int i = 0; i < random.nextInt(1) + 1; ++i) {
                    world.addParticle(ParticleTypes.LAVA, (double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5, random.nextFloat() / 2.0f, 5.0E-5, random.nextFloat() / 2.0f);
            }
        }
    }
}