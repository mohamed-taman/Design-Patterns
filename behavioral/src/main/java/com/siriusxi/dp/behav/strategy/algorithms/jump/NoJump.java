package com.siriusxi.dp.behav.strategy.algorithms.jump;

import static java.lang.System.out;

public class NoJump implements JumpBehavior {
    @Override
    public void jump() {
        out.println("I am not Jumping! ");
    }
}
