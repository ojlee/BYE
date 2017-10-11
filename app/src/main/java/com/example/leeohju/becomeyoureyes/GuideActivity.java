package com.example.leeohju.becomeyoureyes;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Locale;

public class GuideActivity extends AppCompatActivity implements LocationListener {

    String tv1 = null;
    String tv2 = null;

    //위치정보 객체
    LocationManager lm = null;
    //위치정보 장치 이름
    String provider = null;


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


        /**위치정보 객체를 생성한다.*/
        lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        /** 현재 사용가능한 위치 정보 장치 검색*/
        //위치정보 하드웨어 목록
        Criteria c = new Criteria();
        //최적의 하드웨어 이름을 리턴받는다.
        provider = lm.getBestProvider(c, true);

        // 최적의 값이 없거나, 해당 장치가 사용가능한 상태가 아니라면,
        //모든 장치 리스트에서 사용가능한 항목 얻기
        if (provider == null || !lm.isProviderEnabled(provider)) {
            // 모든 장치 목록
            List<String> list = lm.getAllProviders();

            for (int i = 0; i < list.size(); i++) {
                //장치 이름 하나 얻기
                String temp = list.get(i);

                //사용 가능 여부 검사
                if (lm.isProviderEnabled(temp)) {
                    provider = temp;
                    break;
                }
            }
        }// (end if)위치정보 검색 끝

        /**마지막으로  조회했던 위치 얻기*/
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        Location location = lm.getLastKnownLocation(provider);

        if (location == null) {
            Toast.makeText(this, "사용가능한 위치 정보 제공자가 없습니다.", Toast.LENGTH_SHORT).show();
        } else {
            //최종 위치에서 부터 이어서 GPS 시작...
            onLocationChanged(location);
            Button btnDes1 = (Button) findViewById(R.id.btndes1);
            btnDes1.setContentDescription("현재위치는 위도 경도"+ " " +tv1 + " " +tv2+ "입니다");

        }


        Intent intent = getIntent();
        Data data = (Data) intent.getSerializableExtra("data");

// 여기부터 if문
        if (data.cosNum == 1) {
            //여기서 선언
            ts = getResources().getStringArray(R.array.hanlimTs);
            ds = getResources().getStringArray(R.array.hanlimDs);
        } else if (data.cosNum == 2) {
            ts = getResources().getStringArray(R.array.museumTs);
            ds = getResources().getStringArray(R.array.museumDs);
        } else if (data.cosNum == 3) {
            ts = getResources().getStringArray(R.array.saruyniTs);
            ds = getResources().getStringArray(R.array.saruyniDs);
        } else if (data.cosNum == 4) {
            ts = getResources().getStringArray(R.array.sungsanilchulTs);
            ds = getResources().getStringArray(R.array.sungsanilchulDs);
        } else if (data.cosNum == 5) {
            ts = getResources().getStringArray(R.array.ewolTs);
            ds = getResources().getStringArray(R.array.ewolDs);
        } else {
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
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:064-743-0404"));
                try {
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }


        });
    }


    /** 이 화면이 불릴 때, 일시정지 해제 처리*/
    @Override
    public void onResume() {
        //Activity LifrCycle 관련 메서드는 무조건 상위 메서드 호출 필요
        super.onResume();

        //위치정보 객체에 이벤트 연결
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        lm.requestLocationUpdates(provider, 500, 1, this);
    }
    /** 다른 화면으로 넘어갈 때, 일시정지 처리*/
    @Override
    public void onPause(){
        //Activity LifrCycle 관련 메서드는 무조건 상위 메서드 호출 필요
        super.onPause();

        //위치정보 객체에 이벤트 해제
        lm.removeUpdates(this);
    }

    /** 위치가 변했을 경우 호출된다.*/
    @Override
    public void onLocationChanged(Location location) {
        // 위도, 경도
        double lat = location.getLatitude();
        double lng = location.getLongitude();

        tv1 = String.valueOf(lat) + " , " + String.valueOf(lng);
        tv2 = getAddress(lat, lng);

    }
    @Override
    public void onProviderDisabled(String provider) {
        // TODO Auto-generated method stub

    }
    @Override
    public void onProviderEnabled(String provider) {
        // TODO Auto-generated method stub

    }
    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        // TODO Auto-generated method stub

    }

    /** 위도와 경도 기반으로 주소를 리턴하는 메서드*/
    public String getAddress(double lat, double lng){
        String address = null;

        //위치정보를 활용하기 위한 구글 API 객체
        Geocoder geocoder = new Geocoder(this, Locale.getDefault());

        //주소 목록을 담기 위한 HashMap
        List<Address> list = null;

        try{
            list = geocoder.getFromLocation(lat, lng, 1);
        } catch(Exception e){
            e.printStackTrace();
        }

        if(list == null){
            Log.e("getAddress", "주소 데이터 얻기 실패");
            return null;
        }

        if(list.size() > 0){
            Address addr = list.get(0);
            address = addr.getCountryName() + " "
                    + addr.getPostalCode() + " "
                    + addr.getLocality() + " "
                    + addr.getThoroughfare() + " "
                    + addr.getFeatureName();
        }

        return address;



    }


}
