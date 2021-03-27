package com.siriusxi.dp.behav.observer.concrete;

import com.siriusxi.dp.behav.observer.Message;
import com.siriusxi.dp.behav.observer.Observer;
import com.siriusxi.dp.behav.observer.Subject;

public class UserInterface implements Observer {
    
    private final Subject station;
    
    public UserInterface(Subject station) {
        this.station = station;
        station.register(this);
    }
    
    @Override
    public void update(Message message) {
        display(message);
    }
    
    public void unsubscribe() {
        station.remove(this);
    }
    
    private void display(Message message) {
        
        var finalMessage = """
                <h2>Current Weather forecast UI<h2>
                <ul>
                    <li>Temperature: %d </li>
                    <li>Pressure: %d </li>
                    <li>Wind Speed: %d </li>
                </ul>""".formatted(message.temperature(),
                message.pressure(),
                message.windSpeed());
        
        System.out.println(finalMessage);
    }
}
