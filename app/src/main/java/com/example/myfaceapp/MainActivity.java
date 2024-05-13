package com.example.myfaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;


import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button capBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        capBtn = findViewById(R.id.capBtn);
        capBtn.setOnClickListener(v -> {
            /*
            * Sensor team will add the code of both camera permission and GPS permission, to record the location at the same time of capturing the photo*/
            goToCaptureActivity();

            //                goToCPermissionActivity();//if any of the sensors is not allowed, passing which is not allowed, or check there in the activity.

        });
    }

    private void goToCaptureActivity() {
        Intent intent = new Intent(this, CaptureActivity.class);
        startActivity(intent);
    }

    private void goToPermissionActivity() {
        Intent intent = new Intent(this, PermissionActivity.class);
        startActivity(intent);
    }

}