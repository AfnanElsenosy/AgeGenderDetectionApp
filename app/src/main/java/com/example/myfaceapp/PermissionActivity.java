package com.example.myfaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class PermissionActivity extends AppCompatActivity {
    TextView msgTxt;
    Button permBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission);
        msgTxt = findViewById(R.id.msgTxt);
        permBtn = findViewById(R.id.permBtn);

        String mis_permission = "GPS";
        if (mis_permission.equals("GPS")){
            msgTxt.setText("Please allow to use GPS.");
        }
        else if(mis_permission.equals("Camera")){
            msgTxt.setText("Please allow to use the camera.");
        }

        /*the page where we display error message if any of the two sensors is not allowed, and ask for guaranteeing the permission to continue*/


        permBtn.setOnClickListener(v -> {

            goToCaptureActivity();
        });
    }

    private void goToCaptureActivity() {
        Intent intent = new Intent(this, CaptureActivity.class);
        startActivity(intent);
    }
}