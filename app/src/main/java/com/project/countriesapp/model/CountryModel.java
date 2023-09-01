package com.project.countriesapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import io.reactivex.Single;

public class CountryModel {

    @SerializedName("name")
    String countryName;
    @SerializedName("capital")
    String capitalName;
    @SerializedName("flagPNG")
    String flagName;

    public CountryModel(String countryName, String capitalName, String flagName) {
        this.countryName = countryName;
        this.capitalName = capitalName;
        this.flagName = flagName;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public String getFlagName() {
        return flagName;
    }

}
