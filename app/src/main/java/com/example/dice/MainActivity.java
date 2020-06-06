package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton = findViewById(R.id.button_roll);
        final ImageView Dice1= findViewById(R.id.dice1);
        final ImageView Dice2= findViewById(R.id.dice2);
        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Log.d("Dicee","Oh my my you actually pressed that button");
                    Random randomnumgen = new Random();
                    int number = randomnumgen.nextInt(6);
                Log.d("Dicee","Here is your number : " + number);
                 Dice1.setImageResource(diceArray[number]);
                number = randomnumgen.nextInt(6);
                Dice2.setImageResource(diceArray[number]);
            }
        });
    }
}
