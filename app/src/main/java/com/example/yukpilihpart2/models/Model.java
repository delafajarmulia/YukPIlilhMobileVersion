package com.example.yukpilihpart2.models;

import com.google.gson.annotations.SerializedName;

public class Model {
    @SerializedName("id")
    private int id;

    @SerializedName("email")
    private int email;

    public Model(int id, int email) {
        this.id = id;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }
}
