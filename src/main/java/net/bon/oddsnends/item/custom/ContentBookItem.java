package net.bon.oddsnends.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LecternBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ContentBookItem extends Item {
    public ContentBookItem(Item.Settings settings) {
        super(settings);
    }


    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        if (blockState.isOf(Blocks.LECTERN)) {
            return LecternBlock.putBookIfAbsent(context.getPlayer(), world, blockPos, blockState, context.getStack()) ? ActionResult.success(world.isClient) : ActionResult.PASS;
        } else {
            return ActionResult.PASS;
        }
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.useBook(itemStack, hand);
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        return TypedActionResult.success(itemStack, world.isClient());
    }
    public boolean isEnchantable (ItemStack stack){
        return stack.getCount() == 1;
    }

    public int getEnchantability () {
        return 1;
    }

    public static boolean isValid(@Nullable NbtCompound nbt) {
        if (nbt == null) {
            return false;
        } else if (!nbt.contains("pages", 9)) {
            return false;
        } else {
            NbtList nbtList = nbt.getList("pages", 8);

            for (int i = 0; i < nbtList.size(); ++i) {
                String string = nbtList.getString(i);
                if (string.length() > 32767) {
                    return false;
                }
            }
            return true;
        }
    }
}
