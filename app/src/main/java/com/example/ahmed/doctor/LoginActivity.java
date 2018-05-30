package com.example.ahmed.doctor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rodolfonavalon.shaperipplelibrary.ShapeRipple;
import com.rodolfonavalon.shaperipplelibrary.model.Circle;

public class LoginActivity extends AppCompatActivity {
    private ShapeRipple ripple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ripple = findViewById(R.id.login_ripple);
        ripple.setRippleShape(new Circle());
        ripple.setRippleCount(6);
        ripple.setRippleMaximumRadius(300);
        ripple.setRippleDuration(2500);
        ripple.setRippleColor(getColor(R.color.circle));
        ripple.setEnableColorTransition(true);
    }
}
