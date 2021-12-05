package com.cs4.cs4_proto1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.cs4.cs4_proto1.rider.MapLocation;

public class Login_screen extends AppCompatActivity {

        Button btn_Register, btn_Login;
        EditText ui_email, ui_pass;
        TextView forgot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        EditText Value
        ui_email =findViewById(R.id.reg_pass);
        ui_pass =findViewById(R.id.password);
//        Forgot Password
        forgot = findViewById(R.id.forgotpass);
        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Memo plus gold",
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
//        Buttons
        btn_Login = findViewById(R.id.btn_login);
        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Login",
                        Toast.LENGTH_SHORT);
                toast.show();
                startActivity(new Intent(Login_screen.this, MapLocation.class));
            }
        });
        btn_Register = findViewById(R.id.btn_next);
        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login_screen.this, Reg_P1.class));
            }
        });
    }
}