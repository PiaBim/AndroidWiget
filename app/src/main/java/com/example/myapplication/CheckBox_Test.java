package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CheckBox_Test extends AppCompatActivity {
    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;
    private TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox_test);
        checkBox1 =(CheckBox) findViewById(R.id.checkBox1);
        checkBox2 =(CheckBox) findViewById(R.id.checkBox2);
        checkBox3 =(CheckBox) findViewById(R.id.checkBox3);
        checkBox4 =(CheckBox) findViewById(R.id.checkBox4);
        checkBox5 =(CheckBox) findViewById(R.id.checkBox5);
        textView =(TextView) findViewById(R.id.textView);


    }
    public void OnClickDone(View view) {
        StringBuilder chk = new StringBuilder();
        if (checkBox1.isChecked()) {
            chk.append(checkBox1.getText()).append(" ");
        }
        if (checkBox2.isChecked()) {
            chk.append(checkBox2.getText()).append(" ");
        }
        if (checkBox3.isChecked()) {
            chk.append(checkBox3.getText()).append(" ");
        }
        if (checkBox4.isChecked()) {
            chk.append(checkBox4.getText()).append(" ");
        }
        if (checkBox5.isChecked()) {
            chk.append(checkBox5.getText()).append(" ");
        }
        textView.setText(chk.toString());
    }
    public void OnClickCANCLE(View v){
        checkBox1.setChecked(false);
        checkBox2.setChecked(false);
        checkBox3.setChecked(false);
        checkBox4.setChecked(false);
        checkBox5.setChecked(false);
        textView.setText("");
    }
}
