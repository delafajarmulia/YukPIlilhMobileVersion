package com.example.yukpilihpart2.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.text.DateFormat;

public class UserModel implements Parcelable {
    private int Id;

    protected UserModel(Parcel in) {
        Id = in.readInt();
        DivisionId = in.readInt();
        Username = in.readString();
        Password = in.readString();
        Role = in.readString();
        Token = in.readString();
    }

    public static final Creator<UserModel> CREATOR = new Creator<UserModel>() {
        @Override
        public UserModel createFromParcel(Parcel in) {
            return new UserModel(in);
        }

        @Override
        public UserModel[] newArray(int size) {
            return new UserModel[size];
        }
    };

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getDivisionId() {
        return DivisionId;
    }

    public void setDivisionId(int divisionId) {
        DivisionId = divisionId;
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

    public DateFormat getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(DateFormat createdAt) {
        CreatedAt = createdAt;
    }

    public DateFormat getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(DateFormat updatedAt) {
        UpdatedAt = updatedAt;
    }

    private int DivisionId;
    private String Username, Password, Role, Token;
    private DateFormat CreatedAt, UpdatedAt;

    public UserModel(int id, int divisionId, String username, String password, String role, String token, DateFormat createdAt, DateFormat updatedAt) {
        Id = id;
        DivisionId = divisionId;
        Username = username;
        Password = password;
        Role = role;
        Token = token;
        CreatedAt = createdAt;
        UpdatedAt = updatedAt;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(Id);
        parcel.writeInt(DivisionId);
        parcel.writeString(Username);
        parcel.writeString(Password);
        parcel.writeString(Role);
        parcel.writeString(Token);
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "Id=" + Id +
                ", DivisionId=" + DivisionId +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", Role='" + Role + '\'' +
                ", Token='" + Token + '\'' +
                ", CreatedAt=" + CreatedAt +
                ", UpdatedAt=" + UpdatedAt +
                '}';
    }
}

