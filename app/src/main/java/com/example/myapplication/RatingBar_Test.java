package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RatingBar_Test extends AppCompatActivity {
    private RatingBar ratingBar;
    private TextView textView;
    private Button button;


    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.ratingbar_test);
        ratingBar=(RatingBar) findViewById(R.id.ratingBar);
        textView=(TextView) findViewById(R.id.textView2);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float rating=ratingBar.getRating();
                textView.setText("SCORE:"+rating);
            }
        });
    }
}
