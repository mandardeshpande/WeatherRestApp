package com.weather.config;

/**
 * Created by mdeshpande on 4/4/17.
 */

public class ClientUrlConfigurator {
    public static final String rootClientURL = "http://dataservice.accuweather.com";
    public static final String apiKey = "D2teGHv5WCulgwdc6ujqYLk1TARYllSj";

    public static final String routeForLocationKey = "/locations/v1/search";
    public static final String routeForForecast = "/forecasts/v1/daily/";
    public static final String routeForCurrentConditions = "/currentconditions/v1/";

    public static final String foreCast = "day";
}
