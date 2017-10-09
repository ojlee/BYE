package com.example.leeohju.becomeyoureyes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.util.TypedValue;

public class SetSizeActivity extends AppCompatActivity {

    SeekBar txtSizeSeekBar;
    TextView txtSizeExample;
    float scale;
    public int fontSize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setsize);

        scale = getResources().getConfiguration().fontScale;
        fontSize = (int) scale;

        final int fontMinSize = 20;
        int fontMaxSize =60;
        txtSizeSeekBar = (SeekBar)findViewById(R.id.txtSizeSeekBar);
        txtSizeExample = (TextView)findViewById(R.id.txtSizeExample);


        txtSizeSeekBar.setMax(fontMaxSize);
        txtSizeSeekBar.setProgress(fontSize);
        txtSizeExample.setTextSize((float)fontSize);



        txtSizeSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar arg0) {


            }
            @Override
            public void onStartTrackingTouch(SeekBar arg0) {

            }

            @Override
            public void onProgressChanged(SeekBar arg0, int progress, boolean arg2) {
                if(progress >= fontMinSize){
                    txtSizeExample.setTextSize(progress);
                }
                else{
                    txtSizeExample.setTextSize(fontMinSize);
                }

                fontSize = progress;
            }
        });

        final Button btnSizeSave = (Button) findViewById(R.id.btnSizeSave);
        btnSizeSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn1 = (Button) findViewById(R.id.btnSizeSave);

                btn1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, fontSize);
//                Intent intent = new Intent(SetSizeActivity.this,SetMainActivity.class);
//                startActivity(intent);

            }
        });

    } // oncreate
} // class
