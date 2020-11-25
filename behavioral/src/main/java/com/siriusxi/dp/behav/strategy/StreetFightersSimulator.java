package com.siriusxi.dp.behav.strategy;

import com.siriusxi.dp.behav.strategy.algorithms.jump.HighJump;
import com.siriusxi.dp.behav.strategy.algorithms.jump.JumpBehavior;
import com.siriusxi.dp.behav.strategy.algorithms.kick.KickBehavior;
import com.siriusxi.dp.behav.strategy.fighters.Ken;
import lombok.extern.java.Log;

/**
 * Street Fighters game Simulator,
 * to demonstrate implementation of Strategy Pattern.
 *
 * @author mohamed_taman
 */
@Log
public class StreetFightersSimulator {
    
    public static void main(String[] args) {
        
        // let us make some behaviors first
        JumpBehavior highJump = new HighJump();
        
        // Make a fighter with default behaviors
        Fighter ken = new Ken();
        ken.display();
        
        // Test behaviors
        ken.punch();
        ken.kick();
        ken.jump();
        ken.roll();
        
        // Change behavior dynamically (algorithms are interchangeable)
        ken.setBehavior(highJump);
        ken.jump();
        
        // Creating inline kick implementation
        KickBehavior backwardKick = () -> log.info("Performing a Backward Kick!");
        ken.setBehavior(backwardKick);
        ken.kick();
        
        //Returning to normal Kick behavior
        ken.setBehavior(KickBehavior.tornadoKick());
        ken.kick();
    }
}
