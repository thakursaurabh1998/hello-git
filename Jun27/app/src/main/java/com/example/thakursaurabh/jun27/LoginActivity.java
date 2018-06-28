package com.example.thakursaurabh.jun27;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    String email;
    String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        Bundle extra = getIntent().getExtras();
        this.email = extra.getString("EMAIL");
        this.pass = extra.getString("PASS");
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
        String newPass = String.valueOf(loginP.getText());
        if(String.valueOf(loginE.getText()).equals(this.email)) {
            if(String.valueOf(loginP.getText()).equals(this.pass)) {
                Intent intent = new Intent(this, FinalActivity.class);
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
