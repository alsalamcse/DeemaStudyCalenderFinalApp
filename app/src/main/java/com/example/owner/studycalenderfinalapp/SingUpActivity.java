package com.example.owner.studycalenderfinalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SingUpActivity extends AppCompatActivity {
    private EditText edFirstName,edLastName,edPhone,edEmail2,edPassWord2,edPassWord3;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
    }
}
