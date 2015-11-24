package com.example.ocane.android;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

import java.util.Locale;

/**
 * Created by Océane on 24/11/2015.
 */
public class Settings extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

    }

    @Override
    protected void onStart() {
        super.onStart();

        /*RadioGroup languageGroup = (RadioGroup) findViewById(R.id.radioLanguage);
        languageGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if (checkedId == R.id.englishRadio) {
                    Toast.makeText(getApplicationContext(), "choice: English",
                            Toast.LENGTH_SHORT).show();
                    String language = "en"; // ta langue
                    Locale locale = new Locale(language);
                    Locale.setDefault(locale);
                    Configuration config = new Configuration();
                    config.locale = locale;
                    getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                } else {
                    Toast.makeText(getApplicationContext(), "choice: Français",
                            Toast.LENGTH_SHORT).show();
                    /*String language = "fr"; // ta langue
                    Locale locale = new Locale(language);
                    Locale.setDefault(locale);
                    Configuration config = new Configuration();
                    config.locale = locale;
                    getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());

                }
            }
        });*/

        Button myReturnButton;
        myReturnButton = (Button) findViewById(R.id.returnButton);

        myReturnButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    });
}
}