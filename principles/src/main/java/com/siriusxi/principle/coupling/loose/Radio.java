package com.siriusxi.principle.coupling.loose;


import lombok.extern.java.Log;

@Log
public class Radio extends Device {
    
    private void on() {
        log.info(type() + " is switched on.");
    }
    
    private void off() {
        log.info(type() + " is switched off.");
    }
    
    @Override
    public void onDevice() {
        this.on();
    }
    
    @Override
    public void offDevice() {
        this.off();
    }
}
