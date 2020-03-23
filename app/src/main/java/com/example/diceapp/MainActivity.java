package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
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
        final ImageView imageView=(ImageView) findViewById(R.id.dice1);
        final ImageView imageView1=(ImageView) findViewById(R.id.dice2);
        Button button=(Button) findViewById(R.id.button);
        final int[] array={R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6,};
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random=new Random();
            int number=     random.nextInt(6);

              imageView.setImageResource(array[number]);
                Random newrandom=new Random();
                int newnumber=     random.nextInt(6);

                imageView1.setImageResource(array[newnumber]);
            }
        });
    }
}
