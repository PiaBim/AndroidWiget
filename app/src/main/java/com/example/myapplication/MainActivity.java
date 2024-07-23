package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageView clothingImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            clothingImageView = findViewById(R.id.imageView);

            Button color1=findViewById(R.id.button1);
            Button color2=findViewById(R.id.button2);
            Button color3=findViewById(R.id.button3);
            Button color4=findViewById(R.id.button4);

            color1.setOnClickListener(view -> clothingImageView(Color.RED));
            color2.setOnClickListener(view -> clothingImageView(Color.BLUE));
            color3.setOnClickListener(view -> clothingImageView(Color.GREEN));
            color4.setOnClickListener(view -> clothingImageView(Color.YELLOW));
            return insets;
        });
        }
    private void clothingImageView(int color) {
        clothingImageView.setBackgroundColor(color);

    }

}