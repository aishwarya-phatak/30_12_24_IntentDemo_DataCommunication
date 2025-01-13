package com.bitcode.a30_12_24_intentdemo_datacommunication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView txtUsername;
    TextView txtPassword;
    Button btnBack;
    String username, password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        initViews();
        getAndBindData();
    }

    private void initViews(){
        txtUsername = findViewById(R.id.textViewUsername);
        txtPassword = findViewById(R.id.textViewPassword);
        btnBack = findViewById(R.id.btnBack);
    }

    private void getAndBindData(){
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        username = bundle.getString("username");
        password = bundle.getString("password");

        txtUsername.setText(username);
        txtPassword.setText(password);
    }
}