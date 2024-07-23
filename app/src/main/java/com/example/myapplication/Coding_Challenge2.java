package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Coding_Challenge2 extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private CheckBox checkBox1, checkBox2, checkBox3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coding_challenge2);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String text = editText.getText().toString();
                    if (text.equals("laundry")) {
                        checkBox1.setChecked(true);
                    } else if (text.equals("cooking")) {
                        checkBox2.setChecked(true);
                    } else if (text.equals("posting letter")) {
                        checkBox3.setChecked(true);
                    } else {
                        checkBox1.setChecked(false);
                        checkBox2.setChecked(false);
                        checkBox3.setChecked(false);
                    }
                }
        });
    }
}

