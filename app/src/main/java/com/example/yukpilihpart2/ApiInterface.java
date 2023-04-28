package com.example.yukpilihpart2;

import com.example.yukpilihpart2.models.GetUser;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("https://localhost:7248/api/User")
    Call<GetUser> getUser();
}
