package com.project.countriesapp.di;

import com.project.countriesapp.service.CountriesService;
import com.project.countriesapp.viewmodel.ListViewModel;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {CountriesApiModule.class})
public interface CountriesApiComponent {

    void inject(CountriesService service);

    void inject(ListViewModel listViewModel);
}
