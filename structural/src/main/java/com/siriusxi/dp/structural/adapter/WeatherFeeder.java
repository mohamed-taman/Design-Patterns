package com.siriusxi.dp.structural.adapter;

import java.util.Objects;

public final class WeatherFeeder {
    public static final double MAX_TEMPERATURE = 100;
    public static final double MIN_TEMPERATURE = 16;

    private WeatherFeeder() {
    }

    public static void postWarning(City city){
        Objects.requireNonNull(city, "City cannot be null");
        var message = "";
        if (city.getTemperature() >= MAX_TEMPERATURE ||
                city.getTemperature() <= MIN_TEMPERATURE) {

            message = "Warning! The current temperature in %s is %.1f %s."
                    .formatted(city.getName(),
                            city.getTemperature(),
                            city.getTemperatureScale());

            city.setWeatherWarning(true);
        } else
            message = "The temperature in %s is OK.".formatted(city.getName());

       System.out.println(message);
    }
}
