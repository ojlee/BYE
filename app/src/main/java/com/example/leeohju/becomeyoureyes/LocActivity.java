package com.example.leeohju.becomeyoureyes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LocActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loc);

        Button btnLoc1 = (Button) findViewById(R.id.btnLoc1);
        btnLoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocActivity.this,CosActivity.class);
                startActivity(intent);
            }
        });
        Button btnLoc2 = (Button) findViewById(R.id.btnLoc2);
        btnLoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocActivity.this,CosActivity.class);
                startActivity(intent);
            }
        });
        Button btnLoc3 = (Button) findViewById(R.id.btnLoc3);
        btnLoc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocActivity.this,CosActivity.class);
                startActivity(intent);
            }
        });
        Button btnLoc4 = (Button) findViewById(R.id.btnLoc4);
        btnLoc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocActivity.this,CosActivity.class);
                startActivity(intent);
            }
        });
        Button btnLoc5 = (Button) findViewById(R.id.btnLoc5);
        btnLoc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocActivity.this,CosActivity.class);
                startActivity(intent);
            }
        });

    }
}
