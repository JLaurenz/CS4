package com.cs4.cs4_proto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Reg_P2 extends AppCompatActivity {

    EditText email, p_number , p_verify;
    Button vnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_p2);

        email = findViewById(R.id.reg_pass);
        p_number = findViewById(R.id.reg_cpass);
        p_verify = findViewById(R.id.verify_otp);

        vnext =findViewById(R.id.btn_vnext);
        vnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Reg_P2.this, Reg_P3.class));
                finish();
            }
        });
    }
}