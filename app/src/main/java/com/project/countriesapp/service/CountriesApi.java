package com.project.countriesapp.service;

import com.project.countriesapp.model.CountryModel;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface CountriesApi {

    @GET("DevTides/countries/master/countriesV2.json")
    // Note: Single is a type of observable that rxjava generates for us
    // And the only kind of specific thing about a single is that it's an observable that emits only one value and then finishes
    Single<List<CountryModel>> getCountries();
}
