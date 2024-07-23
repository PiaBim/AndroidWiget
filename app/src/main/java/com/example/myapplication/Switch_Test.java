package com.example.myapplication;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Switch_Test extends AppCompatActivity {
    private ImageView switch_img;
    private Switch switch_btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch_test);

        switch_img=findViewById(R.id.imageOFF);
        switch_btn=findViewById(R.id.switch1);

        switch_btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    switch_img.setImageResource(R.drawable.on);
                }else{
                    switch_img.setImageResource(R.drawable.off);
                }
            }
        });
    }
}
