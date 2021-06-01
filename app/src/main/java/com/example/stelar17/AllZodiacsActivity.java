package com.example.stelar17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AllZodiacsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_zodiacs);

        Button capricorn_button = (Button) findViewById(R.id.button);
        capricorn_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(AllZodiacsActivity.this, CapricornActivity.class);
                startActivity(i1);
            }

        });

        Button aquarius_button = (Button) findViewById(R.id.aquarius_button);
        aquarius_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(AllZodiacsActivity.this, AquariusActivity.class);
                startActivity(i3);
            }
        });

        Button pisces_button = (Button) findViewById(R.id.pisces_button);
        pisces_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(AllZodiacsActivity.this, PiscesActivity.class);
                startActivity(i4);
            }
        });

        Button aries_button = (Button) findViewById(R.id.aries_button);
        aries_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(AllZodiacsActivity.this, AriesActivity.class);
                startActivity(i5);
            }
        });

        Button taurus_button = (Button) findViewById(R.id.taurus_button);
        taurus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(AllZodiacsActivity.this, TaurusActivity.class);
                startActivity(i6);
            }
        });

        Button gemeni_button = (Button) findViewById(R.id.gemeni_button);
        gemeni_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7 = new Intent(AllZodiacsActivity.this, GemeniActivity.class);
                startActivity(i7);
            }
        });
        Button cancer_button = (Button) findViewById(R.id.cancer_button);
        cancer_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8 = new Intent(AllZodiacsActivity.this, CancerActivity.class);
                startActivity(i8);
            }
        });
        Button leo_button = (Button) findViewById(R.id.leo_button);
        leo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i9 = new Intent(AllZodiacsActivity.this, LeoActivity.class);
                startActivity(i9);
            }
        });
        Button virgo_button = (Button) findViewById(R.id.virgo_button);
        virgo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i10 = new Intent(AllZodiacsActivity.this, VirgoActivity.class);
                startActivity(i10);
            }
        });
        Button scorpio_button = (Button) findViewById(R.id.scorpio_button);
        scorpio_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i12 = new Intent(AllZodiacsActivity.this, ScorpioActivity.class);
                startActivity(i12);
            }
        });


    }
}