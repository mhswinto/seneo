package com.android.seneo.LatihanActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.seneo.R;

public class hasilLatihanAlatMusik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_latihan_alat_musik);

        Button btn_kembali = findViewById(R.id.btn_kembali);
        final TextView jawabanBenar = findViewById(R.id.jawaban_Benar);
        final TextView jawabanSalah = findViewById(R.id.jawaban_Salah);

        final int getJawabanBenar = getIntent().getIntExtra("Benar", 0);
        final int getJawabanSalah = getIntent().getIntExtra("Salah", 0);

        jawabanBenar.setText(String.valueOf(getJawabanBenar));
        jawabanSalah.setText(String.valueOf(getJawabanSalah));

        btn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(hasilLatihanAlatMusik.this, latihan_alatMusikDaerah.class));
                finish();
            }
        });
    }
}