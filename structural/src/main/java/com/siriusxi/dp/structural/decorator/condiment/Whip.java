package com.siriusxi.dp.structural.decorator.condiment;

import com.siriusxi.dp.structural.decorator.CondimentDecorator;
import com.siriusxi.dp.structural.decorator.Drink;

public class Whip extends CondimentDecorator {
    Drink drink;

    public Whip(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getIngredients() {
        return drink.getIngredients().concat(", Whip");
    }

    @Override
    public double cost() {
        return drink.cost() + .10;
    }
}