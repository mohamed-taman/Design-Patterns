package com.siriusxi.dp.behav.strategy;

import com.siriusxi.dp.behav.strategy.algorithms.jump.JumpBehavior;
import com.siriusxi.dp.behav.strategy.algorithms.kick.KickBehavior;
import com.siriusxi.dp.behav.strategy.algorithms.roll.RollBehavior;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

/**
 * Strategy Fighter class to be implemented, as you must have a specific fighter.
 *
 * @author Mohamed Taman
 */
@Log
@NoArgsConstructor
@RequiredArgsConstructor
public abstract class Fighter {
    
    @NonNull
    protected JumpBehavior jumpBehavior;
    
    @NonNull
    protected KickBehavior kickBehavior;
    
    @NonNull
    protected RollBehavior rollBehavior;
    
    public void setBehavior(JumpBehavior jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
    }
    
    public void setBehavior(KickBehavior kickBehavior) {
        this.kickBehavior = kickBehavior;
    }
    
    public void setBehavior(RollBehavior rollBehavior) {
        this.rollBehavior = rollBehavior;
    }
    
    public void jump() {
        // delegate to jump behavior
        jumpBehavior.jump();
    }
    
    public void kick() {
        // delegate to kick behavior
        kickBehavior.kick();
    }
    
    public void roll() {
        // delegate to roll behavior
        rollBehavior.roll();
    }
    
    public void punch() {
        log.info("Performing a Quick punch!");
    }
    
    public abstract void display();
}
