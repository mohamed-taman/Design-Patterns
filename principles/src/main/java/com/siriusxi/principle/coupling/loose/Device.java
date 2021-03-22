package com.siriusxi.principle.coupling.loose;

public abstract class Device {
    
    public abstract void onDevice();
    
    public abstract void offDevice();
    
    public String type(){
        return this.getClass().getSimpleName();
    }
}
