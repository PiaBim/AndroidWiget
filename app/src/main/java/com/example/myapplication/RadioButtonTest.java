package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RadioButtonTest extends AppCompatActivity {
    LinearLayout linearLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiobutton);
        linearLayout=(LinearLayout) findViewById(R.id.radiobutton);
    }
    public void onRadioButtonClicked(View v){
        boolean checked=((RadioButton)v).isChecked();

        if(v.getId()==R.id.radio_Red){
            if(checked)
                linearLayout.setBackgroundColor(Color.RED);

        }
        else if(v.getId()==R.id.radio_Blue){{
            if(checked)
                linearLayout.setBackgroundColor(Color.BLUE);
        }
        }
    }
}
