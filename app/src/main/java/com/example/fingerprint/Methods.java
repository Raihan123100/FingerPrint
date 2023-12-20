package com.example.fingerprint;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Methods {
    @GET("api/users?page=1")
    Call<Model> getAllData();

    @POST("users")

        //on below line we are creating a method to post our data.
    Call<DataModal> createPost(@Body DataModal dataModal);

}