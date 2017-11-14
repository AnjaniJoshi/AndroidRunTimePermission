package com.permissionmodel.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.permissionmodel.R;

import java.util.ArrayList;
import java.util.List;


public class SplashActivity extends AppCompatActivity {
    Context mContext;
    Activity mActivity;
    private static final int SPLASH_DURATION = 2000; // 2 seconds

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mContext = SplashActivity.this;
        mActivity = SplashActivity.this;

        setContentView(R.layout.activity_splash);

        moveToNextScreen();

    }

    private void moveToNextScreen() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent intent = new Intent(mContext, MainActivity.class);
                intent.putExtra("notification", "");
                startActivity(intent);


                finish();
            }
        }, SPLASH_DURATION);
    }
}
