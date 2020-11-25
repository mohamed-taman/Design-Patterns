package com.siriusxi.dp.behav.strategy.algorithms.jump;

import lombok.extern.java.Log;

@Log
public class HighJump implements JumpBehavior {
    @Override
    public void jump() {
        log.info("Performing a High Jump!");
    }
}
