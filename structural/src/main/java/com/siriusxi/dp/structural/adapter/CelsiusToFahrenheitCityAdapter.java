package com.siriusxi.dp.structural.adapter;

public class CelsiusToFahrenheitCityAdapter implements City{

    private final City city;

    public CelsiusToFahrenheitCityAdapter(City city) {
        this.city = city;
    }

    @Override
    public String getName() {
        return city.getName();
    }

    @Override
    public double getTemperature() {
        return city.getTemperature() * 1.8 + 32;
    }

    @Override
    public boolean hasWeatherWarning() {
        return city.hasWeatherWarning();
    }

    @Override
    public void setWeatherWarning(boolean hasWarning) {
        city.setWeatherWarning(hasWarning);
    }
}
