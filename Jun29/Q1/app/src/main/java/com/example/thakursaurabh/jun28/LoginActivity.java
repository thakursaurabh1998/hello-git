package com.example.thakursaurabh.jun28;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button loginN = findViewById(R.id.button);
        loginN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPass();
            }
        });
    }

    public void checkPass(){
        EditText loginE = findViewById(R.id.editText2);
        EditText loginP = findViewById(R.id.editText);
        SharedPreferences sharedPref = this.getSharedPreferences("com.example.thakursaurabh.jun28", Context.MODE_PRIVATE);
        final String email = sharedPref.getString("email","");
        final String pass = sharedPref.getString("pass","");
        Log.i("emailINFO",email);
        if(String.valueOf(loginE.getText()).equals(email)) {
            if(String.valueOf(loginP.getText()).equals(pass)) {
                Intent intent = new Intent(this, FinalActitvity.class);
                startActivity(intent);
            } else {
                AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
                builder1.setMessage("Password not correct.");
                builder1.setCancelable(true);
                builder1.show();
            }
        }
        else {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage("Email not correct.");
            builder1.setCancelable(true);
            builder1.show();
        }


    }
}
