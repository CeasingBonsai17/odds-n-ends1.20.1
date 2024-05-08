package net.bon.oddsnends.block.custom;

import net.bon.oddsnends.block.OddsNEndsBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class FruitingLeavesBlock extends LeavesBlock {
    public FruitingLeavesBlock(Settings settings) {
        super(settings);
    }
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int j = 1 + world.random.nextInt(2);
        SweetBerryBushBlock.dropStack(world, pos, new ItemStack(Items.APPLE, j));
        world.playSound(null, pos, SoundEvents.BLOCK_CAVE_VINES_PICK_BERRIES, SoundCategory.BLOCKS, 1.0f, 0.8f + world.random.nextFloat() * 0.4f);
        BlockState blockState = OddsNEndsBlocks.AKANE_LEAVES.getDefaultState();
        world.setBlockState(pos, blockState, Block.NOTIFY_LISTENERS);
        world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, blockState));
        return ActionResult.success(world.isClient);
    }
}