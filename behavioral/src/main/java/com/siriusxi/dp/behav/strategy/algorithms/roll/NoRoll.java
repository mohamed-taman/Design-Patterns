package com.siriusxi.dp.behav.strategy.algorithms.roll;

import static java.lang.System.out;

public class NoRoll implements RollBehavior {
    @Override
    public void roll() {
        out.println("I am not Rolling! ");
    }
}
