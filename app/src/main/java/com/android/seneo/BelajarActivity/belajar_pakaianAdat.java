package com.android.seneo.BelajarActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.android.seneo.MyAdapter;
import com.android.seneo.MyModel;
import com.android.seneo.R;

import java.util.ArrayList;

public class belajar_pakaianAdat extends AppCompatActivity {

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
                "King Baba",
                "Pakaian Adat dari Kalimantan Barat",
                "Sumber : cekaja.com, taldebrooklyn.com",
                R.drawable.pakaian_kingbaba));
        modelArrayList.add(new MyModel(
                "Kustin",
                "Pakaian Adat dari Kalimantan Timur",
                "Sumber : cekaja.com, pariwisataindonesia.id",
                R.drawable.pakaian_kustin));
        modelArrayList.add(new MyModel(
                "Upak Nyamu",
                "Pakaian Adat dari Kalimantan Tengah",
                "Sumber : cekaja.com, kataomed.com",
                R.drawable.pakaian_upaknyamu));
        modelArrayList.add(new MyModel(
                "Bagajah Gamuling Baular Lulut",
                "Pakaian Adat dari Kalimantan Selatan",
                "Sumber : cekaja.com, budayanesia.com",
                R.drawable.pakaian_bagajahgamulingbaularlulut));
        modelArrayList.add(new MyModel(
                "Ta'a dan Sapei Sapaq",
                "Pakaian Adat dari Kalimantan Utara",
                "Sumber : cekaja.com, bahassemua.com",
                R.drawable.pakaian_taasapeisapaq));

        //setup adapter
        myAdapter = new MyAdapter(this, modelArrayList);

        //set adapter to view pager
        viewPager.setAdapter(myAdapter);

        //set defaults padding from lef/right
        viewPager.setPadding(100,0,100,0);

    }

}