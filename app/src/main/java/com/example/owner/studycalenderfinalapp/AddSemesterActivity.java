package com.example.owner.studycalenderfinalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddSemesterActivity extends AppCompatActivity{
    private TextView tvAddSemester,tvAddCourse2 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_semester);
        tvAddSemester = (TextView) findViewById(R.id.tvAddSemester);
        tvAddCourse2 = (TextView) findViewById(R.id.tvAddCourse2 );
       tvAddCourse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AddSemesterActivity.this, AddCourseActivity.class);
                startActivity(i);
            }
            } );
       }
    }





