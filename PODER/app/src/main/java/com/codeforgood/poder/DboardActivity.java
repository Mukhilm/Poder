package com.codeforgood.poder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.codeforgood.poder.ui.login.LoginActivity;

public class DboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_dboard);
        Button acc = (Button) findViewById(R.id.AccountButton);
        acc.setVisibility(View.VISIBLE);
        acc.setBackgroundColor(Color.TRANSPARENT);

        //    acc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(DboardActivity.this, AccountActivity.class);
//                startActivity(intent);
//            }
//        });

        Button app = (Button) findViewById(R.id.AppointmentButton);
        app.setVisibility(View.VISIBLE);
        app.setBackgroundColor(Color.TRANSPARENT);

        app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DboardActivity.this, AppointmentActivity.class);
                startActivity(intent);
            }
        });

        Button demo = (Button) findViewById(R.id.DemographicsButton);
        demo.setVisibility(View.VISIBLE);
        demo.setBackgroundColor(Color.TRANSPARENT);

        demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DboardActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });

        Button exam = (Button) findViewById(R.id.ExamButton);
        exam.setVisibility(View.VISIBLE);
        exam.setBackgroundColor(Color.TRANSPARENT);

        exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DboardActivity.this, PlacementExamActivity.class);
                startActivity(intent);
            }
        });


        Button logout = (Button) findViewById(R.id.logout);
        logout.setVisibility(View.VISIBLE);
        logout.setBackgroundColor(Color.TRANSPARENT);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DboardActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
