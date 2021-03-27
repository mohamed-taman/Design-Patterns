package com.siriusxi.dp.behav.observer.concrete;

import com.siriusxi.dp.behav.observer.Message;
import com.siriusxi.dp.behav.observer.Observer;
import com.siriusxi.dp.behav.observer.Subject;

public class BusinessApp implements Observer {
    
    private final Subject station;
    
    public BusinessApp(Subject station) {
        this.station = station;
        station.register(this);
    }
    
    @Override
    public void update(Message message) {
        show(message);
    }
    
    public void unsubscribe() {
        station.remove(this);
    }
    
    private void show(Message message) {
        
        var finalMessage = """
                Current Weather Forecast:
                  * Temperature: %d
                  * Wind Speed: %d
                  * Pressure: %d
                """.formatted(message.temperature(),
                message.windSpeed(),
                message.pressure());
        
        System.out.println(finalMessage);
    }
}
