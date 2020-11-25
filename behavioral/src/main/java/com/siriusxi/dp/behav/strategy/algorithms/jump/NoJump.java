package com.siriusxi.dp.behav.strategy.algorithms.jump;

import lombok.extern.java.Log;

@Log
public class NoJump implements JumpBehavior {
    @Override
    public void jump() {
        log.info("I am not Jumping!");
    }
}
