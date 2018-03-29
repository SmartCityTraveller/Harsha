package com.example.admin.androidsmartcity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Form extends AppCompatActivity {

    TextView final_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        final_result = (TextView) findViewById(R.id.result_text);
        final_result.setEnabled(false);
    }

    public void SelectCategory(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){

            case R.id.rb1:
                if(checked) {
                    final_result.setText("Amusement Park");
                    final_result.setEnabled(true);
                }
                else{
                    final_result.setEnabled(false);
                }
                    break;

            case R.id.rb2:
                if(checked) {
                    final_result.setText("Water Park");
                    final_result.setEnabled(true);
                }
                else{
                    final_result.setEnabled(false);
                }
                break;
            case R.id.rb3:
                if(checked) {
                    final_result.setText("Sea Side");
                    final_result.setEnabled(true);
                }
                else{
                    final_result.setEnabled(false);
                }
                break;

            case R.id.rb4:
                if(checked) {
                    final_result.setText("Others");
                    final_result.setEnabled(true);
                }
                else{
                    final_result.setEnabled(false);
                }
                break;

        }
    }
}
