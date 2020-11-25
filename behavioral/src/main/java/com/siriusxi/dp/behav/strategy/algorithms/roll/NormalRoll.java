package com.siriusxi.dp.behav.strategy.algorithms.roll;

import lombok.extern.java.Log;

@Log
public class NormalRoll implements RollBehavior {
    
    @Override
    public void roll() {
        log.info("Performing a Rolling!");
    }
}
