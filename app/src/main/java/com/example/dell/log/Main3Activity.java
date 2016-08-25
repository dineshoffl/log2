package com.example.dell.log;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Main3Activity extends AppCompatActivity {



private static SeekBar seek;
    private static TextView textv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        seakba();
    }public void seakba(){
        seek=(SeekBar)findViewById(R.id.seekBar);
        textv=(TextView)findViewById(R.id.textView);
        textv.setText("covered:"+seek.getProgress()+"/"+seek.getMax());
        seek.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    int prograss_val;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                prograss_val=progress;
                        textv.setText("covered:"+progress+"/"+seek.getMax());
                        Toast.makeText(Main3Activity.this,"seak bar is progress",Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        Toast.makeText(Main3Activity.this,"seak bar is onstrarttracking",Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        textv.setText("covered:"+prograss_val+"/"+seek.getMax());
                        Toast.makeText(Main3Activity.this,"seak bar is onstoptracking",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


    }