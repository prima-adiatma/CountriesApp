package com.project.countriesapp.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.project.countriesapp.R;

import androidx.swiperefreshlayout.widget.CircularProgressDrawable;

public class CountryImageUtil {


    public static void loadImage(ImageView view, String url, CircularProgressDrawable progressDrawable) {

        RequestOptions options = new RequestOptions()
                .placeholder(progressDrawable)
                .error(R.mipmap.ic_launcher_round);

        Glide.with(view.getContext())
                .setDefaultRequestOptions(options)
                .load(url)
                .into(view);

    }

    public static CircularProgressDrawable getProgressDrawable(Context context) {
        CircularProgressDrawable progressDrawable = new CircularProgressDrawable(context);
        progressDrawable.setStrokeWidth(10f);
        progressDrawable.setCenterRadius(50f);
        progressDrawable.start();
        return  progressDrawable;
    }
}
