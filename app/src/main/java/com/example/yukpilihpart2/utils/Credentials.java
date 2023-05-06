package com.example.yukpilihpart2.utils;

import static android.icu.util.MeasureUnit.SECOND;

import com.example.yukpilihpart2.ApiInterface;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Credentials {

//    OkHttpClient client = new OkHttpClient.Builder()
//            .retryOnConnectionFailure(true)
//            .build();

    //public static final String BASE_URL = "https://reqres.in/api/";
    public static final String BASE_URL = "http://10.0.2.2:5043/api/";
    private static Retrofit retrofit = null;
    public static Retrofit getRetrofit(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            //private static ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        }
        return retrofit;
    }

//    private static ApiInterface apiInterface = retrofit.create(ApiInterface.class);
//
//    public static ApiInterface getApiInterface(){
//        return apiInterface;
//    }
}
