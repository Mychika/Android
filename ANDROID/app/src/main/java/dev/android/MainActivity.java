package dev.android;


import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    public static String newHome = "Add new home";
    public static String newWork = "Add new work";
    public static Boolean isFrench = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isFrench == true) {
            setContentView(R.layout.activity_main_fr);
        }else {
            setContentView(R.layout.activity_main);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

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

                if (isFrench == true) {
                    setContentView(R.layout.activity_main_fr);
                }else {
                    setContentView(R.layout.activity_main);
                }
            }
        });
    }

}