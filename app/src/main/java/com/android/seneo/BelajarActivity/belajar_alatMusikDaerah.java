package com.android.seneo.BelajarActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.android.seneo.MyAdapter;
import com.android.seneo.MyModel;
import com.android.seneo.R;

import java.util.ArrayList;

public class belajar_alatMusikDaerah extends AppCompatActivity {

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
                "Tuma",
                "Alat Musik dari Kalimantan Barat",
                "Sumber : 99.co, romadecade.org",
                R.drawable.alatmusik_tuma));
        modelArrayList.add(new MyModel(
                "Sampe",
                "Alat Musik dari Kalimantan Timur",
                "Sumber : 99.co, romadecade.org",
                R.drawable.alatmusik_sampe));
        modelArrayList.add(new MyModel(
                "Japen",
                "Alat Musik dari Kalimantan Tengah",
                "Sumber : 99.co, romadecade.org",
                R.drawable.alatmusik_japen));
        modelArrayList.add(new MyModel(
                "Panting",
                "Alat Musik dari Kalimantan Selatan",
                "Sumber : 99.co, romadecade.org",
                R.drawable.alatmusik_panting));
        modelArrayList.add(new MyModel(
                "Jatung Utang",
                "Alat Musik dari Kalimantan Utara",
                "Sumber : 99.co, romadecade.org",
                R.drawable.alatmusik_jatungutang));

        //setup adapter
        myAdapter = new MyAdapter(this, modelArrayList);

        //set adapter to view pager
        viewPager.setAdapter(myAdapter);

        //set defaults padding from lef/right
        viewPager.setPadding(100,0,100,0);

    }

}