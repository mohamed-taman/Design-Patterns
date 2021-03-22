package com.siriusxi.principle.coupling.tight;

import lombok.extern.java.Log;

@Log
public class Television {
    
    public void on(){
        log.info("TV is switched on.");
    }
    
    public void loadLastState(){
        log.info("TV is loading last program.");
    }
    
    public void off(){
        log.info("TV is switched off.");
    }
    
    public void saveCurrentState(){
        log.info("TV is saving current program.");
    }
}
