package com.paragon.myapplication;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonListener, viewOrder, DateSelect, DialogDateBtn, NextPage;
    CheckBox checkBox1, checkBox2, checkBox3;
    TextView orderText, LanguageResult, RatingTextViewR, SeekBarrResult, DateTextView, DialogTextView;
    RadioGroup radioGroup;
    RadioButton radioButton;
    RatingBar RateBar;
    SeekBar seekBar;
    Switch switch1;
    DatePicker datePicker;
    DatePickerDialog datePickerDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonListener = findViewById(R.id.buttonListener);
        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        checkBox3 = findViewById(R.id.checkbox3);
        orderText = findViewById(R.id.orderId);
        viewOrder = findViewById(R.id.viewOrderId);
        orderText = findViewById(R.id.orderId);
        RatingTextViewR = findViewById(R.id.RatingResultId);
        RateBar = findViewById(R.id.RatingBarID);
        SeekBarrResult = findViewById(R.id.SeekBarResultId);
        seekBar = findViewById(R.id.SeekBarID);
        switch1 = findViewById(R.id.switchId);
        DateSelect = findViewById(R.id.SelectDateButtonId);
        DateTextView = findViewById(R.id.DateTextID);
        datePicker = findViewById(R.id.DatePickerId);
        DialogDateBtn = findViewById(R.id.Dialog_datePickerId);
        DialogTextView = findViewById(R.id.DialogDateTextID);
        NextPage = findViewById(R.id.NextPage);

        LanguageResult = findViewById(R.id.LanguageResultId);
        radioGroup = findViewById(R.id.RadiogroupId);


        DateTextView.setText(currentDate());
        DateSelect.setOnClickListener(this);
        DialogDateBtn.setOnClickListener(this);
        NextPage.setOnClickListener(this);

        radioButton = findViewById(R.id.Java);
        radioButton.setChecked(true);
        String Result = radioButton.getText().toString();
        LanguageResult.setText(Result);
        LanguageResult.setVisibility(View.VISIBLE);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radioButton = findViewById(checkedId);
                String Result = radioButton.getText().toString();
                LanguageResult.setText(Result);
                LanguageResult.setVisibility(View.VISIBLE);


            }
        });


        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "On", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Off", Toast.LENGTH_SHORT).show();

                }
            }
        });


        SeekBarrResult.setText("Volume: " + seekBar.getProgress() + "/" + seekBar.getMax());
        SeekBarrResult.setVisibility(View.VISIBLE);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                SeekBarrResult.setText("Volume: " + progress + "/" + seekBar.getMax());
                SeekBarrResult.setVisibility(View.VISIBLE);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "On Start Tracking Touch is on", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "On Start Tracking Touch is oFF", Toast.LENGTH_SHORT).show();
            }
        });

        RateBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                RatingTextViewR.setText("Rating: " + rating);
                RatingTextViewR.setVisibility(View.VISIBLE);
            }
        });


        buttonListener.setOnClickListener(this);
        viewOrder.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.buttonListener) {
            Toast.makeText(MainActivity.this, "Button has Clicked", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.viewOrderId) {
            viewOrder.setTextSize(15);
            viewOrder.setText("Viewed on below");

            StringBuilder stringBuilder = new StringBuilder();

            if (checkBox1.isChecked()) {
                String value = checkBox1.getText().toString();
                stringBuilder.append(value + "is Ordered\n");
            }
            if (checkBox2.isChecked()) {
                String value = checkBox2.getText().toString();
                stringBuilder.append(value + "is Ordered\n");
            }
            if (checkBox3.isChecked()) {
                String value = checkBox3.getText().toString();
                stringBuilder.append(value + "is Ordered");
            }

            orderText.setText(stringBuilder);
            orderText.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.SelectDateButtonId) {
            Toast.makeText(MainActivity.this, "Button has Clicked", Toast.LENGTH_SHORT).show();
            DateTextView.setText(currentDate());

        } else if (v.getId() == R.id.Dialog_datePickerId) {
            Toast.makeText(MainActivity.this, "Button has Clicked", Toast.LENGTH_SHORT).show();

            DatePicker datePicker = new DatePicker(this);
            int date = datePicker.getDayOfMonth();
            int months = datePicker.getMonth();
            int years = datePicker.getYear();

            datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    DialogTextView.setText("Date is: " + dayOfMonth + "/" + month + 1 + "/" + year);
                }
            }, years, months, date);

            datePickerDialog.show();
        } else if (v.getId() == R.id.NextPage) {
            Toast.makeText(MainActivity.this, "Going to Next activity", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
            Toast.makeText(MainActivity.this, "It's Second Activity", Toast.LENGTH_SHORT).show();
        }


    }


    String currentDate() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Date is: ");
        stringBuilder.append(datePicker.getDayOfMonth() + "/");
        stringBuilder.append(datePicker.getMonth() + 1 + "/");
        stringBuilder.append(datePicker.getYear());
        return stringBuilder.toString();

    }
}
