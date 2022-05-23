package com.android.seneo.LatihanActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.seneo.BelajarActivity.belajar;
import com.android.seneo.BelajarActivity.belajar_alatMusikDaerah;
import com.android.seneo.BelajarActivity.belajar_makananDaerah;
import com.android.seneo.BelajarActivity.belajar_pakaianAdat;
import com.android.seneo.BelajarActivity.belajar_rumahAdat;
import com.android.seneo.R;

public class latihan extends AppCompatActivity {

    CardView pindahRumahAdat, pindahPakaianAdat, pindahMakananDaerah, pindahAlatMusik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);
        pindahRumahAdat = findViewById(R.id.latihanRumahAdat);
        pindahPakaianAdat = findViewById(R.id.latihanPakaianAdat);
        pindahMakananDaerah = findViewById(R.id.latihanMakananDaerah);
        pindahAlatMusik = findViewById(R.id.latihanAlatMusikDaerah);

        pindahRumahAdat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahRumahAdat = new Intent(latihan.this, latihan_rumahAdat.class);
                startActivity(pindahRumahAdat);
            }
        });

        pindahPakaianAdat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahPakaianAdat = new Intent(latihan.this, latihan_pakaianAdat.class);
                startActivity(pindahPakaianAdat);
            }
        });

        pindahMakananDaerah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahMakananDaerah = new Intent(latihan.this, latihan_makananDaerah.class);
                startActivity(pindahMakananDaerah);
            }
        });

        pindahAlatMusik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahaAlatMusik = new Intent(latihan.this, latihan_alatMusikDaerah.class);
                startActivity(pindahaAlatMusik);
            }
        });


    }
}