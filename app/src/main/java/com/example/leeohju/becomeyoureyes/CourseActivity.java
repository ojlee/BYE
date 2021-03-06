package com.example.leeohju.becomeyoureyes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        ImageButton btnCos1 = (ImageButton) findViewById(R.id.btncos1);
        btnCos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cosNum = 1;
                Data data = new Data(cosNum);
                Intent intent = new Intent(CourseActivity.this,GuideActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

        ImageButton btnCos2 = (ImageButton) findViewById(R.id.btncos2);
        btnCos2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cosNum = 2;
                Data data = new Data(cosNum);
                Intent intent = new Intent(CourseActivity.this,GuideActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

        ImageButton btnCos3 = (ImageButton) findViewById(R.id.btncos3);
        btnCos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cosNum = 3;
                Data data = new Data(cosNum);
                Intent intent = new Intent(CourseActivity.this,GuideActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

        ImageButton btnCos4 = (ImageButton) findViewById(R.id.btncos4);
        btnCos4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cosNum = 4;
                Data data = new Data(cosNum);
                Intent intent = new Intent(CourseActivity.this,GuideActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

        ImageButton btnCos5 = (ImageButton) findViewById(R.id.btncos5);
        btnCos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cosNum = 5;
                Data data = new Data(cosNum);
                Intent intent = new Intent(CourseActivity.this,GuideActivity.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });
    }
}
