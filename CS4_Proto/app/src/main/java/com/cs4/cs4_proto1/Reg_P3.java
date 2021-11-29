package com.cs4.cs4_proto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reg_P3 extends AppCompatActivity {
    Button ta_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_p3);

        ta_next = findViewById(R.id.btn_tnext);
        ta_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Reg_P3.this, Reg_P4.class));
                finish();
            }
        });
    }
}