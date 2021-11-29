package com.cs4.cs4_proto1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class Reg_P1 extends AppCompatActivity {

    TextView birthdate;
    DatePickerDialog.OnDateSetListener Date_Listener;
    EditText f_name, l_name, c_name, c_code;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_p1);

        f_name = findViewById(R.id.reg_pass);
        l_name = findViewById(R.id.last_name);
        c_name = findViewById(R.id.company_name);
        c_code = findViewById(R.id.company_code);

//        Birthdate
        birthdate = findViewById(R.id.birth_date);
        birthdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        Reg_P1.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        Date_Listener, year,month,day );
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        Date_Listener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String date = month + " / " +   dayOfMonth + " / " + year;
                birthdate.setText(date);
            }
        };
//        NEXT
        next = findViewById(R.id.btn_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Reg_P1.this, Reg_P2.class));
                finish();
            }
        });
    }
}