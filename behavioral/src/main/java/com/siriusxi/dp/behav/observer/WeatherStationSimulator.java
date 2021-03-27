package com.siriusxi.dp.behav.observer;

import com.siriusxi.dp.behav.observer.concrete.Alert;
import com.siriusxi.dp.behav.observer.concrete.BusinessApp;
import com.siriusxi.dp.behav.observer.concrete.Logger;
import com.siriusxi.dp.behav.observer.concrete.UserInterface;

/**
 * Main driver class to show Observer pattern in action.
 *
 * @author mohamed_taman.
 */
public class WeatherStationSimulator {
    
    public static void main(String[] args) {
        // 1. create weather station subject
        WeatherStation station = new WeatherStation();
        
        // Create observers
        UserInterface ui = new UserInterface(station);
        Alert alert = new Alert(station);
        Logger logger = new Logger(station);
        BusinessApp businessApp = new BusinessApp(station);
        
        System.out.println("-------------- First Weather Update -----------------");
        // Update weather data
        station.updateMeasures(100, 20, 15);
        
        // Logger is not interested anymore
        logger.unsubscribe();
        
        System.out.println("-------------- Second Weather Update -----------------");
        // Second Update weather data
        station.updateMeasures(160, 20, -1);
        // All observers are unregistered
        alert.unsubscribe();
        ui.unsubscribe();
        businessApp.unsubscribe();
        
        System.out.println("-------------- Third Weather Update -----------------");
        // Third Update weather data
        station.updateMeasures(134, 150, -12);
    }
}
