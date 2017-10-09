package com.example.leeohju.becomeyoureyes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        Button btnDes1 = (Button) findViewById(R.id.btndes1);
        btnDes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuideActivity.this,CourseActivity.class);
                startActivity(intent);
            }
        });

        Button btnDes2 = (Button) findViewById(R.id.btndes2);
        btnDes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button btnDes3 = (Button) findViewById(R.id.btndes3);
//        btnDes3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }
}
