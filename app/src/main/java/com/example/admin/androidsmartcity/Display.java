package com.example.admin.androidsmartcity;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Display extends AppCompatActivity implements View.OnClickListener {

    EditText editTextTime1, editTextTime2;
    Button buttontime1, buttontime2;

    TimePickerDialog timePickerDialog, timePickerDialog1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        editTextTime1 = (EditText) findViewById(R.id.add);
        editTextTime2 = (EditText) findViewById(R.id.end);

        buttontime1 = (Button) findViewById(R.id.time);
        buttontime2 = (Button) findViewById(R.id.text);

        buttontime1.setOnClickListener(Display.this);
        buttontime2.setOnClickListener(Display.this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.time:
                Calendar calender = Calendar.getInstance();
                int _hour = calender.get(Calendar.HOUR);
                int _minute = calender.get(Calendar.MINUTE);

                timePickerDialog = new TimePickerDialog(Display.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        editTextTime1.setText(hourOfDay + " : " + minute);
                    }
                }, _hour, _minute, false);
                timePickerDialog.show();

                break;

            case R.id.text:
                Calendar calender1 = Calendar.getInstance();
                int _hour1 = calender1.get(Calendar.HOUR);
                int _minute1 = calender1.get(Calendar.MINUTE);

                timePickerDialog1 = new TimePickerDialog(Display.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        editTextTime2.setText(hourOfDay + " : " + minute);
                    }
                }, _hour1, _minute1, false);
                timePickerDialog1.show();

                break;

        }
    }

    public void onBtnClick(View v) {

        if (v.getId() == R.id.sendData) {

            Intent i = new Intent(Display.this, Form.class);
            startActivity(i);


        }
    }
}