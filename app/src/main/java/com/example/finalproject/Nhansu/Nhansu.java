package com.example.finalproject.Nhansu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.finalproject.Lichtrinh.Lichtrinh;
import com.example.finalproject.Login.Login;
import com.example.finalproject.Notification.Notification;
import com.example.finalproject.R;
import com.example.finalproject.Taichinh.Taichinh;
import com.example.finalproject.Tour.Tour;

import java.util.ArrayList;

public class Nhansu extends AppCompatActivity {

    private EditText etFindNhansu;
    private ArrayList<Employee> employeeList;
    private EmployeeAdapter employeeAdapter;
    private RecyclerView rvNhansu;
    private ImageView imgFind;
    private ImageView imgNotification;
    private ImageView imgUserlogin;
    private LinearLayout groupLichtrinh;
    private LinearLayout groupTour;
    private LinearLayout groupTaichinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhansu);

        etFindNhansu = (EditText) findViewById(R.id.etFindNhansu);
        rvNhansu = (RecyclerView) findViewById(R.id.rvNhansu);
        imgFind = (ImageView) findViewById(R.id.imgFind);
        employeeList = new ArrayList<Employee>();
        employeeAdapter = new EmployeeAdapter(this,R.layout.item_nhansu,employeeList);
        rvNhansu.setAdapter(employeeAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvNhansu.setLayoutManager(linearLayoutManager);

        imgNotification = (ImageView) findViewById(R.id.imgNotification);
        imgUserlogin = (ImageView) findViewById(R.id.imgUserlogin);
        groupTour = (LinearLayout) findViewById(R.id.groupTour);
        groupTaichinh = (LinearLayout) findViewById(R.id.groupTaichinh);
        groupLichtrinh = (LinearLayout) findViewById(R.id.groupLichtrinh);

        Employee employee = new Employee("A","1b","IT","a@gmail.com","0123456789");
        employeeList.add(employee);
        employeeAdapter.notifyDataSetChanged();

        String str = etFindNhansu.getText().toString();
        imgFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals(""))
                    Toast.makeText(Nhansu.this,"Test",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(Nhansu.this,str,Toast.LENGTH_SHORT).show();
            }
        });

        imgUserlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Nhansu.this, Login.class);
                startActivity(intent);
            }
        });

        imgNotification.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Nhansu.this, Notification.class);
                startActivity(intent);
            }
        });

        groupTour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Nhansu.this, Tour.class);
                startActivity(intent);
            }
        });

        groupLichtrinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Nhansu.this, Lichtrinh.class);
                startActivity(intent);
            }
        });

        groupTaichinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Nhansu.this, Taichinh.class);
                startActivity(intent);
            }
        });

    }
}