package com.example.yukpilihpart2;

import com.example.yukpilihpart2.models.GetUser;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Url;

public interface ApiInterface {
    @GET("User")
    Call<GetUser> getUser();
}
