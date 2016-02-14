package com.enzymedev.hapataxi1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class UserTaxiLocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_taxi_location);
    }


    public void gotoAllTaxis(View view) {
        //redirect user to register page
        startActivity(new Intent(UserTaxiLocation.this, TaxiSearchResults.class));
    }

    public void toUserProfile(){
        startActivity( new Intent(UserTaxiLocation.this , UserProfile.class));
    }
}
