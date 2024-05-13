package com.example.myfaceapp;

import static android.view.View.INVISIBLE;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;


import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
public class ErrorActivity extends AppCompatActivity {


    Button retryBtn,detectBtn;
    ImageView imageView4;
    TextView errorTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);

        retryBtn = findViewById(R.id.retryBtn);
        detectBtn = findViewById(R.id.detectBtn);

        imageView4 = findViewById(R.id.imageView4);

        errorTxt = findViewById(R.id.errorTxt);

        boolean not_stored = false;//That if the picture is not found

        if(not_stored){
            imageView4.setVisibility(INVISIBLE);
            detectBtn.setVisibility(INVISIBLE);

            errorTxt.setText("Sorry, but picture isn't saved!");

        }

        retryBtn.setOnClickListener(v -> {
            goToCaptureActivity();
        });


        boolean dtct = true;//This is an extra thing for API model that if the model could detect the face or not
        detectBtn.setOnClickListener(v -> {
            if (dtct) {
                goToResultActivity();
            }
            else {
                Toast.makeText(this, "unable to detect the face", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void goToResultActivity() {
            Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);
    }

    private void goToCaptureActivity() {
        Intent intent = new Intent(this, CaptureActivity.class);
        startActivity(intent);
    }



}