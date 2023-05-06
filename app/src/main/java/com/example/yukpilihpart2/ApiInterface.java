package com.example.yukpilihpart2;

import com.example.yukpilihpart2.models.GetAllUser;
import com.example.yukpilihpart2.models.GetModel;
import com.example.yukpilihpart2.models.GetUser;
import com.example.yukpilihpart2.models.TokenLogin;

import javax.ws.rs.Consumes;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Url;

//@Path("/json/product")
public interface ApiInterface {
    @GET("User/{id}")
    Call<GetUser> getUser(@Path("id") int id);

    @GET("User")
    Call<GetAllUser> getUsers();

    //@Headers("Content-Type:application/json")
    @FormUrlEncoded
    @POST("Auth/Login")
    //@Path("/post")
    @Consumes("application/json")
    Call<TokenLogin> UserLogin(@Field("username") String username,
                               @Field("password") String password);
}
