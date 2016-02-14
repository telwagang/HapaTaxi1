package com.enzymedev.hapataxi1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;


/**
 * Created by telwa on 03/Feb/2016.
 */
public class UserDetails extends android.support.v4.app.Fragment implements SeekBar.OnSeekBarChangeListener {


    static int page_pos=0;
    int fagval;
    SeekBar seekBar;
    int value ;
    TextView tv ;

    public static UserDetails newInstance(int position){
        UserDetails instance= new UserDetails();
        Bundle barg=new Bundle();
        barg.putInt("val", position);
        instance.setArguments(barg);
        return(instance);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fagval = getArguments() != null ? getArguments().getInt("val") : 0;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_userdetails, container ,false);

        seekBar = (SeekBar) view.findViewById(R.id.seekBar);
        tv = (TextView) view.findViewById(R.id.tvseekvalue);

        Bundle b=getArguments();
        page_pos=b.getInt("pos");

        seekBar.setOnSeekBarChangeListener(this);
        return view;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        value = progress;
        settext(value);

    }

    private void settext(int value) {
        tv.setText(Integer.toString(value));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }


}
