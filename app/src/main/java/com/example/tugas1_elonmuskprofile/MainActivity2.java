package com.example.tugas1_elonmuskprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    GridView grid;
    ArrayAdapter adapter;
    String[] dataElon = {
            "Nama Lengkap","Elon Reeve Musk",
            "Lahir", "28 Juni 1971 di Rretoria, Afrika Selatan",
            "Almamater", "Queens University, University of Pennsylvania",
            "Pekerjaan", "Entrepreneur, Industrial Engineer, Investor",
            "Jabatan",
            "Founder & CEO SpaceX, CEO & Arsitek Tesla, Founder Boring Company, Co-Founder NeuraLink, OpenAI, & Zip2",
            "Kekayaan Bersih", "US$102,9 miliar (Orang Terkaya Ke-2 Di Dunia saat ini)"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        grid = (GridView)findViewById(R.id.gridView);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dataElon);
        grid.setAdapter(adapter);
    }

}