package com.example.finalproject.Tour;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.finalproject.Lichtrinh.Lichtrinh;
import com.example.finalproject.Login.Login;
import com.example.finalproject.Nhansu.Nhansu;
import com.example.finalproject.Notification.Notification;
import com.example.finalproject.R;
import com.example.finalproject.Taichinh.Taichinh;

public class Tour extends AppCompatActivity {

    private ImageView imgNotification;
    private ImageView imgUserlogin;
    private LinearLayout groupNhansu;
    private LinearLayout groupTour;
    private LinearLayout groupTaichinh;
    private LinearLayout groupLichtrinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour);

        imgNotification = (ImageView) findViewById(R.id.imgNotification);
        imgUserlogin = (ImageView) findViewById(R.id.imgUserlogin);
        groupNhansu = (LinearLayout) findViewById(R.id.groupNhansu);
        groupTour = (LinearLayout) findViewById(R.id.groupTour);
        groupTaichinh = (LinearLayout) findViewById(R.id.groupTaichinh);
        groupLichtrinh = (LinearLayout) findViewById(R.id.groupLichtrinh);

        imgUserlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tour.this, Login.class);
                startActivity(intent);
            }
        });

        imgNotification.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tour.this, Notification.class);
                startActivity(intent);
            }
        });

        groupNhansu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tour.this, Nhansu.class);
                startActivity(intent);
            }
        });

        groupLichtrinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tour.this, Lichtrinh.class);
                startActivity(intent);
            }
        });

        groupTaichinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tour.this, Taichinh.class);
                startActivity(intent);
            }
        });
    }
}