package com.example.tossapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imgOne;
    Button toss;
    TextView dice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.purple_500)));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.purple_500));
        }
        imgOne = findViewById(R.id.imgOne);
        toss = findViewById(R.id.btnToss);
        dice = findViewById(R.id.dice);
        final Random random = new Random();
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_anim);
        toss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score = random.nextInt(6) + 1;
                dice.setText(String.valueOf(score));

                switch (score) {
                    case 1:
                        imgOne.startAnimation(animation);
                        imgOne.setImageResource(R.drawable.one);
                        break;

                    case 2:
                        imgOne.startAnimation(animation);
                        imgOne.setImageResource(R.drawable.two);
                        break;

                    case 3:
                        imgOne.startAnimation(animation);
                        imgOne.setImageResource(R.drawable.three);
                        break;

                    case 4:
                        imgOne.startAnimation(animation);
                        imgOne.setImageResource(R.drawable.four);
                        break;

                    case 5:
                        imgOne.startAnimation(animation);
                        imgOne.setImageResource(R.drawable.five);
                        break;

                    case 6:
                        imgOne.startAnimation(animation);
                        imgOne.setImageResource(R.drawable.six);
                        break;
                }
            }
        });
    }

}