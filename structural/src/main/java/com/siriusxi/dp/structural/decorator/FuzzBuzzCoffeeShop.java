package com.siriusxi.dp.structural.decorator;

import com.siriusxi.dp.structural.decorator.component.Espresso;
import com.siriusxi.dp.structural.decorator.condiment.Mocha;
import com.siriusxi.dp.structural.decorator.condiment.Sprinkles;

public class FuzzBuzzCoffeeShop {

    public static void main(String... args) {

        Drink espresso = new Espresso();
        espresso = new Sprinkles(espresso);
        espresso = new Mocha(espresso);
        espresso = new Mocha(espresso);

        System.out.printf("""
                        Coffee Ingredients: %s.
                        Cost: $ %.2f%n""",
                espresso.getIngredients(),
                espresso.cost());
    }
}
