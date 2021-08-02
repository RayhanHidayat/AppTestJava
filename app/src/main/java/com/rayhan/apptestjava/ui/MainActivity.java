package com.rayhan.apptestjava.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.rayhan.apptestjava.databinding.ActivityMainBinding;

import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        MainViewModel movieDetailViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        movieDetailViewModel.getMovieDetails();

        movieDetailViewModel.movieDetail.observe(this, item -> {
            final String poster = item.getPosterPath();
            final String backdrop = item.getBackdropPath();

            binding.tvTitle.setText(item.getTitle());
            binding.tvBahasaIsi.setText(item.getOriginalLanguage());
            binding.tvDateIsi.setText(item.getReleaseDate());
            binding.tvNumAvg.setText(item.getVoteAverage());
            binding.tvNumCount.setText(item.getVoteCount());
            binding.tvOverview.setText(item.getOverview());
            binding.tvTagline.setText(item.getTagline());

            Glide.with(this)
                    .load("https://image.tmdb.org/t/p/w500" + backdrop)
                    .apply(RequestOptions.bitmapTransform(new RoundedCornersTransformation(9, 0)))
                    .apply(RequestOptions.overrideOf(600, 200)).into(binding.imgBackdrop);
            Glide.with(this)
                    .load("https://image.tmdb.org/t/p/w500" + poster)
                    .apply(RequestOptions.bitmapTransform(new RoundedCornersTransformation(9, 0)))
                    .into(binding.imgPoster);
        });
    }
}