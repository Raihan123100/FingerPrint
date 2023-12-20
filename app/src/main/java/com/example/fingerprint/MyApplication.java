package com.example.fingerprint;

import android.app.Application;

import Interfaces.MyApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyApplication extends Application {
    private MyApi myApi;

    @Override
    public void onCreate() {
        super.onCreate();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/") // Base URL of the API
                .addConverterFactory(GsonConverterFactory.create()) // JSON converter
                .build();

        myApi = retrofit.create(MyApi.class);
    }

    public MyApi getMyApi() {
        return myApi;
    }
}

