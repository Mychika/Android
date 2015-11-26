package dev.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Timetable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (MainActivity.isFrench == true) {
            setContentView(R.layout.activity_settings_fr);
        }else {
            setContentView(R.layout.activity_settings);
        }

        ArrayAdapter<String> rerList = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item);
        rerList.add("RER A");
        rerList.add("RER B");
        rerList.add("RER C");
        rerList.add("RER D");
        rerList.add("RER E");

        ListView rerListView = (ListView) findViewById(R.id.listView);
        rerListView.setAdapter(rerList);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
