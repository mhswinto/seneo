package com.android.seneo.LatihanActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.seneo.MainActivity;
import com.android.seneo.R;
import com.android.seneo.UsernameActivity;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class soalLatihan_alatMusikDaerah extends AppCompatActivity {

    TextView waktu;
    private TextView tv_pertanyaan;
    private ImageView iv_pertanyaan;
    private AppCompatButton next;
    private AppCompatButton option1, option2, option3, option4, option5;
    private List<listPertanyaanAlatMusik> listPertanyaan;
    private SharedPreferences sharedPreferences;
    private int currentQuestionPosition = 0;
    private String selectedOptionByUser = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_latihan_alat_musik_daerah);

        tv_pertanyaan = findViewById(R.id.banyakKuis);
        iv_pertanyaan = findViewById(R.id.pertanyaan);

        option1 = findViewById(R.id.option1);
        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option1.getText().toString();
                    option1.setTextColor(Color.WHITE);
                    revealAnswer();
                    listPertanyaan.get(currentQuestionPosition).setPilihanUser(selectedOptionByUser);
                }
            }
        });

        option2 = findViewById(R.id.option2);
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option2.getText().toString();
                    option2.setTextColor(Color.WHITE);
                    revealAnswer();
                    listPertanyaan.get(currentQuestionPosition).setPilihanUser(selectedOptionByUser);
                }
            }
        });

        option3 = findViewById(R.id.option3);
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option3.getText().toString();
                    option3.setTextColor(Color.WHITE);
                    revealAnswer();
                    listPertanyaan.get(currentQuestionPosition).setPilihanUser(selectedOptionByUser);
                }
            }
        });

        option4 = findViewById(R.id.option4);
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option4.getText().toString();
                    option4.setTextColor(Color.WHITE);
                    revealAnswer();
                    listPertanyaan.get(currentQuestionPosition).setPilihanUser(selectedOptionByUser);
                }
            }
        });

        option5 = findViewById(R.id.option5);
        option5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = option5.getText().toString();
                    option5.setTextColor(Color.WHITE);
                    revealAnswer();
                    listPertanyaan.get(currentQuestionPosition).setPilihanUser(selectedOptionByUser);
                }
            }
        });

        next = findViewById(R.id.btn_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()) {
                    Toast.makeText(soalLatihan_alatMusikDaerah.this, "Pilih jawaban!", Toast.LENGTH_SHORT).show();
                }
                else {
                    pertanyaanSelanjutnya();
                }
            }

        });

        listPertanyaan = latihanAlatMusik.Pertanyaan();

        if (!listPertanyaan.isEmpty()){
            Collections.shuffle(listPertanyaan);
        }
        waktu = findViewById(R.id.timer);

        TimerMulai(waktu);

        tv_pertanyaan.setText((currentQuestionPosition+1)+"/"+listPertanyaan.size());
        iv_pertanyaan.setImageResource(Integer.parseInt(String.valueOf(listPertanyaan.get(0).getPertanyaan())));
        option1.setText(listPertanyaan.get(0).getOption1());
        option2.setText(listPertanyaan.get(0).getOption2());
        option3.setText(listPertanyaan.get(0).getOption3());
        option4.setText(listPertanyaan.get(0).getOption4());
        option5.setText(listPertanyaan.get(0).getOption5());

    }

    private void pertanyaanSelanjutnya(){
        currentQuestionPosition++;
        if ((currentQuestionPosition+1) == listPertanyaan.size()){
            next.setText("Selesai");
        }
        if (currentQuestionPosition < listPertanyaan.size()){
            selectedOptionByUser = "";
            option1.setTextColor(Color.parseColor("#4D4949"));
            option2.setTextColor(Color.parseColor("#4D4949"));
            option3.setTextColor(Color.parseColor("#4D4949"));
            option4.setTextColor(Color.parseColor("#4D4949"));
            option5.setTextColor(Color.parseColor("#4D4949"));

            tv_pertanyaan.setText((currentQuestionPosition+1)+"/"+listPertanyaan.size());
            iv_pertanyaan.setImageResource(listPertanyaan.get(currentQuestionPosition).getPertanyaan());
            option1.setText(listPertanyaan.get(currentQuestionPosition).getOption1());
            option2.setText(listPertanyaan.get(currentQuestionPosition).getOption2());
            option3.setText(listPertanyaan.get(currentQuestionPosition).getOption3());
            option4.setText(listPertanyaan.get(currentQuestionPosition).getOption4());
            option5.setText(listPertanyaan.get(currentQuestionPosition).getOption5());

        }
        else {
            Intent intent = new Intent(soalLatihan_alatMusikDaerah.this, hasilLatihanAlatMusik.class);
            intent.putExtra("Benar", getJawaba_benar());
            intent .putExtra("Salah", getJawaban_salah());
            startActivity(intent);

            finish();
        }
    }
    //method untuk timer
    private void TimerMulai(TextView timerTextView){
        //kode baru
        //inisialisasi durasi
        long duration = TimeUnit.MINUTES.toMillis(2);
        //inisialisasi hitungan mundur
        new CountDownTimer(duration, 1000) {
            @Override
            public void onTick(long l) {
                //ketika timer berjalan
                String secDuration = String.format(Locale.ENGLISH, "%02d : %02d"
                        , TimeUnit.MILLISECONDS.toMinutes(l)
                        , TimeUnit.MILLISECONDS.toSeconds(l) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l)));

                //set converted string on text view
                waktu.setText(secDuration);
            }

            @Override
            public void onFinish() {
                //ketika waktu habis
                Toast.makeText(soalLatihan_alatMusikDaerah.this, "Waktu Habis", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(soalLatihan_alatMusikDaerah.this, hasilLatihanAlatMusik.class);
                intent.putExtra("Benar", getJawaba_benar());
                intent.putExtra("Salah", getJawaban_salah());
                startActivity(intent);
            }
        }.start();
    }
    //method untuk jawaban benar
    private int getJawaba_benar(){
        int jawabanBenar = 0;

        for (int i = 0; i < listPertanyaan.size(); i++){
            final String getpilihanUser = listPertanyaan.get(i).getPilihanUser();
            final String getJawaban = listPertanyaan.get(i).getJawaban();

            if (getpilihanUser.equals(getJawaban)){
                jawabanBenar++;
            }
        }
        return jawabanBenar;
    }
    //method untuk jawaban salah
    private int getJawaban_salah() {
        int jawabanSalah = 0;

        for (int i = 0; i < listPertanyaan.size(); i++){
            final String getpilihanUser = listPertanyaan.get(i).getPilihanUser();
            final String getJawaban = listPertanyaan.get(i).getJawaban();

            if (!getpilihanUser.equals(getJawaban)){
                jawabanSalah++;
            }
        }
        return jawabanSalah;
    }
    //method untuk memperlihatkan jawaban yang benar
    private void revealAnswer(){
        final String getJawaban = listPertanyaan.get(currentQuestionPosition).getJawaban();
        if (option1.getText().toString().equals(getJawaban)) {
            option1.setTextColor(Color.WHITE);
        }
        else if (option2.getText().toString().equals(getJawaban)){
            option2.setTextColor(Color.WHITE);
        }
        else if (option3.getText().toString().equals(getJawaban)){
            option3.setTextColor(Color.WHITE);
        }
        else if (option4.getText().toString().equals(getJawaban)){
            option4.setTextColor(Color.WHITE);
        }
        else if (option5.getText().toString().equals(getJawaban)){
            option5.setTextColor(Color.WHITE);
        }
    }

}