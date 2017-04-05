package com.weather.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.weather.modelType.UnitType;

/**
 * Created by mdeshpande on 4/4/17.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Temperature {
    @JsonProperty("Metric")
    private UnitType metric;
    @JsonProperty("Imperial")
    private UnitType imperial;
    @JsonProperty("Minimum")
    private UnitType minimumTemparature;
    @JsonProperty("Maximum")
    private UnitType maximumTemparature;;

    public UnitType getMinimumTemparature() {
        return minimumTemparature;
    }

    public void setMinimumTemparature(UnitType minimumTemparature) {
        this.minimumTemparature = minimumTemparature;
    }

    public UnitType getMaximumTemparature() {
        return maximumTemparature;
    }

    public void setMaximumTemparature(UnitType maximumTemparature) {
        this.maximumTemparature = maximumTemparature;
    }

    public UnitType getMetric() {
        return metric;
    }

    public void setMetric(UnitType metric) {
        this.metric = metric;
    }

    public UnitType getImperial() {
        return imperial;
    }

    public void setImperial(UnitType imperial) {
        this.imperial = imperial;
    }


}
