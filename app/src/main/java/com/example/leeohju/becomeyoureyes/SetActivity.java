package com.example.leeohju.becomeyoureyes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class SetActivity extends AppCompatActivity {
    SeekBar txtSizeSeekBar;
    TextView txtSizeExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int size = 15;  // 초기 글자 크기값
        txtSizeSeekBar = (SeekBar)findViewById(R.id.txtSizeSeekBar);
        txtSizeExample = (TextView)findViewById(R.id.txtSizeExample);

        txtSizeSeekBar.setMax(18);
        txtSizeSeekBar.setProgress(size);
        txtSizeExample.setTextSize((float)15);

        txtSizeSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
