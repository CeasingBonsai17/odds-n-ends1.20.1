package net.bon.oddsnends.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class OddFoodComponents {
    public static final FoodComponent BAKED_APPLE = new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).snack().build();
    public static final FoodComponent FLORAL_BAKED_APPLE = new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).snack().build();
    public static final FoodComponent MANDRAKE_ROOT = new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 0), 0.5f).build();
    public static final FoodComponent PEELED_MANDRAKE_ROOT = new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).build();
    public static final FoodComponent WILD_MANDRAKE_ROOT = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 60, 1), 1.0f).build();
    public static final FoodComponent WILD_CARROT = new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build();
    public static final FoodComponent ALGAE = new FoodComponent.Builder().hunger(2).saturationModifier(0.0f).snack().build();
}