package com.siriusxi.principle.coupling.loose;

import lombok.extern.java.Log;

/**
 * LC for loose coupling, just to make difference
 * from the Television class in tight package.
 */
@Log
public class LCTelevision extends Device {
    
    private void on(){
        log.info(type() + " is switched on.");
    }
    
    private void loadLastState(){
        log.info(type() + " is loading last program.");
    }
    
    private void off(){
        log.info(type() + " is switched off.");
    }
    
    private void saveCurrentState(){
        log.info(type() + " is saving current program.");
    }
    
    @Override
    public void onDevice() {
        this.on();
        this.loadLastState();
    }
    
    @Override
    public void offDevice() {
        this.saveCurrentState();
        this.off();
    
    }
}
