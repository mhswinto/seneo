package com.android.seneo.BelajarActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.android.seneo.MyAdapter;
import com.android.seneo.MyModel;
import com.android.seneo.R;

import java.util.ArrayList;

public class belajar_makananDaerah extends AppCompatActivity {

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
                "Bubur Pedas Sambas",
                "Makanan dari Kalimantan Barat",
                "Sumber : makananoleholeh.com",
                R.drawable.makanan_buburpedassambas));
        modelArrayList.add(new MyModel(
                "Ayam Cincane",
                "Makanan dari Kalimantan Timur",
                "Sumber : makananoleholeh.com",
                R.drawable.makanan_ayamcincane));
        modelArrayList.add(new MyModel(
                "Juhu Singkah",
                "Makanan dari Kalimantan Tengah",
                "Sumber : makananoleholeh.com",
                R.drawable.makanan_juhusingkah));
        modelArrayList.add(new MyModel(
                "Soto Banjar",
                "Makanan dari Kalimantan Selatan",
                "Sumber : makananoleholeh.com",
                R.drawable.makanan_sotobanjar));
        modelArrayList.add(new MyModel(
                "Kepiting Soka",
                "Makanan dari Kalimantan Utara",
                "Sumber : makananoleholeh.com",
                R.drawable.makanan_kepitingsoka));

        //setup adapter
        myAdapter = new MyAdapter(this, modelArrayList);

        //set adapter to view pager
        viewPager.setAdapter(myAdapter);

        //set defaults padding from lef/right
        viewPager.setPadding(100,0,100,0);

    }

}