package com.example.admin.androidsmartcity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void onSignUpClick(View v) {
        if (v.getId() == R.id.Bsignup) {
            EditText name = (EditText) findViewById(R.id.TFname);
            EditText email = (EditText) findViewById(R.id.TFemail);
            EditText uname = (EditText) findViewById(R.id.TFuname);
            EditText pass1 = (EditText) findViewById(R.id.TFpass1);
            EditText pass2 = (EditText) findViewById(R.id.TFpass2);

            String namestr = name.getText().toString();
            String emailstr = email.getText().toString();
            String unamestr = uname.getText().toString();
            String pass1str = pass1.getText().toString();
            String pass2str = pass2.getText().toString();

            if (!pass1str.equals(pass2str)) {
                //popup msg
                Toast pass = Toast.makeText(Signup.this, "Passwords dont match", Toast.LENGTH_SHORT);
                pass.show();
            } else {
                //inserting details in database
                Contact c = new Contact();
                c.setName(namestr);
                c.setEmail(emailstr);
                c.setUname(unamestr);
                c.setPass(pass1str);

                helper.insertContact(c);
            }

        }
    }
}
