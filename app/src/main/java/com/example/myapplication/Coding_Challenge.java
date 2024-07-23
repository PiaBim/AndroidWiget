package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Coding_Challenge extends AppCompatActivity {

    private ImageView imageview;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coding_challenge);
        imageview = findViewById(R.id.imageView);

    }
    public void onClick(View view) {
        if (view.getId()==R.id.radioButton1) {
            imageview.setImageResource(R.drawable.on);
        }
                else if(view.getId()==R.id.radioButton2) {
            imageview.setImageResource(R.drawable.off);
        }
                else if(view.getId()==R.id.radioButton3){
                imageview.setImageResource(R.drawable.img);
        }
    }
}
