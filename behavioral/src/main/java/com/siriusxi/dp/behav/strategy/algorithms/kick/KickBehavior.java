package com.siriusxi.dp.behav.strategy.algorithms.kick;

/**
 * Encapsulated Kick behavior
 *
 * @author mohamed_taman
 */
public interface KickBehavior {
    void kick();
    
    static KickBehavior normalKick() {
        return () -> System.out.println("Performing a Straight Kick!");
    }
    
    static KickBehavior tornadoKick() {
        return () -> System.out.println("Performing a Tornado Kick!");
    }
}
