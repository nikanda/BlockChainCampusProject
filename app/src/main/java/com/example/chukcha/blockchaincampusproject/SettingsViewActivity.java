package com.example.chukcha.blockchaincampusproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class SettingsViewActivity extends AppCompatActivity {

    private Spinner gender_sp;
    private Spinner age_sp;
    private Spinner education_sp;
    private String[] ageArray;
    private String[] genderArray;
    private String[] educationArray;
    private ImageView go_to_statistic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_layout);

        ageArray = getResources().getStringArray(R.array.age_array);
        genderArray = getResources().getStringArray(R.array.gender_array);
        educationArray = getResources().getStringArray(R.array.education_array);

        gender_sp = (Spinner)findViewById(R.id.gender_sp);
        age_sp = (Spinner)findViewById(R.id.age_sp);
        education_sp = (Spinner)findViewById(R.id.education_sp);
        go_to_statistic = (ImageView)findViewById(R.id.go_to_statistic);

        gender_sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                UserSettingsClass.setGender(ageArray[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        education_sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                UserSettingsClass.setEducation(educationArray[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        age_sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                UserSettingsClass.setAge(ageArray[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        go_to_statistic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), StatisticactivityView.class);
                startActivity(intent);
            }
        });
    }


}
