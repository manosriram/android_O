package com.example.manosriram.snakes;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {




    public void rollTapped(View view) {
        int[] image = {R.drawable.one,

                R.drawable.two,

                R.drawable.three,

                R.drawable.four,

                R.drawable.five,

                R.drawable.six};

        Random ran = new Random();
        int randomnumber = ran.nextInt(6);
        ImageView dice = (ImageView) findViewById(R.id.dice);
        dice.setImageResource(image[randomnumber]);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
