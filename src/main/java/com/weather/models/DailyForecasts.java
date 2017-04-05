package com.weather.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by mdeshpande on 4/5/17.
 */
public class DailyForecasts {
    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("Temperature")
    private Temperature temperature;
}
