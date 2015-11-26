package dev.android;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Locale;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (MainActivity.isFrench == true) {
            setContentView(R.layout.activity_settings_fr);
        }else {
            setContentView(R.layout.activity_settings);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        final RadioButton englishRadio = (RadioButton) findViewById(R.id.englishRadio);
        final RadioButton frenchRadio = (RadioButton) findViewById(R.id.frenchRadio);

        if(MainActivity.isFrench == true) {
            englishRadio.setChecked(false);
            frenchRadio.setChecked(true);
        } else {
            englishRadio.setChecked(true);
            frenchRadio.setChecked(false);
        }

        englishRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.isFrench = false;
            }
        });

        frenchRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.isFrench = true;
            }
        });


        Button submitHome = (Button) findViewById(R.id.submitHome);
        Button submitWork = (Button) findViewById(R.id.submitWork);

        submitHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText home = (EditText) findViewById(R.id.newHome);

                if (home.getText().toString() != "") {
                    MainActivity.newHome = home.getText().toString();
                }

                Toast toast = Toast.makeText(getApplicationContext(),"Home: " + MainActivity.newHome + "added.", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        submitWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText work = (EditText) findViewById(R.id.newWork);

                if (work.getText().toString() != "") {
                    MainActivity.newWork = work.getText().toString();
                }
                Toast toast = Toast.makeText(getApplicationContext(),"Work: " + MainActivity.newWork + " added.", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


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
