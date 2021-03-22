package com.siriusxi.principle.coupling.tight;

import lombok.extern.java.Log;

import java.util.Objects;

@Log
public class Remote {
    
    private final Television television;
    
    public Remote(){
        television = new Television();
    }
    
    public Remote(Television tv){
        
        television = Objects.requireNonNull(tv,
                "Television instance can't be null");
    }
    
    public void switchOn() {
        log.info("Switching on TV...");
        television.on();
        television.loadLastState();
    }
    
    public void switchOff() {
        log.info("Switching off TV...");
        television.saveCurrentState();
        television.off();
    }
}
