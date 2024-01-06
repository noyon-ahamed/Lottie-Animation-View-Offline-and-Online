package com.example.lottieanimationview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    Button lottieofline,lottieonline;
    LottieAnimationView animationView,animationviewonline;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lottieofline=findViewById(R.id.lottieofline);
        animationView=findViewById(R.id.animationView);
        animationviewonline=findViewById(R.id.animationViewonline);
        lottieonline=findViewById(R.id.lottieonline);

        lottieofline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                animationView.setAnimation(R.raw.finger);
                animationView.playAnimation();

            }
        });

        lottieonline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                animationviewonline.setVisibility(View.VISIBLE);
                animationviewonline.playAnimation();

            }
        });
    }
}