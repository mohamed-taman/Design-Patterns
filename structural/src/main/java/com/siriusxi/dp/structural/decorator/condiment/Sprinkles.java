package com.siriusxi.dp.structural.decorator.condiment;

import com.siriusxi.dp.structural.decorator.CondimentDecorator;
import com.siriusxi.dp.structural.decorator.Drink;

public class Sprinkles extends CondimentDecorator {
    Drink drink;

    public Sprinkles(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getIngredients() {
        return drink.getIngredients().concat(", Sprinkles");
    }

    @Override
    public double cost() {
        return drink.cost() + .20;
    }
}