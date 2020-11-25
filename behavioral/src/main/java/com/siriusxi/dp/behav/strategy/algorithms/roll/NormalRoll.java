package com.siriusxi.dp.behav.strategy.algorithms.roll;

import static java.lang.System.out;

public class NormalRoll implements RollBehavior {
    
    @Override
    public void roll() {
        out.println("Performing a rolling! ");
    }
}
