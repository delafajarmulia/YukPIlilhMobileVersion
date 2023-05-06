package com.example.yukpilihpart2.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetOneUser {
    @SerializedName("users")
    @Expose
    int users;

    public int getUsers() {
        return users;
    }

    public void setUsers(int users) {
        this.users = users;
    }
}
