package com.siriusxi.dp.behav.strategy.algorithms.jump;

import static java.lang.System.out;

public class HighJump implements JumpBehavior {
    @Override
    public void jump() {
        out.println("Performing a High Jump!");
    }
}
