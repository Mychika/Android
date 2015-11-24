package com.example.ocane.android_foucrier_plaisant.Main;

/**
 * Created by Océane on 24/11/2015.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ocane.android_foucrier_plaisant.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Button myParamButton;
        myParamButton = (Button) findViewById(R.id.paramButton);

        myParamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Conversion.class);

                //On démarre l'autre Activity
                startActivity(intent);

            }
        });
    }
}
