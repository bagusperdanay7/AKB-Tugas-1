package com.example.tugas1_elonmuskprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    Button implicitIntentProfile, implicitIntentProduk, explicitIntenttwitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        implicitIntentProfile = findViewById(R.id.buttonProfil);
        implicitIntentProduk = findViewById(R.id.buttonProduk);
        explicitIntenttwitter = findViewById(R.id.buttonTwitter);

        implicitIntentProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentProfile = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intentProfile);

            }
        });

        implicitIntentProduk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentProduk = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intentProduk);
            }
        });

        explicitIntenttwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urltwitter = "https://twitter.com/elonmusk";
                Intent bukaTwitter = new Intent(Intent.ACTION_VIEW);
                bukaTwitter.setData(Uri.parse(urltwitter));
                startActivity(bukaTwitter);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Aplikasi dimulai", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Aplikasi dijeda", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Aplikasi dilanjutkan", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Aplikasi dihentikan", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Aplikasi dimusnahkan dari memory", Toast.LENGTH_SHORT).show();
    }
}