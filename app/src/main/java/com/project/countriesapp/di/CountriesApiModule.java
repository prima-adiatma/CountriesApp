package com.project.countriesapp.di;

import com.project.countriesapp.service.CountriesApi;
import com.project.countriesapp.service.CountriesService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
@Module
public class CountriesApiModule {

    private static final String BASE_URL = "https://raw.githubusercontent.com";

    @Provides
    public CountriesApi provideCountriesApi() {
        return new Retrofit.Builder()
            .baseUrl(BASE_URL)
            // GsonConverterFactory: converts Json that is retrieved from the backend API into a object type that we define
            .addConverterFactory(GsonConverterFactory.create())
            // RxJava2CallAdapterFactory: rxjava to takes that list and converts it into a single observable of that list and that allows
            // retrofit to convert Json from the backend API into a single of the response type that we are looking
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(CountriesApi.class);
    }
    @Provides
    public CountriesService provideCountriesService(){
        return new CountriesService();
    }


}
