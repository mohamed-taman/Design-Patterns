package com.siriusxi.dp.behav.strategy.fighters;

import com.siriusxi.dp.behav.strategy.Fighter;
import com.siriusxi.dp.behav.strategy.algorithms.jump.JumpBehavior;
import com.siriusxi.dp.behav.strategy.algorithms.jump.NormalJump;
import com.siriusxi.dp.behav.strategy.algorithms.kick.KickBehavior;
import com.siriusxi.dp.behav.strategy.algorithms.kick.NormalKick;
import com.siriusxi.dp.behav.strategy.algorithms.kick.TornadoKick;
import com.siriusxi.dp.behav.strategy.algorithms.roll.NoRoll;
import com.siriusxi.dp.behav.strategy.algorithms.roll.NormalRoll;
import com.siriusxi.dp.behav.strategy.algorithms.roll.RollBehavior;

import static java.lang.System.out;

public class Ryu extends Fighter {
    
    public Ryu() {
        this.jumpBehavior = new NormalJump();
        this.kickBehavior = new NormalKick();
        this.rollBehavior = new NoRoll();
    }
    
    public Ryu(JumpBehavior jumpBehavior,
               KickBehavior kickBehavior,
               RollBehavior rollBehavior) {
        super(jumpBehavior, kickBehavior, rollBehavior);
    }
    
    @Override
    public void display() {
        out.println("I am \"Ryu\", Kens friend!");
    }
}
