package com.project.countriesapp.service;


import com.project.countriesapp.di.DaggerCountriesApiComponent;
import com.project.countriesapp.model.CountryModel;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import androidx.lifecycle.ViewModel;
import io.reactivex.Single;


@Singleton
public class CountriesService {

//    private static CountriesService instance;

    @Inject
    public CountriesApi api;

//    @Inject
    public CountriesService() {
        // Melakukan injeksi langsung menggunakan Dagger di konstruktor
        DaggerCountriesApiComponent.create().inject(this);

        // Inject Manual
//        CountriesApiComponent component = DaggerCountriesApiComponent.create();
//        CountriesService service = CountriesService.getInstance();
//        component.inject(service);
    }

    // Singleton logic to create only one instance
    // Not use this logic because have @Singleton
//    public static CountriesService getInstance() {
//        if (instance == null) {
//            instance = new CountriesService();
//        }
//        return instance;
//    }

    public Single<List<CountryModel>> getCountries() {
        return api.getCountries();
    }
}
