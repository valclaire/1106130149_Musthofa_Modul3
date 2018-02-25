package com.example.musthofakamal.mineralwater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
private EditText username;
private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
    }

    public void login(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        if (username.getText().toString().equalsIgnoreCase("mineral") && password.getText().toString()
        .equalsIgnoreCase("user1")){
            String login = "login";
            intent.putExtra("button", login);
            startActivity(intent);
        }else if (username == null){
            Toast.makeText(getApplicationContext(), "Isilah dahulu username ", Toast.LENGTH_LONG).show();
        }else if (password == null){
            Toast.makeText(getApplicationContext(), "Isilah dahulu password", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(), "Isilah dengan benar username dan password", Toast.LENGTH_LONG).show();
        }
    }
}
