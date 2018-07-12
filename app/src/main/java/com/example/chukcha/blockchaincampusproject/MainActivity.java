package com.example.chukcha.blockchaincampusproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText country_ed = (EditText)findViewById(R.id.country_ed);
        final EditText age_ed = (EditText)findViewById(R.id.age_ed);

        if(UserSettingsClass.getAge() != null){
            age_ed.setText(UserSettingsClass.getAge());

        }
        if(UserSettingsClass.getCountryTxt() != null){
            country_ed.setText(UserSettingsClass.getCountryTxt());
        }


        ImageButton next_btn = (ImageButton)findViewById(R.id.next_btn);

        UserSettingsClass.setAge(age_ed.getText().toString());
        UserSettingsClass.setCountryTxt(country_ed.getText().toString());

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserSettingsClass.setAge(age_ed.getText().toString());
                UserSettingsClass.setCountryTxt(country_ed.getText().toString());
                Intent intent = new Intent(getApplicationContext(), StatisticactivityView.class);
                startActivity(intent);
            }
        });




    }
}
