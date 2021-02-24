package com.paragon.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    TextView CountryName;
    Button previousbtn;
    Spinner CountrySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        previousbtn = findViewById(R.id.previousbtnId);
        previousbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Going to Next activity", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity2.this, "It's Second Activity", Toast.LENGTH_SHORT).show();
            }
        });

        CountrySpinner = findViewById(R.id.CountrySpinnerID);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, getCountry());

        CountrySpinner.setAdapter(arrayAdapter);

        CountrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CountryName = findViewById(R.id.CountryNameResult);

                String result = parent.getSelectedItem().toString();
                CountryName = findViewById(R.id.CountryNameResult);
                CountryName.setText("Country is: " + result);
                CountryName.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    public ArrayList<String> getCountry() {
        ArrayList<String> getCountries = new ArrayList<>();
        getCountries.add("Bangladesh");
        getCountries.add("India");
        getCountries.add("Pakistan");
        getCountries.add("Myanmar");
        getCountries.add("Sri Lanka");
        getCountries.add("USA");
        getCountries.add("South Africa");
        getCountries.add("Vutan");
        getCountries.add("China");
        getCountries.add("Argentina");
        getCountries.add("Brazil");
        getCountries.add("Noakhali");
        getCountries.add("Japan");
        getCountries.add("Singapore");
        getCountries.add("Malaysia");

        return getCountries;

    }
}