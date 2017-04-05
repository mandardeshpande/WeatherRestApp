package com.weather.modelType;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by mdeshpande on 4/4/17.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class UnitType {
    @JsonProperty("Value")
    private String unitValue;
    @JsonProperty("Unit")
    private String unitAbbrevation;

    public String getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(String unitValue) {
        this.unitValue = unitValue;
    }

    public String getUnitAbbrevation() {
        return unitAbbrevation;
    }

    public void setUnitAbbrevation(String unitAbbrevation) {
        this.unitAbbrevation = unitAbbrevation;
    }
}
