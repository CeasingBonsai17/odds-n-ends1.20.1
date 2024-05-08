package net.bon.oddsnends.block.entity;

import net.bon.oddsnends.block.OddBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.MobSpawnerEntry;
import net.minecraft.world.MobSpawnerLogic;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class HangingSpawnerBlockEntity extends BlockEntity {
        private final MobSpawnerLogic logic = new MobSpawnerLogic() {
            public void sendStatus(World world, BlockPos pos, int status) {
                world.addSyncedBlockEvent(pos, OddBlocks.HANGING_SPAWNER, status, 0);
            }

            public void setSpawnEntry(@Nullable World world, BlockPos pos, MobSpawnerEntry spawnEntry) {
                super.setSpawnEntry(world, pos, spawnEntry);
                if (world != null) {
                    BlockState blockState = world.getBlockState(pos);
                    world.updateListeners(pos, blockState, blockState, 4);
                }

            }
        };

        public HangingSpawnerBlockEntity(BlockPos pos, BlockState state) {
            super(BlockEntityType.MOB_SPAWNER, pos, state);
        }

        public void readNbt(NbtCompound nbt) {
            super.readNbt(nbt);
            this.logic.readNbt(this.world, this.pos, nbt);
        }

        protected void writeNbt(NbtCompound nbt) {
            super.writeNbt(nbt);
            this.logic.writeNbt(nbt);
        }

        public static void clientTick(World world, BlockPos pos, BlockState state, net.bon.oddsnends.block.entity.HangingSpawnerBlockEntity blockEntity) {
            blockEntity.logic.clientTick(world, pos);
        }

        public static void serverTick(World world, BlockPos pos, BlockState state, net.bon.oddsnends.block.entity.HangingSpawnerBlockEntity blockEntity) {
            blockEntity.logic.serverTick((ServerWorld)world, pos);
        }

        public BlockEntityUpdateS2CPacket toUpdatePacket() {
            return BlockEntityUpdateS2CPacket.create(this);
        }

        public NbtCompound toInitialChunkDataNbt() {
            NbtCompound nbtCompound = this.createNbt();
            nbtCompound.remove("SpawnPotentials");
            return nbtCompound;
        }

        public boolean onSyncedBlockEvent(int type, int data) {
            return this.logic.handleStatus(this.world, type) ? true : super.onSyncedBlockEvent(type, data);
        }

        public boolean copyItemDataRequiresOperator() {
            return true;
        }

        public void setEntityType(EntityType<?> entityType, Random random) {
            this.logic.setEntityId(entityType, this.world, random, this.pos);
        }

        public MobSpawnerLogic getLogic() {
            return this.logic;
        }
    }