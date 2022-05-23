package com.android.seneo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class UsernameActivity extends AppCompatActivity {

    private EditText nama;
    private Button masuk;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);

        nama = findViewById(R.id.nama);
        masuk = findViewById(R.id.btn_masuk);

        sharedPreferences = getSharedPreferences("app-data",MODE_PRIVATE);

        if(sharedPreferences.getString("nama", null) != null){
            Intent intent = new Intent(UsernameActivity.this, MainActivity.class);
            startActivity(intent);
        }

        masuk.setOnClickListener(v -> {
            @SuppressLint("CommitPrefEdits")
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("nama", nama.getText().toString());
            editor.apply();

            Intent intent = new Intent(UsernameActivity.this, MainActivity.class);
            startActivity(intent);

        });
    }
}