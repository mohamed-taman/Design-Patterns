package com.siriusxi.dp.behav.strategy.fighters;


import com.siriusxi.dp.behav.strategy.Fighter;
import com.siriusxi.dp.behav.strategy.algorithms.jump.JumpBehavior;
import com.siriusxi.dp.behav.strategy.algorithms.jump.NoJump;
import com.siriusxi.dp.behav.strategy.algorithms.kick.KickBehavior;
import com.siriusxi.dp.behav.strategy.algorithms.kick.NormalKick;
import com.siriusxi.dp.behav.strategy.algorithms.roll.NoRoll;
import com.siriusxi.dp.behav.strategy.algorithms.roll.RollBehavior;
import lombok.extern.java.Log;

@Log
public class EHonda extends Fighter {
    
    public EHonda() {
        this.jumpBehavior = new NoJump();
        this.kickBehavior = new NormalKick();
        this.rollBehavior = new NoRoll();
    }
    
    public EHonda(JumpBehavior jumpBehavior,
                  KickBehavior kickBehavior,
                  RollBehavior rollBehavior) {
        super(jumpBehavior, kickBehavior, rollBehavior);
    }
    
    @Override
    public void display() {
        log.info("I am a Sumo \"E.Honda\"!");
    }
}
