package com.siriusxi.principle.coupling.loose;

import lombok.extern.java.Log;

import java.util.Objects;

/**
 * LC for loose coupling, just to make difference
 * from the Remote class in tight package.
 */
@Log
public class LCRemote {
    
    private final Device device;
    
    
    
    public LCRemote(Device device){
        
        this.device = Objects.requireNonNull(device,
                "Device can't be null");
    }
    
    public void switchOn() {
        log.info("Switching on "+ device.type() + "...");
        device.onDevice();
    }
    
    public void switchOff() {
        log.info("Switching off " + device.type() + "...");
       device.offDevice();
    }
}
