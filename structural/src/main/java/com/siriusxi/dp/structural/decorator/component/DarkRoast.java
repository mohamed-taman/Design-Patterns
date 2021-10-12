package com.siriusxi.dp.structural.decorator.component;

import com.siriusxi.dp.structural.decorator.Drink;

public class DarkRoast extends Drink {

    public DarkRoast() {
        ingredients = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}