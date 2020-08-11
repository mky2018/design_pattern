package com.mky.design.decoration;

/**
 * @author makaiyu
 * @date 2020-06-12 09:57
 */
public class RoastFood extends FoodDecoration {

    private Food food;

    public RoastFood(Food f) {
        this.food = f;
    }

    @Override
    public String getDesc() {
        return getDecoration() + food.getDesc();
    }

    private String getDecoration() {
        return "烤";
    }
}
