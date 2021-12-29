package com.siriusxi.dp.structural.adapter;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherFeeder.postWarning(new AmericanCity("San Francisco",15.2));

        WeatherFeeder.postWarning(new AmericanCity("Atlanta",70.6));

        WeatherFeeder.postWarning(new AmericanCity("New York",104.3));

        City kuwait = new CelsiusToFahrenheitCityAdapter(new MiddleEastCity("Kuwait",50));
        WeatherFeeder.postWarning(kuwait);

        City cairo = new CelsiusToFahrenheitCityAdapter(new MiddleEastCity("Cairo",35.2));
        WeatherFeeder.postWarning(cairo);
    }
}
