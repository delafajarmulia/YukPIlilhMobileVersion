package com.example.yukpilihpart2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.yukpilihpart2.models.GetAllUser;
import com.example.yukpilihpart2.models.GetModel;
import com.example.yukpilihpart2.models.GetOneUser;
import com.example.yukpilihpart2.models.GetUser;
import com.example.yukpilihpart2.models.Model;
import com.example.yukpilihpart2.models.TokenLogin;
import com.example.yukpilihpart2.models.User;
import com.example.yukpilihpart2.utils.Credentials;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private ApiInterface mApiInterface;

    private EditText txtUsername, txtPassword;
    private String username, password, token;
    private final String TAG = "Retrofit get";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = findViewById(R.id.input_username);
        txtPassword = findViewById(R.id.input_password);

        username = txtUsername.getText().toString();
        password = txtPassword.getText().toString();

        mApiInterface = Credentials.getRetrofit().create(ApiInterface.class);
//        refresh2();
//        refresh(1);

        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login();
            }
        });
    }

    private void Login(){
        Call<TokenLogin> userLogin = mApiInterface.UserLogin(username, password);
        userLogin.enqueue(new Callback<TokenLogin>() {
            @Override
            public void onResponse(Call<TokenLogin> call, Response<TokenLogin> response) {
                token = response.body().getToken();
                Intent intent = new Intent(MainActivity.this, ChangePwActivity.class);
                startActivity(intent);
            }

            @Override
            public void onFailure(Call<TokenLogin> call, Throwable throwable) {
                System.out.println("failled");
            }
        });
    }

//    private void refresh2(){
//        Retrofit retrofit2 = new Retrofit.Builder().baseUrl("http://10.0.2.2:5043/api/").addConverterFactory(GsonConverterFactory.create()).build();
//
//        ApiInterface apiInterface = retrofit2.create(ApiInterface.class);
//
//        Call<GetAllUser> getAllUserCall = apiInterface.getUsers();
//        getAllUserCall.enqueue(new Callback<GetAllUser>() {
//            @Override
//            public void onResponse(Call<GetAllUser> call, Response<GetAllUser> response) {
//                if (response!=null && response.isSuccessful() && response.body()!=null){
//                    // GET response body
//                    List<User> users = response.body().getUsers();
//                    System.out.println(users);
//                } else {
//                    // error case
//                    switch (response.code()) {
//                        case 404:
//                            System.out.println("not found");
//                            break;
//                        case 500:
//                            System.out.println("server broken");
//                            break;
//                        default:
//                            System.out.println("unknown error");
//                            break;
//                    }
//                }
//
//                Log.d(TAG, "Hello world!");
//            }
//
//            @Override
//            public void onFailure(Call<GetAllUser> call, Throwable throwable) {
//                Log.d(TAG, throwable.toString());
//            }
//        });
//    }
//
//    private void refresh(int id){
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://10.0.2.2:5043/api/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        ApiInterface apiService = retrofit.create(ApiInterface.class);
//
//        Call<GetUser> userCall = apiService.getUser(id);
//        userCall.enqueue(new Callback<GetUser>() {
//            @Override
//            public void onResponse(Call<GetUser> call, Response<GetUser> response) {
//                if(response.isSuccessful()){
//                    int page = response.body().getId();
//                    Log.d(TAG, "Hello world!");
//                }
//            }
//
//            @Override
//            public void onFailure(Call<GetUser> call, Throwable t) {
//                Log.d(TAG, t.toString());
//            }
//        });
//    }
}