package com.example.leeohju.becomeyoureyes;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    TimerTask mTask;
    Timer mTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.hide();
        setTheme(android.R.style.Theme_NoTitleBar_Fullscreen);// 꽉찬 빈화면
        setContentView(R.layout.activity_splash); // 컨텐츠 뷰 가져오기
        mTask = new TimerTask() {    // 초단위의 동작에서는 TimerTask 보다는 Handler 사용이 더 편리하다
            @Override
            public void run() {
                Log.d("Splash", "Splash.....");
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                
                startActivity(i);
                finish();
            }
        };

        mTimer = new Timer();
        mTimer.schedule(mTask, 3000); // 1000 ->1초단위
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mTimer != null){
            mTimer.cancel(); // 메모리 낭비를 피하기 위해 꼭 필요한 코드
        }
    }
}
