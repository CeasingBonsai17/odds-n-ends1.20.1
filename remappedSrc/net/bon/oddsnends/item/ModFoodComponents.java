package net.bon.oddsnends.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent BAKED_APPLE = new FoodComponent.Builder().nutrition(6).saturationModifier(0.3f).build();
    public static final FoodComponent MANDRAKE_ROOT = new FoodComponent.Builder().nutrition(3).saturationModifier(0.8f).build();
    public static final FoodComponent PEELED_MANDRAKE_ROOT = new FoodComponent.Builder().nutrition(3).saturationModifier(0.8f).build();
    public static final FoodComponent WILD_MANDRAKE_ROOT = new FoodComponent.Builder().nutrition(2).saturationModifier(0.1f).build();
    public static final FoodComponent WILD_CARROT = new FoodComponent.Builder().nutrition(2).saturationModifier(0.6f).build();
}