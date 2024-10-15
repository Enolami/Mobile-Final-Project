package com.example.finalproject.Notification;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject.Lichtrinh.Lichtrinh;
import com.example.finalproject.Login.Login;
import com.example.finalproject.Nhansu.Nhansu;
import com.example.finalproject.R;
import com.example.finalproject.Taichinh.Taichinh;
import com.example.finalproject.Tour.Tour;

import java.util.ArrayList;

public class Notification extends AppCompatActivity {

    private Button btnAddNoti;
    private RecyclerView rvNoti;
    String tieude,noidung;
    ArrayList<Noti> notiList;
    NotiAdapter notiAdapter;
    private ImageView imgLogin;
    private LinearLayout groupNhansu;
    private LinearLayout groupTour;
    private LinearLayout groupTaichinh;
    private LinearLayout groupLichtrinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        imgLogin = (ImageView) findViewById(R.id.imgUserlogin);
        groupNhansu = (LinearLayout) findViewById(R.id.groupNhansu);
        groupTour = (LinearLayout) findViewById(R.id.groupTour);
        groupTaichinh = (LinearLayout) findViewById(R.id.groupTaichinh);
        groupLichtrinh = (LinearLayout) findViewById(R.id.groupLichtrinh);

        btnAddNoti = (Button) findViewById(R.id.btnAddNoti);
        rvNoti = (RecyclerView) findViewById(R.id.rvNoti);
        notiList = new ArrayList<>();
        notiAdapter = new NotiAdapter(this,R.layout.item_notification,notiList);
        rvNoti.setAdapter(notiAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvNoti.setLayoutManager(linearLayoutManager);

        btnAddNoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
                Noti noti = new Noti(tieude,noidung);
                notiList.add(noti);
                notiAdapter.notifyDataSetChanged();
            }
        });

        imgLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Notification.this, Login.class);
                startActivity(intent);
            }
        });

        groupNhansu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Notification.this, Nhansu.class);
                startActivity(intent);
            }
        });

        groupLichtrinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Notification.this, Lichtrinh.class);
                startActivity(intent);
            }
        });

        groupTaichinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Notification.this, Taichinh.class);
                startActivity(intent);
            }
        });

        groupTour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Notification.this, Tour.class);
                startActivity(intent);
            }
        });
    }

    public void showDialog()
    {
        final Dialog dialog = new Dialog(Notification.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.add_noti);
        dialog.setCancelable(true);

        final EditText etTieude = (EditText) dialog.findViewById(R.id.etTieude);
        final EditText etNoidung = (EditText) dialog.findViewById(R.id.etNoidung);
        final Button button = (Button) dialog.findViewById(R.id.btnThemNoti);
        button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  tieude = etTieude.getText().toString();
                  noidung = etNoidung.getText().toString();
                  dialog.dismiss();
              }
        });

        dialog.show();
    }
}