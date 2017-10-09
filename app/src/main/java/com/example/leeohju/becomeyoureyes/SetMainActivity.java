package com.example.leeohju.becomeyoureyes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SetMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setmain);

        Button btnSetSize = (Button) findViewById(R.id.btnSetSize);
        btnSetSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SetMainActivity.this,SetSizeActivity.class);
                startActivity(intent);

            }
        });

        Button btnSetTheme = (Button) findViewById(R.id.btnSetTheme);
        btnSetTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SetMainActivity.this,SetThemeActivity.class);
                startActivity(intent);

            }
        });



    }
}
