package com.cs4.cs4_proto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Reg_P4 extends AppCompatActivity {
    EditText pass, c_pass;
    Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_p4);

        pass = findViewById(R.id.reg_pass);
        c_pass = findViewById(R.id.reg_cpass);

        reg = findViewById(R.id.btn_creg);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Reg_P4.this, Login_screen.class));
                finish();
            }
        });
    }
}