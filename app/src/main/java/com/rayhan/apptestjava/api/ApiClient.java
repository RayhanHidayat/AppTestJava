package com.rayhan.apptestjava.api;

import android.content.Context;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    protected static final String API_KEY = "INSERT_API_KEY_HERE";
    private static final String BASE_URL = "https://api.themoviedb.org/3/";

    public ApiService getApiService(Context context) {
        final OkHttpClient client = new OkHttpClient
                .Builder()
                .addInterceptor(new ApiKeyInterceptor())
                .build();
        final Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        return retrofit.create(ApiService.class);
    }
}
