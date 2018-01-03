package com.zhu.android.seekphoto;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;


public class LanuchActivity extends AppCompatActivity {
    private final long SPLASH_LENGTH = 3000;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanuch);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        handler.postDelayed(new Runnable() {  //使用handler的postDelayed实现延时跳转
            public void run() {
                Intent intent = new Intent(LanuchActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_LENGTH);
    }
}
