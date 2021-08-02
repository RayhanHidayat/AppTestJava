package com.rayhan.apptestjava.api;

import com.rayhan.apptestjava.api.model.ResponseMovieDetail;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("movie/550")
    Call<ResponseMovieDetail> getDetails();
}
