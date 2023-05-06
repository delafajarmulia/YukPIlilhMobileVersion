package com.example.yukpilihpart2.models;

import androidx.exifinterface.media.ExifInterface;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

public class GetAllUser {
    @SerializedName("users")
    @Expose
    List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
