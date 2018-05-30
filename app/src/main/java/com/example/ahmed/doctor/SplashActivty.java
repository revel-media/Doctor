package com.example.ahmed.doctor;

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.natasa.progressviews.CircleSegmentBar;
import com.natasa.progressviews.utils.ProgressStartPoint;

public class SplashActivty extends AppCompatActivity {
    private CircleSegmentBar segmentBar;
    private Runnable mTimer;
    protected int progress;
    private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_activty);
        mHandler = new Handler();
        segmentBar = findViewById(R.id.segment_bar);
        segmentBar.setWidthProgressBarLine(25);
        //you can set start position for progress
        //you can set linear gradient with default colors or to set yours colors, or sweep gradient
        segmentBar.setLinearGradientProgress(true);

    }

    @Override
    protected void onResume() {
        super.onResume();
        setTimer();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mHandler.removeCallbacks(mTimer);
    }

    private void setTimer() {
        mTimer = new Runnable() {
            @Override
            public void run() {
                progress += 1;
                if (progress <= 100)
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {

                            segmentBar.setProgress((float) progress);
                        }
                    });
                mHandler.postDelayed(this, 100);
            }
        };
        mHandler.postDelayed(mTimer, 1000);
    }
}
