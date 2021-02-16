package com.example.dailynature.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dailynature.R;

public class MainActivity extends AppCompatActivity {

    CardView cvHewan, cvBuah, cvSayur;
    TextView tvAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvHewan = (CardView) findViewById(R.id.cv_hewan_home);
        cvBuah = (CardView) findViewById(R.id.cv_buah_home);
        cvSayur = (CardView) findViewById(R.id.cv_sayur_home);
        tvAbout = findViewById(R.id.tv_about);

        cvHewan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HewanActivity.class);
                startActivity(i);
            }
        });

        cvBuah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BuahActivity.class);
                startActivity(i);
            }
        });

        cvSayur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SayurActivity.class);
                startActivity(i);
            }
        });

        tvAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(i);
            }
        });
    }
}
