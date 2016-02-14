package com.enzymedev.hapataxi1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static com.enzymedev.hapataxi1.R.layout.activity_register;


public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void goToLogin(View view) {
        //go to login activity
        startActivity(new Intent(Register.this, Login.class));
    }
}
