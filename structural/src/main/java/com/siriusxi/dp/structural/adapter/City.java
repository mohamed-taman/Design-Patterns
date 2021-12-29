package com.siriusxi.dp.structural.adapter;

public interface City {
    String getName();
    double getTemperature();
    default String getTemperatureScale(){
        return "Fahrenheit";
    }
    boolean hasWeatherWarning();
    void setWeatherWarning(boolean hasWarning);
}
