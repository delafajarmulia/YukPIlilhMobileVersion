package com.example.yukpilihpart2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.appsearch.GetByDocumentIdRequest;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.yukpilihpart2.models.GetUser;
import com.example.yukpilihpart2.models.User;
import com.example.yukpilihpart2.utils.Credentials;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private ApiInterface mApiInterface;

    private EditText txtUsername, txtPassword;
    private String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = findViewById(R.id.input_username);
        txtPassword = findViewById(R.id.input_password);

        username = txtUsername.getText().toString();
        password = txtPassword.getText().toString();

        mApiInterface = Credentials.getRetrofit().create(ApiInterface.class);
        refresh();

        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ChangePwActivity.class);
                startActivity(intent);
            }
        });
    }

    private void refresh(){
        Call<GetUser> userCall = mApiInterface.getUser();
        userCall.enqueue(new Callback<GetUser>() {
            @Override
            public void onResponse(Call<GetUser> call, Response<GetUser> response) {
                List<User> userList = response.body().getUserList();
                Log.d("Retrofit get", "jumlah user :" +String.valueOf(userList.size()));
            }

            @Override
            public void onFailure(Call<GetUser> call, Throwable t) {
                Log.d("Retrofit get", t.toString());
            }
        });
    }
}