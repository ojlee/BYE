package com.example.leeohju.becomeyoureyes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by leeohju on 2017-10-03.
 */

public class SetThemeActivity extends AppCompatActivity {

    public int btnTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settheme);


        Button btnSetTheme1 = (Button) findViewById(R.id.btnSetTheme1);
        btnSetTheme1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTheme = (int) getResources().getColor(R.color.colorTheme1);

            }
        });

        Button btnSetTheme2 = (Button) findViewById(R.id.btnSetTheme2);
        btnSetTheme2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTheme = (int) getResources().getColor(R.color.colorTheme2);;

            }
        });

        Button btnSetTheme3 = (Button) findViewById(R.id.btnSetTheme3);
        btnSetTheme3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTheme = (int) getResources().getColor(R.color.colorTheme3);;

            }
        });

        Button btnSetTheme4 = (Button) findViewById(R.id.btnSetTheme4);
        btnSetTheme4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTheme = (int) getResources().getColor(R.color.colorTheme4);;

            }
        });

        Button btnSetTheme5 = (Button) findViewById(R.id.btnSaveTheme);
        btnSetTheme5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btnSetTheme5 = (Button) findViewById(R.id.btnSizeSave);

                btnSetTheme5.setBackgroundColor(btnTheme);
//                Intent intent = new Intent(SetThemeActivity.this,MainActivity.class);
//                startActivity(intent);


            }
        });
    }
}