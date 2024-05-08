package net.bon.oddsnends.block.custom;


import net.bon.oddsnends.block.entity.HangingSpawnerBlockEntity;
import net.bon.oddsnends.block.entity.OddBlockEntities;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class HangingSpawnerBlock extends BlockWithEntity {
    public HangingSpawnerBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new HangingSpawnerBlockEntity(pos, state);
    }

    @Override
    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return HangingSpawnerBlock.checkType(type, OddBlockEntities.HANGING_SPAWNER_BLOCK_ENTITY, world.isClient ? HangingSpawnerBlockEntity::clientTick : HangingSpawnerBlockEntity::serverTick);
    }

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack tool, boolean dropExperience) {
        super.onStacksDropped(state, world, pos, tool, dropExperience);
        if (dropExperience) {
            int i = 15 + world.random.nextInt(15) + world.random.nextInt(15);
            this.dropExperience(world, pos, i);
        }
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}