package com.enzymedev.hapataxi1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by eurphrasia on 09/Feb/2016.
 */
public class DriverDetails extends android.support.v4.app.Fragment {

    int famval;


    public static DriverDetails newInstance(int position){
        DriverDetails instance= new DriverDetails();
        Bundle barg=new Bundle();
        barg.putInt("pos", position);
        instance.setArguments(barg);
        return(instance);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        famval = getArguments() != null ? getArguments().getInt("pos"): 0 ;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_driverdetails, container,false);

        return view;
    }
}
