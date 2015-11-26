package dev.android;


import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    public static String newHome;
    public static String newWork;
    public static Boolean isFrench = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (isFrench == true) {
            setContentView(R.layout.activity_main_fr);
            newHome = "Ajouter maison";
            newWork = "Ajouter travail";
        }else {
            setContentView(R.layout.activity_main);
            newHome = "Add new home";
            newWork = "Add new work";
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        if (isFrench == true) {
            setContentView(R.layout.activity_main_fr);
        } else {
            setContentView(R.layout.activity_main);
        }

        SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
        String currentDateandTime = sdf.format(new Date());

        Toast toast = Toast.makeText(getApplicationContext(), currentDateandTime, Toast.LENGTH_SHORT);
        toast.show();

        Button settingsButton;
        settingsButton = (Button) findViewById(R.id.settingsButton);

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Settings.class);

                //On démarre l'autre Activity
                startActivity(intent);

            }
        });

        Button mapButton;
        mapButton = (Button) findViewById(R.id.mapButton);

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Map.class);

                //On démarre l'autre Activity
                startActivity(intent);

            }
        });

        Button timeButton;
        timeButton = (Button) findViewById(R.id.timeButton);

        timeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Timetable.class);

                //On démarre l'autre Activity
                startActivity(intent);

            }
        });
    }

}