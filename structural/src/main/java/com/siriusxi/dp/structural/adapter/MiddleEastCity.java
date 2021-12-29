package com.siriusxi.dp.structural.adapter;

public class MiddleEastCity implements City {

    private final String name;
    private final double temperature;
    private boolean hasWarning;

    public MiddleEastCity(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public String getTemperatureScale() {
        return "Celsius";
    }

    @Override
    public boolean hasWeatherWarning() {
        return hasWarning;
    }

    @Override
    public void setWeatherWarning(boolean hasWarning) {
        this.hasWarning = hasWarning;
    }
}
