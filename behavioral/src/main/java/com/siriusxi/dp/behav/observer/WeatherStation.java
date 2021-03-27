package com.siriusxi.dp.behav.observer;

import java.util.ArrayList;

import static java.lang.System.out;
import static java.util.Objects.requireNonNull;

public class WeatherStation extends Subject {
    
    private int pressure;
    private int windSpeed;
    private int temperature;
    
    public WeatherStation() {
        super.observers = new ArrayList<>();
    }
    
    @Override
    public void register(Observer observer) {
        requireNonNull(observer, "Observer can't be null.");
        if (!observers.contains(observer))
            observers.add(observer);
        
        out.printf("%s is registered for weather forecasting.%n",
                observer.getClass().getSimpleName());
    }
    
    @Override
    public void remove(Observer observer) {
        requireNonNull(observer, "Observer can't be null.");
        observers.remove(observer);
        out.printf("%s has left the Station.%n", observer.getClass().getSimpleName());
    }
    
    @Override
    protected void notifyObservers() {
        out.println(observers.size());
        observers.forEach(observer -> observer.update(new Message(this.pressure,
                this.windSpeed, this.temperature)));
    }
    
    protected void updateMeasures(int pressure, int windSpeed, int temperature) {
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.temperature = temperature;
        this.notifyObservers();
    }
}
