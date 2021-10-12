package com.siriusxi.dp.structural.decorator.component;

import com.siriusxi.dp.structural.decorator.Drink;

public class Decaf extends Drink {

    public Decaf() {
        ingredients = "Decaffeinated Coffee";
    }

    @Override
    public double cost() {
        return 2.25;
    }
}