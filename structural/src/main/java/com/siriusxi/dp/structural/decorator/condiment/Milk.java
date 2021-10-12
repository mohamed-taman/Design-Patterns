package com.siriusxi.dp.structural.decorator.condiment;

import com.siriusxi.dp.structural.decorator.CondimentDecorator;
import com.siriusxi.dp.structural.decorator.Drink;

public class Milk extends CondimentDecorator {
    Drink drink;

    public Milk(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getIngredients() {
        return drink.getIngredients().concat(", Milk");
    }

    @Override
    public double cost() {
        return drink.cost() + .30;
    }
}