package com.example.anew.Hotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.anew.R;
import com.example.anew.Wisata.ListWisata;
import com.example.anew.Wisata.WisataData;
import com.example.anew.Wisata.parcelable;

import java.util.ArrayList;

public class HotelHotel extends AppCompatActivity {
    private RecyclerView rvHeroes;
    private ArrayList<Hotel> list = new ArrayList<>();
    private String title = "Mode List";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_hotel);


        rvHeroes = findViewById(R.id.rv_heroess);
        rvHeroes.setHasFixedSize(true);

        list.addAll(HotelData.getListData());
        showRecyclerList();
    }


    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }


    private void showRecyclerList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListHotel listwisata = new ListHotel(list);
        rvHeroes.setAdapter(listwisata);


    }
}


