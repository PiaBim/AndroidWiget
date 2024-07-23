package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Toggle_Button_Test extends AppCompatActivity {
    private ImageView imageview;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toggle_button_test);
        imageview=(ImageView) findViewById(R.id.imageView);
    }
    public void onToggleClicked(View view) {
        boolean on=((ToggleButton) view).isChecked();
        if(on){
            imageview.setImageResource(R.drawable.img);
        }
        else{
            imageview.setImageResource(0);
        }
    }
}

