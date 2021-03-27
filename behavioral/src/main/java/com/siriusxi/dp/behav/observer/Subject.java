package com.siriusxi.dp.behav.observer;

import java.util.List;

public abstract class Subject {
    
    protected List<Observer> observers;
    
    public abstract void register(Observer observer);
    
    public abstract void remove(Observer observer);
    
    protected abstract void notifyObservers();
}
