package com.example.myapplication;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Electric_Circuit extends AppCompatActivity {
    private ToggleButton toggleButton1;
    private ToggleButton toggleButton2;
    private ImageView imageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.electric_circuit);
        toggleButton1 = findViewById(R.id.toggleButton1);
        toggleButton2 = findViewById(R.id.toggleButton2);
        imageView = findViewById(R.id.imageView);
        toggleButton1.setOnCheckedChangeListener(toggleListener);
        toggleButton2.setOnCheckedChangeListener(toggleListener);
    }
    private CompoundButton.OnCheckedChangeListener toggleListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            updateLightState();
        }
    };
    private void updateLightState() {
    boolean isToggle1On=toggleButton1.isChecked();
    boolean isToggle2On=toggleButton2.isChecked();
    if(isToggle1On&&isToggle2On){
        imageView.setImageResource(R.drawable.on);
    }else{
        imageView.setImageResource(R.drawable.off);
    }
    }

}
