package com.android.seneo.BelajarActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.android.seneo.MyAdapter;
import com.android.seneo.MyModel;
import com.android.seneo.R;

import java.util.ArrayList;

public class belajar_rumahAdat extends AppCompatActivity {

    //UI Views
    private ViewPager viewPager;

    private ArrayList<MyModel> modelArrayList;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_rumah_adat);

        //init UI views
        viewPager = findViewById(R.id.viewPager);
        loadCards();

        //set viewpager change listener
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void loadCards() {
        //init list
        modelArrayList = new ArrayList<>();

        //add items to list
        modelArrayList.add(new MyModel(
                "Rumah Panjang",
                "Rumah adat dari Kalimantan Barat",
                "Sumber : 1001indonesia.net, ruparupa.com",
                R.drawable.rumah_panjang));
        modelArrayList.add(new MyModel(
                "Rumah Lamin",
                "Rumah adat dari Kalimantan Timur",
                "Sumber : moondoggiesmusic.com, ruparupa.com",
                R.drawable.rumah_lamin));
        modelArrayList.add(new MyModel(
                "Rumah Bubungan Tinggi",
                "Rumah adat dari Kalimantan Selatan",
                "Sumber : indonesiakaya.com, ruparupa.com",
                R.drawable.rumah_bubungan_tinggi));
        modelArrayList.add(new MyModel(
                "Rumah Betang",
                "Rumah adat dari Kalimantan Tengah",
                "Sumber : indonesia.go.id, ruparupa.com",
                R.drawable.rumah_betang));
        modelArrayList.add(new MyModel(
                "Rumah Baloy",
                "Rumah adat dari Kalimantan Utara",
                "Sumber : celebes.co, ruparupa.com",
                R.drawable.rumah_baloy));

        //setup adapter
        myAdapter = new MyAdapter(this, modelArrayList);

        //set adapter to view pager
        viewPager.setAdapter(myAdapter);

        //set defaults padding from lef/right
        viewPager.setPadding(100,0,100,0);

    }

}