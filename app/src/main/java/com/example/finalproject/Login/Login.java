package com.example.finalproject.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject.R;

public class Login extends AppCompatActivity {
    private EditText etUser;
    private EditText etPassword;
    private Button btnLogin;
    private TextView tvForget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUser = (EditText) findViewById(R.id.etUser);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        tvForget = (TextView) findViewById(R.id.tvForget);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etUser.getText().toString().equals(""))
                    Toast.makeText(Login.this, "Vui lòng nhập tài khoản", Toast.LENGTH_SHORT).show();
                else if(etPassword.getText().toString().equals(""))
                    Toast.makeText(Login.this,"Vui lòng nhập mật khẩu",Toast.LENGTH_SHORT).show();
                else
                    finish();
            }
        });

        tvForget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Forget_password.class);
                startActivity(intent);
            }
        });
    }
}