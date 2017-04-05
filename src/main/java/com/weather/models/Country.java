package com.weather.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by mdeshpande on 4/4/17.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Country {
    @JsonProperty("ID")
    private String countryId;

    @JsonProperty("LocalizedName")
    private String countryLocalizedName;

    @JsonProperty("EnglishName")
    private String countryEnglishName;

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryLocalizedName() {
        return countryLocalizedName;
    }

    public void setCountryLocalizedName(String countryLocalizedName) {
        this.countryLocalizedName = countryLocalizedName;
    }

    public String getCountryEnglishName() {
        return countryEnglishName;
    }

    public void setCountryEnglishName(String countryEnglishName) {
        this.countryEnglishName = countryEnglishName;
    }
}
