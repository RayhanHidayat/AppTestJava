package com.rayhan.apptestjava.ui;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.rayhan.apptestjava.api.ApiClient;
import com.rayhan.apptestjava.api.ApiService;
import com.rayhan.apptestjava.api.model.ResponseMovieDetail;

import org.jetbrains.annotations.NotNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends AndroidViewModel {
    private final Application application;
    private final ApiService client;
    private final String tag = "MainViewModel";
    private final MutableLiveData<ResponseMovieDetail> _movieDetail = new MutableLiveData<ResponseMovieDetail>();
    public final LiveData<ResponseMovieDetail> movieDetail = _movieDetail;

    public MainViewModel(@NonNull @NotNull Application application) {
        super(application);
        this.application = application;
        client = new ApiClient().getApiService(application);
    }

    public void getMovieDetails() {
        client.getDetails().enqueue(new Callback<ResponseMovieDetail>() {
            @Override
            public void onResponse(@NotNull Call<ResponseMovieDetail> call, @NotNull Response<ResponseMovieDetail> response) {
                if (response.isSuccessful()) {
                    _movieDetail.setValue(response.body());

                    if (movieDetail == null) Log.i(tag, "Response detail berisi null");
                }
            }

            @Override
            public void onFailure(@NotNull Call<ResponseMovieDetail> call, @NotNull Throwable t) {
                Log.e(tag, "Response detail gagal didapat");
            }
        });
    }

    @NotNull
    public Application getApplication() {
        return application;
    }
}
