package com.example.mysqltest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText email, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitialUI();
    }

    private void InitialUI() {
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
    }

    public void loginBtn(View view){
        String user = email.getText().toString();
        String password = pass.getText().toString();

        background bg = new background(this);
        bg.execute(user,password);
    }

    public void registerBtn(View view){
        startActivity(new Intent(MainActivity.this, RegisterActivity.class));
    }
}
