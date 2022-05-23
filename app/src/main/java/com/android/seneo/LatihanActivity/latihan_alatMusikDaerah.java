package com.android.seneo.LatihanActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.seneo.R;

public class latihan_alatMusikDaerah extends AppCompatActivity {

    CardView kembali;
    Button btn_startLatihan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_alat_musik_daerah);

        kembali = findViewById(R.id.keluar);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(latihan_alatMusikDaerah.this, latihan.class);
                startActivity(intent);
            }
        });

        btn_startLatihan = findViewById(R.id.startLatihan);
        btn_startLatihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(latihan_alatMusikDaerah.this, soalLatihan_alatMusikDaerah.class);
                startActivity(intent);
            }
        });

    }
}