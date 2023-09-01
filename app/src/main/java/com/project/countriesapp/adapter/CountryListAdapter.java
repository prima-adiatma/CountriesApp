package com.project.countriesapp.adapter;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.project.countriesapp.databinding.ItemCountryBinding;
import com.project.countriesapp.model.CountryModel;
import com.project.countriesapp.util.CountryImageUtil;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryListAdapter extends RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>{

    private List<CountryModel> countries;

    public CountryListAdapter(List<CountryModel> countries) {
        this.countries = countries;
    }

    public void updateCountries(List<CountryModel> newCountries) {
        countries.clear();
        countries.addAll(newCountries);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemCountryBinding binding = ItemCountryBinding.inflate(layoutInflater, parent, false);
        return new CountryViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        CountryModel country = countries.get(position);
        holder.bind(country);
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder {

        private final ItemCountryBinding binding;

        public CountryViewHolder(@NonNull ItemCountryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(CountryModel country) {
            binding.name.setText(country.getCountryName());
            binding.capital.setText(country.getCapitalName());
            CountryImageUtil.loadImage(binding.imageView, country.getFlagName(), CountryImageUtil.getProgressDrawable(binding.imageView.getContext()));
        }

    }



}
