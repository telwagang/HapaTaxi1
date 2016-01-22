package com.enzymedev.hapataxi1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class StartActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void goToRegister(View view) {
        //redirect user to register page
        startActivity(new Intent(StartActivity.this, Register.class));
    }

    public void goToLogin(View view) {
        //redirect user to login activity
        startActivity(new Intent(StartActivity.this, Login.class));
    }

    public void goToHomeScreen(View view) {
        //redirect user to login activity
        startActivity(new Intent(StartActivity.this, UserTaxiLocation.class));
    }
    
}
