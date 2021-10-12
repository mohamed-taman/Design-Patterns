package com.siriusxi.dp.structural.decorator;

/**
 * This abstract class Drink defines the functionality of Drink implemented by decorator
 */
public abstract class Drink {
    protected String ingredients = "Unknown Drink";

    /**
     * @return the ingredients of the drink
     */
    public String getIngredients() {
        return ingredients;
    }

    /**
     * @return the cost of the drink
     */
    public abstract double cost();
}