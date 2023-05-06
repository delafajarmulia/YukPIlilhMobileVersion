package com.example.yukpilihpart2.models;

import com.google.gson.annotations.SerializedName;

public class TokenLogin {
    @SerializedName("token")
    private String Token;

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }
}
