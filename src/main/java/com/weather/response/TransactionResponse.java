package com.weather.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.weather.models.Country;
import com.weather.models.DailyForecasts;
import com.weather.models.Temperature;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mdeshpande on 4/4/17.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class TransactionResponse {

    @JsonProperty("Version")
    private String versionId;

    @JsonProperty("Key")
    private String keyForLocation;

    @JsonProperty("Country")
    private Country countryOfLocation;

    @JsonProperty("Temperature")
    private Temperature temperature;

    @JsonProperty("DailyForecasts")
    private List<DailyForecasts> foreCasts = new ArrayList<>();

    public List<DailyForecasts> getForeCasts() {
        return foreCasts;
    }

    public void setForeCasts(List<DailyForecasts> foreCasts) {
        this.foreCasts = foreCasts;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getKeyForLocation() {
        return keyForLocation;
    }

    public void setKeyForLocation(String keyForLocation) {
        this.keyForLocation = keyForLocation;
    }

    public Country getCountryOfLocation() {
        return countryOfLocation;
    }

    public void setCountryOfLocation(Country countryOfLocation) {
        this.countryOfLocation = countryOfLocation;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "";
    }
}
