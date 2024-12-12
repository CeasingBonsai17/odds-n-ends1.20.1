package net.bon.oddsnends.block.custom;

import net.bon.oddsnends.item.OddItems;
import net.minecraft.block.AmethystClusterBlock;
import net.minecraft.block.Fertilizable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.world.WorldView;

public class GiantPadmaBlock extends AmethystClusterBlock implements Fertilizable {

        public static final BooleanProperty SHEARED = BooleanProperty.of("sheared");

        public GiantPadmaBlock(int height, int xzOffset, Settings settings) {
                super
                        (height, xzOffset, settings);
                        this.setDefaultState((BlockState) this.getDefaultState().with(SHEARED, false));
        }
        public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state, boolean isClient) {
                return state.get(SHEARED).booleanValue();
        }
        public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
                world.setBlockState(pos, state.with(SHEARED, false));
        }
        public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
                return true;
        }

        public boolean canPlaceAt(BlockState state, BlockView world, BlockPos pos) {
                Direction direction = (Direction)state.get(FACING);
                BlockPos blockPos = pos.offset(direction.getOpposite());
                return world.getBlockState(blockPos).isOpaque();
        }

        @Override
        public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
                ItemStack itemStack = player.getStackInHand(hand);
                boolean s = state.get(SHEARED);
                boolean bl = false;
                if (!s) {
                        if (itemStack.isOf(Items.SHEARS)) {
                                world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ENTITY_SHEEP_SHEAR, SoundCategory.BLOCKS, 1.0f, 1.0f);
                                world.setBlockState(pos,state.cycle(SHEARED), Block.NOTIFY_LISTENERS);
                                GiantPadmaBlock.dropGiantPadmaPetals(world, pos);
                                if (!player.isCreative()) {
                                        itemStack.damage(1, player, p -> p.sendToolBreakStatus(hand));
                                }
                                bl = true;
                        }
                        if (!world.isClient() && bl) {
                                player.incrementStat(Stats.USED.getOrCreateStat(itemStack.getItem()));
                        }
                }
                if (bl) {
                        return ActionResult.success(world.isClient);
                }
                return ActionResult.PASS;
        }
        public static void dropGiantPadmaPetals(World world, BlockPos pos) {
                GiantPadmaBlock.dropStack(world, pos, new ItemStack(OddItems.GIANT_PADMA_PETAL, 4));
        }
        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
                builder.add(FACING);
                builder.add(WATERLOGGED);
                builder.add(SHEARED);
        }
}