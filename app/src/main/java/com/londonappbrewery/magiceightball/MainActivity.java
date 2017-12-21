package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView bola = findViewById(R.id.image_eightBall);


        final int [] balls = {R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};

        Button botoncito = findViewById(R.id.button_ask);


        botoncito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random numberRandomsBalls = new Random();

                int number = numberRandomsBalls.nextInt(5);

                bola.setImageResource(balls[number]);

            }
        });


    }
}
