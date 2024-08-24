package com.example.pizzaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.login_button).setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, CategoryActivity.class);
            startActivity(intent);
        });
    }
}
