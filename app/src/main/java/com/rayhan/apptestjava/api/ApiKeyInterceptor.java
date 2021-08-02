package com.rayhan.apptestjava.api;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class ApiKeyInterceptor implements Interceptor {
    @NotNull
    @Override
    public Response intercept(Chain chain) throws IOException {
        final HttpUrl url = chain.request()
                .url()
                .newBuilder()
                .addQueryParameter("api_key", ApiClient.API_KEY).build();
        final Request request = chain.request()
                .newBuilder()
                .url(url)
                .build();
        return chain.proceed(request);
    }
}
