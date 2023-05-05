package com.example.yukpilihpart2.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.text.DateFormat;

public class User {
    @SerializedName("id")
    @Expose
    private int Id;

    @SerializedName("username")
    @Expose
    private String Username;

    @SerializedName("password")
    @Expose
    private String Password;

    @SerializedName("role")
    @Expose
    private String Role;

    @SerializedName("token")
    @Expose
    private String Token;

    public User(int id, String username, String password, String role, String token) {
        Id = id;
        Username = username;
        Password = password;
        Role = role;
        Token = token;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }
}
