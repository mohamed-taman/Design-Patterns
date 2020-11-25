package com.siriusxi.dp.behav.strategy.algorithms.kick;

import static java.lang.System.out;

public class NormalKick implements KickBehavior {
    
    @Override
    public void kick() {
        out.println("Performing a Straight kick! ");
    }
}
