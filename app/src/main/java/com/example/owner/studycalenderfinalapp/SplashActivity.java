package com.example.owner.studycalenderfinalapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.tv.TvContentRating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    private TextView TvWelcome, TvText, TvAccount;
    private Button btnStart, btnAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TvText = (TextView) findViewById(R.id.TvText);
        TvWelcome = (TextView) findViewById(R.id.TvWelcome);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnAccount = (Button) findViewById(R.id.btnAccount);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SplashActivity.this, SingUpActivity.class);
                startActivity(i);
            }
        });
        btnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SplashActivity.this, SignIn.class);
                startActivity(i);
            }
        });

    }
}