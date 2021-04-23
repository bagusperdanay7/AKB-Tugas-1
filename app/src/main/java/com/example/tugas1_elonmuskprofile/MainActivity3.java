package com.example.tugas1_elonmuskprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    ListView list;
    ArrayAdapter adapter;
    String[] produkElon = {
            "Tesla", "Zip2", "Paypal", "X.com", "SolarCity", "SpaceX", "Neuralink", "The Boring Company"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        list = (ListView)findViewById(R.id.ListView);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, produkElon);
        list.setAdapter(adapter);

    }

}