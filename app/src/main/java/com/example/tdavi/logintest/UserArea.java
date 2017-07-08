package com.example.tdavi.logintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        String age = intent.getStringExtra("age");

        TextView uWelcome = (TextView) findViewById(R.id.uWelcome);
        EditText uUsername = (EditText) findViewById(R.id.uUsername);

        // Display user details
        String message = name + ", you have successfully logged in!";
        uWelcome.setText(message);
        uUsername.setText(username);
    }
}
