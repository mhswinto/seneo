package com.android.seneo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.seneo.BelajarActivity.belajar;
import com.android.seneo.LatihanActivity.latihan;

public class MainActivity extends AppCompatActivity {

    CardView pindahBelajar, pindahLatihan, keluar;
    private TextView namanya;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pindahBelajar = findViewById(R.id.pilihBelajar);
        pindahLatihan = findViewById(R.id.pilihLatihan);
        namanya = findViewById(R.id.namanya);
        keluar = findViewById(R.id.keluar);

        sharedPreferences = getSharedPreferences("app-data",MODE_PRIVATE);

        namanya.setText(sharedPreferences.getString("nama","Username : "));

        keluar.setOnClickListener(v -> {
            @SuppressLint("CommitPrefEdits")
            SharedPreferences.Editor editor = sharedPreferences.edit();

            editor.clear().apply();
            Intent keluar = new Intent(MainActivity.this, UsernameActivity.class);
            startActivity(keluar);
        });

        pindahBelajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBelajar = new Intent(MainActivity.this, belajar.class);
                startActivity(pindahBelajar);
            }
        });

        pindahLatihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahLatihan = new Intent(MainActivity.this, latihan.class);
                startActivity(pindahLatihan);
            }
        });
    }
}