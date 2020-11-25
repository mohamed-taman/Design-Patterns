package com.siriusxi.dp.behav.strategy.algorithms.roll;

import lombok.extern.java.Log;

@Log
public class NoRoll implements RollBehavior {
    @Override
    public void roll() {
        log.info("I am not Rolling!");
    }
}
