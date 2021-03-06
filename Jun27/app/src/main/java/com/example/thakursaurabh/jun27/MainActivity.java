package com.example.thakursaurabh.jun27;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login = findViewById(R.id.register);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage();
            }
        });
    }

    public void sendMessage() {
        EditText name = (EditText)findViewById(R.id.name);
        EditText email = (EditText)findViewById(R.id.email);
        EditText pass = (EditText)findViewById(R.id.password);
        EditText confirmPass = (EditText)findViewById(R.id.confirmPass);
        String gemail = String.valueOf(email.getText());
        String gpass = String.valueOf(pass.getText());
        String gconfirmPass = String.valueOf(confirmPass.getText());
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        int flag = 0;

        if(TextUtils.isEmpty(name.getText().toString())){
            name.setError("Name Empty");
            flag=1;
        }
        if(TextUtils.isEmpty(email.getText().toString())){
            email.setError("Email empty");
            flag=1;
        }
        if(TextUtils.isEmpty(pass.getText().toString())){
            pass.setError("Password empty");
            flag=1;
        }
        if(TextUtils.isEmpty(confirmPass.getText().toString())){
            confirmPass.setError("Confirm Password empty");
            flag=1;
        }
        if(flag==1)
            return;
        if(gconfirmPass.equals(gpass)==false){
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage("Passwords do not match.");
            builder1.setCancelable(true);
            builder1.show();
            return;
        }
        intent.putExtra("EMAIL",gemail);
        intent.putExtra("PASS",gpass);
        startActivity(intent);

    }
}
