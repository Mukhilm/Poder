package com.codeforgood.poder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class ExtraElementsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_extra_elements);

        Button su = (Button) findViewById(R.id.sign_up);
        su.setVisibility(View.VISIBLE);
        su.setBackgroundColor(Color.TRANSPARENT);

        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExtraElementsActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });

        Button work = (Button) findViewById(R.id.work);
        work.setVisibility(View.VISIBLE);
        work.setBackgroundColor(Color.TRANSPARENT);

        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExtraElementsActivity.this, InterestedInWorkActivity.class);
                startActivity(intent);
            }
        });

        Button donate = (Button) findViewById(R.id.donate);
        donate.setVisibility(View.VISIBLE);
        donate.setBackgroundColor(Color.TRANSPARENT);

        donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paypal.com/fundraiser/charity/144000"));
                startActivity(intent);
            }
        });

        Button contact = (Button) findViewById(R.id.contactus);
        contact.setVisibility(View.VISIBLE);
        contact.setBackgroundColor(Color.TRANSPARENT);

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExtraElementsActivity.this, ContactUsActivity.class);
                startActivity(intent);
            }
        });

        Button fb = (Button) findViewById(R.id.facebook);
        fb.setVisibility(View.VISIBLE);
        fb.setBackgroundColor(Color.TRANSPARENT);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/PODERWorks/"));
                startActivity(intent);
            }
        });

        Button twitter = (Button) findViewById(R.id.twitter);
        twitter.setVisibility(View.VISIBLE);
        twitter.setBackgroundColor(Color.TRANSPARENT);

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/poderworks?lang=en"));
                startActivity(intent);
            }
        });
    }
}
