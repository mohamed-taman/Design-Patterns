package com.siriusxi.dp.behav.observer.concrete;

import com.siriusxi.dp.behav.observer.Message;
import com.siriusxi.dp.behav.observer.Observer;
import com.siriusxi.dp.behav.observer.Subject;

import static java.lang.System.out;

public class Logger implements Observer {
    
    private final Subject station;
    
    public Logger(Subject station) {
        this.station = station;
        station.register(this);
    }
    
    public void unsubscribe() {
        station.remove(this);
    }
    
    @Override
    public void update(Message message) {
        log(message);
    }
    
    private void log(Message message) {
        out.printf("Logger: Current Weather measures: [Temperature %d, Pressure %d, Wind Speed " +
                           "%d]%n",
                message.temperature(),
                message.pressure(),
                message.windSpeed());
    }
}
