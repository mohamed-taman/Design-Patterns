package com.siriusxi.dp.behav.strategy.algorithms.kick;


import lombok.extern.java.Log;

@Log
public class NormalKick implements KickBehavior {
    @Override
    public void kick() {
        log.info("Performing a Straight Kick!");
    }
}
