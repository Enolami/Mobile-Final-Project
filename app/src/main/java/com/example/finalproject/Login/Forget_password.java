package com.example.finalproject.Login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject.R;

public class Forget_password extends AppCompatActivity {

    private EditText etEmail;
    private EditText etNewpass;
    private EditText etRepass;
    private Button btnForget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etNewpass = (EditText) findViewById(R.id.etNewpass);
        etRepass = (EditText) findViewById(R.id.etRepass);
        btnForget = (Button) findViewById(R.id.btnForget);

        btnForget.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(etEmail.getText().toString().equals(""))
                    Toast.makeText(Forget_password.this,"Vui lòng nhập email", Toast.LENGTH_SHORT).show();
                else if(etNewpass.getText().toString().equals(""))
                    Toast.makeText(Forget_password.this,"Vui lòng nhập mật khẩu mới", Toast.LENGTH_SHORT).show();
                else if(!etNewpass.getText().toString().equals(etRepass.getText().toString()))
                    Toast.makeText(Forget_password.this,"Mật khẩu không khớp", Toast.LENGTH_SHORT).show();
                else
                    finish();
            }
        });
    }
}