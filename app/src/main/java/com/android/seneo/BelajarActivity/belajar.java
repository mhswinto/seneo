package com.android.seneo.BelajarActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.seneo.LatihanActivity.latihan;
import com.android.seneo.MainActivity;
import com.android.seneo.R;

public class belajar extends AppCompatActivity {

    CardView pindahRumahAdat, pindahPakaianAdat, pindahMakananDaerah, pindahAlatMusik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);

        pindahRumahAdat = findViewById(R.id.belajarRumahAdat);
        pindahPakaianAdat = findViewById(R.id.belajarPakaianAdat);
        pindahMakananDaerah = findViewById(R.id.belajarMakananDaerah);
        pindahAlatMusik = findViewById(R.id.belajarAlatMusikDaerah);

        pindahRumahAdat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahRumahAdat = new Intent(belajar.this, belajar_rumahAdat.class);
                startActivity(pindahRumahAdat);
            }
        });

        pindahPakaianAdat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahPakaianAdat = new Intent(belajar.this, belajar_pakaianAdat.class);
                startActivity(pindahPakaianAdat);
            }
        });

        pindahMakananDaerah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahMakananDaerah = new Intent(belajar.this, belajar_makananDaerah.class);
                startActivity(pindahMakananDaerah);
            }
        });

        pindahAlatMusik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahaAlatMusik = new Intent(belajar.this, belajar_alatMusikDaerah.class);
                startActivity(pindahaAlatMusik);
            }
        });

    }
}