package com.example.bollez.sleeptrackingdevice;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SignupActivity extends AppCompatActivity {
    Spinner genderspinner;
    ArrayAdapter<CharSequence> genderadapter;

    Spinner countryspinner;
    ArrayAdapter<CharSequence> countryadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        //Country
        countryspinner = (Spinner) findViewById(R.id.country_spinner);
        countryadapter = ArrayAdapter.createFromResource(this, R.array.country_array,android.R.layout.simple_spinner_item);
        countryadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        countryspinner.setAdapter(countryadapter);

        //GENDER
        genderspinner = (Spinner) findViewById(R.id.gender_spinner);
        genderadapter = ArrayAdapter.createFromResource(this,R.array.gender_array, android.R.layout.simple_spinner_item);
        genderadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderspinner.setAdapter(genderadapter);

    }

}
