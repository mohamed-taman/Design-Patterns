package com.siriusxi.dp.behav.observer.concrete;

import com.siriusxi.dp.behav.observer.Message;
import com.siriusxi.dp.behav.observer.Observer;
import com.siriusxi.dp.behav.observer.Subject;

import static java.lang.System.out;

public class Alert implements Observer {
    
    private final Subject station;
    
    public Alert(Subject station) {
        this.station = station;
        station.register(this);
    }
    
    public void unsubscribe() {
        station.remove(this);
    }
    
    @Override
    public void update(Message message) {
        if (message.temperature() <= 0 ||
                    message.pressure() >= 150 ||
                    message.windSpeed() >= 50)
            alert(message);
    }
    
    private void alert(Message message) {
        out.printf("Alert Critical Weather: [Temp %d, Pressure %d, Wind Speed %d]%n",
                message.temperature(),
                message.pressure(),
                message.windSpeed());
    }
}
