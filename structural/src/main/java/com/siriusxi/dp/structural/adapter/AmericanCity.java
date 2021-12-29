package com.siriusxi.dp.structural.adapter;

public class AmericanCity implements City {

    private final String name;
    private final double temperature;
    private boolean hasWarning;

    public AmericanCity(String name, double temperature) {
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
    public boolean hasWeatherWarning() {
        return hasWarning;
    }

    @Override
    public void setWeatherWarning(boolean hasWarning) {
        this.hasWarning = hasWarning;
    }
}
