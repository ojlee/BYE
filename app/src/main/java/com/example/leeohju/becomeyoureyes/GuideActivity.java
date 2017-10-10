package com.example.leeohju.becomeyoureyes;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class GuideActivity extends AppCompatActivity {

    private int cosnum;

    private String txtview;

    private String imgbtndes1;
    private String imgbtndes2;
    private String imgbtndes3;
    private String imgbtndes4;

    String[] ts;
    String[] ds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        Intent intent = getIntent();
        Data data = (Data)intent.getSerializableExtra("data");

// 여기부터 if문
        if(data.cosNum == 1)
        {
            //여기서 선언
            ts = getResources().getStringArray(R.array.hanlimTs);
            ds = getResources().getStringArray(R.array.hanlimDs);
        }
        else if(data.cosNum == 2){
            ts = getResources().getStringArray(R.array.museumTs);
            ds = getResources().getStringArray(R.array.museumDs);
        }
        else if(data.cosNum == 3){
            ts = getResources().getStringArray(R.array.saruyniTs);
            ds = getResources().getStringArray(R.array.saruyniDs);
        }
        else if(data.cosNum == 4){
            ts = getResources().getStringArray(R.array.sungsanilchulTs);
            ds = getResources().getStringArray(R.array.sungsanilchulDs);
        }
        else if(data.cosNum == 5){
            ts = getResources().getStringArray(R.array.ewolTs);
            ds = getResources().getStringArray(R.array.ewolDs);
        }
        else{
            Log.d("에러", "비정상적인 코스선택");
        }

        TextView txtdesT = (TextView) findViewById(R.id.txtdesT);
        ImageButton guideBtn1 = (ImageButton) findViewById(R.id.guideBtn1);
        ImageButton guideBtn2 = (ImageButton) findViewById(R.id.guideBtn2);
        ImageButton guideBtn3 = (ImageButton) findViewById(R.id.guideBtn3);
        ImageButton guideBtn4 = (ImageButton) findViewById(R.id.guideBtn4);

        txtdesT.setText(ts[0]);

        guideBtn1.setContentDescription(ds[1]);
        guideBtn2.setContentDescription(ds[2]);
        guideBtn3.setContentDescription(ds[3]);
        guideBtn4.setContentDescription(ds[4]);



        guideBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview = ts[1];
                TextView txtdesT = (TextView) findViewById(R.id.txtdesT);
                txtdesT.setText(txtview);
            }
        });


        guideBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview = ts[2];
                TextView txtdesT = (TextView) findViewById(R.id.txtdesT);
                txtdesT.setText(txtview);
            }
        });


        guideBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview = ts[3];
                TextView txtdesT = (TextView) findViewById(R.id.txtdesT);
                txtdesT.setText(txtview);
            }
        });


        guideBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview = ts[4];
                TextView txtdesT = (TextView) findViewById(R.id.txtdesT);
                txtdesT.setText(txtview);
            }
        });



        Button btnDes1 = (Button) findViewById(R.id.btndes1);
        btnDes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button btnDes2 = (Button) findViewById(R.id.btndes2);
        btnDes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btnDes2 = (Button) findViewById(R.id.btndes2);
                btnDes2.setContentDescription(ds[0]);
            }
        });

        Button btnDes3 = (Button) findViewById(R.id.btndes3);
        btnDes3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:064-743-0404"));
                try {
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }




        });
    }
}
