package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject.Lichtrinh.Lichtrinh;
import com.example.finalproject.Login.Login;
import com.example.finalproject.Nhansu.Nhansu;
import com.example.finalproject.Notification.Notification;
import com.example.finalproject.Taichinh.Taichinh;
import com.example.finalproject.Tour.Tour;

public class MainActivity extends AppCompatActivity {

    private ImageView imgNotification;
    private ImageView imgUserlogin;
    private LinearLayout groupNhansu;
    private LinearLayout groupTour;
    private LinearLayout groupTaichinh;
    private LinearLayout groupLichtrinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgNotification = (ImageView) findViewById(R.id.imgNotification);
        imgUserlogin = (ImageView) findViewById(R.id.imgUserlogin);
        groupNhansu = (LinearLayout) findViewById(R.id.groupNhansu);
        groupTour = (LinearLayout) findViewById(R.id.groupTour);
        groupTaichinh = (LinearLayout) findViewById(R.id.groupTaichinh);
        groupLichtrinh = (LinearLayout) findViewById(R.id.groupLichtrinh);

        imgUserlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });

        imgUserlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });

        imgNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Notification.class);
                startActivity(intent);
            }
        });

        groupNhansu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Nhansu.class);
                startActivity(intent);
            }
        });

        groupLichtrinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Lichtrinh.class);
                startActivity(intent);
            }
        });

        groupTaichinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Taichinh.class);
                startActivity(intent);
            }
        });

        groupTour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Tour.class);
                startActivity(intent);

            }
        });
    }
}