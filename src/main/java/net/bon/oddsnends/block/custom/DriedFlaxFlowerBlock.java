package net.bon.oddsnends.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class DriedFlaxFlowerBlock extends FlaxFlowerBlock{
    public DriedFlaxFlowerBlock(Settings settings) {
        super(settings);
    }
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isSolidBlock(world, pos);
    }
}
