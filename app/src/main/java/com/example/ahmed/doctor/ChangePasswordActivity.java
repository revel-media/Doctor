package com.example.ahmed.doctor;

import android.os.MessageQueue;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rodolfonavalon.shaperipplelibrary.ShapeRipple;
import com.rodolfonavalon.shaperipplelibrary.model.Circle;

public class ChangePasswordActivity extends AppCompatActivity {
    private ShapeRipple ripple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        ripple = findViewById(R.id.ripple);
        ripple.setRippleShape(new Circle());
        ripple.setRippleCount(4);
        ripple.setRippleMaximumRadius(250);
        ripple.setRippleDuration(2500);
        ripple.setRippleColor(getColor(R.color.circle));
        ripple.setRippleFromColor(getColor(R.color.circle));
        ripple.setEnableColorTransition(true);
    }
}
