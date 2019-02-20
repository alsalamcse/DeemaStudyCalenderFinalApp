package com.example.owner.studycalenderfinalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddCourseActivity extends AppCompatActivity {
    private TextView tvAddCourse1;
    private EditText edCourseTittle;
    private Button imageButton1,btnSave1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_course);
        edCourseTittle=(EditText) findViewById(R.id .edCourseTittle) ;
        btnSave1=(Button)findViewById(R.id .btnSave1) ;
        tvAddCourse1=(TextView) findViewById(R.id .tvAddCourse1) ;
        btnSave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AddCourseActivity.this, MainTabsActivity.class);
                startActivity(i);
            }
        });
    }
}
