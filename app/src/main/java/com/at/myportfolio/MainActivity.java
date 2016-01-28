package com.at.myportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
Button one,two,three,four,five,six;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button) findViewById(R.id.Button_one);
        two = (Button) findViewById(R.id.Button_two);
        three = (Button) findViewById(R.id.Button_three);
        four = (Button) findViewById(R.id.Button_four);
        five = (Button) findViewById(R.id.Button_five);
        six = (Button) findViewById(R.id.Button_six);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Spotify Streamer",Toast.LENGTH_LONG).show();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Scores App",Toast.LENGTH_LONG).show();
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Library App", Toast.LENGTH_LONG).show();
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Build It Bigger", Toast.LENGTH_LONG).show();
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "XYZ Reader", Toast.LENGTH_LONG).show();
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "MY App Yayyyy !!!!", Toast.LENGTH_LONG).show();
            }
        });
    }




}
