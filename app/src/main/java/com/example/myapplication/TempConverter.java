package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TempConverter extends AppCompatActivity {
    private EditText text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tempconverter);
        text=(EditText) findViewById(R.id.edit);
    }
    public void onClicked(View v){
        if (v.getId()==R.id.button1){
            RadioButton celsiusButton = (RadioButton) findViewById(R.id.radioButton);
            RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.radioButton2);
            if(text.getText().length()==0){
                Toast.makeText(this,"정확한 값 입력",Toast.LENGTH_LONG).show();
                return;
            }
            float inputValue=Float.parseFloat(text.getText().toString());
            if(celsiusButton.isChecked()){
                text.setText(String.valueOf(convertFahrenheitToCelsius(inputValue)));
                fahrenheitButton.setChecked(true);
                celsiusButton.setChecked(false);
            }else{
                text.setText(String.valueOf(convertCelsiusToFahrenheit(inputValue)));
                fahrenheitButton.setChecked(false);
                celsiusButton.setChecked(true);
            }
        }
    }
    private float convertFahrenheitToCelsius(float fahrenheit){
        return (fahrenheit-32)*5/9;
    }
    private float convertCelsiusToFahrenheit(float celsius){
        return (celsius*9/5)+32;
    }
}
