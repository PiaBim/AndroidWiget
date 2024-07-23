package com.example.myapplication;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Radio_Button extends AppCompatActivity {
    private ImageView image;
    private RadioButton radio1, radio2, radio3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_button);
        image = findViewById(R.id.imageView);
        radio1 = findViewById(R.id.radioButton1);
        radio2 = findViewById(R.id.radioButton2);
        radio3 = findViewById(R.id.radioButton3);

    }

    public void onClicked(View view) {
        if (radio1.isChecked()) {
            image.setImageResource(R.drawable.on);
        } else if (radio2.isChecked()) {
            image.setImageResource(R.drawable.off);
        } else if (radio3.isChecked()) {
            image.setImageResource(R.drawable.img);
        }
    }

}

