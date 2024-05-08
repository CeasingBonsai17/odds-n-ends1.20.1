package net.bon.oddsnends.block.custom;

import net.bon.oddsnends.item.ModItems;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.AmethystClusterBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

public class GiantPadmaBlock
        extends AmethystClusterBlock {

        public static final BooleanProperty SHEARED = BooleanProperty.of("sheared");

        public GiantPadmaBlock(int height, int xzOffset, Settings settings) {
                super
                        (height, xzOffset, settings);
                        this.setDefaultState((BlockState) this.getDefaultState().with(SHEARED, false));
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
                int j = 3 + world.random.nextInt(1);
                GiantPadmaBlock.dropStack(world, pos, new ItemStack(ModItems.GIANT_PADMA_PETAL, j));
        }
        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
                builder.add(FACING);
                builder.add(WATERLOGGED);
                builder.add(SHEARED);
        }
}