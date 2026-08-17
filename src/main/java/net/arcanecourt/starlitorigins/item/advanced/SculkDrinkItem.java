package net.arcanecourt.starlitorigins.item.advanced;

import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SculkDrinkItem extends Item {
    public final int drinkingTime = 40;

    public SculkDrinkItem(Properties pProperties) {
        super(pProperties);
    }

    public int getDuration(ItemStack pStack) {return drinkingTime;}

    public UseAnim getUseAnimation(ItemStack pStack) {return UseAnim.DRINK;}

    @Override
    public SoundEvent getDrinkingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.starlit_origins.sculk_drink"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

}
