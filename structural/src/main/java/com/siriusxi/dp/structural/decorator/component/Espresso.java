package com.siriusxi.dp.structural.decorator.component;

import com.siriusxi.dp.structural.decorator.Drink;

public class Espresso extends Drink {

    public Espresso() {
        ingredients = "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 4.00;
    }
}