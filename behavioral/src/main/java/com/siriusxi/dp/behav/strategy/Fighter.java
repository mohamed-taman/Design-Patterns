package com.siriusxi.dp.behav.strategy;

import com.siriusxi.dp.behav.strategy.algorithms.jump.JumpBehavior;
import com.siriusxi.dp.behav.strategy.algorithms.kick.KickBehavior;
import com.siriusxi.dp.behav.strategy.algorithms.roll.RollBehavior;

import static java.lang.System.out;

/**
 * Abstract as you must have a specific fighter
 * @author Mohamed Taman
 */
public abstract class Fighter {
    
    protected JumpBehavior jumpBehavior;
    protected KickBehavior kickBehavior;
    protected RollBehavior rollBehavior;
    
    public Fighter (){}
    
    public Fighter(JumpBehavior jumpBehavior,
                   KickBehavior kickBehavior,
                   RollBehavior rollBehavior) {
        this.jumpBehavior = jumpBehavior;
        this.kickBehavior = kickBehavior;
        this.rollBehavior = rollBehavior;
    }
    
    public void setBehavior(JumpBehavior jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
    }
    
    public void setBehavior(KickBehavior kickBehavior) {
        this.kickBehavior = kickBehavior;
    }
    
    public void setBehavior(RollBehavior rollBehavior) {
        this.rollBehavior = rollBehavior;
    }
    
    public void jump(){
        // delegate to jump behavior
        jumpBehavior.jump();
    }
    
    public void kick(){
        // delegate to kick behavior
        kickBehavior.kick();
    }
    
    public void roll(){
        // delegate to roll behavior
        rollBehavior.roll();
    }
    
    public void punch(){
        out.println("Performing a Quick punch!");
    }
    
    
    public abstract void display();
}
