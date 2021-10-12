package com.siriusxi.dp.structural.decorator.component;

import com.siriusxi.dp.structural.decorator.Drink;

public class HouseBlend extends Drink {

    public HouseBlend() {
        ingredients = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 1.49;
    }
}