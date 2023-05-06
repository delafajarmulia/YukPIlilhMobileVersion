package com.example.yukpilihpart2.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetModel {
    @SerializedName("page")
    @Expose
    int page;

//    @SerializedName("data")
//    @Expose
//    List<Model> modelList;
//
//    @SerializedName("message")
//    @Expose
//    String message;
}
